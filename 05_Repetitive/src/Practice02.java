
public class Practice02 {
	
	public static void main(String[] args) {
	/*
	 * 		1~200까지 3과 4의 공배수를 더하다가
	 * 		그 더한 수가 1000을 초과한 경우, 반복문을 빠져나오고
	 * 		그때까지 더해진 수와 빠져나올때의 수을 출력
	 *
	 *		[출력결과]
	 *		빠져나온 수	: 156
	 *		더한 수	: 1092
	 */
		int sum = 0;
		
		for( int i = 1; i <= 200; i++ )
		{
			if((i%3)==0 && (i%4)==0)
			{
				sum = sum + i;
				if(sum>1000)
				{
					System.out.printf("빠져나온 수\t: %d \n",i);
					break;
				}
			}
		}
		
		System.out.printf("더한 수\t: %d",sum);
	}
}
