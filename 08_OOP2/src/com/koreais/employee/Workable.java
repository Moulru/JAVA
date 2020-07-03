package com.koreais.employee;

//	일하는 것이 가능한 ~~ 이때 일을 할 때 사용하는 속성,기능 선언
public interface Workable {
	// 변수 --> 상수
	// 메서드 --> 추상메서드
	
	int BONUS = 1000000;		// 기본 보너스 금액(상수)
	
	int getBonus();		// 보너스 금액 반환
	int getRealPay();	// 급여 금액 반환
	
	void printPayslip();	// 급여관련 명세서 출력
	
	
	abstract double getBonusRate();	// 직급별 보너스 비율
	abstract double getPayRate();	// 직급별 떼는 세금의 비율
	abstract String getPosition();	// 직급명 반환
	
}