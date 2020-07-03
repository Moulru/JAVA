import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FileTest {

	public static void main(String[] args) {
		// 데이터를 실제 파일로 쓰는 작업
		
		// 파일을 다루려면 파일의경로와 파일명을 알아야한다
		
		// 현재 프로젝트폴더 구하기
		String projectPath = System.getProperty("user.dir");
//		System.out.println(projectPath);
		
		// 파일을 쓸 경로와 파일명
		String filePath = projectPath + "\\lib\\test.txt";
//		System.out.println(filePath);
		
		
		// 파일 쓰기
		try {
			Document doc = Jsoup.connect("http://prod.danawa.com/list/?cate=112758").get();
			
			// 해당 파일의 인스턴스가 정상적으로 생성이 된다면,
			// 파일의 Handle을 확보했다 (내가 사용하는 동안 남이 이 파일을 지우거나 변경X)
			BufferedWriter writer = new BufferedWriter( new FileWriter(filePath));
			
//			writer.write("안녕??!!");
			// html() : 내가 가져온 페이지 정보를 html형식의 String으로 반환
			writer.write(doc.html());
			
			// 파일을 다 사용하고 나면 반드시!! close()로 닫아줘야한다 (그래야 남이 사용가능) ★★
			writer.close();
		} catch (IOException e) {
		}
		
		
	}

}
