import java.util.Scanner;			// Scanner(입력)을 하려면 꼭 추가해야됨

public class ScannerEx {

	public static void main(String[] args) {
		/*
		 * 	출력 : print.. - 그냥 쓰면 됨
		 * 	입력 : Scanner - import를 해줘야 한다.  
		 */
		
		//	자료형 변수명 = 값
		int	num = 10;
		//	클래스명 이름(참조변수) = new ~~~
		Scanner	sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		num = sc.nextInt();
		// sc.nextInt(); 를 만나게 되면
		// ~~값이 입력되고 엔터가 눌리기 전까지 입력대기상태가 됨.
		
		// nextInt() --> 정수 값을 받는 메서드(함수,기능)
		// sc.next~~ 알맞은 자료형의 이름으로 기능을 사용
//		double d = 0.0;
//		d = sc.nextDouble();
		
		System.out.println("저의 나이는 "+ num + "살 입니다.");
		
		System.out.print("주소를 입력하세요 : ");
		// next()		: 문자열 입력받음. 띄어쓰기 전까지
		// nextLine()	: 문자열 입력받음. 한 줄 전체(엔터까지)
		//				  키보드버퍼가 비어있으면, 입력대기상태
		//				  아니면, 전체 내용을 읽어들인다.
	
		String addres = "";		// 빈값으로 생성
		sc.nextLine();			// 위에 입력된 엔터를 꺼내준다.
		addres = sc.nextLine();
		
		System.out.println("주소는 " + addres + "입니다.");
		
	}
}
