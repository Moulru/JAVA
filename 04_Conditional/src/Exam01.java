
public class Exam01 {

	public static void main(String[] args) {
		int x = 0;
		
		System.out.printf("x가 %d일 때 참(true)인 것은\n", x);
		
		// 1번
		if ( x == 0) {		// == : 등가 비교 양측이 같은지
			System.out.println("x==0");
		}
		
		// 2번
		if (x != 0) {		// != : 같지않은지
			System.out.println("x!=0");
		}
		
		// 3번
		if (!(x == 0)) {	// !(~~) : ~~의 결과(true / false) 를 반대로
			System.out.println("!(x==0)");
		}
		
		// 4번
		if ( !(x != 0) ) {	
			System.out.println("!(x!= 0)");
		}

//		-------------------------------------------------------------------------------------------
		
		x = 10;
		System.out.println();
		System.out.printf("x가 %d일 때 참(true)인 것은\n", x);
		
		// 블록 {} (중괄호) 안에 들어갈 코드가 1개일 경우,
		// 블록을 생략 가능하다.
		if ( x == 0)
			System.out.println("x==0");
//			System.out.println("한줄 더 이어써도 다른 수행문으로 간주됨(if문안에 안들어감)");
		
		// 한 줄로도 가능하다.
		if (x != 0) System.out.println("x!=0");
		
		
		// 자신 스타일로 중괄호위치 변경 가능
		if (!(x == 0)) 
		{
			System.out.println("!(x==0)");
		}
		
		
		if ( !(x != 0) ) 
		{	
			System.out.println("!(x!= 0)"); 
		}
	}

}
