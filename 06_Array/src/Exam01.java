
public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 	배열의 담긴 모든 숫자의 합 구하기
		 * 	--> 배열 크기에 상관없이 for문을 돌 수 있도록!
		 */

		int[]	myArr	= { 1,2,3,4,5,6,7,8,9,10 };
		int		sum		= 0;
		
		for(int i=0; i<myArr.length; i++)
		{
			sum += myArr[i];
		}
		
		System.out.println("배열에 담긴 수의 합 : " +sum);
	}

}
