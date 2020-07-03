//import java.util.ArrayList;	// ArrayList를 임포트하면 생기는데,
import java.util.*;				// 뒤를 *로 바꿔주면 모든 java.util을 사용하겠다는 의미

public class Exam03 {
	public static void main(String[] args) {
		/*
		 * 	Iterator			>> 다른 언어에서도 쓰임!
		 * 		- 컬렉션(List,Set 같은거) 에 저장된 요소를 접근하는데 사용되는 인터페이스
		 * 
		 * 		- 컬렉션 클래스들을 공통적으로 접근 가능하다
		 */
		
		ArrayList<Integer> list = new ArrayList<>(); 
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> it = list.iterator();
		// iterator는 list의 전체 요소에 대한 정보를 받아온다
		// 최초에 맨 앞 요소에 위치한다
		
		while( it.hasNext() ) {		// 다음요소가 있으면 true 반환 / 없으면 false 반환
			System.out.println( it.next() );	// 다음 요소를 가져온다
		}
		// 현재 while문이 끝나게 되면, it는 마지막요소에 위치한다 (다음요소가 없다)
//		System.out.println( it.next() );	마지막 요소에 위치해서 더이상 받을 요소가 없어서 예외가 발생한다!
//		반드시 it.next()를 사용하려면, hasNext()로 검사 후 사용
		
		// it(iterator)가 list의 모든 요소를 다 돌았으면, 다시 처음으로 돌아갈 방법은 없다
		// 새로만들어야됨!
		
		it = list.iterator();		// list의 iterator 새로만들기
		
		
	}	// main() 끝
}
