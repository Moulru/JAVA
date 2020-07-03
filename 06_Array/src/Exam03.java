
public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 	로또 번호 추첨기
		 * 		1~45까지 공을 추첨기에 담고, 랜덤한 6개의 공을 뽑는다
		 * 			--> 크기 45 정수 배열
		 * 			--> 1~45까지 숫자를 담기
		 * 			--> random을 이용해여 6개의 공을 골라내기
		 */
		
		// step1. 추첨기 생성
		int[] myLotto = new int[45];
		
		// step2. 공넣기
		for(int i=0; i<45; i++)
		{
			myLotto[i] = (i+1);		// 인덱스: 0~44, 공: 1~45
		}

//		// 추첨기 공 출력하기
//		for(int i=0; i<45; i++)
//		{
//			System.out.printf("[%2d] ",myLotto[i]);
//			
//			if( (i+1) % 5 == 0 )	// 5개 단위로 개행하기
//			{
//				System.out.println();
//			}
//		}
		
		// step3. 랜덤한 6개의 공 뽑기
		// 공 섞기 (배열에 들어있는 값들을 스위칭)
		// 1. myLotto[0] 값을 랜덤한 index(1~44)의 값과 바꿈
		// 2. 여러번 반복하여 섞기
		
		/* 
		 *  두 변수의 값을 바꾸는법
		 *  int a	 = 1;
		 *  int b	 = 2;
		 *  int temp = 0;			// 임시 값 생성
		 *  temp	 = a;			// 임시값에 a를 넣고
		 *  a		 = b;			// a에 b를 넣고
		 *  b		 = temp;		// b에 임시값에 넣었던 a값을 다시 넣는다.
		 */
		
		// 아래의 for문은 몇번을 반복할지만 결정
		for (int i=0; i<1000; i++)	// 1000번 섞는다
		{
			// 랜덤한 인덱스를 구하기
			int randomIndex = (int)(Math.random() * 44) + 1;
			
			// 임시공간에 0번 인덱스 공 담기
			int temp = myLotto[0];
			myLotto[0] = myLotto[randomIndex];
			myLotto[randomIndex] = temp;
		}
		
		// step4. 1등번호 출력
		for (int i=0; i<6; i++)
		{
			System.out.printf(" %d ",myLotto[i]);
		}
		
	}

}
