
public class ConditionalEx {

	public static void main(String[] args) {
		/*
		 * 	[조건문]
		 * 		정의 : 주어진 조건에 만족할 때, 수행하는 '제어문'
		 * 
		 * 		1. if문
		 * 			구성 : 조건식, 수행문
		 * 
		 * 			if()
		 *			> 만약 조건이 만족하면 수행해라
		 * 			> 만족하지 않으면, 수행문을 건너뛴다.
		 * 
		 * 			else if()
		 * 			> '위 조건'이 만족하지 않으면,
		 * 			> 이 조건을 비교한 후 수행해라
		 * 			> 무조건 if문이 있어야만 함께 사용할 수 있다. (if문에 종속적)
		 * 			> 개수 제한이 없다.
		 * 
		 * 			else
		 * 			> '위 조건'이 만족하지 않으면,
		 * 			> 이 조건을 무조건 수행해라
		 * 			> else if 보다 앞에 사용하면 안됨
		 * 
		 * 		2. switch~case문
		 *	 		하나의 조건으로 많은 '경우의 수'를 처리
		 *			1. 조건식의 결과는 '정수', '문자열'만 허용
		 *				> 하지만 문자열은 조건식에 가급적 넣지말자..
		 *
		 *			2. case문의 값은 정수인 상수만 가능하며, 중복되서는 안된다
		 *
		 * 			* break;
		 * 				switch~case문을 빠져나감			
		 */
		
		int age = 5;
		
		// if(조건식) {
		//		수행문
		// }
		if( age > 19 ) {
			System.out.println("성인입니다.");
		}
		
		else if(age < 8) {
			System.out.println("유아입니다.");
		}
		
		//else는 조건이 없다. 바로 수행문을 작성
		else {
			System.out.println("미성년자입니다.");
		}
		
	}

}
