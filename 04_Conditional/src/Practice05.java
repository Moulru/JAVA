import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		/*
		 *  Exam05 학점 부여하기를 switch~case문으로
		 *  
		 *  	hint1. 숫자 버리기 예제 방법 활용
		 *  		>> 정수와 정수를 나눈 결과 활용, case 10: ~ default: 까지
		 *  
		 *  [출력결과]
		 *  성적을 입력하세요 : 70점
		 *  당신은 F입니다.
		 */
		
//		switch(점수)
//		{
//		case 100:
//		~~~
//		}
		
		Scanner sc	= new Scanner(System.in);
		
		int inNum	= 0;
		int grade	= 0;
		
		System.out.print("성적을 입력하세요 : ");
		inNum = sc.nextInt();
		
		grade = inNum/10*10;
				
		if((inNum > -1) && ( inNum < 101))
		{
			switch(grade)
			{
			case 100:
				System.out.println("당신은 A(만점)입니다.");
				break;
			case 90:
				System.out.println("당신은 A입니다.");
				break;
			case 80:
				System.out.println("당신은 B입니다.");
				break;
			case 70:
				System.out.println("당신은 C입니다.");
				break;
				
			default:
				{
					if(inNum == 0)
					{
						System.out.println("당신은 F(빵점)입니다.");
					}
					else
					{
						System.out.println("당신은 F입니다.");
					}
					break;
				}
			}
		}
		else
		{
			System.out.println("잘못 입력하였습니다.");
		}
	}

}
