
public class ExceptionEx {

	public static void main(String[] args) {
		/*
		 * 	예외처리 (Exception handling)
		 * 		1. 프로그램 오류
		 * 			- 컴파일 에러 : 컴파일 과정에서 발생하는 에러 > 문법오류 (.class 파일 생성 안됨)
		 * 			- 런타임 에러 : 실행 중 발생하는 에러 
		 * 							ex) 재귀호출을 무한대로 반복하다보면 나오는 StackOverflow, 배열 인덱스 잘못접근
		 * 			- 논리적 에러 : 개발자가 생각한 개발의도와 다르게 동작
		 * 
		 * 		2. 예외처리
		 * 			- 런타임에서 발생할 수 있는 오류를 대비한 코드 작성
		 * 			- 프로그램의 비정상 종료를 막는다
		 * 			- 기본적인 예외처리 : if문
		 * 
		 * 		3. 문법적인 예외처리 try~catch문
		 * 			- 예외처리를 하는 구문
		 * 			- { } 블록 생략 불가능
		 * 			
		 */
		
		System.out.println("main() 시작");
		
//		System.out.println(10/0);		// 0으로 나누면 런타임 에러나서 프로그램 강제종료가 됨
		
		try {		// try블럭 안에 작성하는 코드 : 예외가 발생할 것으로 예상되는 코드
			// 예외발생 예상지역
			System.out.println("0으로 나누기 직전입니다.");
			System.out.println(10/0);		// 예외가 발생하면 더이상 수행되지않고 catch구문으로 넘어감
			System.out.println("0으로 나눈 후 입니다.");
		} catch (Exception e) {			// Exception 클래스 = 모든 예외 클래스의 조상
			// 예외발생 시 처리 지역
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		
		System.out.println("main() 끝");
	}	// main() 끝

}
