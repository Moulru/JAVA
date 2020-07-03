public class Practice02 {
	public static void main(String[] args) {
		/*
		 * 	책 클래스 Book02
		 * 	전자책 클래스 EBook02
		 * 		printInfo() 오버라이딩 하기
		 */
		
		Book02 book = new Book02("자바 짱!", 20000);
		book.printInfo();
//		제목 : 자바 짱!
//		가격 : 20000원
		
		EBook02 ebook = new EBook02("자바 짱! - ebook", 10000, "a-1231");
		ebook.printInfo();
//		제목 : 자바 짱! - ebook
//		가격 : 10000원
//		보안키 : a-1231
	}
}

/*
 * 	단계별 문제 해결
 * 		1. 클래스 생성 - 상속관계 성립
 * 		2. 생성자 생성
 * 			부모클래스 : (String, int)
 * 			자식클래스 : (String, int, String)
 * 		3. 멤버변수 생성
 * 			> printInfo()에서 출력해야 하니깐!
 * 		4. 메서드 구현
 * 			> printInfo() 오버라이딩하기!
 */

// 1.
class Book02 {
	// 3. 멤버변수 - 제목, 가격
	String name;
	int price;
	
	// 2.
	Book02(String name, int price) {
//		각 멤버변수에 생성 시 받은 매개변수의 값 대입
		this.name = name;
		this.price = price;
	}
	
	// 4.
	void printInfo() {
//		제목 : 자바 짱!
//		가격 : 20000원
		System.out.println("제목 : " + name);
		System.out.println("가격 : " + price + "원");
	}
}

class EBook02 extends Book02 { // 전자책은 책이다. (is-a)
	// 3. 멤버변수 - 제목,가격은 부모클래스(Book02) 멤버 사용
	//			   - 보안키(key) 만 전자책에 추가해주면 된다.
	String key;
	
	// 2.
	EBook02( String name, int price, String key ) {
//		super(); 생략! -> 사용 불가
		super(name, price);
		this.key = key; // 이 멤버는 EBook02만의 멤버이다. 
	}
	
	// 4. 보안키 정보까지 추가로 출력하기 위한 오버라이딩
	// 마찬가지로 자동완성이 된다.
	@Override
	void printInfo() {
		// super. 을 하면 부모클래스의 멤버에 접근한다!
		// 기존에 제목,가격은 부모클래스 printInfo() 에서 출력했으니
		// 여기서 또 하지 말고 기존 메서드를 재활용하자!
		super.printInfo(); // --> 제목, 가격이 출력
		System.out.println("보안키 : " + key);
	}
}


