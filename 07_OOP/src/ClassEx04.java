
public class ClassEx04 {

	public static void main(String[] args) {
		/*
		 * 		# 기본형 매개변수, 참조형 매개변수
		 * 			- 기본 : Call by Value
		 * 			- 참조 : Call by Reference
		 * 
		 * 		# 기본형 : 기본자료형으로 받는 형태
		 * 			- 매개변수가 지역변수이기 때문에 메서드가 끝나면 소멸한다
		 * 		# 참조형 : 인스턴스, 배열 형태
		 * 			- 참조형태이기 때문에, (주소를 전달받음) 메서드내에서 값 변경 시 호출한 쪽에도 적용된다
		 * 			
		 */

//		기본형 매개변수
		int num = 10;
		change1(num);			// 여기의 num은 change1 메서드의 num과 완전 다른 개체!!
		System.out.println(num);
		
//		참조형 - 인스턴스
		Test04 test04 = new Test04();
		test04.num = 10;
		change2( test04 );
		System.out.println( test04.num );		
		
//		참조형 - 배열
		int[] arr = { 1, 2, 3 };
		change3( arr );
		System.out.println( arr[0] );
		
//		참조형식을 이용하여 반환을 1개 이상 받아보기 ( 안좋은 방식의 코딩임 )
		int[]	arr2	= { 0 };
		int		result	= 0;
		
		result = add(3,5,arr2);
		System.out.println( result );
		System.out.println( arr2[0] );
	}
	
	static int add( int num1, int num2, int[] result ) {
		result[0] = (num1 + num2) * 2;
		
		return num1+num2;
	}

	// call by value
	static void change1( int num ) {
		num = 20;				// num은 매개변수 ( 즉, 지역변수 )
	}
	
	// call by reference
	static void change2( Test04 test ) {
		test.num = 20;
	}
	
	static void change3( int[] arr ) {
		// 첫번째 요소의 값을 20으로 변경
		arr[0] = 20;
	}
}

class Test04 {
	int num;
}