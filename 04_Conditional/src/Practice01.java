import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/* 국어 영어 수학 점수를 입력받고
		 * 	평균이 60점 이상이면 합격, 아니면 불합격이라고 출력
		 */
		
		int sub1	= 0;
		int sub2	= 0;
		int sub3	= 0;
		int sum		= 0;
		int avg		= 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 차례대로 입력해주세요 : ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		
		sum = (sub1+sub2+sub3);
		avg = (sub1+sub2+sub3)/3;
		
		System.out.printf("총점 %d점, 평균 %d점 ",sum,avg);
		
		if(avg>=60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}
	}

}
