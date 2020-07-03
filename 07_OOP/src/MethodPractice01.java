import java.util.Scanner;

public class MethodPractice01 {

	public static void main(String[] args) {
		/*
		 * 	두 개의 변수를 입력 받고 큰 수에서 작은 수를 뺀 결과 값을 출력
		 * 
		 * 		> 메서드 : 입력받은 두 수를 전달 받고, 결과 반환
		 * 
		 * 	[출력결과]
		 * 		두 수 입력 : 1 20
		 * 		결과 : 19
		 */

		Scanner sc = new Scanner(System.in);
		int x	= 0;
		int y	= 0;
		
		System.out.print("두 수 입력 : ");
		x	= sc.nextInt();
		y	= sc.nextInt();
		
		System.out.printf("결과 : %d",minus(x,y));
	}

	
	static int minus(int num1,int num2) {
		int result;
		if(num2>num1)
		{
			result = num2 - num1;
			return result;
		}
		result = num1 - num2;
		
		return(result);
	}
}
