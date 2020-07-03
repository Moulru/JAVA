
public class MethodPractice03 {

	public static void main(String[] args) {
		/*
		 * 	재귀호출을 이용한 팩토리얼 결과 값 구하기
		 * 		3! = 3 * 2 * 1 = 6
		 * 		5! = 5 * 4 * 3 * 2 * 1 = 120
		 */

		System.out.println(pactoria(5));
		System.out.println(pactoria(8));
	}

	// 팩토리얼 메서드 구현!!
	static int pactoria(int num) {
		if(num==1) {
			return num;
		}
		
		return num*(pactoria(num-1));
	}
}
