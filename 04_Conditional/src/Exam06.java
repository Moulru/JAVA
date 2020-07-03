import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// switch ~ case 문을 이용하여
		// '월'을 입력받았을때 계절을 출력하기
		
		int inputMonth = 0;
		String strMon = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요 : ");
		inputMonth = sc.nextInt();
		
		switch(inputMonth)
		{
			case 3:
			case 4:
			case 5:
				strMon = "봄";
				System.out.printf("%d월은 %s입니다.",inputMonth,strMon);
				break;
			case 6:
			case 7:
			case 8:
				strMon = "여름";
				System.out.printf("%d월은 %s입니다.",inputMonth,strMon);
				break;
			case 9:
			case 10:
			case 11:
				strMon = "가을";
				System.out.printf("%d월은 %s입니다.",inputMonth,strMon);
				break;
			case 12:
			case 1:
			case 2:
				strMon = "겨울";
				System.out.printf("%d월은 %s입니다.",inputMonth,strMon);
				break;
				
			default:
				System.out.printf("%d월은 없습니다.",inputMonth);
					
		}

	}

}
