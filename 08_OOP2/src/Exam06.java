import java.util.*; // java.util 패키지의 모든 클래스를 패키지명 생략하여 사용

import com.koreais.test.Person;

//package (default package); // 생략이 되어 있다!

public class Exam06 {
	public static void main(String[] args) {
		/*
		 * 	[package 와 import]
		 * 
		 * 	패키지 (package)
		 * 		- 클래스의 묶음
		 * 			관련된 클래스들끼리 그룹 단위로 묶는다.
		 * 			다른 작업의 클래스와 충돌 방지
		 * 
		 * 		- (dafault package)
		 * 			정해놓은 패키지가 없다.
		 * 			workspace\프로젝트폴더\src\'이 위치에 소스파일 생성'
		 * 
		 * 		1. 하나의 소스파일에는 첫 번째 문장으로
		 * 			단 한 번의 패키지 선언만을 허용한다.
		 * 		2. 모든 클래스는 반드시 하나의 패키지에 속해야한다.
		 * 		3. 패키지는 점(.)을 구분자로하여 계층구조로 구성할 수 있다.
		 * 			> 폴더 구조로 생성
		 * 		4. 패키지는 물리적으로 클래스파일(.class)을 포함하는
		 * 			하나의 디렉토리이다.
		 * 
		 * 		- 패키지명 명명 규칙 (권장사항)
		 * 			1. 대소문자를 허용하지만 소문자만 사용
		 * 			2. 회사와 회사 간의 충돌을 막기 위해
		 * 				회사도메인의 역순으로 생성
		 * 				com.회사명.프로젝트명 / com.google.test
		 * 				com.회사명.플랫폼.프로젝트명 / com.google.android.test
		 * 
		 * 			koreais.com
		 * 			koreais.net
		 * 				koreais\com\프로젝트명
		 * 					   \net\프로젝트명
		 * 
		 * 		- 패키지 안에 class를 만들면 자동으로 package~~ 선언! (이클립스)
		 * 		- default package 안에 만들어진 class들은
		 * 			'이름 없는 패키지'에 속하게 되어, 자동으로 같은 패키지이다.
		 * 
		 * 	import
		 * 		- 사용하고자하는 패키지를 미리 명시하는 것
		 * 		- import를 하면 패키지명을 생략 가능하다.
		 * 
		 * 		import 패키지명.클래스명;
		 * 		import 패키지명.*;
		 * 
		 * 		** import java.util.*; 을 하면 'util' 패키지만 명시한다.
		 * 			--> util 하위패키지도 있지만 하위패키지는 명시하지 않는다.
		 * 			--> java.util.zip.*;
		 * 				이런식으로 따로 명시를 해줘야 한다.
		 * 
		 *  	소스파일의 구성 순서 (.java)
		 *  		1. package문
		 *  		2. import문
		 *  		3. class의 선언
		 *  
		 *  	- 다른 패키지에서 default package는 import할 수 없다.
		 *  		> 패키지 이름이 없기 때문!
		 */
		
//		import java.util.Scanner;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		Person.printPerson(); // import 필수!
		Person.printPerson();
		
	} // main() 끝
} // 클래스 끝
