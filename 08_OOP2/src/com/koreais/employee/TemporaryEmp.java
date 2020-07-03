package com.koreais.employee;

public class TemporaryEmp extends Employee {
	// 계약직 - 보너스 100% / 월급 100%

	TemporaryEmp(String name, int pay) {
		super.name = name;
		super.pay = pay;
	}

	@Override
	public double getBonusRate() {
		return 100;
	}

	@Override
	public double getPayRate() {
		return 100;
	}

	@Override
	public String getPosition() {
		return "계약직";
	}
}
