import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 	다중 예외처리
		 * 		- 각 예외 발생 시 생성되는 인스턴스에 맞는 클래스로 catch문 구성
		 * 		- 예외의 가장 조상인 Exception 클래스는 반드시!! 마지막에 위치해야함 
		 * 			(Exception아래의 catch문은 절대 수행될 수가 없다. Exception은 모든 예외클래스의 부모클래스이기 때문에)
		 */
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("10에 나눌 수 입력 : ");
			num = sc.nextInt();
			System.out.println( 10 / num );		// ArithmeticException
			
			
			System.out.print("인덱스 입력(0~2) : ");
			num = sc.nextInt();
			
			int[] arr = new int[3];
			arr[num] = 10;		//	0~2가 아닌 숫자를 입력시 ArrayIndexOutOfBoundsException
			
			System.out.println("try 끝!");
			
		} catch(ArithmeticException e) {	//	if - else if 같이 여러번 catch를 정의할 수 있음
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("e.getMessage() : " + e.getMessage());
			System.out.println("e.toString() : " + e);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 접근이 잘못되었습니다.");
			System.out.println("e.getMessage() : " + e.getMessage());
			System.out.println("e.toString() : " + e);
			
		} catch (InputMismatchException e) {
			// 이 클래스는 java.util 패키지에 있기 때문에, import 해줘야 함
			// java.lang 패키지에 있는 클래스들은 import 하지않아도 사용이 가능하다
			System.out.println("숫자를 입력해주세요.");
			System.out.println("e.getMessage() : " + e.getMessage());
			System.out.println("e.toString() : " + e);
			
		} catch (Exception e) {		// 다형성 적용 - Exception은 모든 예외의 부모
			// else의 느낌 --> 위에 catch문 중에 일치하는 클래스가 없으면 부모클래스이기에 무슨 예외던 다 받을 수 있음
			
			
			// e는 Exception 클래스 타입의 참조변수
			// e에는 예외발생 시 생성된 '인스턴스'를 참조한다
			// e에는 그때의 정보가 담겨있다
			System.out.println("e.getMessage() : " + e.getMessage());
			System.out.println("e.toString() : " + e);	// Object클래스의 toSting() 메서드
//			System.out.println("e.toString() : " + e.toString());	// Object클래스의 toSting() 메서드		toString()을 붙이던 안붙이던 상관없음!!
								// 원레는  '클래스명@값' 반환이 되는데, 오버라이딩이 되어있는 상태
								// 위 형태로 반환이 안되면 무조건 오버라이딩이 되어있는 상태!
		}
		
	} // main() 끝
}
