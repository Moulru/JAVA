public class Exam02 {
	public static void main(String[] args) {
		/*
		 * 	포함관계 (has-a)
		 * 		사각형은 좌표(x,y)를 포함하고 있다.
		 */
		
//		(1) 생성자
//									바로 인스턴스를 생성하여 대입!
		Rectangle02 rect1 = new Rectangle02(new Point02(1,1), 5, 5);
		// new 하면서 만들어진 인스턴스는 rect1 인스턴스의 point 에 대입
		
		Point02 point1 = new Point02(2,2);
		Rectangle02 rect2 = new Rectangle02(point1, 6, 6);
		// point1 참조변수를 생성자에 넣었다.
		// point1과 rect2 인스턴스의 point 는 같은 인스턴스를 가리킨다.
		
//		(2) 생성자
		Rectangle02 rect3 = new Rectangle02(3, 3, 6, 6);
		
		rect1.printArea();
		rect2.printArea();
		rect3.printArea();
	}
}

class Point02 {
	int x;
	int y;
	
	Point02( int x, int y ) {
		this.x = x;
		this.y = y;
	}
}

class Rectangle02 {
	Point02 point; // 사각형이 좌표를 포함한다 (has-a)
//	String name; 이것도 똑같은 개념이었다!! String은 클래스니까!
	int width;
	int height;
	
//	(1)
	Rectangle02( Point02 point, int w, int h ) {
		this.point = point; // 인스턴스의 주소를 참조변수에 대입
		this.width = w;
		this.height = h;
	}
//	(2)
	Rectangle02( int x, int y, int w, int h ) {
		point = new Point02(x, y);
		this.width = w;
		this.height = h;
	}
	
	void printArea() {
		System.out.println("넓이 : " + (width * height));
		System.out.printf("좌표 (%d,%d)\n", point.x, point.y);
		// 클래스 안에서 클래스를 포함했다고하여 복잡한게 아니다!
		// main()메서드에서 참조변수로 접근하듯이 똑같이 하면 됨
	}
}




