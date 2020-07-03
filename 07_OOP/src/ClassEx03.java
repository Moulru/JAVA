
public class ClassEx03 {

	public static void main(String[] args) {
		/*
		 * 	JVM 메모리 구조
		 * 
		 * 		Method Area
		 * 			- 클래스가 사용되면 클래스의 정보가 저장
		 * 			- 클래스 변수 저장
		 * 		Heap
		 * 			- 생성된 인스턴스 저장
		 * 			- 인스턴스 변수 저장
		 * 		Call Stack			--> stack (first in, last out)
		 * 			- 메서드의 작업에 필요한 메모리 공간
		 * 			- 지역변수(매개변수포함), 연산결과 등을 저장
		 * 			- 작업을 마치면 자동으로 반환
		 */

		ClassEx03 ex03 = new ClassEx03();
		
		int number = 1 + 2;
		
		ex03.method1();
	}

	void method1()	{
		method2();
	}
	
	void method2()	{
		System.out.println("method2()");
	}
}
