import java.util.*;

public class Practice03 {

	public static void main(String[] args) {
		/*
		 * 	Person 클래스
		 * 		- 이름
		 * 		- 나이		<<- 애만 int
		 * 		- 성별
		 * 		- 전화번호
		 * 
		 * 	3개의 Person 정보를 입력받아서 ArrayList에 저장
		 * 		> Person 인스턴스 생성하여 list에 추가
		 * 	list 내용 전체 출력(iterator 사용)
		 */
		
		Person student = new Person("김철수",17,"남자","010-1111-1111");
		Person teacher = new Person("이영희",45,"여자","010-2222-2222");
		Person doctor = new Person("박수현",32,"남자","010-3333-3333");
		
		ArrayList<String> list = new ArrayList<>();
		student.addList(list);
		teacher.addList(list);
		doctor.addList(list);
		
		Iterator<String> it = list.iterator();
		
		int count =0;
		while (it.hasNext()) {
			System.out.print(it.next());
			if(count==3) {
				System.out.println();
				count=0;
			}
			else {
				System.out.print(" / ");
				count++;
			}
		}

	} // main() 끝
}

class Person {
	private String name;
	private int age;
	private String gender;
	private String ph;
	
	Person(String name, int age, String gender, String ph) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ph = ph;
	}
	
	void addList(ArrayList<String> list) {
		list.add(this.name);
		list.add(this.age+"");
		list.add(this.gender);
		list.add(this.ph);
	}
	
}