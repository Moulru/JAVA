
public class VariableEx {
	public static void main(String[] args) {
		// 주석 (Comment)
		// 주석이란, 1.소스코드에 설명을 추가하는 것
		//               2.컴파일러는 주석을 무시한다. ->프로그램 수행에 영향이 없다.
		//               3.한 줄 주석 //
		//               4. 여러줄 주석 /* 주석내용 */
		//               5. 주석 단축키 : Ctrl + /
		
		// 자동 줄맞춤 단축키 (줄 선택 후) Ctrl + Shift + F
				
		/* 여러줄주석
		 * 여러줄주석
		 여러줄 주석*/
		
		System.out.println("Hello world");
		// 출력..
		// 프로그래밍 : 표준 입출력
		//  >콘솔(cmd)에 출력하거나 입력 받는 것
		
		/*
		 * (콘솔에) 출력하는 방법
		 * 	1. 서식지정이 없는 출력
		 * 	2. 서식지정이 있는 출력
		 * 
		 * 	[서식 지정이 없는 출력]
		 * 		print	: 출력 후 줄바꿈(개행)을 하지않음
		 * 		println	: 출력 후 줄바꿈을 수행 (print + line)
		 */
		System.out.print("Hello?");
		System.out.println("world");
		//"Hello" <-- 쌍따옴표로 묶으면 '문자열'
		
		System.out.println(10); // 숫자, 숫자는 그냥 쓰면 됨.
		//System.out.println(안녕); <- 오류남
		
		System.out.println(); // 개행만 하겠다.

		// '서식있는 출력' 에서의 + 연산자의 역할
		// 숫자와 숫자 일 때만 덧셈 (사칙연산)
		// 그 외, 숫자+문자열, 문자열+문자열은 문자열로 취급
		//		--> 문자열과 문자열을 연결
		System.out.println("1+1 = " +2);
		System.out.println("1+1 = " +1+1);
		System.out.println("1+1 = " +(1+1));
		// 내가 의도한 숫자 계산을 할 때는,
		// 무조건 소괄호로 묶는다
		System.out.println("9*9 = " + 9*9); // 덧,뺄셈과 달리 곱셈 나눗셈은 계산이 됨
		System.out.println("------------------------");
		
		/*
		 * 	변수(Variable)
		 * 		1. 정의	: '하나'의 값을 저장할 수 있는 메모리 공간
		 * 		2. 변수이름 만드는 규칙
		 * 			1) 대소문자 구분, 길이 제한 없음
		 * 			2) 시스템 예약어(keyword) 사용 불가
		 * 			3) 숫자로 시작 X (시작만 아니면 숫자 포함은 가능)
		 * 			4) 특수문자는 _와 $만 허용이 됨
		 * 		3. 권장사항
		 * 			1) 클래스명의 첫 글자는 대문자
		 * 			2) 변수명, 메서드명의 첫 글자는 소문자
		 * 			3) 여러 단어로 조합된 경우, 각 단어의 첫글자는 대문자 (MyLife)
		 * 			4) '상수'명은 모두 대문자로, 여러 단어로 조합된 상수일 경우 _로 구분 (MAX_SIZE)
		 * 				final int myAge; <- final을 붙이면 상수가 된다!
		 *
		 * '들여쓰기'는 아주 중요합니다.
		 */
		
		// 상수란?
		// 처음 초기값을 넣으면 변경할 수 없음
		final int A = 10;
		// A = 5; <- 상수 값이 변경될 때 오류남.
		
		System.out.println(A);
		
		// 변수 선언
		int myAge; // int : 정수
		myAge = 20; // 변수에 값을 대입
		
//		int aaa = 20; // 선언과 대입을 동시에 사용해야 올바른 사용법
		
		System.out.println(myAge); // 변수에 저장된 값 출력
		System.out.println("제 나이는 " + myAge + "살 입니다.");
		myAge = 37;
		System.out.println("제 나이는 " + myAge + "살 입니다."); //변수는 변하는 값
		
		/*
		 * 	[변수의 타입]
		 * 		* 문자
		 * 			1개 문자	: 'A' '1' 'ㅋ'
		 * 			문자열		: "문자열~~~"
		 * 		* 숫자
		 * 			정수		: 음수,0,양수
		 * 			실수		: 소수점이 있는 숫자
		 * 
		 * int 같은 것을 '자료형'이라고 부름. 또는 type
		 * 
		 * 
		 * 	[자료형의 종류]
		 * 		1. 논리형
		 * 			boolean (1byte / 8bit) [true,false]
		 * 		2. 문자형
		 * 			char (2byte / 16bit) [0~65535] (2의16승 만큼)
		 * 		3. 정수형
		 * 			byte (1byte / 8bit) [-128 ~ 127]
		 * 			short (2byte / 16bit) [-32768~32767]
		 * 			int (4byte / 32bit) [약 -21억~21억]            		<-*기본자료형
		 * 			long (8byte / 64bit) [약 -900경~900경]
		 * 		4. 실수형
		 * 			float (4byte / 32bit) [소수점 아래 6자리 정도]
		 * 			double (8byte / 64bit) [소수점 아래 16자리 정도]	<-* 기본자료형
		 * 				---> double이 더 정밀하다.
		 */
		
		int 	a	=	5; //정수를 담는 a 변수 생성 및 5 담기
		double 	b	=	2.2; //소수를 담는 b 변수 생성 및 2.2 담기
		float	ff	=	1.1f;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(ff);
		
		System.out.println(10+20);
		
		System.out.println("----------------");
		
		int		x = 5;
		double	y = 2.2;
		
		// 묵시적 형변환
		//		: 서로 다른 타입일 때 자료형의 크기가 큰 자료형으로 자동 변환
		System.out.println("x + y = " + (x+y) );
		
		// 명시적 형변환(casting) : 자료형을 직접 기입
		System.out.println("x + y = " + (int)(x+y));
		
		System.out.println("x / y = " + (int)(x/y) );		// 괄호의 위치가 중요 (x,y 둘다 int로 명시)
		System.out.println("x / y = " + (int)x/y );			// 괄호의 위치가 중요 (x만 int로 명시)
		
		// 정수와 정수를 나누면 소수점 이하는 자동으로 날아감
		System.out.println("5 / 3 = " + (5/3));
		System.out.println("5 / 3. = " + (5/3.));			// .을 붙이면 소수(double)이 됨
		
		System.out.println("------------------------");
		
		char ch		= 'A';
//		char ch1	= '' // 빈 값을 초기값으로 할 수 없다.
				
		System.out.println(ch);
		
		String name = "성이름";
		
		System.out.println(name + 20 + "살");
		
		System.out.println("------------------------");
		
		/*
		 *  [서식 지정이 있는 출력]
		 *  	--> 형식화된 출력
		 *  
		 *  	printf : print + format
		 *  	printf("서식", 값);
		 *  	printf("1 + 1 = %d", (1+1));
		 *  
		 *  형식 : %[-][0][n][.m] 서식문자
		 *  	[]안의 내용은 옵션이다 (사용 안해도 됨)
		 *  
		 *  	%b		boolean
		 *  	%d		10진수(ddecimal)
		 *  	%o		8진수(octal)
		 *  	%x,%X	16진수(hexa-deciaml)
		 *  	%f		부동소수점(소수표현)
		 *  	%e,%e	지수표현식(exponent)
		 *  	%c		문자(character)		-> 1개 문자 (char 자료형)
		 *  	%s		문자열(string)		-> 문자열	(string 자료형)
		 *
		 *  	이스케이프 문자(역슬래시 사용)
		 *  	\n		개행(줄바꿈)
		 *  	\t		탭(tab)
		 *  	\\		\를 출력하기
		 *  	\'		'를 출력하기
		 *  	\"		"를 출력하기
		 *  	추가내용 : %% -> % 출력하기
		 */
		
		int dx = 5;
		double dy = 3;
		
		System.out.printf("[%d]", dx);			// %d에 dx를 대입해 출력, printf는 자동개행이 안됨
		System.out.printf("\n");				// 역슬래시 \n를 사용해 개행 가능
		System.out.printf("[%d] [%d] \n", dx, 5);	// 순차적으로 하나씩 대입함
		
		System.out.printf("[%d]   \n", dx);
		System.out.printf("[%5d]  \n", dx);		// [숫자] : 전체 자리수 지정(우측정렬)
		System.out.printf("[%-5d] \n", dx);		// [-]	 : 자리수 지정이 된 경우, 좌측정렬
		System.out.printf("[%05d] \n", dx);		// [0]	 : 자리수 지정이 된 경우, 빈자리에 0을 채움
		
		System.out.printf("x / y = %f	\n", (dx/dy) );
		System.out.printf("x / y = %.21f\n", (dx/dy) );	// [.m] 소수점 21번째까지 표기
		System.out.printf("x / y = %.1f	\n", (dx/dy) );	// [.m] 소수점 1번째까지 표기
		
		// 문자열 사용 해보기
		// %s -> string -> 문자열을 받는다.
		System.out.printf("[%10s]\n", name);			// 10칸 확보, 우측정렬
		System.out.printf("[%-10s]\n", name);			// 10칸 확보, 좌측정렬
		System.out.printf("[%.1s]\n", name);			// 좌측에서 1개글자만 출력
		
		System.out.printf("[%2d]\n", 1000);				// 최소한의 칸을 확보
		// 칸을 넘어가면 그냥 그대로 출력된다. (잘리지 않음)
	}
}
