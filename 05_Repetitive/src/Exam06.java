
public class Exam06 {

	public static void main(String[] args) {
		//	for문 조건변수 값
		//	초기식;조건식;증감식
		//	조건변수만 잘 조절하면 초기값,증감식은 자유롭게 사용
//		for( int i = 10; i > 0; i--)
//		{
//			System.out.println(i);
//		}

		//	while문
		//	1부터 계속 값을 더하다가, 더한값이 100을 초과하면 끝
		
		int num = 1;
		int sum = 0;
		
		while( sum < 100 )
		{
			sum += num;
			System.out.printf("num = %d \t sum = %d\n", num, sum);
			num++;
		}
	}

}
