
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyCrawler2 {
	static int pagecount = 4;		// 몇페이지까지 검색할 것인지
	// static으로 한 이유? --> main이 static이라서 
	
	public static void main(String[] args) {
		/*
		 * 	Selenium 사용
		 * 		- 웹UI 자동화 툴
		 * 		- HTML 코드 안에 정보가 없을 때
		 * 		- 실제로(브라우저를 이용하여) 페이지를 접속한 효과를 낼 수 있다!
		 * 		- 다양한 언어에서 사용이 가능! (java, python, javascript 등..)
		 * 		- WebDriver 라는 가상화 브라우저 사용
		 * 		- https://docs.seleniumhq.org/download/
		 */
		
		String projectPath = System.getProperty("user.dir");
		String chromePath = projectPath + "\\lib\\chromedriver.exe";
		String csvPath = projectPath + "\\lib\\danawa_notebook.csv";
		/*
		 * 		csv파일이란 ?
		 * 			- 쉼표로 구분된 값(comma sperated value)
		 */
		
		
		
		// 제품 정보를 담을 리스트 생성
		ArrayList<ProductInfo> list = new ArrayList<>();
		
		// selenium으로 웹 자동화툴(크롬드라이버)사용을 위한 설정
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		// ChromeDiver 인스턴스가 생성된다 = chormedriver.exe가 구동!
		WebDriver driver = new ChromeDriver();
		
		// 이때부터 우리가 직접 크롬을 사용하는 것과 같은 효과를 낼 수 있다!

		
		// get() : 해당 URL로 이동
		driver.get("http://prod.danawa.com/list/?cate=112758");
		
		// 현재 get을 한 상태 = 1페이지
		// i를 현재 페이지를 나타내는 변수로사용
		for(int page=1;page<=pagecount;page++) {
			
			if( page != 1 ) {	// 첫페이지가 아니면
				// 우리가 실행한 크롬브라우저를 자바스크립트 실행용도로 형변환
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				
				// movePage(2~4) 라는 자바스크립트를 실행해라
				jse.executeScript( "".format("movePage(%d)", page) );
				// 현재 페이지에서 위 스크립트가 실행되면 페이지가 이동된다
				
				// 잠깐의 대기를 하지않으면, 페이지 이동시간이 있기때문에 이동되기전에 1페이지의 소스만 계속 읽어오는 문제가 생긴다
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
			
			// 이동한 페이지의 코드를 읽어와야 파싱을 할 수 있다
			Document doc = Jsoup.parse( driver.getPageSource() );
//			↓ Jsoup 라이브러리로 페이지 접속한 것과 비슷하다! Document에 페이지 정보가 저장됨 = 파싱하는 방식이 동일해졌다
//			Document doc = Jsoup.connect("http://prod.danawa.com/list/?cate=112758").get();
					
			Elements prod_area = doc.select( "div#productListArea" );
			
			// 이름,가격, 스펙은 AD광고 제품과 실제 순위 제품모두 동일하게
			// <div class = "prod_main_info">안에 들어있다!
			// 모든 prod_main_info를 리스트화 했다
			Elements prod_main_info = prod_area.select("div.prod_main_info");
			
			for (int i=0; i<prod_main_info.size(); i++){
				
				// 리스트화된 요소 중 하나만 반환받는다
				Element product = prod_main_info.get(i);
				
				// 제품명 <p class="prod_name"> 밑에 <a> 태그의 text부분만 반환
				String name = product.select("p.prod_name a").text();
//				System.out.println(name);
				
				// 가격 <p class="price_sect"> 밑에 text부분만 반환
				String price = product.select("p.price_sect").text().replace(",", "");	// replace : 앞의문자를 뒷문자로 바꿈 (여기서는 쉼표를 공백으로 제거함)
				
				// 상세스펙 <div class="spec_list">
				// 스펙은 AD광고상품과 순위제품의 태그명이 다르다. ↓따로 태그명을 지정하지않음
				String spec = product.select(".spec_list").text();
				
				// 순위 <string class="pop_rank">
				String rank = product.select("strong.pop_rank").text();
				if( rank.equals("")) {
					// 순위 정보가 없다면!
					//		1페이지 : AD광고제품
					//		2페이지부터는 원레 순위가 없음
					if(page==1){
						rank = "AD광고";
					}
					else {
						rank = "순위없음";
					}
				}
				
//				System.out.println( "=====" + (i+1) + "번째 제품=====" );
//				System.out.println( "제품명 : " + name );
//				System.out.println( "가격 : " + price );
//				System.out.println( "순위 : " + rank );
//				System.out.println( "상세스펙 : " + spec );
				
				list.add( new ProductInfo(page,name,price,spec,rank) );
			}
		}
		
		
		driver.close();		// 크롬 브라우저 종료
		
		System.out.println("제품의 개수 : " + list.size());

		// 파일 쓰기
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(csvPath));
			// 첫 줄은 제목의 용도로 쓸 예정
			writer.write("page,rank,name,price,spec\n");

			for(int i=0;i<list.size();i++) {
				writer.write( "".format("%d,%s,%s,%s,%s", list.get(i).page, list.get(i).rank, list.get(i).name, list.get(i).price, list.get(i).spec));
				writer.newLine();	// 개행 삽입 (위에서 \n해도된다)
			}
			
			writer.close();
		} catch (IOException e) {
		}

	} // main() 끝
}

class ProductInfo {
	int		page;
	String	name;
	String	price;
	String	spec;
	String	rank;
	
	ProductInfo(int page,String name,String price,String spec,String rank) {
		this.page = page;
		this.name = name;
		this.price = price;
		this.spec = spec;
		this.rank = rank;
	}
}