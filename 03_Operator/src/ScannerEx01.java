import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// 여러 개의 숫자 입력 받기
		
		// 스캐너 사용하는 공식
		Scanner sc = new Scanner(System.in);

		System.out.print("두 수를 입력해 주세요 : ");
		
		int num1 = 0;
		int num2 = 0;
		
		num1= sc.nextInt();
		num2= sc.nextInt();
		
		System.out.println("두 수의 합: " + (num1+num2));
		
	}

}
