
public class Exam03 {

	public static void main(String[] args) {
		// break, continue
		
		// continue 의 사용
		for( int i=0; i<5; i++ )
		{
			if( i==1 )
			{
				continue;		// continue를 만나면 바로 증감식으로 '점프'
			}
			
			System.out.println(i);
		}

		System.out.println("==========================");
		
		//	break 의 사용
		for( int i=0; i<5; i++ )
		{
			if( i==1 )
			{
				break;			// break를 만나면 바로 종료
			}
			
			System.out.println(i);
		}
	}

}
