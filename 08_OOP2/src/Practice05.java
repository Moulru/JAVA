

public class Practice05 {

	public static void main(String[] args) {
		/*
		 *  아래 코드 결과가 나오도록 클래스 작성
		 *  	[조건]
		 *  	1. printPos()는 오버라이딩 X
		 *  	2. MyColorPoint05클래스 내부 코드에는 출력 메서드를 사용 X
		 *  		> 출력 함수 : print, println 등
		 */

		MyPoint05 point1 = new MyPoint05(1,1);	// 좌표 x,y
		MyColorPoint05 point2 = new MyColorPoint05(2,2,"red");	// 좌표+색
		
//							출력결과
		point1.printPos();	// (1,1)
		point2.printPos();	// (2,2)red
		
//									출력결과 --> 반환된 내용
		System.out.println(point1); // (1,1) 입니다.
		System.out.println(point2); // (2,2) 입니다.
	}
}

class MyPoint05 {
	private int x;
	private int y;
	protected String color;
	
	MyPoint05(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void printPos() {
		if(color==null) {
			System.out.printf("(%d,%d)\n",x,y);
		}
		else System.out.printf("(%d,%d) %s\n",x,y,color);
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ") 입니다.";
	}
}

class MyColorPoint05 extends MyPoint05 {
	protected String color;
	
	MyColorPoint05(int x,int y,String color) {
		super(x,y);
		super.color = color;
	}
}