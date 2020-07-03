import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		/*
		 * 	finally
		 * 		- 선택적으로 사용 (옵션처럼)
		 * 		- 예외 발생 여부와 상관없이 무조건 실행되는 블럭
		 * 
		 * 		┌ 예외가 발생했다!		--> catch문 끝난 후 수행
		 * 		└ 예외가 발생하지않았다!	--> try문 끝난 후 수행
		 * 
		 */
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
				
		try {
			num = sc.nextInt();
			
			System.out.println(" 결과 : " + method1(num));
			
			System.out.println("try 끝");
		} catch (Exception e) {
			System.out.println("catch 끝");
		} finally {
			System.out.println("finally");
		}
	
	}	// main() 끝
	
	static int method1( int num ) {
		int result = 0;
		
		try {
			result = 10 / num;			// num이 0이면 예외발생
			
			System.out.println("method1() try 끝");
			return result;		// 여기서 return을 만나도 finally는 수행이 된다!
			// finally가 수행되고 여기서 값을 반환하기때문에 아래의 method1() 끝은 수행이 안됨
		} catch (Exception e) {
			System.out.println("method1() catch 끝");
		} finally {
			System.out.println("method1() finally 끝");
		}
		
		System.out.println("method1() 끝");
		return result;
	}
}
