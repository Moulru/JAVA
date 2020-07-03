import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/*
		 * 	피보나치 수열
		 * 		- 입력받은 '횟수'만큼 피보나치수열을 출력하기
		 * 
		 * 		1 1 2 3 5 ...  (현재숫자+이전숫자 = 다음숫자)
		 * 			n = (n-1) + (n-2)		--> 현재숫자 = 이전숫자 + 이전이전숫자
		 * 
		 * 		- 처음 두 개 1은 고정 값이므로, 배열에 넣어둔다.
		 * 
		 * 	1. 배열 값을 저장하는 for문 1개
		 * 	2. 피보나치 수열을 위 형태로 출력하는 for문 1개
		 */

		Scanner sc = new Scanner(System.in);
		int in = 0;
		int n = 0;

		System.out.print("피보나치 수열을 몇회까지 출력하시겠습니까? : ");
		in = sc.nextInt();
		int[] pibo = new int[in];

		pibo[0] = 1;
		pibo[1] = 1;

		for (int i = 2; i < pibo.length; i++) {
			n = pibo[i - 1] + pibo[i - 2];
			pibo[i] = n;
		}

		for (int i = 0; i < pibo.length; i++) {
			System.out.println(pibo[i]);
		}
	}
}
