package com.koreais.calc;
// Alt + Shift + N

/*
 * 	1. 계산기 클래스를 만드는 개발자와
 * 		그 만들어진 계산기 클래스를 사용하는 개발자가
 * 		동시에 작업을 한다.
 * 		(클래스가 완성된 후 작업을 해도 되지만.. 시간이 부족
 * 			일반적으로 이렇게 개발!)
 * 
 * 	2. 계산기 클래스를 사용하는 개발자는
 * 		가상의 계산기 클래스를 본인이 생각한대로 만들어두고
 * 		사용하는 코드를 작성한다.
 * 
 * 	3. 1개월 뒤 실제 만들어진 계산기 클래스를 보니까
 * 		사용측 개발자가 작성했던 클래스와 다르다 (Calculator.java)
 * 			> 멤버변수의 개수가 다르다!!
 * 
 * 	4. 결국 사용측 개발자가 싸움에 져서 1개월 간 작성한 코드를
 * 		모조리 수정하게 됐다. 끝 --> 최악
 * 
 *  5. 인터페이스를 통해 미리 규격(추상메서드)을 정해놓고 각자 개발
 * 	6. 인터페이스 구현 후 개발이 완료되면,
 * 		클래스명만 바꿔주면 모든 작업이 끝난다.
 */

class CalcTest implements Calculatable{
	@Override
	public void setValue(int val1, int val2, int val3) {
		
	}

	@Override
	public int sum() {
		return 120;
	}

	@Override
	public int avg() {
		// TODO Auto-generated method stub
		return 40;
	}
	// 이건 가상의 클래스이기 때문에 굳이 기능 구현을 하지 않는다.

}

// 계산기를 사용하는 코드
public class CalcUser {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setValue(30, 90, 30);
		System.out.println( calc.sum() );
		System.out.println( calc.avg() );
		
		// 이 이후부터는 calc 참조변수를 이용하여
		// 나머지 코드를 작성을 한다.
	}
}





