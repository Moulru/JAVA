public class Practice08 {
	public static void main(String[] args) {
		/*
		 * MyColorPoint08 클래스 작성하기
		 */
		
		MyPoint08 point = new MyColorPoint08(4, 5, "blue");
		point.move(3, 2);
		point.reverse();
		point.printPos(); // 2,3 blue
	}// main() 끝
}

abstract class MyPoint08 {
	int x;
	int y;
	String color;
	
	MyPoint08( int x, int y ) {
		this.x = x;
		this.y = y;
	}
	protected abstract void move( int x, int y );
	protected abstract void reverse();
	protected void printPos() {
		if(color == null) {
			System.out.println( x + "," + y );
		}
		else System.out.println( x + "," + y + "," + color);
	}
}
class MyColorPoint08 extends MyPoint08 {

	int reverse;
		
	MyColorPoint08(int x, int y, String color) {
		super(x, y);
		super.color = color;
	}
	
	protected void move(int x, int y) {
		super.x = x;
		super.y = y;
	}
	
	protected void reverse(){
		reverse = super.x;
		super.x = super.y;
		super.y = reverse;
	}
}