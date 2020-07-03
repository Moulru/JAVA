import java.util.*;

public class Practice01 {
	public static void main(String[] args) {
		/*
		 * 	10개의 정수를 입력 받고, 가장 작은 수를 출력하기
		 * 		> 정수는 ArrayList에 담기
		 */
		
		ArrayList<Integer> arrList = new ArrayList<>();
		// 제네릭 타입매개변수 공간에 int 사용못함
		
		Scanner sc = new Scanner(System.in);
		
//		arrList.add(sc.nextInt());
//		arrList.add(sc.nextInt());
//		arrList.add(sc.nextInt());
//		arrList.add(sc.nextInt());
//		arrList.add(sc.nextInt());
//		arrList.add(sc.nextInt());
//		arrList.add(sc.nextInt());
//		arrList.add(sc.nextInt());
//		arrList.add(sc.nextInt());
//		arrList.add(sc.nextInt());
		
		for(int i=0; i<10; i++) {
			arrList.add(sc.nextInt());
			// nextInt() 는 입력된 키보드버퍼에서 정수만 가져온다
		}
		
		Collections.sort(arrList);
		// 오름차순 정렬을 해주면 제일 앞에 있는 숫자가 가장 작은 숫자
		
		System.out.println("가장 작은 수 : " + arrList.get(0));
		
	}
}