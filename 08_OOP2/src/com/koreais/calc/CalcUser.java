package com.koreais.calc;
// Alt + Shift + N

/*
 * 	1. ���� Ŭ������ ����� �����ڿ�
 * 		�� ������� ���� Ŭ������ ����ϴ� �����ڰ�
 * 		���ÿ� �۾��� �Ѵ�.
 * 		(Ŭ������ �ϼ��� �� �۾��� �ص� ������.. �ð��� ����
 * 			�Ϲ������� �̷��� ����!)
 * 
 * 	2. ���� Ŭ������ ����ϴ� �����ڴ�
 * 		������ ���� Ŭ������ ������ �����Ѵ�� �����ΰ�
 * 		����ϴ� �ڵ带 �ۼ��Ѵ�.
 * 
 * 	3. 1���� �� ���� ������� ���� Ŭ������ ���ϱ�
 * 		����� �����ڰ� �ۼ��ߴ� Ŭ������ �ٸ��� (Calculator.java)
 * 			> ��������� ������ �ٸ���!!
 * 
 * 	4. �ᱹ ����� �����ڰ� �ο� ���� 1���� �� �ۼ��� �ڵ带
 * 		������ �����ϰ� �ƴ�. �� --> �־�
 * 
 *  5. �������̽��� ���� �̸� �԰�(�߻�޼���)�� ���س��� ���� ����
 * 	6. �������̽� ���� �� ������ �Ϸ�Ǹ�,
 * 		Ŭ������ �ٲ��ָ� ��� �۾��� ������.
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
	// �̰� ������ Ŭ�����̱� ������ ���� ��� ������ ���� �ʴ´�.

}

// ���⸦ ����ϴ� �ڵ�
public class CalcUser {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setValue(30, 90, 30);
		System.out.println( calc.sum() );
		System.out.println( calc.avg() );
		
		// �� ���ĺ��ʹ� calc ���������� �̿��Ͽ�
		// ������ �ڵ带 �ۼ��� �Ѵ�.
	}
}





