import java.util.ArrayList;

public class Exam05 {
	public static void main(String[] args) {
		/*
		 *	동기화 (synchronization)
		 *		- 여러 쓰레드가 공유된 하나의 지역을 동시 접근하다보면 예상치 못한 결과가 나올 수 있다
		 *		- 동기화 : 하나의 쓰레드만 접근할 수 있도록 접근제어
		 *
		 *		- 한 쓰레드가 동기화된 지역을 접근하면, 다른 쓰레드는 접근 불가
		 *			> lock(잠금) 걸렸다고 얘기한다
		 *			> 해당 지역에서 작업 중인 쓰레드는 해당 지역의 고유 lock을 지니고 있다고한다
		 */
		
		// 여러 명의 학생이 수강신청을 한다! 10명이서 5개의 자리를 놓고 다툼

		ArrayList<Thread> th_list = new ArrayList<>();
		
		// 이렇게 StudentThread 클래스의 인스턴스를 만들어 놓고,
		// 실제 쓰레드 인스턴스 생성 시 같은 인스턴스를 공유시켜준다
		Runnable r = new StudentThread();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread( r );
			t.setName("".format("%d번 학생", (i + 1)));

			t.start();
			th_list.add(t);
		}
		// 여기까지 진행되면, 10명의 학생쓰레드가 생성 및 실행되고,
		// 쓰레드 run()에서는 1분간 대기상태가 된다!
		
		System.out.println("2초 뒤 수강신청 페이지가 열립니다.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		for( int i=0; i<th_list.size(); i++) {
			th_list.get(i).interrupt();
			// 자고있는 학생들을 다 깨운다
			
		}
		
	}	// main() End

}

// 학생이 수강신청을 하는 쓰레드
class StudentThread implements Runnable {
	RegisterClass register = new RegisterClass();
	// 실제 수강신청 작업을 할 수 있는 클래스의 인스턴스 생성
	// 이 인스턴스는 모든 쓰레드가 공유할 것임
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(1000*60);
		} catch (InterruptedException e) {
			// main에서 interrupt() 를 하면 여기가 수행됨
		}
		
		// 자고나서 수강신청을 진행!
		register.doRegister();
	}
	
}

// 실제로 수강신청 작업을 하는 쓰레드
class RegisterClass {
	int count = 5;		// 수강신청 가능한 수
	
	// 동기화 사용! - 한 쓰레드만 진입할 수 있다 --> 다른 쓰레드는 진입 불가!
	synchronized void doRegister() {
		if( count > 0) {
			System.out.println(Thread.currentThread().getName() + " 신청 성공!!");
			count--;	// 내가 신청했으니까 개수 감소
		}
		else System.out.println(Thread.currentThread().getName() + " 신청 실패");
		
		System.out.println("남은 자리 : " + count);
	}
}