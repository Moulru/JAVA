package com.koreais.calc;

// ���� Ŭ���� ����� �����ڰ� �ۼ��س��� ���� Ŭ����
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
