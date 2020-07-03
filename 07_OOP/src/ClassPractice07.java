public class ClassPractice07 {
	public static void main(String[] args) {
		/*
		 * 	원 클래스 Circle07
		 * 		원의 둘레 : 반지름 * 2 * 3.14 (Circumference)
		 * 		원의 넓이 : 반지름 * 반지름 * 3.14 (Area)
		 * 			반지름 = radius
		 * 
		 * 		getCircum() : 원의 둘레 반환
		 * 		getArea() 	: 원의 넓이 반환
		 * 		printInfo() : 원의 둘레와 넓이 '출력'
		 * 						> 소수점 1자리 까지
		 * 			* 몇 번째로 생성된 원인지 정보까지 출력
		 */
		Circle circle1 = new Circle(true, 5); // 5는 반지름
		Circle circle2 = new Circle(false, 8); // 8은 지름
		Circle circle3 = new Circle(7); // 7은 반지름

		circle3.printInfo();
//		[3번 원의 정보 출력]
//		둘레 : 44.0
//		넓이 : 153.9
		circle1.printInfo();
//		[1번 원의 정보 출력]
//		둘레 : 31.4
//		넓이 : 78.5
		circle2.printInfo();
//		[2번 원의 정보 출력]
//		둘레 : 25.1
//		넓이 : 50.2
		
	}
}

class Circle {
	float radius;
	int snum = 0;
	static int count = 1;
	
	Circle(boolean isRadius,int num) {
		if(isRadius == true) {
			this.radius = (float)num;
		}
		else {
			this.radius = (float)num / 2;
		}

		this.snum = count++;
	}
	
	Circle(int num) {
		this(true, num);
	}
	
	float getCircum() {
		return (float)(radius * 2 * 3.14);
	}
	float getArea() {
		return (float)(radius * radius * 3.14);
	}
	void printInfo() {
		System.out.printf("[%d번 원의 정보 출력]\n",snum);
		System.out.printf("둘레 : %.1f\n",getCircum());
		System.out.printf("넓이 : %.1f\n",getArea());
		System.out.println();		// 개행
	}
}