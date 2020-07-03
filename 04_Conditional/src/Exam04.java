import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		//	switch~case
		
		//	공부할 언어 선택기
		//	숫자를 입력받고 그 숫자인 언어 내용을 출력
		
		int inputStudyNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================");
		System.out.println("  [ 재미있는 프로그래밍 ]");
		System.out.println("   1. JAVA ");
		System.out.println("   2. C언어 ");
		System.out.println("   3. PYTHON ");
		System.out.println("==========================");
		
		System.out.print("공부할 언어를 선택하세요 : ");
		inputStudyNum = sc.nextInt();
		
		switch( inputStudyNum )
		{
		/*	case 조건이 맞은 후에
		 * 	break 가 없으면,
		 * 	case 조건에 맞지 않더라도
		 * 	다음 break를 만나거나, switch가 끝날때까지 무조건 case를 진입한다.
		 */
		
		//	break를 없앰으로써 여러 조건에 진입할 수 있는게 특징
		case 1:
			System.out.println("Hello JAVA!");
			break;
		case 2:
			System.out.println("Hello C!");
			break;
		case 3:
			System.out.println("Hello PYTHON!");
			break;
			
		default:				// if문에서의 else와 같은역할
				System.out.println("없는 번호입니다.");
		}

	}

}