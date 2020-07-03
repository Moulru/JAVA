import java.util.*;

public class Exam02 {
	static int arrSize = 10000;	// 우리가 사용하는  메서드들이 static메서드
								// 클래스메서드이기 때문에 인스턴스변수 사용불가

	public static void main(String[] args) {
		/*
		 * 	List 인터페이스를 구현한 클래스 중
		 * 
		 * 	LinkedList
		 * 		- 순서O, 중복O
		 * 		- 불연속적인 데이터들을 연결(link)한 형태
		 * 		- 하나의 요소는 자신과 연결된 다음 요소의 주소와 자기자신의 값으로 이루어져있다
		 * 
		 * 		- 배열 : 데이터가 연속된 자료형태
		 * 			> 데이터 접근속도 빠르다!
		 * 			> 크기변경X, 자동으로 새로운 배열을 생성이 됨
		 * 			> 중간에 값을 추가/삭제 시 시간이 오래 걸림
		 * 
		 * 					접근시간		추가/삭제
		 * 		ArrayList 	빠르다		느리다				<< (보통 ArrayList 사용을 더 많이한다)
		 * 		LinkedList	느리다		빠르다
		 * 			> 데이터가 많으면 접근성이 떨어짐
		 * 
		 */

		ArrayList<String> arrList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		add(arrList);
		add(linkedList);
		// 두 개의 리스트에 50000개의 문자열 요소가 추가됨
		
		System.out.println("ArrayList 걸린 시간 : " + getAccessTime(arrList));
		System.out.println("LinkedList 걸린 시간	: " + getAccessTime(linkedList));
		
		System.out.println("데이터가 많으면 많을 수록 LinkedList는 걸리는 시간이 증가한다!");
	}

	//			인터페이스의 다형성 사용!
	static void add( List<String> list ) {
		for( int i=0; i < arrSize; i++ ) {
			list.add( i + "" );
			// 우리가 사용하는 리스트는 문자열이니 변환해야됨! (""를 붙이면 문자열이 된다)
		}
	}

	//	각 리스트가 5만개의 요소를 하나씩 접근할 때
	//	걸리는 소요시간을 반환
	static long getAccessTime( List<String> list ) {
		long startTime	= 0;		// 시작시간
		long endTime	= 0;		// 끝난시간
		
		// (현재시각 - 1970-01-01 00:00:00) 의 결과 값을 long 값으로 반환 
		startTime = System.currentTimeMillis();
		
		for( int i=0; i < arrSize; i++ ) {
			list.get(i);	// 0~49999까지 5만개의 요소를 반환
			// 반환된 값은 사용안함! 그냥 접근만 해보았음
		}
		
		endTime = System.currentTimeMillis();
		// endTime - startTime = 걸린시간 (1/1000초)
		
		return endTime-startTime;
	}
}
