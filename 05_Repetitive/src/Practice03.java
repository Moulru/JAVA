
public class Practice03 {
	
	public static void main(String[] args) {
		/*
		 * 		2중 for문을 이용한 구구단 출력
		 * 
		 * 		조건
		 * 		printf("%d * %d = %d /t", ?, ?, ?);		형태로 작성
		 * 
		 * 		[출력결과]
		 * 		2*1=2 ...
		 * 		3*1=3 ...
		 *		...
		 *		9*1=9 ...
		 */
		
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{
				System.out.printf("%d * %d = %d \t", i, j, i*j);
			}
			System.out.println();
		}
	}
}
