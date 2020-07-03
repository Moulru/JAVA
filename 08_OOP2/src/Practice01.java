public class Practice01 {
	public static void main(String[] args) {
		/*
		 * 	사각형 클래스 Rectangle01
		 * 	정사각형 클래스 Square01
		 * 
		 * 		printArea() 오버라이딩 하지 않기
		 */
		
		Rectangle01 rect = new Rectangle01(4, 3);
		rect.printArea(); // 면적 : 12
		
		Square01 square = new Square01(7);
		square.printArea(); // 면적 : 49
	}
}

/*
 * 	단계별 문제 해결
 * 		1. 클래스 생성 - 상속관계도 성립
 * 		2. 생성자 생성
 * 			> 부모클래스 -> (int, int)
 * 			> 자식클래스 -> (int)
 * 				>> 부모클래스에 기본생성자가 없어서 super() X
 * 				>> 직접 부모클래스 생성자를 호출해줘야 한다.
 * 		3. 멤버변수 생성 (printArea에서 사용해야 하니까)
 * 		4. 메서드 구현
 * 			> Rectangle01의 인스턴스가 printArea()를 사용했다.
 * 				--> Rectangle01에 메서드가 있어야 한다!
 */

// 1.
class Rectangle01 {
	// 3.
	int witdh;
	int height;
//	또는 그냥 넓이는 저장할 멤버변수 하나만 있어도 됨. (int area)
	
	// 2.
	Rectangle01(int w, int h) {
		witdh = w;
		height = h;
//		area = w * h; // 만약 넓이 변수 하나만 가졌다면 이렇게..
	}
	
	// 4.
	void printArea() {
		System.out.println( "면적 : " + (witdh*height) );
	}
}

class Square01 extends Rectangle01 {
	// 2.
	Square01(int num) {
//		super(); // 이게 사용할 수 없다.
//				// 부모클래스에 기본생성자가 없으니깐~~!
		
		// 정사각형은 가로,세로 길이가 같다
		super(num, num);
	}
}



