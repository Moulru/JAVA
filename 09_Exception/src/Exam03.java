
public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 	메서드에 예외 선언
		 * 		void method() throws Exception1, Exception2, ... ExceptionN {
		 * 			dkanrjsk
		 * 		}
		 */
		
//		method1();		// 예외가 선언된 메서드 호출 시 try-catch 필요
		
		try{
			method1();
		} catch ( Exception e) {
			System.out.println("main() catch!");
			System.out.println(e.getMessage());
			
			e.printStackTrace();	// 콘솔에 스택 정보 출력
			// stack 정보에 method1 이 찍힌다
			// 이 시점에서 e라는 참조변수가 가리키는 인스턴스는 method1에서 new로 생성된 인스턴스
			// 예외가 발생한 시점의 stack 정보! ★★
			
			// System.out.println( e.printStackTrace() );
			// 문자열같은 값이 반환되는 메서드였으면 println 같은 메서드안에 넣어줘야함
			// printStackTrace()은 바로 출력을 직접 하는 메서드
		}
		
		System.out.println("main() 끝");
	}

	static void method1() throws Exception {
		System.out.println("method1() 시작");
		
		throw new Exception();	// 예외 인스턴스를 생성하여 던진다!
		// 예외를 받아줄 catch 가 필요하다
	}
}
