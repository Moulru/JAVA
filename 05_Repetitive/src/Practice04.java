
public class Practice04 {

	public static void main(String[] args) {
		/*
		 * 	1~100 사이 숫자 중, 3의배수와 5의배수를
		 *  역순으로 출력하기
		 *  
		 *  단, 3과 5의 공배수는 [15]와 같이 출력하기
		 *  
		 *  [출력결과]
		 *  100 99 96 95 93 ... [90] 87 85 84  ... 1
		 */

		for(int i=100; i>0; i--)
		{
			if((i%3)==0 && (i%5)==0)
			{
			System.out.printf("[%d]\n",i);
			}
			else if((i%3)==0 || (i%5)==0)
			{
			System.out.printf("%d\n",i);
			}
		}
	}

}
