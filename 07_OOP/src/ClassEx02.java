
public class ClassEx02 {

	// 더한값을 반환하는 클래스 메서드
	static int add1(int num1,int num2) {
		return num1+num2;
	}
	// 더한값을 출력하는 클래스 메서드
	static void add2(int num1,int num2) {
		System.out.println(num1+num2);
	}
	// 더한값을 반환하는 인스턴스 메서드
	int add3(int num1,int num2) {
		return num1+num2;
	}
	// 더한값을 출력하는 인스턴스 메서드
	void add4(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		/*
		 * 	클래스 메서드	/	인스턴스 메서드
		 * 	반환 있다		/	반환 없다
		 * 
		 * 	add1 ~ add8 사용해서 결과 출력
		 */

		// 원레는 ClassEx02.add~~ 라고 써야하지만, 같은 클래스의 메서드이기 때문에 생략이 가능하다!
		System.out.println(add1(1,0));
		add2(2,0);
		
		ClassEx02 myClass1 = new ClassEx02();
		System.out.println(myClass1.add3(3,0));
		myClass1.add4(4,0);
		
		// 다른 클래스의 클래스메서드는 '무조건' 클래스명.메서드명();
		System.out.println(myAddClass.add5(5,0));
		myAddClass.add6(6,0);
		
		myAddClass myClass2 = new myAddClass();
		System.out.println(myClass2.add7(7,0));
		myClass2.add8(8,0);
		
	}
}

class myAddClass {
	// 더한값을 반환하는 클래스 메서드
	static int add5(int num1,int num2) {
		return num1+num2;
	}
	// 더한값을 출력하는 클래스 메서드
	static void add6(int num1,int num2) {
		System.out.println(num1+num2);
	}
	// 더한값을 반환하는 인스턴스 메서드
	int add7(int num1,int num2) {
		return num1+num2;
	}
	// 더한값을 출력하는 인스턴스 메서드
	void add8(int num1,int num2) {
		System.out.println(num1+num2);
	}
}