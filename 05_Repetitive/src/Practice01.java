import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/*
		 * 		1부터 입력받은 수까지 짝수들의 합 구하기
		 * 
		 * 		[출력결과]
		 * 		숫자를 입력하세요 : 10
		 * 		합 : 30
		 */

		Scanner sc= new Scanner(System.in);
		int in	= 0;
		int sum	= 0;
		
		System.out.print("숫자를 입력하세요 : ");
		in = sc.nextInt();
		
		for(int i=1;i<=in;i++)
		{
			if(i%2 != 0)
			{
				continue;
			}
			sum = sum + i;
		}
		
		System.out.println(sum);
	}

}
