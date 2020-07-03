package com.koreais.employee;

abstract class Employee implements Workable {
	protected String name;
	protected int pay;

//	=====================
//	계약직 [김철수]님의 명세서
//	월급 1500000원
//	보너스 1000000원
//	수고하셨습니다.
//	=====================
	
	@Override
	public int getBonus() {
		return BONUS/100*(int)getBonusRate();
	}
	@Override
	public int getRealPay() {
		return pay/100*(int)getPayRate();
	}
	
	public void printPayslip() {
		System.out.println("=====================");
		System.out.println(getPosition() + "[" + name + "]님의 명세서");
		System.out.println("월급" + getRealPay() + "원");
		System.out.println("보너스" + getBonus() + "원");
		System.out.println("수고하셨습니다.");
		System.out.println("=====================");
		System.out.println();
	}
}