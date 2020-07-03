
public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 	String 클래스
		 * 		- 사용가능한 메서드가 너무 많다!	--> 필요에 따라 검색하면서 사용할 것(구글링하여)
		 * 		- 구성
		 * 			> 문자배열 char[]
		 * 			> 메서드들
		 * 		- String의 인스턴스(문자열)은 한 번 생성하면 변경 불가
		 */

		String str2 = new String("ABC");
		method1(str2);
		
		String str3 = String.format("%d하하하", 123);		// printf랑 비슷함
		System.out.println(str3);
		System.out.println("".format("%d호호호", 456));		// "" <<-도 문자열이기 때문에 format을 붙여 유용하게 쓸수있다 ex) return "".format(%d,args);
		
		// 문자열로 변환하는 메서드
		int value = 20;
		// 둘 다 문자열로 만들어준다
		String str4 = value+"";					// 편하다
		String str5 = String.valueOf(value);	// 성능이 더 좋다 (많은 반복)
		
	}	// main() 끝

	static void method1( String str1 ) {
		System.out.println("str1 : " + str1);
		str1 += "DEF";
		// 메서드 호출 처음에는 str1이 str2가 가리키는 ABC를 가리킨다
		// 근데 str1 = str1 + "DEF"; 코드 수행 후,
		// 기존 str1에 있던 "ABC" + "DEF" = "ABCDEF"가 새로 생성이 되고,
		// 그 새로 생성된 ABCDEF를 가리키게 된다.
		System.out.println("str1 : " + str1);
	}
}