
public class MethodEx02 {

	public static void main(String[] args) {
		/*
		 * 	메서드 재귀호출
		 * 
		 * 		- 메서드 호출 -> 스택에 쌓인다
		 * 			> 반복분보다 속도가 느리다
		 * 			> 너무많은 재귀호출은 오류발생
		 * 
		 * 		- 그럼 왜 사용을 할까?
		 * 			> 복잡한 코드가 논리적으로 간결해질 수 있다
		 * 			> 재귀호출 자체가 비효율적이므로,
		 * 		 	  반복문의 사용보다 확실한 이득이 있을 때만 사용을 고려한다.
		 */

		method1(3);
		
		System.out.println( power(2,4) );
	}

	static void method1(int num) {
		if (num==0){
			return;
		}
		
		System.out.printf("method1() : %d\n",num);
		num--;
		method1(num);
	}
	
	// 거듭제곱
	// num1의 num2제곱 --> 2,4 입력 시 2의 4승 (2^4) --> 16이 출력되게
	static int power(int num1, int num2) {
		if(num2==1) {	// 2^1 --> 1승일때
			return num1;
		}
		
		return num1 * power(num1,(num2-1));
		
//		2^4 = 2*2^3 = 2*2*2^2 = 2*2*2*2^1
//		2^4 = 2 * power(2^3)
	}
}
