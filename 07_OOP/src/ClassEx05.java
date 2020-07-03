
public class ClassEx05 {

	public static void main(String[] args) {
		/*
		 * 	생성자
		 * 		- 정의 : 인스턴스가 생성될 때 호출되는 인스턴스 초기화 용도의 메서드
		 * 			> 인스턴스 멤버변수 값을 초기화 하고싶을때 작성
		 * 
		 * 		- 조건
		 * 			1. 생성자(메서드)의 이름은 클래스명과 같아야한다
		 * 			2. 생성자는 리턴값(반환)이 없다
		 *		- 우리는 여태 클래스를 만들면서 생성자를 만들지 않았지만,
		 *		  컴파일러가 자동으로 비어있는 (껍데기) 기본 생성자를 추가해준다. 
		 *			> 직접 정의한 생성자가 없을경우!
		 *		- 생성자는 오버로딩이 가능하다!
		 *			> 생성자를 정의했으면 반드시 정의해놓은 생성자들중에,
		 *			  매개변수가 맞는 생성자를 호출할 수 있도록 인스턴스를 생성한다.
		 *
		 *	복사 생성자
		 *		인스턴스를 생성할 때 기존에 만들어놓은 인스턴스의 내용을 복사할 때 사용
		 *
		 */
		
//		우리가 인스턴스를 만들 때 new 뒤에 붙였던 MyClass1()
//		저게 바로 생성자를 호출하는 문법이었다
		
//		정의된 생성자가 없을 때 자동으로 생서되던 기본생성자가 현재 없으므로, 오류발생!
		MyClass1 class1 = new MyClass1(10);
		System.out.println("class1 만들어짐!!");
		
		// 기본생성자가 없으면 오류!
		MyClass1 class2 = new MyClass1();
		System.out.println("class2 만들어짐!!");
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		Phone myPhone = new Phone();
		
		// 좋지 않은 멤버변수 값 대입 방법 (외부에서 직접 접근)
//		myPhone.model = "iPhone";
//		myPhone.snValue = 1010;
		
		// 메서드를 통한 값 대입
		myPhone.initValue("iPhone8", 1010);
		
		myPhone.printInfo();
		
		Phone2 myPhone2 = new Phone2("GalxyNote8",2020);
		myPhone2.printInfo();
		
		Phone3 myPhone3_1 = new Phone3();
		Phone3 myPhone3_2 = new Phone3("LG-V30");
		Phone3 myPhone3_3 = new Phone3("LG-V30",3030);
		
		myPhone3_1.printInfo();
		myPhone3_2.printInfo();
		myPhone3_3.printInfo();
		
//								Phone3( Phone3 phone ) { }
		Phone3 myPhone3_4 = new Phone3( myPhone3_3 );	// 복사생성자 사용
		myPhone3_4.printInfo();
		
	}

}

class MyClass1 {
	// 클래스명과 동일한 메서드 -> 생성자
	MyClass1()	{		// 기본생성자
	}
	
	// 생성자는 오버로딩이 가능하다!!! (메서드이기 때문)
	MyClass1( int value ) {
		System.out.println("MyClass1(int value) 생성자!");
		
	}
}

// 생성자가 없을 때의 초기값 세팅
class Phone {
	String	model;
	int		snValue;
	
	void initValue( String model, int snValue ) {
		// this는 내 인스턴스(호출한 인스턴스) 자기 자신의 멤버변수를 가리킨다.
		this.model = model;
		this.snValue = snValue;
		
//		// ↓여기서의 model은 매개변수인 String model 이다
//		model = model;
//		snValue = snValue;
//		// 아래와 같은 논리임
//		String str = "1234";
//		str = str;
	}
	void printInfo() {
		System.out.println("================");
		System.out.println("모델 : " + model);
		System.out.println("S/N : " + snValue);
	}
}

class Phone2 {
	String	model;
	int		snValue;
	
//	인스턴스를 생성할 때, 매개변수로 아래 2개를 받겠다
	Phone2( String model, int snValue ) {
		// this는 변수명이 같을 때 구분하기위해 사용
		this.model = model;
		this.snValue = snValue;
	}
	
	void printInfo() {
		System.out.println("================");
		System.out.println("모델 : " + model);
		System.out.println("S/N : " + snValue);
	}
}

class Phone3 {
	String	model;
	int		snValue;
	
	Phone3() {
//		this(); : 내 클래스의 생성자를 호출!
		this("이름없음", -1);		// 아래 string model, int snValue 생성자를 호출해 저장
		
		// ↓하드코딩
//		this.model = "이름없음";
//		this.snValue = -1;
	}
	Phone3( String model ) {
		this(model, -1);
//		this.model = model;
//		this.snValue = -1;
	}
	Phone3( String model, int snValue ) {
		this.model = model + "폰";		// 최종적으로 호출되는 생성자이므로, 여기 내용만 바꿔도 전부 적용됨
		this.snValue = snValue;
	}
	
//	복사 생성자
	Phone3( Phone3 phone ) {
		this(phone.model,phone.snValue);
	}
	
	void printInfo() {
		System.out.println("================");
		System.out.println("모델 : " + model);
		System.out.println("S/N : " + snValue);
	}
}