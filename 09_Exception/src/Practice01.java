import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/*
		 * 		05 프로젝트 - Exam07 참고
		 * 
		 * 		숫자맞추기 게임
		 * 			--> 이 코드 그대로 가져와서 붙여넣기
		 * 			--> 실행하면 결과가 제대로 나오는 것을 확인
		 * 			--> 입력 받은 값이 숫자가 아닌 문자일 때, 값을 다시 입력 받도록 예외처리하기
		 */

		int inputNum	= 0;		// 숫자 입력 받을 변수
		int answer		= 0;		// 정답 숫자 변수
		int count		= 0;		// 몇 회 안에 맞췄는지 셀 변수
		
		//	1. 정답 숫자 만들기 (랜덤)
//		System.out.println( Math.random() );	// 랜덤 값 생성
		answer = (int)(Math.random()*100)+1;	// (int)(0.x ~ 99.x)+1 ==> 1~100
		
		
		//	2. 숫자를 입력 받아서, 정답 숫자와 비교
		do {
			System.out.print("1~100까지 숫자를 입력하세요 : ");
			
			// 해답
//			try {
//				inputNum = new Scanner(System.in).nextInt();
//
//				if (inputNum > answer) {
//					System.out.println("더 작은 수를 입력해보세요.");
//				} else if (inputNum < answer) {
//					System.out.println("더 큰 수를 입력해보세요.");
//				}
//
//			} catch (InputMismatchException e) {
//				System.out.println("숫자를 입력해주세요.");
//			}
			
			
			// 다른 풀이
			try {
				inputNum = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				System.out.println("문자를 입력하지 마세요.");
				continue; // continue를 넣어 반복문을 도중에 스킵!
			}

			if (inputNum > answer) {
				System.out.println("더 작은 수를 입력해보세요.");
			} else if (inputNum < answer) {
				System.out.println("더 큰 수를 입력해보세요.");
			}

			count++;
		} while ( inputNum != answer );			// 같지않으면 다시 do로 돌아감
		
		// do~while문이 끝났다는 것은, 정답을 맞춘 것이다.
		System.out.printf("정답입니다! %d회 ",count);
		
	}
}
