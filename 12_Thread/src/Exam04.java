import java.util.ArrayList;

public class Exam04 {
	public static void main(String[] args) {
		/*
		 * 	join - 다른 쓰레드가 종료되기를 기다린다
		 */
		
		// 쓰레드를 ArrayList에 담아서!
		ArrayList<Thread> th_list = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			Thread t = new Thread( new MyThreadEx04() );
			t.setName("".format("%d번", (i+1)));
			// 1번 을 반환하는 format 메서드! (1,2,3,4,5 순서로)
			
			t.start();		// 쓰레드 시작
			th_list.add(t);	// 리스트에 추가
			// 총 5개의 새로 만들어진 쓰레드 인스턴스가 추가됨
		}
		
		for(int i=0; i<th_list.size(); i++) {
			Thread t = th_list.get(i);
			// 리스트에 들어있는 쓰레드를 반환
			
			System.out.println(t.getName() + " join 직전");
			try {
				t.join();
				// join : 다른 쓰레드(t)가 끝날 때 까지 대기하는 메서드이기에
				// 끝나기 전에 interrupt()로 깨울 수 있다 --> 예외 처리가 필요함
			} catch (InterruptedException e) {
			}
			
			// 처음 1번쓰레드를 기다렸다가 join이 풀리면,
			// 이미 나머지 쓰레드들도 종료가 된 상태 (같은 시간 동안 sleep)
			// 그 다음 순서부터는 join을 해도 바로 출력 됨
			System.out.println(t.getName() + " join 후");
		}
		
		System.out.println("main() 끝");
	}	// main() End
}

class MyThreadEx04 implements Runnable {

	@Override
	public void run() {
		// 시작 출력, 5초대기, 끝 출력하는 쓰레드
		System.out.println(Thread.currentThread().getName() + " 시작");
		
		try {
			Thread.sleep(5000);		// 5초 대기
		} catch (InterruptedException e) {
		}
		
		System.out.println(Thread.currentThread().getName() + " 끝");
	}

}