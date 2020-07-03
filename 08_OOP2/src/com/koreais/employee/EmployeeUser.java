package com.koreais.employee;

// 실제 프로그램 사용하는 클래스
public class EmployeeUser {
	public static void main(String[] args) {
		/*
		 * 		직원 클래스 Employee
		 * 
		 * 		사원 클래스 PermanentEmp
		 * 		계약직 클래스 TemporaryEmp
		 * 		임원 클래스 ExcutiveEmp
		 * 
		 * 			사원 - 보너스 150% / 월급 95%
		 * 			계약직 - 보너스 100% / 월급 100%
		 * 			임원 - 보너스 200% / 월급 80%
		 * 
		 * 		> Employee 클래스는 Workable 인터페이스를 구현
		 * 			+ 상속관계도 성립
		 * 		> 각각의 클래스는 별도의 소스파일에 작성(.java)
		 */

		Employee hong = new PermanentEmp("홍길동", 3000000);
		Employee kim = new TemporaryEmp("김철수", 1500000);
		Employee lee = new ExcutiveEmp("이몽룡", 4500000);
		
		hong.printPayslip();
		kim.printPayslip();
		lee.printPayslip();
		
//		[출력결과]
//		=====================
//		계약직 [김철수]님의 명세서
//		월급 1500000원
//		보너스 1000000원
//		수고하셨습니다.
//		=====================
		
	}
}
