public class Generics { // 제네릭 --> 래퍼클래스 사용이 필요한 문법 (기능)
	public static void main(String[] args) {
		/*
		 *  제네릭 (Generics)		--> 지네릭스
		 *  	- 모든 종류의 타입을 다룰 수 있도록 일반화된 '타입매개변수'로
		 *  		'클래스'나 '메서드'를 선언하는 기법
		 *  	- 클래스 외부에서 (인스턴스를 생성하는 곳) 사용할 타입을 지정하여 사용
		 *  	
		 *  	- 타입매개변수에 쓰이는 문자
		 *  		E : element (요소)
		 *  		T : type
		 *  		K : key		(Map)
		 *  		V : value	(Map)
		 */
		
		// 여기가 클래스 외부
		MyData d = new MyData();
		d.data = 10; // 클래스에서 data 멤버변수를 int로 선언해놨다! -> 무조건int
		
		// 클래스명뒤에 <> 를 적고 타입을 전달   
		MyData2<String> d2 = new MyData2<String>(); //뒤에는 String 안써도됨
		d2.data = "문자열";
		
		// 제네릭에는 기본자료형을 사용할 수 없다!!
		MyData2<Integer> d3 = new MyData2<>();
		d3.data = 20;
		
//		MyData2<int> d4 = new MyData2<>(); // 안 됨
		// 참조형만 사용할 수 있다. --> 클래스
	}
}

class MyData {
	int data;
}

// 제네릭 사용
class MyData2<E> { // E 는 타입매개변수. 다른 문자를 써도 된다.
	E data;
}

// 타입매개변수 : 여러 개 사용 가능. 자료형이 들어갈 위치는 다 들어갈 수 있다.
class MyData3<E, T> {
	private E data1;
	private T data2;
	
	public E getData1() {
		return data1;
	}
	public void setData1(E data1) {
		this.data1 = data1;
	}
	public T getData2() {
		return data2;
	}
	public void setData2(T data2) {
		this.data2 = data2;
	}
}






