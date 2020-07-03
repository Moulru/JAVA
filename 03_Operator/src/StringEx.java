
public class StringEx {

	public static void main(String[] args) {
		/*
		 *  문자열(String)에 관하여..
		 *  
		 *  변수 -> int a = 10; -> 4byte만큼 메모리 공간을 차지
		 *  					   그 공간 안에 10이라는 정수 값 담겨있음
		 *  
		 *  클래스를 이용해서 변수처럼 만든 것 --> 객체
		 *  	String name = "박준호";
		 *  	name은 참조형변수, "박준호"라는 객체를 가리킴
		 *  	때문에 name에 들어있는 값은 "박준호"의 메모리 주소
		 *  
		 *  
		 *  String str1 = "ABC";
		 *  	1. "ABC"라는 문자열 객체가 메모리 어딘가에 생성
		 *  	2. str1이 "ABC"를 가리킴
		 *  	3. str2는 str1때 만들어진 "ABC"를 가리킴
		 *  		--> 같은 문자열이 이미 있으면 다시 만들지 않음
		 *  		--> str1, str2는 같은 주소를 가리킴
		 *  
		 *  	4. str3의 경우, 'new' 연산자를 사용함
		 *  		--> new를 사용하면 위에서 만들었던 "ABC"와는
		 *  			다른 메모리영역에 새로운 "ABC"를 만듬
		 *  		--> new는 그때마다 항상 새로운 객체를 만듬
		 */
		
		
		String str1 = "ABC";	// 참조형변수 - "ABC"를 가리킴
		String str2 = "ABC";
		String str3 = new String("ABC");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1 == ABC ? " + (str1 == "ABC"));
		
		System.out.println("str1 == str3 ? " + (str1 == str3));
		
		System.out.println("str3 == ABC ? " + (str3 == "ABC"));
		
		// String 에 들어있는 문자들만 순수하게 비교할때
		System.out.println("str3.equals ? " + str3.equals("ABC"));
		// String 에 들어있는 문자열 전체 길이 계산
		System.out.println("str1의 문자열 전체길이 : " + str1.length() );
		
		String str4 = "    !   AbC  !    ";
		System.out.println("str4의 문자열 전체길이 : " + str4.length() );
		System.out.println(str4.trim() );					// 앞 뒤 공백 제거
		System.out.println(str4.toUpperCase() );			// 알파벳을 모두 대문자로
		System.out.println(str4.toLowerCase() );			// 알파벳을 모두 소문자로
	}

}
