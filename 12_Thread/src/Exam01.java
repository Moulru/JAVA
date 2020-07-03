public class Exam01 {
	public static void main(String[] args) {
		/*
		 *	main() 메서드도 쓰레드이다
		 *		- 작업 우선순위 (1~10)
		 *			> 기본 값 : 5 (높을수록 우선순위가 높다)
		 *			> 우선순위가 높다고 해서 명확하게 더 많이 시간이 부여되는건 아님
		 *				>> os(운영체제)에서 따로 우선순위를 부여할 수 있음
		 *			> setPriority : 우선순위 설정
		 *				>> ex/ Thread.currentThread().setPrioity(10);
		 *			> 각 쓰레드의 작업(run에 작성해놓은 코드) 중요도에 따라 우선순위를 다르게 설정하면
		 *			   작업시간을 더 많이(또는 적게) 부여
		 *
		 * 	각 쓰레드마다 작업공간(stack)이 부여된다
		 * 
		 */
		
		long	id		 = Thread.currentThread().getId();
		String	name	 = Thread.currentThread().getName();
		int		priority = Thread.currentThread().getPriority();
		
		System.out.println("현재 쓰레드 이름 : " + name);
		System.out.println("현재 쓰레드 ID : " + id);
		System.out.println("현재 쓰레드 우선순위 값 : " + priority);
		System.out.println("==========================");
		
		MyThreadEx01 th = new MyThreadEx01();
		// new 로 Thread 인스턴스를 만들면 쓰레드가 생성! (아직 실행은 X)
		
		th.setName("[1번 쓰레드]");		// getName에서 반환할 문자열 -> 쓰레드 이름
		
		th.start();		// 쓰레드 실행
		// 실제 쓰레드가 실행! --> 새로운 작업공간(stack)이 생성
		
//		[err message]
//		java.lang.Exception: errMethod에서 예외 던짐
//		at MyThreadEx01.errMethod(Exam01.java:57)
//		at MyThreadEx01.run(Exam01.java:52)
		
		th.run();
		// run() 을 직접 호출하는 것은 생성된 쓰레드를 실행시키는 것이 아니라,
		// th 참조변수로 해당 클래스의 run() 메서드를 실행시킨 것

//		[err message]
//		java.lang.Exception: errMethod에서 예외 던짐
//		at MyThreadEx01.errMethod(Exam01.java:46)
//		at MyThreadEx01.run(Exam01.java:41)
//		at Exam01.main(Exam01.java:33)				<<- main이 있는것을 확인 할 수 있다!

		
	} // main() End
	
}

class MyThreadEx01 extends Thread {
	@Override
	public void run() {
		errMethod();
	}

	void errMethod() {
		try {
			throw new Exception("errMethod에서 예외 던짐");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}