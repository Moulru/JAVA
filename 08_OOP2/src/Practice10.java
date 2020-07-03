
public class Practice10 {

	public static void main(String[] args) {
		/*
		 * 	포함관계 연습 (has-a)
		 * 	
		 * 	총을 지닌 경찰
		 * 		총		: Gun 클래스
		 * 		경찰		: Police 클래스
		 * 
		 * 		1. Gun
		 * 			private int bullet;		> 총에 장전된 총알의 수
		 * 			생성자 (int bullet)		> 장전할 총알의 수를 받아서 장전
		 * 									>> 총이라는 인스턴스는 생성시 총알을 장전하여 생성을 할 수 있다
		 * 			shot(int count)			> 총알 발사하는 기능 , 총알이 있으면 "빵야!"라고 1회 출력
		 * 									>> count의 수만큼 빵야 출력, 총알이 없으면(0이면) "총알 부족" 이라고 출력 후 끝
		 * 			reload(int bullet)		> 전달받은 총알의 수만큼(bullet) 장전
		 * 			printInfo()				> "현재 총알 수 : 10발" 이런식으로 출력
		 * 
		 * 		2. Police
		 * 			private int bullet;			> 경찰이 지니고 있는 총알의 수	
		 * 			Gun myGun;					> 경찰이 지닌 총
		 * 			생성자 (Gun gun, int bullet)	> '총'인스턴스와 지닌 총알의 수를 받음
		 * 										>> 경찰이 출동 할 때 총 한자루와 여분의 총알을 지니고 간다
		 * 			reload(int bullet)			> 전달받은 총알의 수 만큼 '총'을 장전하기
		 * 										> 장전한 수만큼 지닌 총알의 수 감소
		 */

		// 5발이 장전된 총과 여분의 총알 20발
		Police hong = new Police(new Gun(5), 20);
		
		hong.myGun.printInfo();
		hong.myGun.shot(6);			//	빵야! 5번 출력 후 총알 부족이라고 출력
		
		hong.myGun.printInfo();		//	현재 총알 수 : 0발
		hong.myGun.shot(1);			//	총알 부족
		
		hong.reload(10);
		hong.myGun.printInfo();		//	현재 총알 수 : 10발
		hong.reload(18);
		hong.myGun.printInfo();
		hong.reload(10);
		hong.myGun.printInfo();
		
	}
}

class Gun {
	private int bullet;
	
	Gun (int bullet) {
		this.bullet = bullet;
	}

	void shot(int count) {

		if(bullet == 0) {
			System.out.println("총알 부족");
		}

		else {
			while (bullet != 0) {
				System.out.println("빵야!");
				bullet--;

				if (bullet == 0) {
					System.out.println("총알 부족");
					break;
				}

				else if (count == 1) {
					break;
				}
				--count;
			}
		}
	}
	
	public void reload (int bullet) {
		this.bullet = this.bullet + bullet;
	}
	
	void printInfo() {
		System.out.println("현재 총알 수 : " + bullet);
	}
}

class Police{
	private int bullet;
	Gun myGun;

	Police(Gun gun, int bullet) {
		this.myGun = gun;
		this.bullet = bullet;
	}

	void reload(int bullet) {
		for (int i = 0; i < bullet; i++) {
			if (this.bullet > 0) {
				this.bullet = this.bullet - 1;
				myGun.reload(1);
			}
			
			else {
				break;
			}
		}
	}
	
//	void print() {
//		System.out.println("남은총알 : " + this.bullet);
//	}
}