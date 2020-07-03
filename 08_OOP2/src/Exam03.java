public class Exam03 {
	public static void main(String[] args) {
		/*
		 * 	Object 클래스
		 * 		- 모든 클래스의 조상 --> 모두 상속을 받는다.
		 * 		- Object = 객체,인스턴스
		 * 		- 상속 받는 클래스가 없을 경우,
		 * 			자동으로 extends Object 가 붙는다!
		 * 			--> 마치 기본생성자처럼!
		 */
		
		Note08 note1 = new Note08();
		Note08 note2 = new Note08();
		
		// note1 이 equals를 사용 가능한 것은,
		// Object 클래스에 정의되어 있기 때문이다.
		System.out.println( note1.equals(note2) );
	}
}

class Phone03 { // extends Object 생략이 되어 있는 상태
	
}

// 상속은 내리 물려 받는다.
// Phone03가 상속 받은 Object 클래스를 여기서도 상속 받는다.
class AndroidPhone03 extends Phone03 {
	
}

class Note08 extends AndroidPhone03 {
	
}

