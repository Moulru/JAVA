public class Exam04 {
	public static void main(String[] args) {
		/*		그냥 문자열 사용할 때 String / 문자열의 문자 변경이 잦다 -> buffer
		 * 
		 * 	StringBuffer 클래스
		 * 		- String 클래스와 유사하다. char[] 을 가지고 있다.
		 * 		- 하지만 문자열 내용 변경이 가능하다.
		 * 		- 또, equals() 메서드를 오버라이딩하지 않았다.
		 * 		- 내부적으로 배열의 길이(버퍼/buffer)를 가지고 있다.
		 * 			> 문자열 편집 중에 현재 버퍼길이보다 더 늘어나면
		 * 			  자동으로 버퍼 길이를 늘려준다. (성능 저하 요인)
		 * 
		 * 	StringBuilder 클래스
		 * 		- StringBuffer와 동일하다. (클래스명만 바꿔치기하면 된다.)
		 * 		- Thread의 '동기화' 관련 부분이 제거되어 성능이 더 좋다.
		 */
		int[] arr = new int[16];	// int 16개 배열
		arr[0] = 0;
		arr[15] = 0;
		
		// 내부적으로 가지고 있는 문자배열의 길이를 생성 시 세팅
		StringBuffer sb1 = new StringBuffer(); // 기본 버퍼길이는 16byte
		StringBuffer sb2 = new StringBuffer(80); // 버퍼길이 지정
		StringBuffer sb3 = new StringBuffer("ABC"); // 문자길이+16byte = 19
		
		// append() 메서드 : 뒤에 문자열을 추가하고 자기 자신의 주소를 '반환'
		sb3.append("DEF");
		System.out.println( sb3 );
		sb3.append("GHI").append("JKL");
		// sb3.append("GHI"); 의 결과(반환)은 sb3 이기 때문에,
		// sb3.append("JKL"); 을 한 것과 같다.
		System.out.println(sb3);
		
//		StringBuffer s = sb3.append("GHI");
//		s.append("JKL");
		
		// equals()사용 - String과 다르게 오버라이딩 되어있지 않다.
		StringBuffer sb4 = new StringBuffer("ABC");
		StringBuffer sb5 = new StringBuffer("ABC");
		System.out.println( sb4.equals(sb5) );
		
		// String으로 변환
		String str4 = sb4.toString(); // sb4를 String으로 만들겠다!
		String str5 = sb5.toString();
		
		// String 클래스에서는 오버라이딩이 되어 있다!
		System.out.println( str4.equals(str5) );
		
	}// main()
}






