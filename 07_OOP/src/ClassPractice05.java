
public class ClassPractice05 {

	public static void main(String[] args) {
		/*
		 * 	책 클래스 (Book)
		 * 		생성자로 제목, 가격 입력받음
		 * 			> 제목이나 가격을 넣지않고 생성을 하면,
		 * 			 >> 제목 : "제목없음", 가격 : -1원
		 * 
		 * 		printInfo() 호출시,
		 * 		제목 : 재미있는 JAVA!
		 * 		가격 : 15000원
		 * 
		 * 
		 * 		종류별로 최소 3개 인스턴스 생성 및 출력
		 */

		Book book1 = new Book();
		book1.printInfo();
		
		Book book2 = new Book(60000);
		book2.printInfo();
		
		Book book3 = new Book("재미있는 JAVA!", 16000);
		book3.printInfo();
	}

}

class Book {
	String str = new String();
	int pay = 0;
	
	Book() {
		this("제목없음",-1);
	}
	Book(String str) {
		this(str,-1);
	}
	Book(int pay) {
		this("제목없음",pay);
	}
	Book(String str, int pay) {
		this.str = str;
		this.pay = pay;
	}
	
	void printInfo() {
		System.out.println("제목 : " + str);
		System.out.println("가격 : " + pay + "원");
	}
}