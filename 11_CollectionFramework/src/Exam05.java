import java.util.*;

public class Exam05 {
	public static void main(String[] args) {
		/*
		 * 	Map
		 * 		- 하나의 요소가 key, value의 쌍으로 이루어짐
		 * 		- 순서 없음
		 * 		- key : 중복 불가능
		 * 		- value : 중복 가능
		 * 
		 * 	HashMap
		 * 		- 정렬X
		 * 		- 더 빠르다
		 * 	TreeMap
		 * 		- 정렬O (오름차순)
		 */
		
		HashMap<String,String> hm = new HashMap<>();
		
		// put(key,value) : key와 value 저장
		hm.put("한국", "KOREA");
		hm.put("일본", "JAPAN");
		hm.put("중국", "CHINA");
		
		System.out.println(hm.size() + ", " + hm);
		
		// containsKey : 해당 키가 들어있으면 true 반환
		System.out.println( "한국 ? " + hm.containsKey("한국"));
		System.out.println( "북한 ? " + hm.containsKey("북한"));
		
		// get : 해당 key에 맞는 value 반환
		System.out.println( "한국 : " + hm.get("한국"));
		
		// "한국" key가 있으면 수행!
		if( hm.containsKey("한국")) {
			System.out.println(hm.get("한국"));	// value 반환
			hm.remove("한국");		// key 삭제 --> 요소 삭제(value 같이 삭제됨)
		}
		////////////////////////////////////////////////////
		System.out.println();
		
		// Map의 iterator 사용
		
		// key+value 묶어서 entry
		Iterator it = hm.entrySet().iterator();
		
		while( it.hasNext() ) {
			Map.Entry entry = (Map.Entry)it.next();
			// 앞에서 iterator 할 때는 integer 였어서 int 변수에 바로 대입 가능
			// 다른 참조형 값은 형변환이 필요하다!
			
			System.out.println( entry.getKey() + "은(는) " + entry.getValue() );
		}
		
	} // main() 끝
}
