import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class MyCrawler {
	public static void main(String[] args) {
		/*
		 * 	웹크롤링
		 * 		- 인터넷 페이지에서 데이터를 가져와 가공하는 것
		 * 		- parsing(파싱) : 내가 원하는 데이터를 특정 패턴이나 순서로 추출하여 가공하는 것
		 * 
		 * 		1. Jsoup 라이브러리 다운로드
		 * 			https://jsoup.org/download 에서 core library 다운로드 후
		 * 			workspace에 lib 폴더 생성하고 lib폴더에 다운받은 파일을 넣어줌
		 * 		2. 프로젝트에 외부 라이브러리 추가
		 * 			이클립스 상단 탭의 Project 클릭, properties 안에서 좌측탭의 JAVA Build Path 클릭
		 * 			JAVA Build Path의 Libraries탭에 Add External JARs..(외부 라이브러리 추가) 클릭 후 다운받은 파일 추가
		 */

		try {
			// 					connect : 해당 URL연결				 get : Document 인스턴스로 반환
			Document doc = Jsoup.connect("http://www.danawa.com").get();
			// 다나와 페이지에 접속하여 페이지의소스(html)을 구해온다

//			 doc에서 <div class="main_middle_content"를 가져오겠다!
			// 띄고 ul을 붙인 것은, 하위 <ul>을 모두 가져오겠다!
			Elements hotdeal = doc.select("div.main_middle_content ul");
//			// 그 하위에서 또 <li>를모두가져오겠다!
			Elements deal = hotdeal.select("li");

			for (int i = 0; i < deal.size(); i++) {
				System.out.println(deal.get(i).text());
			}
			
			
		} catch (IOException e) {
		}

	}
}