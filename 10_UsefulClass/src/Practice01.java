
public class Practice01 {

	public static void main(String[] args) {
		/*
		 * 	MyCard 클래스 완성하기
		 */

		MyCard card1 = new MyCard(5, false);
		MyCard card2 = new MyCard(5, false);
		MyCard card3 = new MyCard();
		// 생성자가 오버로딩 되어있다 (같은 이름으로 여러 매개변수 매서드)
		
		System.out.println("card1 = " + card1);		// card1 = 5
		System.out.println("card2 = " + card2);		// card2 = 5
		System.out.println("card3 = " + card3);		// card3 = 1K
		
		System.out.println( card1.equals(card2) );	// true
		System.out.println( card1.equals(card3) );	// false
		
	}
}

class MyCard {
	int num;
	boolean isKwang;
	MyCard() {
		this.num = 1;
		this.isKwang = true;
	}
	
	MyCard( int num , boolean isKwang ) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public String toString() {
		if(isKwang == false) {
		return num + "";
		}
		else return num + "K";
	}
	
	@Override
	public boolean equals(Object obj) {
		MyCard number = (MyCard)obj;
		if(number.num == this.num) {
			return true;
		}
		return false;
	}
	
	/*
	 * [다른방법]
	 * 
	 * int cardNum;
	 * boolean isKwang;
	 * 
	 * myCard() {
	 * this(1,true);
	 * 
	 * this.cardNum = 1;
	 * this.isKwang = true;
	 * }
	 * 
	 * myCard(int num, boolean isKwang) {
	 * this.cardNum = num;
	 * this.isKwang = isKwang;
	 * }
	 * 
	 */
}