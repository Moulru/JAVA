public class Exam06 {
	public static void main(String[] args) {
		/*
		 * 	래퍼(wrapper) 클래스
		 * 		- 기본자료형을 클래스로 정의한 것
		 * 			기본자료형 : int나 double 같은 자료형
		 * 			참조자료형 : 클래스 타입 (참조형변수)
		 * 		- 기본자료형 값(10, 10.1, false 등등) 들도
		 * 			클래스로 다뤄져야할 때가 있다. (제네릭 사용!)
		 * 
		 * 		기본자료형			래퍼클래스
		 * 		-------------------------
		 * 		boolean			Boolean
		 * 		byte			Byte
		 * 		short			Short
		 * 		long			Long
		 * 		float			Float
		 * 		double			Double
		 * 		int				Integer	 (full-name)
		 * 		char			Character (full-name)
		 * 
		 * 		- 내부적으로 (멤버변수로) 기본자료형의 변수를 가지고 있다.
		 * 			String 클래스에서 char[] 형태로 문자열을 가지고 있던 것 처럼
		 * 		- equals() 가 오버라이딩 되어 있다. (값만 비교)
		 */
		int value = 10;
		Integer int1 = new Integer(10);
		Integer int2 = new Integer(10);
		
		// 생성자로 전달된 값만 가지고 비교를 한다.
		System.out.println( int1.equals(int2) ); // 오버라이딩됨
		System.out.println( int1 == int2 );
						// 그냥 int 변수였다면 true을 것!
		
		// 래퍼클래스의 참조변수를 그대로 사용하면 기본자료형의 값이 반환
		System.out.println( int1 + 20 ); 
		System.out.println( int1.toString() + 20 ); // toString()이 오버라이딩된 것
		System.out.println( value );
		
		System.out.println("=================");
		// 문자열을 숫자로 변환
		int num = Integer.parseInt("123"); // 문자열을 숫자로 변환하는 클래스메서드
		System.out.println(num + 20);
		
		num = Integer.parseInt("10", 2); // 2진수
		System.out.println(num);
		num = Integer.parseInt("10", 8); // 8진수
		System.out.println(num);
		num = Integer.parseInt("10", 16); // 16진수
		System.out.println(num);
		num = Integer.parseInt("F0", 16); // 16진수 -> A~F 문자표현가능
		System.out.println(num);
		
		// 진수를 지정하지 않으면 기본 10진수
		num = Integer.parseInt("-10"); // -는 음수를 나타내는 부호로 쓰임
		System.out.println(num+1);
		
		double num2 = Double.parseDouble("10.1"); // .은 소수점 나타냄
		System.out.println(num2);
		
		
		
	} // main() 끝
}