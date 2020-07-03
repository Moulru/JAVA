import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		/*
		 * 소수만 출력하기 --> PrimeNumber --> 1과 자기자신으로만 나누어 지는 수 --> 1은 소수가 X
		 * 
		 * 1부터 입력받은 수까지 소수 출력
		 * 
		 * [출력결과] 
		 * 숫자를 입력하세요 : 20 
		 * 결과 : 2 3 5 7 11 13 17 19
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int inNum = 0;

		System.out.print("숫자를 입력하세요 : ");
		inNum = sc.nextInt();

		for (int i = 2; i <= inNum; i++) {		// 1은 소수가 아니기때문에 2부터시작

			for (int j = 2; j <= i; j++) {		// 소수는 1로는 나눠지기 때문에 2부터 시작 
				if ((i % j) == 0) {				// i를 j로 나눳을때의 나머지값이 0이라면 소수가 아님!
					if (i != j) {				// i = j가 됫을때(자기자신)도 나눠지기 때문에 빼야됨
						break;					// 소수가 아니면 넘어감
					}

					else {
						System.out.printf("%d ", i);	// 소수가 아닌것들을 넘어갔으니 남은 수는 전부 소수!
					}
				}

			}
		}
	}
}
