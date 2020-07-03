import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		/*
		 * 	국어 영어 수학 점수를 입력받고
		 * 	총점과 평균 점수를 출력하기
		 * 		<조건>
		 * 			1. 변수들 : 국어, 영어, 수학, 총점 (int)
		 * 						평균 (double)
		 * 			2. 사용할 변수들은 코드 시작 부분에서 미리 다 선언 및 0으로 초기화
		 * 			3. 변수명은 a,b,c,d 이런거 말고 의미있게
		 * 			4. 출력 : 서식있는 출력 방식(printf) 사용
		 * 			5. 평균은 소수점 둘째 자리수까지만
		 * 			6. 들여쓰기 신경써서 작성
		 * 
		 * 		<출력내용>
		 * 			국어, 영어, 수학 점수를 입력해주세요 : 20 20 20
		 * 			총점 : 60점, 평균 : 20.00점
		 */

		Scanner sc = new Scanner(System.in);
		
		int kor		= 0;
		int eng		= 0;
		int math	= 0;
		int sum		= 0;
		double ever	= 0.00;
		
		System.out.print("국어, 영어, 수학 점수를 입력해주세요 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		sum = kor + eng + math;
		ever = (double) sum /3 ;

		System.out.printf("총점 : %d점, 평균 :  %.2f점\n",sum,ever);
		
	}

}
