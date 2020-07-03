import java.util.Scanner;

public class MethodPractice02 {

	public static void main(String[] args) {
		/*
		 * 	다시 돌아온 소수 구하기 (05_Practice06)
		 * 
		 * 		이전에 작성한 코드 활용
		 * 
		 * 		> 메서드 : 전달된 숫자가 소수인지 판별 후 
		 * 					true / false 리턴
		 * 			이름 : isPrimeNumber
		 * 					전달한 이 숫자가 소수인가?
		 */

		Scanner sc = new Scanner(System.in);

		int inNum = 0;

		System.out.print("숫자를 입력하세요 : ");
		inNum = sc.nextInt();
		
		/*		다른풀이
		 *  for( int i =2; i<inNum; i++) {
		 *  if (isPrimeNum(i) == true) { system.out.printf(" %d " ,i ) }
		 *  }
		 */
		for(int i=2;i<=inNum;i++)
		{
			if(isPrimeNumber(i)==true) {
				System.out.printf("%d ",i);
			}
		}
		
	}


	static boolean isPrimeNumber(int x) {
		
		/*		다른풀이
		 *  for (int i =2; i< num; i ++)
		 *  { if (num%i==0) { return false }
		 *  }
		 *  
		 */
		for(int j=2;j<=x;j++)
		{
			if((x % j) == 0) {
				if( x != j) {
					return false;
				}
				
				else {
					return true;
				}
			}
		}
		
		return true;
	}
}
