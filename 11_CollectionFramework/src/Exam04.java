import java.util.*;

public class Exam04 {
	public static void main(String[] args) {
		/*								Map 인터페이스에도 HashMap, TreeMap 가 있다
		 * 
		 * 	Set 인터페이스
		 * 		- 집합
		 * 		- 중복 불가
		 * 		- 순서 없음
		 * 
		 * 	HashSet
		 * 		> 데이터가 자동으로 정렬되지 않음
		 * 	TreeSet
		 * 		> 데이터가 자동으로 오름차순 정렬
		 * 
		 * 	Hash~가 붙은 클래스
		 * 		- hash를 이용하여 자료를 검색
		 * 			> Object 클래스의 hashCode() 사용
		 * 
		 * 	Tree~가 붙은 클래스
		 * 		- 이진검색트리로 구현
		 */
		
		HashSet<String> hs1 = new HashSet<>();
		System.out.println( hs1.size() + ", " + hs1 );
		
		hs1.add("1");
		System.out.println( hs1.size() + ", " + hs1 );
		
		hs1.add("2");
		System.out.println( hs1.size() + ", " + hs1 );
		
		hs1.add("1");
		System.out.println( hs1.size() + ", " + hs1 );
		// 중복된 값은 추가되지 않는다!
		
		hs1.add("3");
		System.out.println( hs1.size() + ", " + hs1 );
		
		////////////////////////////////////////////////
		
		HashSet<Integer> hs2 = new HashSet<>();
		// Set을 이용한 로또 번호 추출(중복 X)
		
		// 우리는 Set에 6개의 숫자를 담아야한다!
		// Set의 크기가 6보다 작으면 계속 반복! (중복되게 계속 걸러지니까)
		for ( int i=0; hs2.size() < 6; i++) {
			// Math.random() = 0.0000001 ~ 0.9999999 반환
			// 여기에 숫자를 곱하면 0~곱한수-1을 구할 수 있다
			int num = (int)(Math.random()*45) + 1; // 1~45
			
			hs2.add(num);	// 1~45의 난수를 추가함
		}
		
		// Set 정렬하기 --> list로 변환
		LinkedList<Integer> list2 = new LinkedList<>(hs2);
		Collections.sort(list2);
		
		System.out.print( "HashSet : " + hs2 + "	");		// 정렬안됨 HashSet
		System.out.println( "List를 이용한 정렬 : " + list2 );	// 정렬됨 (오름차순)
		
		// TreeSet은 자동으로 정렬이 된다!
		
		////////////////////////////////////////////////
		
		Iterator it = hs2.iterator();
		
		while(it.hasNext()) {
			System.out.print( it.next() + " ");
		}
		
	}
}
