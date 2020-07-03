
public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 		String 배열 활용 --> 클래스 --> 참조변수
		 * 		String으로 만들어진 것은 원래 '객체'이므로,
		 * 		배열 생성 시 각각의 주소를 가리킨다.
		 */

		// 1. 일반 String 생성하기
		String myName = new String("박준호");
		
		// 2. 배열형태로 String 생성하기
		String[] names = new String[3];
		names[0] = new String("박준호");
		names[1] = new String("홍길동");
		names[2] = new String("이몽룡");
		
		String[] ages = { "20", "21", "22" };
		
		for( int i=0; i <names.length; i++)
		{
			System.out.printf("이름 : %s\t나이 : %s\n", names[i], ages[i]);
		}
		
		System.out.println("------------------------");
		
		// 별도의 참조변수에 담기
		String hong = names[1];
		System.out.println(hong);
		
		for( int i=0; i <names.length; i++)
		{
			System.out.printf("이름 : %s\t나이 : %s\n", names[i], ages[i]);
		}
		
		/*
		 * 	String클래스는 char 배열에 기능을 추가한 것
		 * 
		 * 	[String 주요 기능(메서드)]
		 * 		charAt(index)		: 문자열에서 해당 위치(index)의 '문자'를 반환
		 * 		length()			: 문자열 길이 반환 (정수)
		 * 		substring(from, to)	: 문자열에서 from~(to-1) 위치 문자열 반환
		 * 		equals(string)		: 문자열의 '내용'비교 -> true / false
		 * 		toCharArray()		: 문자열을 char배열로 변환하여 반환 -> char[]
		 */
		System.out.println("------------------------");
		
		String phone = "010-1234-5678";
		System.out.println("phone			= " + phone);
		System.out.println("phone.charAt(5)		= " + phone.charAt(5));
		System.out.println("phone.length()		= " + phone.length());
		System.out.println("phone.substring(0, 3)	= " + phone.substring(0, 3));
		System.out.println("phone.equals		= " + phone.equals("010-1234-5678")); 
		
	}
}