import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/*
		 * 	2차원 배열을 활용한, 행성의 영어 이름 맞추기
		 */

		String[][] words = {
				{"화성","Mars"},
				{"목성","Jupiter"},
				{"해왕성","Neptune"},
				{"토성","Saturn"}
				};
		String input;
		
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		for( int i=0; i<words.length; i++ )
		{
			System.out.printf("%d, %s의 영어 이름 : ",(i+1),words[i][0]);
			
			input = sc.nextLine();
			
			// equals : 대소문자 구분해서 비교한다.
			// equalsIgnoreCase : 대소문자 구분없이 비교한다.
			if( input.equalsIgnoreCase( words[i][1]) )
					{
				System.out.println(" 정답입니다. ");
				score += 25;
					}
			else {
				System.out.printf(" 오답입니다. 정답은 [%s]입니다. \n", words[i][1]);
			}
		}
		
		System.out.printf(" 당신의 점수는 %d점 입니다. ",score);
	}

}
