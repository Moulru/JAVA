import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		/*
		 * do~while
		 * 
		 * 		숫자 맞추기 게임
		 * 			1~100 숫자 중 랜덤으로 정답 숫자 생성
		 * 			숫자를 입력 받아서, 정답일때까지 반복
		 * 
		 * 			입력 숫자가 더 크면, 더 작은 수를 입력해보세요.
		 * 			입력 숫자가 더 작으면, 더 큰수를 입력해보세요.
		 * 
		 * 			1~100까지 숫자를 입력하세요 : 
		 */

		int inputNum	= 0;		// 숫자 입력 받을 변수
		int answer		= 0;		// 정답 숫자 변수
		int count		= 0;		// 몇 회 안에 맞췄는지 셀 변수
		
		//	1. 정답 숫자 만들기 (랜덤)
//		System.out.println( Math.random() );	// 랜덤 값 생성
		
//		answer = Math.random();					// 0.0x ~ 0.9x
//		answer = Math.random()*100;				// 00.x ~ 99.x
		answer = (int)(Math.random()*100)+1;	// (int)(0.x ~ 99.x)+1 ==> 1~100
		
//		System.out.println(answer);				// 정답 숫자
		
		Scanner sc = new Scanner(System.in);
		
		//	2. 숫자를 입력 받아서, 정답 숫자와 비교
		do {
			System.out.print("1~100까지 숫자를 입력하세요 : ");
			
			inputNum = sc.nextInt();
			
			count++;
			
			if( inputNum > answer)
			{
				System.out.println("더 작은 수를 입력해보세요.");
			}
			else if ( inputNum < answer )
			{
				System.out.println("더 큰 수를 입력해보세요.");
			}
		} while ( inputNum != answer );			// 같지않으면 다시 do로 돌아감
		
		// do~while문이 끝났다는 것은, 정답을 맞춘 것이다.
		System.out.printf("정답입니다! %d회 ",count);
	}

}
