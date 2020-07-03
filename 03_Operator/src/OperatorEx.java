
public class OperatorEx {

	public static void main(String[] args) {
		/*
		 * 	연산자
		 * 		연산자 		: 연산을 수행하는 기호
		 * 		피연산자	: 연산자의 작업 대상 (변수,상수 --> 값)
		 * 
		 * 		=====자주쓰는 연산자=====
		 * 		 사칙연산, %		   
		 * 		 비교연산자		   
		 * 		 &&	||	!	   
		 * 		 ++	--	+=	-= 
		 * 		====================
		 * 		산술연산자
		 * 			+	-	*	/	%	<<	>>
		 * 		비교연산자
		 * 			>	<	>=	<=	==	!=
		 * 		논리연산자
		 * 			&&	||	!	&	|	^	~
		 * 		대입연산자
		 * 			=
		 * 		기타
		 * 			형변환연산자(type), 삼항연산자(	?	: )
		 * 					[ex/ (int)(5/3)]
		 * 
		 * 		연산자 우선 순위
		 * 			1. 산술 > 비교 > 논리 > 대입
		 * 			2. 단항 > 이항 > 삼항
		 */

		/*
		 *  [단항연산자] > 항이 하나밖에 없다.
		 *  	1. 증감연산자 ++, --
		 *  		피연산자에 저장된 값을 1증가(++), 또는 1감소(--)
		 *  	2. 부호연산자 -
		 *  		부호를 반대로 바꾼다.
		 */
		
		System.out.println("--------------------");
		
		// 1. 증감연산자
		int myNum1 = 5;
		System.out.println(myNum1++);	// 값을 사용 후 증가
		System.out.println(++myNum1);	// 값을 증가 후 사용
		myNum1++;
		System.out.println(myNum1);
		
		// 2. 부호연산자
		int number = -10;
		System.out.println(-number);
		
		/*
		 *  [산술연산자]
		 *  	1. 사칙연산
		 *  	2. 나머지연산 %
		 *  		나눗셈의 나머지를 반환(ex/ 5 % 3 --> 2)
		 */
		
		System.out.println("--------------------");
		System.out.println("[산술연산자]");
		System.out.println("5 % 3 = " + (5%3));
		
		/*
		 *  [비교연산자]
		 *  	> 주로 '조건문'과 '반복문'의 조건식에 사용
		 *  	> 연산결과를 true/false로 반환 (boolean자료형)
		 *  
		 *  	1. 대소비교  <	 >	 <=	 >=
		 *  	2. 등가비교  ==	 !=
		 */
		System.out.println("--------------------");
		System.out.println("[비교연산자]");
		
		int myNum2 = 3;
		int myNum3 = 3;
		
		System.out.println( myNum2 == myNum3 );		// 앞과 뒤의 값이 같은가?를 결과로 출력 (true / false)
		System.out.println( myNum2 != myNum3 );		// 앞과 뒤의 값이 다른가?를 결과로 출력 (true / false)
		System.out.println( myNum2 >  myNum3 );		// 앞이 뒤의 값보다 큰가?(초과)를 결과로 출력 (true / false)
		System.out.println( myNum2 >= myNum3 );		// 앞이 뒤의 값보다 크거나 같은가?(이상)를 결과로 출력 (true / false)
		
		/*
		 *	[논리연산자]
		 *  	> 주로 '조건문'과 '반복문'의 조건식에 사용
		 *  	> 연산결과를 true/false로 반환 (boolean자료형)
		 *  
		 *  	1. AND 조건 &&	(양측) 둘 다 true여야 true 반환
		 *  	2. OR 조건	||	(양측) 둘 중 하나라도 true면 true 반환
		 *  	3. 논리부정	!	결과를 반대로 뒤집는다. true -> false / false -> true
		 */
		System.out.println("--------------------");
		System.out.println("[논리연산자]");
		System.out.println( (3 > 0) && (4 > 0) );	//	앞이랑 뒤랑 둘다 true면 true를 출력
		System.out.println( (3 > 0) && (4 < 0) );	//	앞이랑 뒤랑 둘다 true면 true를 출력
		System.out.println( (3 > 0) || (4 < 0) );	//	앞이랑 뒤랑 둘 중 하나라도 true면 true를 출력
		
		System.out.println( ! ((3 > 0) || (4 < 0)) );	// 논리부정, 원레 결과값을 반대로 바꿔 출력 (true -> false)
		
		/*
		 * 	[비트연산자(bit)]	- 2진법으로 연산
		 *		곱셈,나눗셈을 하는데 곱셈,나눗셈보다 연산속도가 미약하게 빠르다.
		 *		그렇지만 가독성이 떨어지므로 그냥 곱셈,나눗셈을 쓰는편이 낫다.
		 *
		 *		&	:	AND		둘 다 1이어야 1, 아니면 0
		 *		|	:	OR		둘 중 하나만 1이면 1 (둘 다 0이면 0)
		 *		^	:	XOR		두 값이 다르면 1, 같으면 0
		 *		~	:	비트를 전환한다. 0을1, 1을0 (1의보수 연산자)
		 *		<<	:	비트를 좌측으로 1칸 이동
		 *		>>	:	비트를 우측으로 1칸 이동
		 */
		
		System.out.println("--------------------");
		System.out.println("[비트연산자]");
		
		System.out.println( 4 & 2 );
		System.out.println( 3 & 2 );
		
		System.out.println( 3 | 2 );
		System.out.println( 3 ^ 2 );
		
		System.out.println( 8 << 2 );	
		// 8 = 이진법으로 001000, 여기서 1을 오른쪽으로 두칸 이동시킴 100000, 다시 십진법으로 바꿔 출력함
		System.out.println( 8 >> 2 );
		
		/*
		 * 	[조건연산자]
		 * 		? :
		 * 			조건식 ? 식1 : 식2
		 * 				--> 조건식이 true이면 식1으로
		 * 				--> 조건식이 false이면 식2로
		 */
		System.out.println("--------------------");
		System.out.println("[삼항연산자]");
		
		int myNum4 = 0;
		
		// 양수, 음수, 0 을 출력
		System.out.println(myNum4 > 0 ? "양수":"음수" );	// 0이 0보다 큰가? 맞으면 1번 틀리면 2번식으로

		// 삼항연산자 중첩 --> 0일때는 "0" 이라고 출력
		System.out.println(myNum4 > 0 ? "양수": ( myNum4 < 0 ? "음수" : 0) );	// 삼항연산자 안에 삼항연산자 중첩가능
		
		/*
		 * 	[대입연산자]
		 * 		복합 대입연산자	+=	-=	/=	%=	등등..
		 * 
		 * 		자기 자신의 값과 연산을 하여 자기 자신에게 대입해라
		 */
		System.out.println("--------------------");
		System.out.println("[복합 대입연산자]");
		
		int myNum5 = 0;
		myNum5 += 10;		// myNum5 = myNum5 + 10; <- 식과 같음
		System.out.println(myNum5);
	}

}

