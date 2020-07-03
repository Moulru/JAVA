
public class ClassPractice01 {

	public static void main(String[] args) {
		/*
		 * 	계산기 클래스 만들기
		 * 		class Calculator
		 * 			멤버변수(속성) - 4개
		 * 				- 각각의 계산기 기능이 몇 번 호출 되었는지 기록
		 * 
		 * 			메서드(기능) - 5개
		 * 				- 덧셈(add), 뺄셈(min), 곱셈(mul), 나눗셈(div)
		 * 				- 각각 계산 수행이 몇 번 되었는지 횟수 출력 printResult
		 * 
		 * 			* 각 계산(메서드)이 수행 될 때마다 카운트 증가
		 * 			* printResult 메서드 호출 시 결과 값 출력
		 * 
		 * 		[출력결과]
		 * 		20 + 10 = 30
		 * 		20 - 10 = 10
		 * 		20 + 10 = 30
		 * 		20 / 10 = 2
		 * 		덧셈 : 2			<<- printResult 호출했을 때!
		 * 		뺄셈 : 1
		 * 		곱셈 : 0
		 * 		나눗셈 : 1
		 */
		
		Calculator cc = new Calculator();
		
		System.out.println("1 + 2 = " + cc.add(1,2));
		System.out.println("4 - 3 = " + cc.min(4,3));
		System.out.println("2 * 6 = " + cc.mul(2,6));
		System.out.println("6 / 2 = " + cc.div(6,2));
		System.out.println("6 + 5 = " + cc.add(6,5));
		System.out.println("3 + 2 = " + cc.add(3,2));
		System.out.println("1 * 2 = " + cc.mul(1,2));
		
		cc.printResult();
	}
}

class Calculator {
	int addCount=0;
	int minCount=0;
	int mulCount=0;
	int divCount=0;
	
	int add(int i,int j) {
		int result = i+j;
		addCount++;
		return result;
	}
	int min(int i,int j) {
		int result = i-j;
		minCount++;
		return result;
	}
	int mul(int i,int j) {
		int result = i*j;
		mulCount++;
		return result;
	}
	int div(int i,int j) {
		int result = i/j;
		divCount++;
		return result;
	}
	
	void printResult() {
		System.out.println("덧셈 : " + addCount);
		System.out.println("뺄셈 : " + minCount);
		System.out.println("곱셈 : " + mulCount);
		System.out.println("나눗셈 : " + divCount);
	}
}
