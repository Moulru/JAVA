
public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 	예외 발생시키기
		 * 		- throw (던지기) 를 이용하여 고의로 예외 발생!
		 */

		try {
//			Exception e = new Exception();
//			throw e;
			
			throw new Exception("예외발생!!");
			// 생성자로 전달된 문자열은 detailMessage 라는 멤버변수에 저장이 된다 (getMessage()시 호출됨)
			
		} catch (Exception e) {
			System.out.println("메세지 : " + e.getMessage());
		}
		
	}
}
