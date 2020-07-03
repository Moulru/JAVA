
public class Exam05 {

	public static void main(String[] args) {
		/*
		 * 	2중 for문 *찍기
		 * 		*****
		 * 		*****
		 * 		*****
		 * 		*****
		 * 		*****
		 */
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("*");
			}
			
			// j의 for문 수행 후 개행
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("=================");
		System.out.println();
		
		int row = 2;		// 가로
		int col = 3;		// 세로
		
		for(int i=0; i<col; i++)
		{
			for(int j=0; j<row; j++)
			{
				System.out.print("*");
			}
			
			// j의 for문 수행 후 개행
			System.out.println("");
		}
	}

}
