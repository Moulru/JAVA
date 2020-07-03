
public class ClassPractice04 {

	public static void main(String[] args) {
		/*
		 * 	사각형 클래스 만들기 (Rectanlge)
		 * 		생성자로 가로,세로를 전달받음
		 * 		printArea() --> 메서드 호출 시 면적 출력
		 */

		Rectangle rect1 = new Rectangle(3,4);
		rect1.printArea(); // 면적 : 12
		
		Rectangle rect2 = new Rectangle(3);
		rect2.printArea(); // 면적 : 9  (정사각형으로 간주)
	}
}


class Rectangle {
	int num1 = 0;
	int num2 = 0;
	
	Rectangle( int num1 ) {
		this(num1,num1);
	}
	Rectangle( int num1, int num2 ) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	void printArea() {
		System.out.println("면적 : " + num1*num2);
	}
}