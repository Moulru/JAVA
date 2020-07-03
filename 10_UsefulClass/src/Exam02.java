
public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 	Object 클래스
		 * 
		 * 		clone() : 자신을 봊게하여 새로운 인스턴스를 생성하여 '반환'
		 * 			> clone() 메서드를 사용하려면 사용하고 싶은 클래스에서
		 * 			  Cloneable 인터페이스를 구현해야 한다. implements Cloneable
		 * 					>> 인터페이스를 구현하는 이유는 예외가 발생하기 때문
		 * 			> clone() 메서드를 오버라이딩 해야 한다
		 * 					>> clone()메서드는 Object 클래스의 메서드이다
		 * 
		 * 			- 얕은복사와 깊은복사
		 * 				1. 얕은복사 : 모든 멤버변수의 값들을 그대로 복사
		 * 					> 참조변수의 경우 기리키는 인스턴스의 주소값이 그대로 복사가된다
		 * 					> Object 클래스의 clone()메서드는 얕은복사 밖에 해줄 수 없다
		 * 				2. 깊은복사 : 참조변수의 인스턴스와 동일한 값으로 새 인스턴스를 만들어서 대입
		 * 					> 우리가 해야할 일
		 */

		Circle c1 = new Circle( new Point(1,1), 10);
		Circle c2 = c1;
		// c2 참조변수는 c1참조변수가 가리키는 인스턴스를 가리킨다
//		Circle c3 = (Circle)c1.clone();	// Object 타입으로 반환! 형변환이 필요
		Circle c3 = c1.clone();			// 반환타입을 같은 타입으로 변경 후 그냥 받아짐
		// c3 참조변수는 c1인스턴스와 동일한 새로운 인스턴스를 가리킨다
		
		System.out.printf("c1 : (%d,%d), 반지름 : %d\n",c1.p.x, c1.p.y, c1.num);
		System.out.printf("c3 : (%d,%d), 반지름 : %d\n",c3.p.x, c3.p.y, c3.num);
		c1.p.x = 2;
		c1.num = 20;
		System.out.printf("c1 : (%d,%d), 반지름 : %d\n",c1.p.x, c1.p.y, c1.num);
		System.out.printf("c3 : (%d,%d), 반지름 : %d\n",c3.p.x, c3.p.y, c3.num);
		// 1. 얕은 복사
		// 		현재상황 : c1.p 의 값(즉,주소) 을 그대로 c3.p에 복사, c1.p와 c3.p는 같은 인스턴스를 가리킨다
		// 2. 깊은 복사
		//		c1.p 인스턴스의 x,y값으로 새로운 Point 인스턴스를 생성 후
		//		c3에 대입될 인스턴스에 대입하였다
	}
}

class Point {
	int x;
	int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}

class Circle implements Cloneable {
	Point	p;		// 원점
	int		num;	// 반지름
	
	
	public Circle(Point p,int num) {
		this.p = p;
		this.num = num;
	}
	
	@Override
	// 1) clone() 메서드는 예외를 던진다 ! ==> 호출하는 시점에 try/catch 필요
	//		원레는 main()에서 (이 clone()을 호출한 곳에서) 예외처리를 해야하지만,
	//		매번 clone()을 호출할때마다 try/catch를 하는게 불편하기에 여기서 해준다!
	// 2) Object 타입으로 반환하면, 호출한 쪽에서 형변환을 해줘야한다 --> 이것도 불편하므로
	// 		반환타입을 내 클래스 타입으로 변경하면 호출한 쪽에서 형변환이 필요없다
	protected Circle clone() { // throws CloneNotSupportedException {
		
		// Circle c3 = c1.clone(); 이 형태로 호출됨
		// 이 안에서 현재 this는 c1이다!
		
		// 자기 자신과 동일한 값을 가진 새로운 인스턴스를 만들어서 반환
		Object obj = null;
		
		//	1. 얕은 복사 (super.clone()만 호출해서 반환)
/*
		try {
			// 원레 Object 클래스의 clone() 이 무조건 예외를 던진다
			// 1) 오버라이딩한 clone()도 예외를 같이 던지거나, (호출한쪽으로 넘김)
			// 2) 여기서 try/catch로 예외를 받아줘야한다
			obj = super.clone();
			// clone()에서 인스턴스를 반환
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}	// Object 클래스의 clone()을 호출!
		// clone() 에서 인스턴스를 반환해준다
	
*/

		// 2. 깊은 복사
		try{
			obj= super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		// this : clone() 호출한 복제할 인스턴스 == c1
		Point p = new Point( this.p.x, this.p.y );
		
		Circle c= (Circle)obj;
		c.p = p;					// == ((Circle)obj).p = p;
		// p를 대입하기 전에는 c1의 p의 값이 들어있었다
		
		return c;					// == return (Circle)obj;		// 반환타입을 변경하면서 obj를 형변환 하였다 
	}
	
}


