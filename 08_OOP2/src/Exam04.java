public class Exam04 {
	public static void main(String[] args) {
		/*
		 * 	오버라이딩 (overriding)		--> 상속 관계에서만 나오는 개념
		 * 		- 부모클래스의 메서드를 자식클래스에서 '재정의'하는 것
		 * 		- 자식클래스에서 재정의를 하면 부모클래스의 메서드는 '무시'된다.
		 * 
		 * 		조건
		 * 			1. 메서드 이름이 같아야 한다. (오버로딩도!)
		 * 			2. 매개변수가 같아야 한다. (오버로딩은 달라야 함)
		 * 			3. 반환타입이 같아야 한다. (오버로딩은 상관 없음)
		 * 				--> 결국 완전히 동일한 형태여야 한다.
		 * 
		 * 		오버로딩		: 이름만 같은 메서드를 여러 개 정의하는 것
		 * 		오버라이딩	: 부모클래스의 메서드를 자식클래스에서 재정의하는 것
		 * 
		 * 		
		 * 		super
		 * 			this처럼(자기 자신 클래스를 가리킴)
		 * 			부모클래스의 멤버를 접근
		 * 		
		 * 		super()
		 * 			this() --> 내 클래스의 생성자 메서드 호출
		 * 			부모클래스의 생성자를 호출
		 */
		
		
		Parent04 p1 = new Parent04();
		p1.printValue();
		
		
		
		Child04 c1 = new Child04();
		c1.printValue();
	}
}

class Parent04 {
	int value = 10;
	
	void printValue() {
		System.out.println("Parent04의 printValue() : " + value);
	}
}

class Child04 extends Parent04 {
	int value = 20;
	// 오버라이딩 했다!!
	@Override
	void printValue() {
//		변수의 이름이 같을 때 찾는 순서
//			1. 지역변수
//			2. 멤버변수 (내 클래스의) --> this
//			3. 부모클래스의 멤버변수 --> super
		System.out.println("Child04의 printValue() : " + value);
		System.out.println("Child04의 printValue() super : " + super.value);
	}
}





