
public class Practice01 {

	public static void main(String[] args) {
		/*
		 * 	1. 내 사과는 몇 개의 바구니에..
		 * 		- 1개의 바구니에는 10개의 사과를 담을 수 있다.
		 * 		- 내가 가진 사과가 142개 일 때는 15개의 바구니가 필요하다.
		 * 		- 바구니의 개수를 구하는 코드를 작성하시오.
		 * 
		 * 		*삼항연산자 사용
		 * 			hint. 나머지를 구했을 때 결과에 따라 처리..!
		 * 
		 * 		출력결과 : 사과 142개, 바구니 15개
		 */
		
		int myApple = 142;	// 사과 개수
		int myBuck	= 10;	// 1바구니 당 들어갈 수 있는 사과 개수
		
		int buck = myApple/myBuck;
		
		System.out.println( myApple%myBuck > 0 ? ("사과 "+ myApple +"개, 바구니 " + (++buck) +"개") : ("사과 "+ myApple +"개, 바구니 " +buck+"개"));
		
		/*
		 * 다른 풀이,
		 * 
		 * int buck = 0;
		 * buck = (myApple/myBuck) + (myApple%myBuck > 0 ? 1:0);			<<buck을 삼항연산자로 미리 계산함
		 * System.out.printf("사과 %d개, 바구니 %d개", myApple, buck);		<<계산 값을 출력
		 * 
		 */
		
		/*
		 * 	2. 숫자 버리기
		 * 		int myNumber = 4321; 일 때
		 * 		연산자를 활용하여 4000이 출력되도록 코드를 작성하세요.
		 * 			hint. 정수와 정수를 나눈 결과..!
		 */
		
		int myNumber = 4321;
		System.out.println(myNumber/1000*1000);
	}
}
