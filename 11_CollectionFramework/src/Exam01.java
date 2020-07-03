import java.util.*; // java.util 패키지의 모든 클래스를 사용하겠다.
// ArrayList 클래스는 java.util 패키지에 들어있다.

public class Exam01 {
	public static void main(String[] args) {
		/*
		 * 	컬렉션클래스들 중에서 List 인터페이스를 구현한
		 * 	ArrayList 클래스
		 * 		- 사용 빈도가 높을 것으로 예상!
		 * 		- List인터페이스 구현 -> 순서O, 중복O
		 * 
		 * 	Array = 배열
		 *  일종의 배열이다!
		 *  
		 *  배열과의 차이점
		 *  	1. 배열은 크기를 지정해놓으면 값을 더 많이추가할 수 없다.
		 *  		> 새로 배열을 만들어서 값들을 복사해서 사용
		 *  	2. ArrayList는 크기가 늘어난다. (추가 가능) 		
		 */
		
		// 컬렉션 클래스들은 제네릭으로 되어있다.
		// 다수의 데이터를 다룰 때, 지정된 자료형들끼리 다루겠다! 
		ArrayList<Integer> list = new ArrayList<>(); // 배열을 생성한 것과 같은 느낌
		// int[] arr = new int[20]; // 크기는 대충 20으로 했음.
		
		// list는 참조변수. --> ArrayList를 다룰 때는 메서드를 이용한다.
		list.add(5); 		// arr[0] = 5;
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		
		// list에서 값(하나의 요소) 구해오기
		for( int i = 0; i < list.size(); i++ ) { // arr.length
			System.out.println( list.get(i) ); // arr[i]
		}
		
		// 제네릭이 사용되었어도 제네릭없이 인스턴스를 만들 수 있다!
		ArrayList list2 = new ArrayList();
		list2.add(5);
		list2.add("123"); // 타입을 지정하지 않아서.. 아무거나 들어간다.
		
//		list.add("123"); // <Integer>로 지정했기 때문에 문자열 대입 불가
		
		int num1 = list.get(0); // 리스트의 첫 번째 요소 대입
//		int num2 = list2.get(0); // 오류!
		// list2는 타입을 지정하지 않고 인스턴스를 생성했다.
		// ArrayList 내부에서 타입을 모르기 때문에 Object 참조변수로 요소를 다룬다.
		int num2 = (int)list2.get(0); // 반환된게 Object이기 때문에 형변환!
		
		System.out.println(list); // 리스트 전체 요소가 출력
		
		// 리스트 정렬 --> Collections 클래스 이용
		// ArrayList 는 컬렉션클래스 --> Collections 를 상속
		Collections.sort(list); // 클래스메서드
		System.out.println(list); // 기본 오름차순 정렬됨
		
		
		
		
	}
}