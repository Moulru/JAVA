import java.util.*;

public class Practice02 {
	public static void main(String[] args) {
		/*
		 * 	세 개의 나라 이름과 인구수를 입력 받고,(scanner)
		 * 	나라 이름을 입력하면 인구수를 출력하기
		 * 
		 * 	1. 3개를 다 입력 받아놓고,
		 * 	2. "인구 수를 검색하고 싶은 나라 이름 입력 : 한국"
		 * 	3. "한국 7000"
		 */
		
		HashMap<String,Integer> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나라,인구수 입력");
		
		for (int i = 0; i < 3; i++) {
			hm.put(sc.nextLine(), sc.nextInt());
		}
		
		String search;
		
		System.out.print("인구 수를 검색하고 싶은 나라 이름 입력 : ");
		search = sc.nextLine();
		
		if(hm.containsKey(search)) {
			System.out.println(search + ": "+ hm.get(search) + "만 명");	
		}
		
		
	}
}