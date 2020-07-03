import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		/* 
		 * 	많이 살 수록 더 할인을 해줘요
		 * 
		 * 		장바구니 최종 금액을 입력 받고,
		 * 		그 금액에 따라 할인된 실제 결제액을 출력
		 * 
		 * 		1만원 이상	-> 5%
		 * 		5만원 이상	-> 10%
		 * 		10만원 이상	-> 20%
		 * 
		 * 		[결과]
		 * 
		 * 		장바구니 금액 : 50000
		 * 		최종 결제액은 45000원 입니다.
		 * 
		 * 		장바구니 금액 : 5000
		 * 		최종 결제액은 5000원 입니다.
		 * 		10000원 이상 구매 시 할인이 됩니다!
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int won = 0;
		int res = 0;
		int end = 0;
		System.out.print("장바구니 금액 : ");
		won = sc.nextInt();
		
		if(won >= 10000)
		{
			// if (won >= 10000) 으로 작성하면 else if들의 값이 이미 if값에 만족되기때문에 else로 넘어가지않음
			// 그래서 큰수부터 if값 작성
			if(won >= 100000)				// 장바구니 금액이 1만원 이상시, 할인율 5%
			{
				res = won / 100 * 20;
			}
			else if(won >= 50000)				// 장바구니 금액이 5만원 이상시, 할인율 10%
			{
				res = won / 100 * 10;
			}
			else if(won >= 10000)				// 장바구니 금액이 10만원 이상시, 할인율 20%
			{
				res = won / 100 * 5;
			}
			
			end = won-res;					// 최종결재액은 장바구니금액 - 할인금액
			System.out.printf("최종 결제액은 %d원 입니다.\n",end);
		}
		else
		{
			end = won-res;
			System.out.printf("최종 결제액은  %d원 입니다.\n",end);
			System.out.println("10000원 이상 구매 시 할인이 됩니다!");
		}

	}

}
