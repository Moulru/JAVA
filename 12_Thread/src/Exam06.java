public class Exam06 {
	public static void main(String[] args) {
		/*
		 *  동기화의 또 다른 방법 wait(), notify(), notifyAll()
		 *  	- Object 클래스에 정의된 메서드 (모든 인스턴스가 사용 가능)
		 *  	- synchronized 블럭 안에서만 사용할 수 있다. (임계영역)
		 *  
		 *  	- wait() : 임계영역 안에서 대기상태가 되며, 가지고 있던 lock을 반환
		 *  				> 다른 쓰레드가 임계영역으로 진입할 수 있다. (1개만)
		 *  	- notify() : 임계영역에서 대기중인 쓰레드 1개를 깨운다. (RUNNABLE)
		 *  				> 여러 쓰레드가 대기중이면 어떤 쓰레드를 깨울지모름
		 *  					>> JVM이 결정
		 *  	- notifyAll() : 대기중인 모든 쓰레드를 깨운다 (RUNNABLE)
		 *  				> 다같이 일어난다고해서 동시에 작업을 하는 건 아니다..
		 *  				> 깨어난 쓰레드들끼리 누가 먼저 임계영역의 나머지코드를
		 *  					수행할지 경쟁 후 1개의 쓰레드가 먼저 진행을 한다.
		 *  
		 *  	> 만약 임계영역에 접근한 쓰레드 1개가 그 영역을 계속 사용하게 되면,
		 *  		나머지 쓰레드들은 무한히 밖에서 대기할 수도 있다. (lock걸린상태)
		 *  			wait와 notify로 쓰레드간의 '통신'을 하여 접근 제어
		 */
		
		/*
		 * 	카페 클래스 - 커피제공, 커피제작
		 * 	고객 클래스(쓰레드) - 커피 구입 후 마신다
		 * 	바리스타 클래스(쓰레드) - 커피를 만든다.
		 */
		
		// 행복카페 하나를 만들었다!
		Cafe happyCafe = new Cafe();
		
		// 카페를 방문하는 고객에 대한 인스턴스 생성!
		// 만들어놓은 카페의 인스턴스를 멤버로 가지고 있는다!
		Runnable r = new CafeCustomer( happyCafe );
		
		// 고객 인스턴스는 동일한 카페를 멤버로 가지고 있다 (공유)
		Thread customer1 = new Thread( r, "홍길동" ); // setName("홍길동")
		Thread customer2 = new Thread( r, "임꺽정" );
		
		// 카페에서 일하는 바리스타 인스턴스 생성!
		Thread barista = new Thread( new Barista( happyCafe ) );

		// 고객이 카페에 먼저 방문을 하였다.
		customer1.start();
		customer2.start();
		
		try {
			System.out.println("0.5초 후 바리스타가 출근하여 커피를 만듭니다.");
			Thread.sleep(500);
		} catch (InterruptedException e) {}
		
		// 바리스타가 출근!
		barista.start();
		
	} // main() 끝
}

class Cafe {
	String coffeeName 			= "";	// 제공될 커피의 이름
	boolean isCompleteCoffee 	= false; // 커피의 완성 유/무
	
	// 고객이 커피를 가져가는 메서드
	synchronized String getCoffee() {
		
		// 아직 커피가 완성되지 않았으면
		if( this.isCompleteCoffee == false ) {
			System.out.println( Thread.currentThread().getName() + 
								"님은 커피가 완성될 때까지 기다립니다.");
			
			try {
				// 커피가 완성될 때까지 대기한다. (notify로 깨워줄때까지)
				wait(); // 시간을 지정할 수 있다. 값을 지정하지 않으면 무한대기
				// 임계영역 안에서 대기상태로 빠진다!
			} catch (InterruptedException e) {}
			
			// wait에서 깨어난 후 (notify 발생)
			System.out.println( Thread.currentThread().getName() + 
					"님은 커피를 가져갑니다.");
		}
		
		return this.coffeeName; // 만들어진 커피를 반환 (이름만 반환)
	}
	
	
	// 커피를 만드는 메서드 (어떤 커피를 만들 것인지 매개변수로 전달 받음)
	synchronized void setCompleteCoffee( String coffeeName ) {
		this.coffeeName 		= coffeeName;	// 만든 커피 이름
		this.isCompleteCoffee 	= true; 		// 커피가 완성됐다고 변경
		
		notifyAll(); // 임계영역 안에서 wait 대기중인 쓰레드들을 모두 깨운다!
//		notify(); // 대기중인 쓰레드 중에 하나만 깨운다.
		System.out.println("커피가 완성되었습니다. 모두 가져가세요!");
	}
}

// 카페 고객 클래스 (쓰레드)
class CafeCustomer implements Runnable {
	// main에서 생성한 카페 인스턴스를 담을 참조변수! (멤버로 가지고 있겠다)
	Cafe cafe; 
	
	CafeCustomer(Cafe cafe) {
		// main에서 전달한 카페 인스턴스를 멤버변수에 대입
		this.cafe = cafe;
	}

	@Override
	public void run() {
		// 고객은 커피를 받아서 먹는다.
		
		String myCoffee = cafe.getCoffee();
		
		// 홍길동 : 아메리카노는 참 맛있네요!
		System.out.println( Thread.currentThread().getName() + " : " + 
							myCoffee + "는 참 맛있네요!");
	}
}

// 바리스타 클래스
class Barista implements Runnable {
	// main에서 생성한 카페 인스턴스를 담을 참조변수! (멤버로 가지고 있겠다)
	Cafe cafe; 
	
	Barista(Cafe cafe) {
		// main에서 전달한 카페 인스턴스를 멤버변수에 대입
		this.cafe = cafe;
	}
	
	@Override
	public void run() {
		// 바리스타는 커피를 만든다!!
		cafe.setCompleteCoffee("아메리카노");
	}
}


/*
 * 	쓰레드를 보통 사용하게되는 경우
 */
/*
run() {
	// 무한반복을 시킨다.
	while(true) {
		
		if ( 특정 조건일 때 ) {
			wait();
			// wait 풀려난다 = 어딘가에서 이 쓰레드가 필요할 때 notify
		}
		
		// 이 쓰레드가 하는 일을 수행
		
	}
}
*/














