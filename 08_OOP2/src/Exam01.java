public class Exam01 {
	public static void main(String[] args) {
		/*
		 * 	상속관계 (is-a)
		 * 		학생은 사람이다.
		 */
		
		// Person01을 상속 받은 자식클래스의 인스턴스 생성
		//		--> 부모클래스의 멤버도 포함한다.
		Student01 kim = new Student01();
		kim.name = "김철수";
		kim.age = 21;
		kim.major = "컴퓨터공학";
		kim.printPerson(); // 부모클래스의 메서드
		kim.printMajor(); // 자식클래스(자기 자신)의 메서드
		
		// 부모클래스라고 불렸던 Person01은
		// 이 아래에서는 Student01 클래스와 전혀 관계가 없다.
		Person01 hong = new Person01();
		hong.name = "홍길동";
		hong.age = 17;
		hong.printPerson();		
	}
}

class Person01 {
	String name;
	int age;
	
	void printPerson() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

// 학생은 사람을 상속 받았지만 사람 클래스는 변하는게 없다.
class Student01 extends Person01 {
	String major;
	
	void printMajor() {
		System.out.println("전공 : " + major);
	}
}





class Student01TEST { // Person01을 상속받은 Student01의 실체
	String name;
	int age;
	
	void printPerson() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	String major;
	
	void printMajor() {
		System.out.println("전공 : " + major);
	}
}