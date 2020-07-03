public class ClassEx06 {
	static int sNum1 = 5;		// 명시적 초기화
	static String sStr = new String("ABC");		// 명시적 초기화
	
	int iNum1;
	static int sNum2;
	
	// 클래스 초기화 블럭
	// --> 클래스가 메모리에 로딩될 때 딱 1번만 수행!!!
	static {
		System.out.println("클래스 초기화 블럭!");
//		iNum1 = 20;		// 인스턴스 변수여서 에러남 (클래스 메서드에서는 인스턴스 변수 접근 불가)
		sNum2 = 20;
	}
	
	// 인스턴스 초기화 블럭
	// --> 인스턴스가 생성될 때마다 수행!
	{
		System.out.println("인스턴스 초기화 블럭!");
		iNum1 = 10;
		sNum2 = 30;		// 클래스변수 초기화 가능!
		// 인스턴스가 생성될 때마다 sNum2는 30으로 바뀐다 --> 안좋음
	}

	ClassEx06() {
		System.out.println("ClassEx06() 생성자 호출!");
	}
	
	public static void main(String[] args) {
		System.out.println("main() 메서드 시작!");
		/*
		 * 	변수의 초기화
		 * 		자동으로 초기화 되지않는다	--> 지역변수
		 * 		자동으로 초기화가 된다		--> 배열, 멤버변수(인스턴스변수,클래스변수)
		 * 
		 * 	멤버변수의 초기화 방법
		 * 		1. 명시적 초기화 (선언과 동시에 초기화)
		 * 			> int a = 0;
		 * 		2. 생성자
		 * 		3. 초기화 블럭 { }
		 * 			> 인스턴스 초기화 블럭
		 * 			> 클래스 초기화 블럭
		 * 
		 * 		- 초기화 블럭의 사용 : 복잡한 초기화를 진행할 때
		 * 
		 * 	멤버변수의 초기화 순서
		 * 		- 클래스변수 초기화 시점 : 클래스가 로드될 때 한 번 실행
		 * 		- 인스턴스변수 초기화 시점 : 인스턴스 생성될 때 마다 실행
		 * 		- 클래스변수 초기화 순서
		 * 			# 초기값 -> 명시적 -> 클래스초기화블럭
		 * 				--> 공용 변수이기 때문에 다른 곳에서 초기화 X
		 * 		- 인스턴스변수 초기화 순서
		 * 			# 초기값 -> 명시적 -> 인스턴스초기화블럭 -> 생성자
		 * 
		 * 			> 생성자를 이용하면 인스턴스마다 원하는 값으로 초기화 할 수 있다!
		 * 
		 * 
		 * (프로그램 실행시 일어나는 일..)
		 *		0. 프로그램 실행!
		 *		1. 클래스 정보 로드
		 *		2. 클래스 변수 공간 생성 (이때 초기값 들어감)
		 *		3. 명시적 초기화
		 *		4. 클래스 초기화 블럭
		 *			1~4는 Method Area에 저장(클래스정보,변수)
		 *		5. main() 메서드 수행 (stack에 저장)
		 *		6. main()에서 인스턴스 생성! (heap에 저장)
		 *			인스턴스 초기화 블럭
		 *			생성자
		 */
		
//		int a;						// 지역변수 a
//		System.out.println(a);		// 자동으로 초기화가 안됬기에 오류가 남!
		
		System.out.println(ClassEx06.sNum1);
		System.out.println(ClassEx06.sNum2);
		System.out.println(ClassEx06.sStr);
		
		ClassEx06 ex06 = new ClassEx06();
		System.out.println(ex06.iNum1);
		System.out.println(ex06.sNum2);
		
		ClassEx06 exex06 = new ClassEx06();
		
		System.out.println("main() 메서드 끝!");
	}

	
}
