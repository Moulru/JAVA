
public class Practice06 {

	public static void main(String[] args) {
		/*
		 * 		Animal06클래스
		 * 			cry()	: "동물이 운다" 라고 출력
		 * 			move()	: "동물이 움직인다" 라고 출력
		 * 
		 *  	Dog06 클래스
		 *  		cry()	: "멍멍멍"
		 *  		move()	: "펄쩍펄쩍"
		 *  
		 *  	Cat06 클래스
		 *  		cry()	: "야옹야옹"
		 *  		move()	: "살금살금"
		 *  
		 *  각 클래스들을 구현하고, main()메서드에서 
		 *  강아지와 고양이의 인스턴스를 2개씩 생성한 뒤,
		 *  다형성을 이용하여 cry(), move() 출력하기
		 *  	-> for문으로 처리
		 */

		Dog06 d1 = new Dog06();
		Dog06 d2 = new Dog06();
		
		Cat06 c1 = new Cat06();
		Cat06 c2 = new Cat06();
		
		Animal06[] aa = { d1,d2, c1,c2 };
		
		for(int i=0; i<aa.length; i++) {
			aa[i].cry();
			aa[i].move();
		}
		
	}

}

class Animal06 {
	void cry() {
		System.out.println("동물이 운다");
	}
	
	void move() {
		System.out.println("동물이 움직인다");
	}
}

class Dog06 extends Animal06 {
	
	@Override
	void cry() {
		System.out.println("멍멍멍");
	}
	
	@Override
	void move() {
		System.out.println("펄쩍펄쩍");
	}
	
}

class Cat06 extends Animal06 {
	
	@Override
	void cry() {
		System.out.println("야옹야옹");
	}
	
	@Override
	void move() {
		System.out.println("살금살금");
	}
	
}
