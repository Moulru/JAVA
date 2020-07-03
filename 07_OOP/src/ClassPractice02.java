
public class ClassPractice02 {

	public static void main(String[] args) {
		/*
		 * 	Bullet 클래스
		 * 		멤버변수 : 속도, 힘
		 * 		메서드
		 * 			생성자
		 * 			void printDamege()
		 * 
		 * 		속도*힘 = 공격력
		 */

//		속도 3, 힘 5라고 생성되었을 경우
//		Bullet bullet = new Bullet(3,5);
//		bullet.printDamage(); // 총알의 공격력 : 15
		
		Bullet bullet = new Bullet(3,5);
		bullet.printDamege();
	}
}

class Bullet {
	int speed;
	int str;
	Bullet(int speed,int str) {
		this.speed = speed;
		this.str = str;
	}
	
	void printDamege() {
		System.out.printf("총알의 공격력 : %d",speed*str);
	}
}