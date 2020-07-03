
public class Practice02 {
//						main()에서 예외 던짐 = 프로그램 종료
	public static void main(String[] args) throws Exception {
		/*
		 * 	사용자 정의 예외클래스 만들기
		 * 		class MyException
		 * 			> Exception 클래스 상속받기
		 * 			> 멤버변수
		 * 				private final int ERR_CODE;
		 * 				인스턴스 생성 시 에러코드를 저장할 '상수'	
		 * 					멤버 상수의 초기화
		 * 					1) 명시적 초기화
		 * 					2) 초기화 블럭
		 * 					3) 생성자
		 * 					세 개 중 1개는 반드시 해야됨
		 * 			> 메서드 오버라이딩하기
		 * 				getMessage() 메서드
		 */

//		throw new Exception("에러발생");
//		Exception in thread "main" java.lang.Exception: 에러발생
//		at Practice02.main(Practice02.java:21)
//		이 시점에 "에러발생"이 출력됐다 = getMessage()가 호출됬다
		
		throw new MyException("에러발생", 200);
//		Exception in thread "main" MyException: 에러발생(코드:200)
//		at Practice02.main(Practice02.java:21)
		
	}	// main() 끝

}	// Practice02 클래스 끝

class MyException extends Exception {
	private final int ERR_CODE;
	
	MyException(String msg, int ERR_CODE) {
		super(msg);
		this.ERR_CODE = ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + " (코드:" + ERR_CODE + ")";
	}
}