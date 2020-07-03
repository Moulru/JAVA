
public class Object_Oriented_Programming {

	public static void main(String[] args) {
		/*
		 * 	[객체지향언어]
		 * 		- 객체지향이론
		 * 			실제 세계는 사물(객체)로 이루어져 있으며,
		 * 			발생하는 모든 사건들은 사물간의 상호작용이다
		 * 
		 * 		- 특징
		 * 			1. 코드의 재사용성이 높다
		 * 			2. 코드의 관리가 용이하다
		 * 			3. 신뢰성이 높은 프로그래밍을 가능하게 한다
		 * 
		 * 		- '클래스'와 '객체'
		 * 			1. 클래스 (class)
		 * 				> 정의 : 객체를 정의해 놓은 것
		 * 				> 용도 : 객체를 생성
		 * 			2. 객체 (object)
		 * 				> 정의 : 실제로 존재하는 것, 사물 또는 개념
		 * 				> 용도 : 클래스가 정의된 것에 따라 다름
		 * 				> 유형의 객체 : 책상, 의자, 컴퓨터 등등.. '사물'
		 * 				> 무형의 객체 : 수학공식 과 같은 논리나 '개념'
		 * 			3. 클래스는 일종의 설계도(또는 틀)이며 객체는 그 설계도를 통해 만들어진 실제 사물
		 * 			ex) 로보트(철인) 설계도 ->클래스 / 설계도로 만든 철인 28호, 29호, 30호 등... ->객체
		 * 
		 * 		- 인스턴스 (instance)
		 * 			1. 사전적인 의미 : 사례, 경우, ~~를 예로 들다
		 * 			2. 클래스로 객체를 만드는 것을 '클래스의 인스턴스화'라고 한다
		 * 			3. 객체와 인스턴스는 같은 의미 (문맥에 따라 구별)
		 * 				개념적으로 : 철인은 객체다.
		 * 				프로그래밍관점 : 철인28호는 철인클래스로 만든 인스턴스다
		 * 
		 * 		- 객체(인스턴스) 구성요소  (== 속성과 기능)
		 * 			1. 객체는 다수의 속성과 기능을 가지고 있다.
		 * 			2. 속성 : 멤버변수 (클래스 내부에 선언된 변수)
		 * 			3. 기능 : 메서드
		 * 
		 */
		
//			Alt + Shift + R --> Rename 현재 선택된 항목과 연결된 모든 것의 이름을 함께 변경해줌

		// [인스턴스 생성 방법]
		Car myCar;				// Car 클래스의 인스턴스를 가리킬 참조변수 생성
		myCar = new Car();		// new를 통해 car 클래스의 인스턴스 생성 및 myCar라는 참조변수에 대입
		
		// 한번에 생성하기
		Car mySuperCar = new Car();
//		String name = new String("박준호");		// 같은 구조

		System.out.println(mySuperCar.model);
		System.out.println(mySuperCar.power);
		System.out.println(mySuperCar.maxSpeed);
		// 인스턴스 초기값은 배열의 초기값과 같다
		
		System.out.println("============================");
		
		// 인스턴스 각 멤버변수에 값 대입
		mySuperCar.model = "BMW";	// 모델명
		mySuperCar.power = false;	// 시동 off
		mySuperCar.maxSpeed = 200;	// 최고속도
				
		mySuperCar.printModel();
		mySuperCar.driveCar(100);
		
		System.out.println("============================");
		
		Car yourNormalCar = new Car();
		yourNormalCar.model = "TICO";
		yourNormalCar.power = true;
		yourNormalCar.maxSpeed = 100;
		
		yourNormalCar.printModel();
		yourNormalCar.driveCar(101);
		
//		배열로 인스턴스 만들기
		Car[] myCars = new Car[3];		// 배열형태 참조변수 생성
		myCars[0]	= new Car();		// 각 요소의 인스턴스 생성
		myCars[1]	= new Car();		// 인스턴스들은 서로 무관하다
		myCars[2]	= new Car();
		
		// 인스턴스 바로 지정 가능
		Car[] myCars2 = { new Car(), new Car(), new Car() };
		
		Car[] myCars3 = new Car[20];
		for( int i=0; i< myCars3.length; i++)
		{
			myCars3[i] = new Car();
		}
		
		
	}
}

// 클래스 생성
class Car {
	// 클래스를 만드는 영역
	
//	 1. 멤버변수 선언 (속성)
	String	model;			// 자동차의 모델명 
	boolean	power;			// 시동 on/off 여부
	int		maxSpeed;		// 차의 최고 속도
	
	// 멤버변수는 클래스 내부 메서드에서 접근,사용이 가능하다
	
//	 2. 메서드 선언 (기능)
	
	// 모델명 출력하는 메서드
	void printModel() {
		System.out.println("저의 차는 " + model + "입니다.");
	}
	
	// 자동차가 주행하는 메서드 - 주행속도를 전달 받음
	void driveCar( int speed ) {
		
//		시동이 꺼져있으면 주행할 수 없다.
		if(power == false)
		{
			System.out.println("시동을 켜주세요.");
			return;
		}
//		최고속도 이상으로 주행할 수 없다. --> 최고속도로 speed를 조정
		if(speed > maxSpeed)
		{
			System.out.printf("최고속도는 %dkm입니다. 속도를 낮춥니다.\n", maxSpeed);
			speed = maxSpeed;
		}
		System.out.printf("부릉 부릉!! 시속 %dkm로 주행합니다. \n",speed);
	}
	
}