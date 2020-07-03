
public class ClassPractice03 {

	public static void main(String[] args) {
		/*
		 * 	섯다 카드 클래스
		 * 		멤버변수
		 * 			int number; 카드의 숫자
		 * 			boolean isKwang; 광인지,아닌지 여부
		 * 		메서드
		 * 			생성자
		 * 			void printInfo();
		 */

//		MyCard card1 = new MyCard( 3,false );
//		MyCard card2 = new MyCard();
//		
//								// [출력결과]
//		card1.printInfo();		// 3		--> 그냥 3
//		card2.printInfo();		// 1K		--> 1광
		
		MyCard card1 = new MyCard( 3,false );
		MyCard card2 = new MyCard();
		
		card1.printInfo();
		card2.printInfo();
	}
}

class MyCard {
	int number;
	boolean isKwang;
	
	MyCard() {
		this(1, true);
	}
	
	MyCard(int number,boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
		
	}
	
	void printInfo() {
		System.out.print(number);
		if( isKwang == true ) {
			System.out.print("K");
		}
		System.out.println();
	}
}