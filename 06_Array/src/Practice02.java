
public class Practice02 {

	public static void main(String[] args) {
		/*
		 * 	05_Repetitive - Practice03
		 * 	구구단 결과를 2차원 배열에 저장한 후 출력하기
		 * 		1. 2차원 배열 생성
		 * 		2. 2중for문을 통해 2차원 배열에 값 넣기
		 * 		3. (위 2중 for문과는 별개로)다른 2중for문에서 배열 값을 이용하여 구구단 출력
		 */

		int[][] gugu	= new int[9][9];

		for (int i=0; i<gugu.length; i++)
		{
			for (int j=0; j<gugu.length; j++)
			{
				gugu[i][j] = (i+1)*(j+1);
			}
		}

		for (int i=0; i<gugu.length; i++)
		{
			for (int j=0; j<gugu.length; j++)
			{
				System.out.printf("%d * %d = %d\t",j+1,i+1,gugu[i][j]);
			}
			
			System.out.println();
		}
	}

}
