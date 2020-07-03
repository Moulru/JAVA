public class Exam09 {
	public static void main(String[] args) {
		/*				다 형 성 ! !
		 * 
		 * 	(1) 다형성 (polimorphism)
		 * 		- 정의 : 여러 가지 형태를 가질 수 있는 능력
		 * 			> 한 타입의 참조변수로 여러 타입의 인스턴스를 참조할 수 있다.
		 * 
		 * 		- 부모클래스 타입의 참조변수 = 자식클래스 인스턴스
		 * 
		 * 
		 * 	(2) '참조변수'의 형변환 (int) (float) --> casting
		 * 		- 자식 -> 부모 : Up-casting	: 형변환 생략 가능
		 * 		- 부모 -> 자식 : Down-casting : 형변환 생략 불가능
		 * 		- 명시적 형변환 사용
		 * 
		 * 		* 형변환도 당연히 상속 관계에서만 가능
		 * 		* new 로 생성된 인스턴스는 동일하다.
		 * 			--> 사용할 수 있는 멤버의 수만 달라진다.
		 * 
		 * 
		 * 	(3) instanceof 연산자 -> operator
		 * 		- 참조변수가 가리키는 인스턴스의 타입을 확인한다.
		 * 		- true/false 를 리턴해주기 때문에,
		 * 			주로 조건문에서 사용한다.
		 * 		- 실제 인스턴스의 부모클래스로 검사해도 true가 나온다.
		 * 			> 상속 받았으니까!
		 * 		- 검사 결과가 true --> 형변환이 가능하다!
		 * 
		 * 	(4) 참조변수와 인스턴스의 멤버와의 연결관계
		 * 		> 변수명이 같을 때 무엇이 연결이 되나?
		 * 			ex) 지역변수>멤버변수>부모클래스멤버변수
		 * 		> 메서드 : 오버라이딩과 상관 없이 '항상' 
		 * 					실제 인스턴스의 메서드가 호출된다.
		 * 		> 멤버변수 : 참조변수의 타입에 따라 달라진다.
		 * 
		 * 	(5) 매개변수의 다형성   --> 엄청나게 쓰인다.
		 * 			매개변수를 부모클래스 타입의 참조변수
		 * 				--> 자식클래스의 인스턴스를 받을 수 있다.
		 * 
		 *  (6) 배열형태로 다루기
		 *  		부모클래스 타입 참조변수 배열을 생성
		 *  		실제 인스턴스는 자식클래스 타입으로 만들어 사용 가능
		 * 
		 */
//		(1) 다형성
//		Person09 타입의 참조변수로 Student09 인스턴스를 참조했다. (부모->자식)
		Person09 p1 = new Student09();
//		자기 자신의 인스턴스를 참조했다.
		Student09 s1 = new Student09();
		
//		Student09 s2 = new Person09(); // 불가능 (자식->부모)
		
//		인스턴스 : 실제 대상 (=객체)
//		참조변수 : 인스턴스를 가리킨다. (인스턴스를 사용하기 위한 변수)

//		학생에게 어이~ 사람!! 이라고 부르는건 말이 된다.
//		사람한테 어이~ 학생!! 이라고 부르는건 말이 안 된다. (학생이 아니면?)
		
		p1.printPerson();
		s1.printMajor();
//		학생보고 사람이라고 부르게 되면, 그 학생은 사람의 기능/속성만 사용 가능
//		p1은 Person09 클래스의 정보만 알고 있기 때문!		
		
		
//		(2) 참조변수 형변환
		Student09 s2 = (Student09)p1; // 생략 불가
		// 실제 p1의 인스턴스는 Student09 이다.
		// 단지 참조변수만 Person09 이다. 부모->자식 (Down-casting)
		
//		Person09 p2 = new Student(); 생김새가 비슷하다!!
		Person09 p2 = s1; // 형변환 생략 가능
		// 실제 s1의 인스턴스는 Student09 이다.
		// 참조변수도 Student09이다. 자식 -> 부모 (Up-casting)
		
//		안 되는 것
		Person09 p3 = new Person09(); // 참조변수 타입도, 인스턴스도 Person09
//		System.out.println("형변환 before");
//		Student09 s3 = (Student09)p3;
//		System.out.println("형변환 after");
//		자식클래스 참조변수가 부모클래스 인스턴스를 참조할 수 없다.
//		강제로 명시적 형변환을 해도 실행 시 오류 발생!!
		
		
//		(3) instanceof 연산자
//		Person09 p1 = new Student09();
//		Person09 p2 = s1;
//		Person09 p3 = new Person09();
//		Student09 s1 = new Student09();
//		Student09 s2 = (Student09)p1;
		System.out.println("=====instanceof 연산자=====");
		System.out.println("p1 instanceof Person09 : " + (p1 instanceof Person09) );
		System.out.println("p1 instanceof Student09 : " + (p1 instanceof Student09) );
		System.out.println("p2 instanceof Person09 : " + (p2 instanceof Person09) );
		System.out.println("p2 instanceof Student09 : " + (p2 instanceof Student09) );
		System.out.println("p3 instanceof Person09 : " + (p3 instanceof Person09) );
		System.out.println("p3 instanceof Student09 : " + (p3 instanceof Student09) );
		System.out.println("s2 instanceof Person09 : " + (s2 instanceof Person09) );
		System.out.println("s2 instanceof Student09 : " + (s2 instanceof Student09) );
		// 모든 클래스의 조상 : Object (모든 클래스가 상속 받았다)
		System.out.println("s2 instanceof Object : " + (s2 instanceof Object) );
		
		
//		(4) 참조변수와 인스턴스의 멤버와의 연결관계
		Person09 p4 = new Student09();
		Student09 s4 = new Student09();
//		참조변수에 맞게 멤버변수가 연결
		System.out.println( "p4.str : " + p4.str );
		System.out.println( "s4.str : " + s4.str );
//		실제 인스턴스에 맞게 메서드가 연결
//			오버라이딩 되어 있기 때문!
		p4.printStr();
		s4.printStr();
		
//		printStr() 가 Student09에 오버라이딩되어 있지만...
//		Person09 인스턴스는 Student09를 모른다.
		Person09 p5 = new Person09();
		p5.printStr();
		
//		(5) 매개변수의 다형성
		Student09 		st = new Student09();
		Driver09 		dd = new Driver09();
		Stewardess09 	sd = new Stewardess09();
		// 만약 참조변수를 메서드에 전달하여 신분증 검사를 한다면?
		checkIdCard(st);
		checkIdCard(dd);
		checkIdCard(sd);
		
//		(6) 배열형태로 다루기
		Person09[] arrPerson1 = { st, dd, sd };
		// for문을 통해서 배열 인덱스에 접근하여 공통적인 메서드들을 한 번에 호출
		
		Person09[] arrPerson2 = new Person09[3];
		arrPerson2[0] = new Student09();
		arrPerson2[1] = new Driver09();
		arrPerson2[2] = new Stewardess09();
		
	} // main() 끝
	
	// 메서드 오버로딩을 사용한 경우 -> 매개변수의 타입이 다르다!
//	static void checkIdCard( Student09 s ) {
//		System.out.println("ID Card 확인 : " + s.getIdCard());
//	}
//	static void checkIdCard( Driver09 s ) {
//		System.out.println("ID Card 확인 : " + s.getIdCard());
//	}
//	static void checkIdCard( Stewardess09 s ) {
//		System.out.println("ID Card 확인 : " + s.getIdCard());
//	}
	
	// 다형성을 이용하여 한 번에 해결
	static void checkIdCard( Person09 p ) {
		// 참조변수는 부모클래스 타입
		// 인스턴스는 자식클래스
		System.out.println("ID Card 확인 : " + p.getIdCard());
		// getIdCard() 메서드는 오버라이딩된 자식클래스들의 메서드가 호출
	}
	
} // clas Exam09 끝

class Person09 { // 사람
	private String name; // 외부 접근 불가능한 인스턴스 변수
	private int age;
	String str = "Person09의 str입니다.";
	// 인스턴스변수, 명시적초기화
	
	private String idCard;	// 신분 증명하는 신분증
	// private이기 때문에~ 외부에서 값을 사용하려면 getter 가 필요
	
	String getIdCard() { // getter
		return idCard;
	}
	
	void printPerson() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	void printStr() {
		System.out.println("Person09의 메서드 : " + str);
	}
}

class Student09 extends Person09 { // 학생 --> 사람이기도 한 학생
	private String major;
	String str = "Student09의 str입니다.";
	private String idCard = "학생증번호~~~~~샬라샬라써있음";
	
	void printMajor() {
		System.out.println("전공 : " + major);
	}
	
	void printStr() { // 오버라이딩됐다!!
		System.out.println("Student09의 메서드 : " + str);
	}
	
	// 각 자식클래스들이 오버라이딩을 한다.
	String getIdCard() { // getter
		return idCard;
	}
}

class Driver09 extends Person09 { // 운전기사
	private String idCard = "운전면허증번호~~~~";
	
	String getIdCard() { // getter
		return idCard;
	}
}

class Stewardess09 extends Person09 { // 스튜어디스
	private String idCard = "여권번호~~~~~";
	
	String getIdCard() { // getter
		return idCard;
	}
}


