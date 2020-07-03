
public class ClassPractice06 {

	public static void main(String[] args) {
		/*
		 * 	학생 클래스 (Student)
		 * 		멤버변수
		 * 			이름, 반, 번호, 국어점수, 수학점수, 영어점수
		 * 		메서드
		 * 			1. 총점 반환 : getScore()
		 * 				> int로 반환
		 * 			2. 평균 반환 : getAvg()
		 * 				> float으로 반환
		 * 			3. 정보 출력 : printInfo()
		 * 				> void
		 * 			4. 생성자 : 최소 2개
		 * 			5. 만약 생성자에서 값을 입력 받지 않았다면, 값을 입력받는 메서드도 추가로 정의
		 * 
		 * 		ex) 국어점수를 생성자에서 입력 받지 않았다.
		 * 			setKor ( 80 ); 이런 메서드 정의!
		 * 
		 * 		최소 2명 인스턴스 생성 및 정보 출력!
		 */

		Student stu1 = new Student("하나",1,10,50,60,80);
		stu1.printInfo();
		
		Student stu2 = new Student("둘",2,20,90,76);
		stu2.getEng(70);
		stu2.printInfo();
		
		Student stu3 = new Student("셋",3,30);
		stu3.getKor(88);
		stu3.getMat(80);
		stu3.getEng(72);
		stu3.printInfo();
	}

}

class Student {
	String names = new String();
	int cls		 = 0;
	int num		 = 0;
	int kor		 = 0;
	int mat		 = 0;
	int eng		 = 0;
	
	Student(String names, int cls, int num, int kor, int met, int eng) {
		this.names = names;
		this.cls = cls;
		this.num = num;
		this.kor = kor;
		this.mat = met;
		this.eng = eng;
	}
	
	Student(String names, int cls, int num, int kor, int met) {
		this.names = names;
		this.cls = cls;
		this.num = num;
		this.kor = kor;
		this.mat = met;
	}
	
	Student(String names, int cls, int num, int kor) {
		this.names = names;
		this.cls = cls;
		this.num = num;
		this.kor = kor;
	}
	
	Student(String names, int cls, int num) {
		this(names,cls,num,0,0,0);
	}
	
	void getKor(int kor) {
		this.kor = kor;
	}
	void getMat(int mat) {
		this.mat = mat;
	}
	void getEng(int eng) {
		this.eng = eng;
	}
	
	int getScore() {
		return kor + mat + eng;
	}
	
	float getAvg() {
		return (float)(getScore()) / 3;
	}
	
	void printInfo() {
		System.out.println("=================");
		System.out.println("이름	: " + names);
		System.out.println("반	: " + cls + "반");
		System.out.println("번호	: " + num);
		System.out.println("국어	: " + kor + "점");
		System.out.println("수학	: " + mat + "점");
		System.out.println("영어	: " + eng + "점");
		System.out.println("총점	: " + getScore() + "점");
		System.out.printf("평균	: %.2f점\n" ,getAvg());
		System.out.println("=================");
		System.out.println();		// 개행
	}
}