/*	
 *  Q:	프로그램(컴파일러)는 위에서 아래로 코드를 읽는데,
 *  	어떻게 main 아래 있는 메서드를 호출할 수 있는지?
 *  
 *  A:	프로그램 실행시 class의 정보를 미리 메모리에 올려놓고, main()이 수행되기 때문에 호출할수있다.
 */

public class MethodEx {

	public static void main(String[] args) {
		/*
		 * 	메서드 (Method)
		 * 
		 * 	1. 정의 : 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
		 * 			 함수(Function) 기능과 같은 말이다.
		 * 				>> ~~~.println() , ~~~.printf(), nextInt(), equals() 등
		 * 
		 * 	2. 메서드를 사용하는 이유
		 * 		1) 높은 재사용성
		 * 			> 한 번 만들어 놓으면 언제든 호출하여 사용할 수 있다
		 * 		2) 중복된 코드의 제거
		 * 		3) 프로그램의 구조화
		 *			> 관련된 작업단위로 나누어 구조를 단순화 시킨다
		 *
		 * 	3. 메서드의 선언과 구현
		 * 		선언 : 이런 메서드가 있다..! 라고 등록하는 것	--> 예를들어 책에서 목차에 등록함
		 * 		구현 : 실제 기능			--> 목차를 따라갔을때 있는 내용
		 * 
		 * 	
		 * 		#반환타입 메서드이름 ( 매개변수1, 매개변수2, ...) { 기능 }
		 * 			1) 매개변수(parameter) 선언
		 * 				> 메서드 기능 수행을 위해 메서드가 '호출' 될 때 받을 값을 담는 변수
		 * 				> 메서드의 지역변수가 된다
		 * 				> 개수 제한이 없고, 필요없으면 생략이 가능하다
		 * 
		 * 			2) 메서드이름 ( 앞서 변수명 짓는 것과 유사)
		 * 				> 어떠한 '기능'을 수행하는지 의미를 부여해야 한다
		 * 				> 메서드는 기능을 수행하기 때문에 '동사'가 들어가는 경우가 많다
		 * 
		 * 			3) 반환타입(return type)
		 * 				> 메서드가 수행되고 반환될 값을 타입(자료형)을 적는다
		 * 					>> equals의 경우, boolean이다
		 * 				> 반환할 값이 없는 경우, 'void'라고 적는다
		 * 				> 반환타입이 void가 아닌 경우, 메서드 내부에서 반드시 return으로 반환해야한다
		 * 					>> 반환타입이 int인 경우, return 0; 과 같이 동일한 타입의 값으로 반환해야한다
		 * 				> 반환하는 값은 매개변수와는 달리 여러개 일 수가 없다 (★★★)
		 * 					>> void : 0개 / 그 외 : 1개
		 * 	
		 * 				> 반환 타입이 없는 메서드
		 * 					>> 수행한 결과를 알 필요가 없다.
		 * 				> 반환 타입이 있는 메서드
		 * 					>> 기능의 결과 값 또는 수행의 성공/실패 여부
		 * 
		 * 			4) 메서드의 수행문
		 * 				> if문, for문 등과 같이 { } 안에 코드를 작성
		 * 					>> 수행문 안에서 생성된 변수는 메서드의 '지역변수'
		 * 					>> 지역변수 : 해당 지역이 끝나면 소멸
		 * 					>> 매개변수도 지역변수이기 때문에 끝나면 소멸
		 * 
		 * 			5) 메서드의 사용법
		 * 				> 메서드명();
		 * 				> 선언된 대로 호출을 해야 한다
		 */

		// main 메서드 수행문의 시작
		System.out.println( add(10,20) );
		System.out.println( add(0,0) );
		
		print("안녕하세요!");
		printHello();
		
		System.out.println("--------------------------------");
		
		int[] myArr1 = {1,2,3,4,5};
		printArr(myArr1);
		
		int[] myArr2 = {};
		printArr(myArr2);
		
		
	}	// main 메서드 수행문 끝

	//	메서드 선언은 클래스 선언 안에!! --> main() { 안에다가 하면 안됨! }
	
	// main에서 우리가 테스트로 메서드를 호출할건데,
	// main이 static이기 때문에 테스트용 메서드도 static으로 해야한다
	//	전달받은 두 개의 정수를 더한 결과를 정수로 반환하는 add 메서드
	static int add( int num1, int num2 ) {
//		1. 간단한 수식의 경우, return에서 바로 연산
//		return num1+num2;
		
//		2. 조건식으로 return이 여러번 들어갈 수 있다.
		if( (num1==0) && (num2==0) ) {
			System.out.println("둘 다 0");
			return 0;
			// return을 만나는 순간 메서드는 끝이난다 (반복문의 break 처럼)
		}
		
//		3. 변수에 반환 값을 담아서 리턴하기
		int addResult = 0;		// 반환할 변수 선언
		
		// 반환할 변수에 들어갈 값 연산!
		addResult = num1 + num2;
		
		return addResult;					// 반환할 변수를 return
		
	}
	
	//	문자열을 하나 받아서 그 내용을 콘솔에 출력하고 반환이 없는 print 메서드
	static void print( String str ) {
		System.out.println("출력 내용 : " + str);
	}
	
	//	매개변수와 반환값이 없고 안녕하세요만 출력하는 printHello 메서드
	static void printHello()	{
		System.out.println("안녕하세요.");
		
//		void메서드의 끝에는 return;이 생략되어 있다고 생각하기!
		return;
	}
	
	//	int배열 하나를 전달 받고 모든 요소의 값을 출력하는 printArr 메서드 (반환x)
	static void printArr( int[] myArr )	{
		
		if( myArr.length == 0)
		{
			System.out.println("요소가 없습니다.");
			return;
		}
		
		System.out.print("전달된 배열의 요소 : ");
		for(int i=0; i<myArr.length; i++)
		{
			System.out.printf("%d ",myArr[i]);
		}
		System.out.println();
		
	}
}
