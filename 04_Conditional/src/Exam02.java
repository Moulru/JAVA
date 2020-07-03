import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 숫자를 입력 받아서 0인지 아닌지 판단 후 내용출력
		
		int inputNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		inputNum = sc.nextInt();
		
		// 1번 조건식
		if ( inputNum == 0)
		{
			System.out.println("1: 입력한 숫자는 0 입니다.");
		}
		else
		{
			System.out.println("1: 입력한 숫자는 0 이 아닙니다.");
		}

		// 2번 조건식
		if ( inputNum != 0 )
		{
			System.out.println("2: 입력한 숫자는 0 이 아닙니다.");
		}
		else
		{
			System.out.println("2: 입력한 숫자는 0 입니다.");
		}
	}

}
