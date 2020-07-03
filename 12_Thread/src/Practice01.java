import java.awt.print.Printable;

public class Practice01 {

	public static void main(String[] args) {
		/*
		 * 	1~100 까지 출력하고 종료하는 쓰레드 만들기
		 * 		1) Thread 클래스 상속받은 쓰레드 - MyThread01_01
		 * 		2) Runnable 인터페이스를 구현한 쓰레드 - MyThread01_02
		 * 
		 * 		앞에 작성했던 코드 참고하여 코드작성
		 * 
		 * 		결론.. 쓰레드를 만드는 이유?
		 * 			run() 메서드에 내가 원하는 작업을 main()과 관계없이 진행하기 위해
		 */

		MyThread01_01 t1 = new MyThread01_01();
		t1.start();
		
		Thread t2 = new Thread( new MyThread01_02() );
		t2.start();
	}

}

class MyThread01_01 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("t1 : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class MyThread01_02	implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("t2 : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}