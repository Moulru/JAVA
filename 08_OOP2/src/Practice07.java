
public class Practice07 {

	public static void main(String[] args) {
		/*
		 * 	보병, 탱크, 수송선 클래스의 공통점을 찾아서
		 * 	Unit 클래스를 만들고 모두 이 클래스를 상속받도록 수정
		 * 		--> 추상화 할 것
		 * 
		 */
		
		Marine m1 = new Marine();
		Tank t1 = new Tank();
		Dropship d1 = new Dropship();
		
		m1.move(5, 7);
		m1.stop();
		m1.stimPack();
		
		System.out.println();
		
		t1.move(20, 60);
		t1.stop();
		t1.changeMode(true);
		
		System.out.println();
		
		d1.move(61, 75);
		d1.stop();
		d1.load();
		d1.unload();
		
	}
}

abstract class Unit {
	protected int x;
	protected int y;
	
	abstract void move( int x , int y );
	
	void stop() {
		System.out.println("자리에 멈춥니다");
	}
}

class Marine extends Unit {		// 보병
	
	@Override
	void move( int x , int y ) {		// 좌표를 매개변수로 받아 해당 좌표로 이동을 할 수 있다.
		super.x = x;
		super.y = y;
		System.out.printf("보병이 %d, %d로 이동 \n", super.x, super.y);
	}
	
	void stimPack() {				// 스팀팩 쓴다
		System.out.println("스팀팩 사용!!");
	}
}

class Tank extends Unit {		// 탱크
	
	@Override
	void move(int x, int y) {		// 좌표를 매개변수로 받아 해당 좌표로 이동을 할 수 있다.
		super.x = x;
		super.y = y;
		System.out.printf("탱크가 %d, %d로 이동 \n", super.x, super.y);
	}
	
	void changeMode(boolean isOn) {	// 모드변경
		if( isOn == true ) {
			System.out.println("모드 해제");
		}
		else {
			System.out.println("모드 설정");
		}
	}
}

class Dropship extends Unit {	// 수송선
	
	@Override
	void move(int x, int y) {		// 좌표를 매개변수로 받아 해당 좌표로 이동을 할 수 있다.
		super.x = x;
		super.y = y;
		System.out.printf("수송선이 %d, %d로 이동 \n", super.x, super.y);
	}
	
	void load()	{ 
		System.out.println("탑승");
	}
	
	void unload() {
		System.out.println("하차");
	}
}