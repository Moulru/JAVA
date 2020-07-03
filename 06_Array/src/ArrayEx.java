import javax.print.attribute.standard.PrinterInfo;

public class ArrayEx {

	public static void main(String[] args) {
		/*
		 * 	[배열(Array)]
		 * 		1. 정의 : '같은 타입'의 여러 변수를 하나의 묶음으로 다루는 것
		 * 		2. 생성 : 	[] <-- 대괄호를 이용한다.
		 * 			1) 선언, 생성 동시에
		 * 				타입[] 변수명 = new 타입[길이];
		 * 				int[] myArr = new int[3];
		 * 
		 * 			2) 선언, 생성 따로
		 * 				타입[] 변수명;
		 * 				변수명 = new 타입[길이];
		 * 				int[] myArr;
		 * 				myArr = new int[3];
		 * 
		 * 			3) 선언과 생성, 값 대입을 동시에!
		 * 				타입[] 변수명 = { 요소...};
		 * 				int[] myArr = { 10, 20, 30 };
		 *
		 * 		3. 배열은 자동으로 초기화된다!! ★★★
		 * 			자료형					기본값(초기화 값)
		 * 			──────────────────────────────────────────
		 * 			boolean					false
		 * 			char					'\u0000'  -> 0
		 * 	(정수)	byte,short,int			0
		 * 	(정수)	long					0L
		 * 			float					0.0f
		 * 			double					0.0d 또는 0.0
		 * 			'참조형 변수'			null	
		 * 				--> String은 참조형!
		 * 			
		 * 	(배열의 사용)
		 * 		4. index (인덱스)
		 * 			# 모든 프로그래밍 언어 공통 규칙
		 * 				-> index는 0부터 시작한다.
		 * 				-> 컴퓨터는 0부터 숫자를 센다.
		 * 
		 * 			- 배열의 요소 : '각' 저장 공간
		 * 			- 배열 요소 접근
		 * 				배열이름[인덱스] 형태로 접근
		 * 			- index 값의 범위 : 0 ~ (배열길이-1)
		 * 				--> int[] myArr = new int[3];	--> 범위: [0],[1],[2]
		 * 
		 * 		5. 배열의 길이 구하기
		 * 				int length = 배열이름.length;
		 * 
		 * 	[다차원 배열]	--> 보통 2차원까지만 사용한다.
		 * 		int[][] myArr = new int[2][3];			--> 2행 3열 (2중for문의 i,j순서처럼)
		 * 		myArr[1][2]	= 6;	// 정상
		 * 		myArr[2][1] = 6;	// 오류(없는 공간 접근)

		 * 			2차원 2행3열 배열의 주소값:
		 * 				  ┌─────────┬─────────┬─────────┐
		 * 				  │	 [0][0]	│  [0][1] │	 [0][2]	│
		 * 				  ├─────────┼─────────┼─────────┤
		 *				  │	 [1][0]	│  [1][1] │	 [1][2]	│
		 *				  └─────────┴─────────┴─────────┘

		 *		2차원배열 생성시 값 넣기
		 *		int[][] myArr = { {1,2,3,} , {4,5,6} };
		 *			system.out.println( myArr[1][2] ); 		--> 6
		 */
		
		// 비슷한 역할을 하는 변수들을 각각 선언해도
		// 실제로 메모리 공간에서는 따로논다. (이름만 비슷한척..)
//		int score1 = 10;
//		int score2 = 20;
//		int score3 = 30;
		
		// int 타입 공간 3개를 연달아서 만들겠다! --> 길이가 3인 배열
		int[] arrScore = new int[3];
		arrScore[0]	= 10;		// 첫 번째 요소 -> index 0
		arrScore[1]	= 20;		// 두 번째 요소 -> index 1
		arrScore[2]	= 30;		// 세 번째 요소 -> index 2
		
		System.out.printf("%d %d %d \n",arrScore[0], arrScore[1], arrScore[2]);
		
		// 관련있는 자료들의 연속!
		// 인덱스 범위를 벗어나면 오류가 발생!
//		(오류코드)
//		arrScore[-1]	= 10;		// 음수는 무조건 절대 인덱스에 들어가면 안됨
//		arrScore[3]		= 30;		// 인덱스 범위 초과!
		
		System.out.println("---------------------------------------------");
		
		int[] myArr = new int[5];	// 인덱스 : 0~4
		// for문을 활용하여 배열 출력하기
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("%d", myArr[i]);
		}
		System.out.println();
		
		// for문을 활용하여 배열에 값 넣으면서 출력하기
		for (int i = 0; i < 5; i++)
		{
			myArr[i] = i+1;			// 인덱스: 0~4	// 값: 1~5
			System.out.printf("%d", myArr[i]);
		}
		System.out.println();
		
		// for문을 활용하여 배열 출력하기 - length 사용
		// 배열 전체 요소 접근하는 for문에서는 무조건 length 사용을 할 것
		for (int i = 0; i < myArr.length; i++)
		{
			System.out.printf("%d", myArr[i]);
		}
		System.out.println();
		
		// 같은 행위를 반복할때, 배열의 길이를 2번 구하게되니,
		// 한 번만 구해서 변수에 저장해놓고 그 변수를 가져다 쓰자 (효율적인 프로그래밍)
		int arrLength = myArr.length;
		for (int i = 0; i < arrLength; i++)
		{
			System.out.printf("%d", myArr[i]);
		}
		
		System.out.println("---------------------------------------------");
		
		
	}
}
