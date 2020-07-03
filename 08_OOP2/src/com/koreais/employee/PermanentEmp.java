package com.koreais.employee;

public class PermanentEmp extends Employee {
	// 사원 - 보너스 150% / 월급 95%

	PermanentEmp(String name, int pay) {
		super.name = name;
		super.pay = pay;
	}

	@Override
	public double getBonusRate() {
		return 150;
	}

	@Override
	public double getPayRate() {
		return 95;
	}

	@Override
	public String getPosition() {
		return "사원";
	}
}
