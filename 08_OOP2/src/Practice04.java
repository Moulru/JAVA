public class Practice04 {
	public static void main(String[] args) {
		/*
		 * 	setter와 getter 만들기
		 * 		> 나이가 0이하 또는 150이상이 전달되면,
		 * 		  값을 보정해서 저장하기
		 */
		
		Person04 p = new Person04();
		p.setName("박준호");
		p.setAge(24);
		
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		
		System.out.println();		// 개행
		
		Student04 s = new Student04();
		s.setName("s.박준호");
		s.setAge(-76);
		s.setMajor("컴공");
		
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
		System.out.println("전공 : " + s.getMajor());
	}
}

class Person04 {
	private String name;
	private int age;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
		if(age > 150) {
			if(age > 1000) {
				this.age = 100;
			}
			else this.age = age/10;
		}
		if(age <= 0) {
			if(age==0) {
				this.age = 1;
			}
			else if(age < -100) {
				this.age = 1;
			}
			else this.age = age*-1;
		}
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
}

class Student04 extends Person04 {
	private String major;
	
	void setMajor(String major) {
		this.major = major;
	}
	
	String getMajor() {
		return major;
	}
}