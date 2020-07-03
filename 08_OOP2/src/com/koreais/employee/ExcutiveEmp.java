package com.koreais.employee;

public class ExcutiveEmp extends Employee {
	// 임원 - 보너스 200% / 월급 80%

	ExcutiveEmp(String name, int pay) {
		super.name = name;
		super.pay = pay;
	}

	@Override
	public double getBonusRate() {
		return 200;
	}

	@Override
	public double getPayRate() {
		return 80;
	}

	@Override
	public String getPosition() {
		return "임원";
	}
}
