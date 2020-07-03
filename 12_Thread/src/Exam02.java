
public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 	데몬쓰레드 (demon thread)
		 * 		- 쓰레드는 일반쓰레드와 데몬쓰레드로 나뉜다
		 * 		- 데몬쓰레드는 일반쓰레드의 작업을 돕는 보조 역할이다
		 * 			> 보조 역할을 할 코드는 내가 작성해야됨
		 * 		- 일반쓰레드가 모두 종료되면 데몬쓰레드는 강제로 자동종료된다
		 * 			> main쓰레드가 종료되어도 다른 일반 쓰레드가 종료되지 않으면 프로그램은 종료되징 않았었다!
		 */

		System.out.println("main() 시작");
		
		Thread th = new Thread( new MyThreadEx02() );
		
		th.setDaemon(true);		// 일반쓰레드를 데몬쓰레드로 만들기
		th.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main() 끝");
	}

}

class MyThreadEx02 implements Runnable {

	@Override
	public void run() {
		int num = 0;
		
		while(true) {
			try {
				Thread.sleep(1000);		// 1초간 재우기(대기) --> 1/1000초 기준
			} catch (InterruptedException e) {
			}
			
			num++;
			System.out.println(num + "초 경과...");
		}
	}
	
}