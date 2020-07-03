import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 입력된 점수에 따라 학점을 부여하기
		// 문자열 (String)의 특성을 활용해보기
		
		int		inputGrade	= 0;		// 보통 int는 0으로 초기화한다.
		String	gradeStr	= "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요 : ");
		inputGrade = sc.nextInt();
		
		if ( inputGrade > 90 )
		{
			// gradeStr변수에 A 입력, 100점이라면 추가로 "(만점)" 입력
			gradeStr = "A";
			// 조건식의 중첩
			if ( inputGrade == 100 )
			{
				gradeStr += " (만점)";		// 문자열은 덧셈 연산 가능
			}
		}
		else if ( inputGrade > 80 )
		{
			// gradeStr변수에 B 입력
			gradeStr = "B";
		}
		else if ( inputGrade > 70 )
		{
			// gradeStr변수에 C 입력
			gradeStr = "C";
		}
		else
		{
			// gradeStr변수에 F 입력, 0점이라면 추가로 "(빵점)" 입력
			gradeStr = "F";
			if ( inputGrade == 0 )
			{
				gradeStr += " (빵점)";
			}
		}
		
		System.out.println("당신은 " + gradeStr + "입니다.");

	}

}
