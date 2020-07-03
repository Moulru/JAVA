
public class ClassEx01 {

	public static void main(String[] args) {
		/*
		 * 			클래스~~~ = 앞에 static
		 * 
		 * 	1. 인스턴스 변수
		 * 		- 인스턴스가 생성될 때 생성된다
		 * 		- 생성된 인스턴스별로 독립적인 변수이다
		 * 	2. 클래스 변수
		 * 		- 인스턴스 변수 앞에 static을 붙이면 된다
		 * 		- 모든 곳에서 공통적으로 사용되는 변수 (값이 공유)
		 * 		- 인스턴스 생성 없이 사용 가능하다
		 * 			Car.value
		 * 		- 개념적으로 인스턴스변수/클래스변수와 같다
		 * 
		 * 	3. 인스턴스 메서드
		 * 		- 인스턴스를 통해서만 호출가능
		 * 		- 인스턴스 메서드 안에서만 다른 인스턴스 메서드를 호출가능
		 * 	4. 클래스 메서드
		 * 		- 클래스 메서드가 인스턴스 메서드를 호출할 수 없다
		 * 		- 클래스 메서드 안에서 인스턴스 변수를 접근할 수 없다
		 * 
		 * 		-->> 인스턴스 변수나 인스턴스 메서드를 사용하지 않는 메서드는
		 * 			 static을 붙여서 클래스 메서드로 만든다.
		 */

		Math.random();
		
		// 클래스 변수 접근 --> 클래스명을 통해서
		System.out.println(MyClass.value2);
//		MyClass.value1 --> 인스턴스 변수이기에 접근하려면 오류가 난다
		MyClass.printValue2();		// 클래스 메서드 호출
		
		MyClass class1 = new MyClass();
		System.out.println(class1.value1);	// 인스턴스 변수를 접근하려면 class지정을 해야함
		class1.value1 = 10;
		System.out.println("=============");
		class1.printValue();
		
		System.out.println("=============");
		
		MyClass class2 = new MyClass();
		class2.printValue();
		System.out.println("=============");
		class2.printValue();
		
		System.out.println(MyClass.value2);
		System.out.println(class1.value2);
	}
}

class MyClass {
	int value1;					// 인스턴트 변수
	static int value2;			// 클래스 변수
	
	void printValue() {			// 인스턴스 메서드
		int value3 = 30;
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);		// 인스턴스 메서드에서는 클래스 변수 접근 가능
		System.out.println("value3 : " + value3);
		value2++;
	}
	
//	클래스 메서드는 인스턴스 변수, 인스턴스 메서드에 접근할 수 없다
//		--> 클래스 변수에서는 인스턴스 생성없이 사용 가능하기 때문에
//		--> 인스턴스 변수, 인스턴스 메서드가 없다고 가정하고 만든다
	static void printValue2() {		// 클래스 메서드 (인스턴스 변수, 인스턴스 메서드에 접근할 수 없다)
//		System.out.println(value1);		// 인스턴스 변수 접근 불가
		System.out.println(value2);
		
//		printValue();					// 인스턴스 메서드 불가
	}
	// static은 static 끼리만!!! ★★★
}