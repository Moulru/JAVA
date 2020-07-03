import org.omg.Messaging.SyncScopeHelper;

public class Exam01 {
	public static void main(String[] args) {
		/*
		 * 	Object 클래스
		 * 		- equals() : 같은 인스턴스인지 확인
		 * 		- hashCode() : 인스턴스의 주소값을 이용하여 해시코드를 만들어서 반환
		 * 			* hash 란? : 하나의 값을, 이를 상징하는 문자열로 변환 (일정한 길이)
		 * 			인스턴스의 hashcode = 각 인스턴스를 식별할 하나의 정수 값  
		 * 		- toString() : 인스턴스에 대한 정보를 문자열로 제공(오버라이딩하여 사용)
		 * 									  └─> 쓸모있는 정보!
		 */

		System.out.println("===========================");
		System.out.println("[ equlas() ]");
		MyData d1 = new MyData(1);
		MyData d2 = new MyData(1);
		
		System.out.println("d1.equals(d2)	: " + d1.equals(d2));
		System.out.println("d1 == d2	: " + (d1 == d2));
		// 인스턴스변수 data의 값은 같지만(둘다 1) 실제 인스턴스는 다르다!
		
		System.out.println();
		
		d1 = d2;
		// d1 참조변수에 d2 참조변수가 가진 인스턴스의 주소를 대입
		// 이때부터 d1과 d2는 같은 인스턴스를 가리키게 된다
		// 그러면.. 원레 d1이 가리키던 인스턴스는 가리키는 참조변수가 없다
		// 이럴때 (자신을 가리키는 참조변수가 없을 때) 자동으로 소멸된다
		//				--> JVM의 가비지콜렉터에 의해서
		System.out.println("d1.equals(d2)	: " + d1.equals(d2));
		System.out.println("d1 == d2	: " + (d1 == d2));
		
		System.out.println();
		
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		// 위와는 다르게 String 클래스는 equals()를 오버라이딩 해놨다..!
		// 글자 하나 하나가 같은지 비교하도록!
		
		System.out.println("===========================");
		System.out.println("[ equlas() - overriding ]");
		
		MyData2 d3 = new MyData2(2);
		MyData2 d4 = new MyData2(2);
		System.out.println("d3.equals(d4)	: " + d3.equals(d4));
		System.out.println("d3 == d4	: " + (d3 == d4));
		d3 = d4;	// 원레 d3이 가리키던 인스턴스는 자동소멸
		System.out.println();
		System.out.println("d3.equals(d4)	: " + d3.equals(d4));
		System.out.println("d3 == d4	: " + (d3 == d4));
		
		System.out.println("===========================");
		System.out.println("[ hashCode() ]");
		System.out.println("d1.hashCode()	: " + d1.hashCode());
		System.out.println("d2.hashCode()	: " + d2.hashCode());
		System.out.println("d3.hashCode()	: " + d3.hashCode());
		System.out.println("d4.hashCode()	: " + d4.hashCode());
		// 서로 다른 인스턴스는 다른 hash값을 가진다
		
//		String str1 = new String("ABC");
//		String str2 = new String("ABC");
//		System.out.println("str1.equals(str2) : " + str1.equals(str2));
//		// 위와는 다르게 String 클래스는 equals()를 오버라이딩 해놨다..!
//		// 글자 하나 하나가 같은지 비교하도록!
		System.out.println("str1.hashCode()	: " + str1.hashCode());
		System.out.println("str2.hashCode()	: " + str2.hashCode());
		// String 클래스에서는 hashCode()도 오버라이딩을 해놨다!!
		// 문자열이 같으면 같은 해쉬 값이 나온다 (한 글자씩 가지고 코드를 만든다)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// identityHashCode() : 실제 해쉬코드를 반환하는 System클래스의 클래스메서드

		System.out.println("===========================");
		System.out.println("[ toString() ]");
		System.out.println(d1);
		// MyData 클래스에 toString을 오버라이딩해서 data의 값을 반환
		// 위 d1 출력결과가 5가 나오도록 해보기
		
	}	// main() 끝
}

class MyData {
	int data;	// 접근제어가 (default)인 인스턴스 변수, 멤버변수는 초기화가 자동
	
	MyData( int data ) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		String NULL = new String();
		System.out.print(data);
		return NULL;
	}
}

class MyData2 {
	int data;	// 접근제어가 (default)인 인스턴스 변수, 멤버변수는 초기화가 자동
	
	MyData2( int data ) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 인스턴스변수 data의 값이 같으면 true 반환
		
		// d3.equals(d4) 이렇게 equals()를 호출했을때
		// 이 안에서 this는 d3이 되고, obj는 d4
		
		// 형변환을 해줘야한다! 다형성으로 부모클래스 참조변수로 인스턴스를 받음
		// obj만 가지고서는 MyData2의 속성을 접근할 수 없다
		// ( (MyData2)obj ).data;	<<- 다루기 불편하다
		
//		MyData2 data1 = (MyData2)obj;
//		
//		return (this.data == data1.data);
		// 이렇게만 해도 값비교는 됨, 하지만 예외처리가 필요함
		
		// 예외처리는 Exception을 사용하는 것도 예외처리지만, 
		// if문으로 우리가 논리적으로 맞지않는 경우들을 직접 처리하는 것도 예외처리
		if( obj == null ) {
			// 1) obj 참조변수가 가리키는 인스턴스가 없다 ==> 비교대상이 없다
			// 2) 인스턴스가 없는데 형변환시도하는게 문제가 됨
			System.out.println("obj가 가리키는 인스턴스가 없습니다. (null)");
			return false;
		}
		
		if( this == obj ) {
			// 이미 같은 인스턴스이다 --> data3.equals(data3); 이런것과 같음
			System.out.println("같은 객체입니다.");
			return true;
		}
		
		// obj는 모든 클래스의 조상이라 아무거나 다 받을 수 있다
		// 그런 특성 때문에 비교할 대상이 실제 인스턴스가 MyData2가 맞는지 확인
		if( obj instanceof MyData2 ) {	// 맞으면 true
			MyData2 data1 = (MyData2)obj;
			
			return (this.data == data1.data);
		}
		else {	// 아니면(타입이 다르면) 비교할 필요가 없음!
			return false;
		}
		
	}
}