import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		/*
		 *  홀짝 판별기
		 *  	방법 : 2로 나눈 나머지가 0이면 짝수
		 *  
		 *  	숫자를 입력 받고, 그 숫자가 홀수인지 짝수인지 출력
		 *  
		 *  	출력값
		 *  	숫자를 입력해주세요 : 1
		 *  	입력하신 1은(는) 홀수입니다.
		 *  
		 *  	[심화] : 0일 경우, 애매합니다. 라고 추가로 출력
		 *  	숫자를 입력해주세요 : 0
		 *  	입력하신 0은(는) 짝수입니다.
		 *  	애매합니다.
		 */
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			if(num != 0)
			{
				System.out.printf("입력하신 %d은(는) 짝수입니다. \n",num);
			}
			else
			{
				System.out.printf("입력하신 %d은(는) 짝수입니다. \n",num);
				System.out.printf("애매합니다.\n");
			}
			
		}
		
		else 
		{
			System.out.printf("입력하신 %d은(는) 홀수입니다. \n",num);
		}

	}

}
