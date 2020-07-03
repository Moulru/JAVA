package com.koreais.calc;

// 계산기 클래스 만드는 개발자가 작성해놓은 실제 클래스
public class Calculator implements Calculatable{
	int val1;
	int val2;
	int val3;
	
	public void setValue( int v1, int v2, int v3 ) {
		val1 = v1;
		val2 = v2;
		val3 = v3;
	}
	
	public int sum() {
		return val1 + val2 + val3;
	}
	
	public int avg() {
		return sum()/3;
	}
	
}
