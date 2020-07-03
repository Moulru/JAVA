
public class MethodEx03 {

	public static void main(String[] args) {
		/*
		 * 	가변인자 (가변 : 변할수 있는)
		 * 		- 매개변수의 개수를 '동적'으로 지정
		 * 			> 몇 개가 되던 처리
		 *		- 대표적인 예 : printf (사용자가 원하는 만큼의 %d(매개변수)를 생성가능함)
		 *
		 * 		(타입... 매개변수명)
		 * 
		 * 		- 가변인자는 항상 마지막 매개변수여야 한다
		 */


		System.out.printf("%d, %d\n",1,2);		// 몇개의 %d가 있든 상관없음
		System.out.println(addString("+", "1", "2", "3"));
	}

//	전달된 문자열들에 구분기호를 넣어서 하나의 문자열로 합치는 메서드
//	args 가변인자는 내부적으로 배열을 사용한다
	static String addString( String str, String... args) {
		String result = "";
		
		for (int i=0; i<args.length; i++) {
			// args.length = 3 이라고 치면,
			// i=2 라는 얘기는 마지막 요소!
			if( i+1 == args.length ) {		// 마지막 요소이면
				result += args[i];
			}
			else {							// 그게 아니면 (마지막 요소가 아니면)
				result += args[i] + str;
			}
		}
		
		return result;
	}
}
