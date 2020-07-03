public class Exam05 {
	public static void main(String[] args) {
		/*
		 * 	Math 클래스
		 * 		- 수학계산에 유용한 클래스
		 * 		- 모두 클래스 메서드이다. (static)
		 * 			> 인스턴스를 만들 필요가 없다.
		 * 
		 * 		- 필요 시 검색해서 사용
		 */
		
		// sqrt() : 제곱근 구하는 클래스메서드 (루트) 
		double value = Math.sqrt(25);
		System.out.println( value );
		
		// pow(a, b) : a의 b제곱을 반환 8*8 
		double value2 = Math.pow(8, 2);
		System.out.println( value2 );
		
		
	} // main()
}