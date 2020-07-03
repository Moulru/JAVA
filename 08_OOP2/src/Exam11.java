public class Exam11 {
	public static void main(String[] args) {
		/*
		 * 	인터페이스 (interface)
		 * 		- 일종의 추상클래스 -> 추상클래스보다 '추상화' 정도가 높다.
		 * 		- 실제 구현된 것이 없는 껍데기 기본 '설계도'
		 * 		- 멤버로 가질 수 있는 것 : 추상메서드, 상수
		 * 		- 인스턴스 생성 불가
		 * 			> 클래스 작성에 도움을 주는 목적으로 사용
		 * 		- 미리 정해진 규칙에 맞게 작성하도록 '표준'을 제시한다.
		 * 
		 * 		- class 대신 interface 라고 쓰면 된다.
		 * 
		 * 	인터페이스 상속 extends 사용
		 * 		- 다중 상속이 가능하다.
		 * 		- 인터페이스 끼리!
		 * 
		 * 	인터페이스를 클래스가 사용 -> 인터페이스의 추상메서드를 '구현'
		 * 		implements 사용
		 * 			- 클래스가 인터페이스를 구현한다.
		 * 			- 추상메서드를 완성해야 한다.
		 * 			- 클래스의 상속 + 인터페이스 구현 동시에 가능
		 * 
		 * 	인터페이스 장점
		 * 		1. 개발 시간의 단축 (동시 개발)
		 * 		2. 표준화 (틀이 만들어져 있다!)
		 * 		3. 독립적인 프로그래밍
		 * 
		 * 
		 * 
		 */
	} // main() 끝
} // class Exam11 끝

// 1. 인터페이스 작성
interface MyInterface {
	// 추상메서드와 상수만을 멤버로 가질 수 있다.
	public static final int NUM = 10; // 인터페이스의 상수 멤버
	public abstract void printNum();  // 인터페이스의 추상메서드
	
	int NUM2 = 20;		// 생략
	void printNum2();	// 생략
}

// 2. 인터페이스 상속
interface Fighter { // 싸움을 하는~!
	void Fight();
}

interface Singer { // 노래를 부르는~!
	void Sing();
}

// 인터페이스는 다중 상속이 가능하다.
interface TEST1234 extends Fighter, Singer {
	
}

class Person11 {
	String name;
	int age;
}

// Person11 클래스 상속
// 인터페이스 구현
class Student11 extends Person11 implements Fighter, Singer {
	@Override
	public void Sing() {
	}

	@Override
	public void Fight() {
	}
}









