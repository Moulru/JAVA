
public class Exam04 {

	public static void main(String[] args) {
		//	for문 중첩(다중 for문)
		
		
		//	2중 for문
		System.out.println("i │ j");
		System.out.println("─────");
		for( int i = 1; i <= 3; i++)
		{
			for ( int j = 1; j <= 2; j++)
			{
				System.out.printf("%d │ %d \n", i, j);
			}
		}
	}
}
