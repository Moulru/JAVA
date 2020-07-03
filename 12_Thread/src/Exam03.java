
public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 		쓰레드의 상태
		 * 			NEW
		 * 				- 쓰레드의 상태는 생성되었지만 아직 실행되지않은 상태
		 * 				- start() 메서드가 호출되면 RUNNABL
		 * 			RUNNABLE
		 * 				- 쓰레드가 현재 실행되고 있거나 실행이 준비되어 스케쥴링을 기다리는 상태
		 * 				- run() 메서드 코드가 수행 중!
		 * 			WAITING
		 * 				- 쓰레드가 무한대기중인 상태(종료는 아님!)
		 * 				- 다른 곳에서 풀어줘야 한다!
		 * 			TIMED_WAITTING
		 * 				- sleep() 일정 시간동안 대기중인 상태
		 * 				- 지정된 시간이 지나면 자동으로 RUNNABLE 상태가 된다
		 * 			BLOCKED
		 * 				- lock(잠금)이 걸린 상태(일시정지), lock이 풀리면 RUNNABLE
		 * 			RERMINATED
		 * 				- 쓰레드가 종료한 상태(run 메서드의 코드가 다 끝난 상태)0
		 * 				- 종료 이후에는 다른 상태로 변할 수 없다!(새로 start 할 수도 없다)
		 * 
		 * 		쓰레드의 상태 제어(메서드들)
		 * 			sleep()		: 1/1000초 기준으로 값 입력 지정시간동안 대기
		 * 			interrupt	: WATING 상태의 쓰레드를 깨운다! --> RUNNABLE
		 * 			stop		: 쓰레드 종료(TERMINATED 상태로 변경)
		 * 			suspend()	: 일시정지
		 * 			resume()	: 다시시작 (suspend와 짝)
		 * 			join()		: 다른 쓰레드의 종료를 기다린다
		 * 			yield()		: 스케쥴러가 준 내게 주어진 실행시간을 양보한다(반납)
		 * 				> 1번 쓰레드가 코드 수행 중에 yield()를 만나면 RUNNABLE의 대기가 되고
		 * 				> 다른 쓰레드인 2번쓰레드에게 기회가 주어질 수 있다
		 */

		// yield 예제
		
		Thread th1 = new Thread( new MyThreadEx03() );
		Thread th2 = new Thread( new MyThreadEx03_02() );
//		Thread th1 = new Thread( new MyThreadEx03() , "1번 쓰레드" );		<-- 생성과 동시에 이름을 지을 수 있다
		th1.setName("1번 쓰레드");
		th2.setName("2번 쓰레드");
		th1.setDaemon(true);
		th2.setDaemon(true);
		// 데몬쓰레드로 만들면 main쓰레드가 종료되면 같이 종료됨
		
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		
		System.out.println("main() 끝");
	}		// main() 끝
}

class MyThreadEx03 implements Runnable {

	@Override
	public void run() {
		int count = 0;

		for (int i = 0; i < 1000; i++) {
			count++;
			System.out.println(Thread.currentThread().getName() + " - " + count);
			
			// for문 수행문에서 yield를 만나면 더 이상 진행하지 않고,
			// 내게 남은 작업시간을 반납(양보)
			Thread.yield();
			
			// 1번이 양보했다고 해서 무조건 그 다음 작업 차례가 2번이 되는건 아님
			// 바로 다음 순서가 1번이 될 수도 있다
			// (그래도 결과를 보면 1번보다 2번쓰레드가 더 많이 찍히는걸 볼 수 있다)
		}

		System.out.println(Thread.currentThread().getName() + " 끝");
	}
}

class MyThreadEx03_02 implements Runnable {

	@Override
	public void run() {
		int count = 0;

		for (int i = 0; i < 1000; i++) {
			count++;
			System.out.println(Thread.currentThread().getName() + " - " + count);
		}

		System.out.println(Thread.currentThread().getName() + " 끝");
	}

}