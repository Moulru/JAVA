import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		/*
		 * 	숫자 야구 게임
		 * 		1. 1~9까지 숫자 중 중복되지않는 3개의 정답 숫자를 랜덤으로 생성한다.
		 * 			> int[] answer	= new int[3];  --> 정답 숫자를 담는 배열
		 * 			> int[] input	= new int[3];  --> 입력 숫자를 담는 배열
		 * 		2. 3개의 숫자를 입력받고 규칙에 따라 정답 또는 ball 또는 strike 판별
		 *			> 맞출 때까지 반복
		 *			> 오답일 때 결과를 출력
		 *			> 위치,숫자일치 = strike
		 *			> 위치X, 숫자일치 = ball
		 *			> 위치,숫자 X = out
		 * 		[규칙]
		 * 			정답 : 3 5 6
		 * 			입력 : 1 2 4 (out)
		 * 			입력 : 4 3 5 (2ball)
		 * 			입력 : 3 2 5 (1 strike, 1 ball)
		 * 			입력 : 3 5 1 (2 strike)
		 * 			입력 : 3 5 6 (3 strike, 정답)
		 * 		(숫자와 순서가 맞아야 strike, 숫자만 맞으면 ball,숫자도 순서도 틀리면 out이다)
		 * 
		 * 		[출력 결과]
		 * 			입력 : 1 2 4
		 * 			결과 : out
		 * 			입력 : 3 2 5
		 * 			결과 : 1strike, 1ball
		 * 			입력 : 3 5 6
		 * 			정답입니다. (3회 시도)
		 */
		
		/*
		 * 	1. 배열생성 (정답,입력)
		 * 	2. 정답 숫자 만들기  +중복제거
		 * 	3. 입력 받기
		 * 	4. 값 출력
		 * 	5. 결과 출력
		 * 	6. 오답 시 3부터 반복
		 */
		
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.print("몇 개의 숫자로 게임을 하시겠습니까?(최대 9) : ");
		x = sc.nextInt();
		
		if (x > 9) {
			do {
				System.out.print("다시 입력해주세요(최대 9) : ");
				x = sc.nextInt();
			} while (x > 9 || x == 0 || x < 0);
		}
		
		int[] answer	= new int[x];
		int[] input		= new int[x];
		int strike		= 0;
		int ball		= 0;
		int count		= 0;
		boolean co		= false;
		
		for(int i=0; i<answer.length; i++)
		{
			int random = (int) (Math.random() * 9) + 1;
			answer[i] = random;

			for (int j = 0; j < answer.length; j++) {
				if (answer[i] == answer[j] && i != j) {
					while (answer[i] == answer[j]) {
						random = (int) (Math.random() * 9) + 1;
						answer[i] = random;
						j=0;
					}
				}
			}
		}

		for(int i=0;i<answer.length;i++)				// 정답숫자 출력
		{
			System.out.printf("%d ",answer[i]);
		}
		System.out.println();
		
		do{
			System.out.printf("%d개의 숫자를 입력하세요 : ",input.length);
			for(int i=0; i<input.length; i++)			// 정한 횟수만큼 입력받기
			{
				input[i] = sc.nextInt();
			}
			
			for(int i=0; i<x; i++)						// 자리와 숫자가 일치하면 strike에 1을더하고
			{
				if(input[i]==answer[i]) strike += 1;
				for(int j=0; j<x; j++)					// 자리는 다르고 숫자만 일치하는것이 있는 갯수만큼 ball에 1을 더한다
				{
					if(input[i]!=answer[i] && input[i]==answer[j])
					{
						ball += 1;
					}
				}
			}
			
			count += 1;									// 시도횟수 카운팅
			
			if(strike==x)								// 정한숫자와 strike의 숫자가 일치하면 정답처리
			{
				co=true;
				System.out.printf("정답입니다. 시도횟수 : %d회",count);
			}
			else if(strike==0 && ball==0)				// 숫자가 전부 틀렷다면 out 출력
			{
				System.out.println("OUT!");
			}
			else										// 그외(스트라이크나 볼이 1이라도 있을경우)에는 각 스트라이크와 볼의 갯수를 출력
			{
				System.out.printf("스트라이크: %d ,볼: %d\n",strike,ball);
			}
			
			// 틀리면 게임이 재시작되므로 strike와 ball의 갯수도 초기화
			strike	= 0;
			ball	= 0;
		}while(co!=true);
	}

}
