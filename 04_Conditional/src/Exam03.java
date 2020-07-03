import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 숫자를 입력받고, 양수/음수/0 인지 출력하기

		int inputNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		inputNum = sc.nextInt();
		
		if(inputNum > 0)
		{
			System.out.println("양수입니다.");
		}
		else if(inputNum == 0)
		{
			System.out.println("0 입니다.");
		}
		else
		{
			System.out.println("음수입니다.");
		}
		
		sc.close();
	}

}