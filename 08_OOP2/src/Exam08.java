public class Exam08 { // extends Object 가 생략되어 있다!
	public static void main(String[] args) {
		/*
		 * 	Object 클래스 --> 모든클래스의 조상 (자동 상속)
		 * 		toString() 오버라이딩
		 * 			> 클래스명@객체주소값 을 반환한다.
		 * 
		 * 			> 일반적으로 인스턴스의 정보를
		 * 			  문자열로 제공해주는 용도로 오버라이딩
		 * 				(쓸모있는 정보)
		 */
		
		Exam08 ex = new Exam08();
		System.out.println(ex.toString());
		
//		참조변수를 그냥 출력하면 toString() 결과와 같다.
//		-> 자동으로 toString() 메서드가 호출된다.
		System.out.println(ex);

		System.out.println("=============================");
		
		// 생성자에 값 넣어야 함
		Person08 han = new Person08("한수창", 20);
		// 만약 이름과 나이, 즉 인스턴스 멤버의 값을 출력!
		// toString() 오버라이딩해서 참조변수만을 가지고 내용출력
		System.out.println(han);
		
	} // main() 끝
	
	// 상속 받은 클래스(부모클래스)의 메서드를 오버라이딩하는법
	// 오버라이딩할 메서드 이름 일부를 적고 Ctrl + Space
	// Override 라고 되어있는 것을 선택 -> 자동완성
	
	@Override
	public String toString() {
//		오버라이딩하면 부모클래스에 정의된 메서드는 무시된다.
		System.out.println("오버라이딩함");
		return super.toString();
	}
	
} // class Exam08 끝

class Person08 {
	private String 	name; // 외부 접근 불가 + 인스턴스변수
	private int 	age;
	
//	생성자 -> 인스턴스 생성 시 String,int 값을 전달해야 생성가능
	Person08( String name, int age ) {
		this.name = name; // 변수명이 같으니 멤버변수는 명시
		this.age = age;
	}
	
	@Override
	public String toString() {
//		return super.toString();
//		toString()의 오버라이딩엔 정답이 없다.
//		나의 멤버변수 중 인스턴스의 정보를 표현할 값들을 반환
		return "이름 : " + name + ", 나이 : " + age + "살";
	}
}





