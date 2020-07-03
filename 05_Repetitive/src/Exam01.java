
public class Exam01 {

	public static void main(String[] args) {
		
		for( int i = 0; i < 5; i++ )
		{
			System.out.println(i);
		}
		
		System.out.println("=============================");
		
		int j = 0;
		
		//	초기식에 이미 선언된 변수를 사용 가능!
//		for( j = 0; j < 5; j++ )
//		{
//			System.out.println(j);
//		}
		
		//	j=0이란것을 이미 선언해둿기 때문에 초기식을 생략 할 수도 있다!
		//	수행할 코드가 한 줄 일때, { } 생략가능, 한줄로도 가능
		for( ; j < 5; j++ )		System.out.println(j);
		
	}

}
