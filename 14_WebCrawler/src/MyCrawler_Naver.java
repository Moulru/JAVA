import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MyCrawler_Naver {

	public static void main(String[] args) {

		try {
			
			Document doc = Jsoup.connect("http://news.naver.com/").get();
			
			Elements hotNews = doc.select("ul.type14");
			Elements news = hotNews.select("li");
			
			System.out.println("많이본 뉴스 종합 랭킹순위");
			for (int i=0;i<news.size();i++) {
				System.out.println((i+1)+"위 : " + news.get(i).text());
				
				// System.out.println(news.get(i).select("a").attr("title"));
				//						<li>태그 안의 <a>에서 title만 가져올경우
			}
			
			Document doc2 = Jsoup.connect("http://news.naver.com/main/ranking/memoWeek.nhn?rankingType=memo_week&sectionId=000&date=20180228").get();
			
			Elements mostRp = doc2.select("div.ranking_top3 ol");
//			Elements mostRp = doc2.select("div.content");
			Elements rp = mostRp.select("li");
			
			System.out.printf("\n\n댓글 많이 단 뉴스 TOP3\n");
			for (int i=0;i<rp.size();i++) {
				System.out.println((i+1)+"위 : " + rp.get(i).text());
			}
			
			// 네이버 뉴스페이지에서 실시간 뉴스 랭킹의 제목들 출력하기
			// 댓글 많은 뉴스, 많이 본 뉴스
			
		} catch (IOException e) {
		}

	}

}
