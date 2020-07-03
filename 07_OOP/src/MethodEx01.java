
public class MethodEx01 {

	public static void main(String[] args) {
		/*
		 * 	오버로딩 (Overloading)
		 * 		(메서드 오버로딩이라고도 한다)
		 * 
		 * 		# 같은 이름의 메서드를 여러번 정의하는 것 (메서드 중복정의)
		 * 
		 * 		- 조건
		 * 			1. 메서드의 이름이 같아야한다
		 * 			2. 매개변수의 개수 또는 타입이 달라야 한다
		 * 				> 반환타입은 상관없다
		 * 			3. 메서드가 호출되는 시점에 어떤 메서드를 호출할 지 구분이 가능해야한다
		 * 
		 * 		- 장점
		 * 			1. 같은 기능을 하는 메서드를 타입별로 중복정의할 필요가 없다!
		 * 
		 * 		대표적으로 오버로딩이 사용된 예
		 * 		println				<<-오버로딩이 되어있다!! 숫자나 글자나 뭘넣어도 출력됨
		 */

		System.out.println( add(1,2) );
		System.out.println( add(1.1,2.2) );  			// <- 오버로딩을 하지않으면 타입이 맞지 않아 에러가 난다
		System.out.println( add(1,2,3) );
	}
	
	static int add( int num1, int num2) {
		return num1+num2;
	}
	
	static double add( double num1, double num2) {		// <- 메서드 오버로딩 (같은이름의 메서드)
		return num1+num2;
	}
	
	static int add( int num1, int num2, int num3) {
		return num1+num2+num3;
	}
}
