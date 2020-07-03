public class Exam10 {
	public static void main(String[] args) {
		/*
		 * 	추상클래스 (abstract class)
		 * 		- 추상메서드를 포함하고 있는 클래스 (미완성 클래스)
		 * 			> abstract 제어자를 앞에 붙인다.
		 * 		- 추상클래스로는 인스턴스를 생성할 수 없다.
		 * 
		 * 	추상메서드 (abstract method)
		 * 		- 메서드를 '선언'만 해놓고 구현/정의하지 않은 메서드
		 * 			> abstract 제어자를 앞에 붙인다.
		 * 			> 구현하지 않기 때문에 { } 대신 세미콜론(;)으로 끝낸다.
		 * 				abstract void printInfo();
		 * 
		 * 	>>> 추상클래스를 상속 받은 클래스는 '반드시'
		 * 		추상메서드를 구현해야 한다. --> 오버라이딩해야 한다.	
		 * 
		 * 	왜 추상클래스를 사용을 할까??
		 * 		>> 기능 구현 시 반드시 꼭 자식클래스에서 만들어야만 하는 메서드
		 * 		>> 강제성!!
		 * 
		 * 
		 * 	추상화 : 클래스 간의 공통점을 찾아내서 공통의 부모클래스를 만드는 작업
		 * 		만약 Animal이라는 클래스가 없는 상태에서 Dog, Cat만 있었다!
		 * 			> 둘의 공통점은 cry() !!!
		 * 			> Animal 부모클래스를 만드는 작업 --> 추상화
		 *	
		 *	구체화 : 상속을 통해 클래스를 구현, 확장하는 작업
		 *		Animal 클래스만 있을 때, Dog, Cat을 만드는 작업 --> 구체화
		 * 
		 * 
		 */
//		Animal10 animal = new Animal10(); 
		// 추상클래스로는 인스턴스를 만들 수 없다. 왜? 미완성클래스 
		
		Dog10 dog = new Dog10();
		Cat10 cat = new Cat10();
		dog.cry();
		cat.cry();
		
	} // main() 끝
}// class Exam10 끝

// 추상클래스
abstract class Animal10 {
//	void cry() {   // 일반적인 인스턴스 메서드
//		
//	}
	
//	추상메서드 '선언' --> Animal10을 상속받는 클래스는 반드시 cry() 오버라이딩
	abstract void cry();
}

// 추상클래스를 상속 받은 클래스는 아래 둘 중 하나를 꼭 해야 한다.
//		1. 추상메서드를 오버라이딩한다.
//		2. 내 자신이 추상클래스가 되어, 나를 상속 받을 클래스에게
//			구현을 떠넘긴다.
class Dog10 extends Animal10 {

	@Override
	void cry() {
		System.out.println("멍멍멍!");
	}
}

class Cat10 extends Animal10 {
	@Override
	void cry() {
		System.out.println("야옹야옹");
	}
}






