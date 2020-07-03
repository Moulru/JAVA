public class Exam05 {
	public static void main(String[] args) {
		/*
		 * 	상속과 생성자
		 * 		자식클래스의 인스턴스 생성 시 호출 순서
		 * 			1. 자식클래스의 생성자 호출
		 * 			2. 자식클래스 생성자에서 부모클래스 생성자를 호출
		 * 			3. 부모클래스 생성자 코드 수행
		 * 			4. 자식클래스 생성자 나머지 코드 수행
		 * 			5. 인스턴스 생성
		 */
//		Person05 p1 = new Person05();
//		Student05 s1 = new Student05();
		
		Student05 s1 = new Student05(); // 생성자 오버로딩
		s1.printPerson();
		Student05 hong = new Student05("홍길동", 30); // 생성자 오버로딩
		hong.printPerson();
		// name, age가 들어있다. 왜? 상속받은 Person에 있으니깐!
		
		Student05 kim = new Student05("김철수", 21, "컴퓨터공학");
		kim.printPerson(); // 상속받은 Person 의 메서드
		kim.printMajor();  // 자기 자신 클래스의 메서드
	}
}

class TEST00 {
	
}
class TEST123 extends TEST00{
//	TEST123() { } // 기본생성자는 다른 생성자가 있으면 자동으로 만들어지지 X
	TEST123(int a) { }
	TEST123(int a, int b) { }
	TEST123(int a, int b, int c) { }
}

class TEST456 extends TEST123 {
//	TEST456() { super(); }
	TEST456(int a) {
//		super();  // --> TEST123();
		super(1, 2);
	}
}

class Person05 {
	String name;
	int age;
	
	// 우리가 만들지 않아도 자동으로 생성되는 기본생성자
//	Person05() { 
//		System.out.println("Person05() 호출");
//	}
	
	// 생성자를 직접 정의하면, 기본생성자는 만들어지지 않는다!!
	Person05( String name, int age ) {
		this.name = name;
		this.age = age;
		
		System.out.println("Person05(String,int) 호출");
	}
	
	void printPerson() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student05 extends Person05{
	String major;
	
	// 우리가 만들지 않아도 자동으로 생성되는 기본생성자
	Student05() {
//		상속받은 클래스가 있을 경우, 부모클래스의 생성자를 호출한다.
//		super(); // 모든 자식클래스에는 이 코드가 숨겨져있다!!
//					--> 부모클래스의 기본생성자를 호출하는 코드
		
//		부모클래스에 기본생성자가 없기 때문에, 자동으로 해주는 super() 로는
//		부모클래스의 생성자를 호출할 수 없다!!
//		그래서 우리는 super()를 이용해서 부모클래스 생성자를 직접 호출해야한다.
		super("개똥이", 20);
		System.out.println("Student05() 호출");
	}
	
	Student05(String name, int age) {
//		super(); 가 들어있는데!! 마찬가지로 부모클래스에 기본생성자가 없다.
		super(name, age);
	}
	
	Student05(String name, int age, String major) {
		// 부모클래스 생성자의 호출은
		// 반드시 생성자 코드 가장 위에 와야 한다.
		
//		순서가 아래 있어서 오류
//		this.major = major;
//		super(name, age);

//		정상적인 순서
		super(name, age);
		this.major = major;
	}
	
	void printMajor() {
		System.out.println("전공 : " + major);
	}
	
//	이름 나이 전공 모든 정보를 출력하는 메서드 만들기
//	단, print 쓰지 않기
	void printAll() {
		super.printPerson(); // super를 붙이지 않으면, 오버라이딩된 메서드 호출
		this.printMajor(); // printMajor(); 와 같다 (왜? 부모클래스에 없어서)
	}
	
//	부모클래스(Person)에 있던 메서드를 오버라이딩 하였다.
//	print를 쓰지 않고, 이름 나이 전공을 출력하기
//		printAll()은 사용 XX
	void printPerson() {
		super.printPerson();
		printMajor();
	}
}


/*
 * 		클래스 A, B, C, D
 * 			상속관계 : A <- B <- C <- D
 * 	
 *		D 클래스의 인스턴스 생성 시 생성자 호출 흐름
 *
 *			1. D클래스의 생성자 호출
 *			2. D클래스가 C클래스의 생성자 호출
 *			3. C클래스가 B클래스의 생성자 호출
 *			4. B클래스가 A클래스의 생성자 호출
 *			(A클래스는 상속 받은 클래스가 없다.)
 *			5. A클래스의 생성자 코드 수행
 *			6. B클래스의 생성자 코드 수행
 *			7. C클래스의 생성자 코드 수행
 *			8. D클래스의 생성자 코드 수행
 *			9. D클래스의 인스턴스 생성!!!
 * 
 * 
 * 
 */













