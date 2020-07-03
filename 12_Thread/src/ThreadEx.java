import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class ThreadEx {
	public static void main(String[] args) {
		/*
		 * 	쓰레드 (Thread)
		 * 		- 바느실할 때 사용하는 '실'
		 * 
		 * 		- 프로세스 (process)	: 실행 중인 프로그램 (껍데기)
		 * 		- 쓰레드 (thread)	: 작업을 하는 실행 단위 (실제 작업하는 작업자)
		 * 
		 * 		- 멀티태스킹 : 하나의 운영체제에서 여러 개의 '프로세스'를 동시 실행
		 * 		- 멀티쓰레딩 : 하나의 프로세스에서 여러 개의 '쓰레드'가 동시 작업
		 * 
		 * 		- PID : Process ID (프로세스의 고유 번호)
		 * 		- TID : Thread ID (프로세스 내에서 쓰레드의 고유 번호)
		 * 
		 * 		- 이 프로젝트(12_Thread) 전까진 지금껏 싱글쓰레드로 작업을 했다
		 * 			> Scanner로 nextInt() 메서드 사용 시 입력 대기 상태!
		 * 			> 입력을 받기 전 까지는 다음 코드가 수행되지 않는다
		 * 			> 이때 만약 다른 쓰레드가 있었다면, 그 쓰레드는 계속 일을 한다
		 * 
		 * 		-JVM (자바를 실행하는 가상머신 - 우리가 만든 class 파일 실행)
		 * 			> JVM은 쓰레드별로 스케쥴링을 한다
		 * 			> 멀티쓰레딩일 때, 동시에 작업은 하지만 내가 작업할 시간을 JVM에게 할당 받은 뒤 작업한다
		 * 
		 * 		- 쓰레드를 만드는 2가지 방법
		 * 			1. Thread 클래스를 상속 받기 (extends Thread)
		 * 				> run() 메서드를 오버라이딩해야 한다
		 * 
		 * 			2. Runnable 인터페이스 구현하기 (implement Runnable)
		 * 				> run() 이라는 추상메서드 1개만 정의되어 있다
		 * 					>> run() 메서드를 반드시 오버라이딩 해야함!
		 * 
		 * 		- run() : main() 메서드(프로그램의 시작과 끝)처럼 쓰레드의 시작과 끝
		 * 		- start() : 쓰레드를 동작시킨다
		 * 			> 한 번만 호출할 수 있다
		 * 
		 *  	- main() 메서드의 종료 = 프로그램의 종료
		 *  		> main 쓰레드가 종료되어서 프로그램이 종료된 것
		 *  		> 다른 쓰레드가 실행 중이면 프로그램은 종료되지 않는다!
		 *  
		 *  			---> 모든 쓰레드가 종료되어야 프로그램은 종료된다
		 *  
		 */
		System.out.println("main() 시작");
		
		// 1) Thread를 상속 받은 클래스로 인스턴스 만들기
		MyThread01 th1 = new MyThread01();
		th1.start();
		
		// 2) Runnable을 구현한 클래스로 인스턴스 만들기
		Runnable r = new MyThread02();
		Thread th2 = new Thread( r );		
		// Thread th2 = new Thread( new MyThrea02() ); // 한 줄로 작성함
		
		th2.start();
		
		// 자바에서 쓰레드를 사용하려면, Thread 클래스의 인스턴스가 생성되어야 한다
		// MyThread01 클래스는 Thread클래스를 상속 받았기 때문에 조건이 만족한다
		// MyThread02 클래스는 Thread클래스를 상속 받지 않고, 단지 인터페이스만 구현
		// 그래스 th2같은 경우는 Thread 클래스 타입으로 인스턴스를 생성했다!
		
//		그럼 왜 귀찮게 이렇게 인스턴스를 만드는가?
//		Thread 클래스를 상속 받은 MyThread01클래스는 다른 클래스에 상속받지 못한다
//		다른 클래스를 상속 받으려고 인터페이스를 구현!
		
		System.out.print("정수 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.println("main() 끝");
	}	// main() 끝
}


// 1) Thread 클래스 상속
class MyThread01 extends Thread {
	
	@Override
	public void run() {
		System.out.println("MyThread01 run() 시작");
		
		int num = 0;
		
		while( true ) {		// while문 조건식의 true --> 무한 반복
			// getName() : Thread 클래스의 메서드 - 현재 쓰레드의 이름 반환
			System.out.println( getName() + " - " + (++num));
			
			try {
				// sleep() : Thread 클래스의 클래스메서드
				// 지정한 시간동안 아무것도 안하고 대기
				Thread.sleep(1000);	// 1초 (1/1000초 기준)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}


// 2) Runnable 인터페이스 구현
class MyThread02 implements Runnable {

	@Override
	public void run() {
		System.out.println("MyThread02 run() 시작");

		int num = 0;

		while (true) { // while문 조건식의 true --> 무한 반복
			// getName() : Thread 클래스의 메서드 - 현재 쓰레드의 이름 반환
			// 이 클래스는 Thread 클래스를 상속 받지 않았다! (getName 사용불가)
			// 이때 클래스메서드를 이용해서 '현재 쓰레드 정보'를 반환받는다
			System.out.println(Thread.currentThread().getName() + " - " + (++num));

			try {
				// sleep() : Thread 클래스의 클래스메서드
				// 지정한 시간동안 아무것도 안하고 대기
				Thread.sleep(1000); // 1초 (1/1000초 기준)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}