public class Exam07 {
	final int NUM; // final이 붙으면 반드시 초기화를 해야 한다.
	final int NUM2 = 10; // 명시적 초기화
	final int NUM3; // 어딘가에서는 반드시 초기화가 돼야 한다.
	// 명시적, 초기화블럭, 생성자
	
	{
		NUM = 20;
	}
	
	Exam07() {
		NUM3 = 50;
	}
	
	
	public static void main(String[] args) {
		final int NUM10;
		NUM10 = 10;
//		System.out.println(NUM10);
		/*
		 * 	제어자 (modifier)
		 * 		- 클래스, 변수, 메서드 선언부에 함께 사용하여 의미 부여
		 * 
		 * 		접근제어자 : public, protected, (default), private
		 * 		그 외 : static, final, abstract, 등등...
		 * 
		 * 		- 하나의 대상에 여러 제어자를 조합하여 사용 가능
		 * 		- 접근제어자는 1개만 사용 가능 (다른 제어자와 조합은 가능)
		 * 			> 접근제어자를 동시에 여러 개 사용 불가
		 * 		- 접근제어자를 가장 왼쪽에 적는다. (필수는 아님)
		 * 
		 * 		1. static - 클래스의, 공통적인
		 * 			사용되는 곳 : 멤버변수, 메서드, 초기화블럭
		 * 
		 * 		2. final - 마지막의, 변경될 수 없는
		 * 			사용되는 곳 : 클래스, 메서드, 멤버변수, 지역변수
		 * 				클래스 - 상속 받지 못하게 한다.
		 * 				메서드 - 오버라이딩 못하게 한다.
		 * 				변수 - 값을 변경하지 못하는 상수가 된다.
		 * 
		 * 				final 멤버변수(상수) 초기화
		 * 					1. 명시적초기화 (모든 인스턴스가 같은 값이 된다.)
		 * 					2. 인스턴스 초기화 블럭 (동일)
		 * 					3. 생성자 (매개변수를 통해 인스턴스별로 다른 값)
		 * 						==> 생성자에서 하는 걸로! (목적에 따라 다를 수는 있음)
		 * 
		 * 		3. abstract - 추상의, 미완성의
		 * 			사용되는 곳 : 클래스, 메서드
		 * 				메서드 - 추상메서드이다.
		 * 				클래스 - 추상메서드를 포함한 추상클래스이다.
		 * 
		 * 		4. 접근제어자 (access modifier)
		 * 			사용되는 곳 : 클래스, 메서드, 멤버변수, 생성자
		 * 				private : 외부 접근 불가 (같은 클래스 내에서만 접근 가능)
		 * 										메서드에서 private 멤버변수 접근
		 * 		기본		(default) : 같은 패키지 내에서만 접근 가능
		 * 				protected : 같은 패키지 내에서 접근 가능, 자식클래스에서도 가능
		 * 				public : 접근 제한 없음
		 * 			
		 * 			* default 는 직접 입력하는게 아니다.
		 * 				아무것도 안 쓰면 default이다.
		 * 			* 클래스에는 접근제어자를 붙이지 않거나(default) public 밖에 없다.
		 * 
		 *  		권한의 정도
		 *  			public > protected > (default) > private
		 *  
		 *  	- 데이터의 캡슐화
		 *  		접근제어자로 멤버변수의 접근을 제한하는 것 --> 보호한다.
		 *  		데이터 감추기(data hiding), 캡슐화(encapsulation)
		 *  
		 *  	- 접근제어자를 사용하는 이유
		 *  		1. 외부로부터 데이터를 보호 (값을 마음대로 변경할 수 X)
		 *  		2. 외부에 공개할 필요가 없는 정보를 감추기 위함
		 *  
		 *  	- getter 와 setter 메서드
		 *  		> 별다른게 아니라 단지 private 멤버 값 세팅 및 반환
		 *  		> setData, getData 와 같이 이름을 짓는다.
		 *  	***	> 잘못된 값이 세팅되는 것을 방지하기 위함.
		 *  
		 *  	- 생성자의 접근제어자
		 *  		Singleton pattern
		 *  			> 인스턴스가 하나만 존재하도록 설계
		 *  			> 메모리 전체에 인스턴스 하나만 두고 사용
		 *  
		 *  	- 제어자 조합
		 *  		1. 메서드에 static과 abstract 함께 사용 불가
		 *  			> static 메서드는 몸통(코드구현)이 필요하다.
		 *  			> abstract 메서드는 몸통이 없다.
		 *  		2. 클래스에 abstract와 final 함께 사용 불가
		 *  			> final : 상속 불가
		 *  			> abstract : 추상화 (상속이 되어야 기능 구현이 됨)
		 *  		3. abstract 메서드는 private일 수 없다.
		 *  			> private : 외부 접근 불가
		 *  			> abstract 메서드 : 자식클래스에서 오버라이딩해야함.
		 *  
		 *  [public과 main함수]
		 *  	1. public class가 있는 경우, 소스파일명은 반드시
		 *  		public class의 이름으로 해야 한다.
		 *  	2. public class가 하나도 없으면, 소스파일명은
		 *  		어느 클래스명이 돼도 상관없다.
		 *  	3. 하나의 소스 파일에는 public class는 단 하나!
		 *  	4. .class 파일은 선언된 클래스당 하나씩 만들어진다.
		 */
		
		MyData07 data07 = new MyData07();
//		data07.data = 10;
		data07.setData(10);
//		System.out.println(data07.data);
		System.out.println(data07.getData());
		
		
//		Singleton s = new Singleton(); // 생성자가 private이다..
		Singleton.getInstance(); // 이 자체가 클래스변수인 s 이다.
		
	}// main()의 끝
}
class MyData07 {
	private int data; // 외부에서 접근할 수 없게 만들었다.
	// setter : set멤버변수명(매개변수로 멤버변수에 저장할 값)
	void setData(int data) {
		this.data = data;
	}
	// getter : get멤버변수명() return 멤버변수;
	int getData() {
		return data;
	}
}

class Singleton {
//	생성자를 외부 접근 불가로 만들었다 --> 외부에서 인스턴스 생성 불가
	private Singleton() {
	}
	
	// static : 클래스변수 -> 클래스 정보 로드 시 생성!
	// private : 외부 접근 불가
	private static Singleton s = new Singleton(); // 멤버변수
	
	// 외부에서 접근이 가능하도록!
	public static Singleton getInstance() {
		return s; // 위에서 만들어진 클래스변수를 반환
	}
}










