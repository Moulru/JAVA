
public class Exam02 {

	public static void main(String[] args) {
		//	1~10까지의 합 구하기
		
		//	합을 저장할 변수
		int sum = 0;
		
		for ( int i = 1; i <= 10 ; i++)
		{
			sum += i;
		}
		
		System.out.printf("1~10까지의 합 : %d",sum);
	}

}
