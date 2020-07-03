public class Object_Oriented_Programming2 {
	public static void main(String[] args) {
		/*
		 * [상속]
		 * 		정의 : 기존의 클래스를 '재사용'하여 새로운 클래스를 작성하는 것.
		 * 				기존 클래스의 변수, 메서드를 그대로 물려 받아서 사용
		 * 
		 * 		명칭
		 * 			조상클래스 : 부모클래스(parent), 상위클래스(super), 기반클래스(base)
		 * 			자손클래스 : 자식클래스(child), 하위클래스(sub), 파생클래스(derived)
		 * 
		 * 		- 생성자, 초기화블럭은 상속되지 않는다. 멤버만 상속이 된다.(변수,메서드)
		 * 		- 자식클래스의 멤버 개수는 부모클래스보다 '무조건' 같거나 많다.
		 * 
		 * 		- 클래스 간의 관계
		 * 			상속관계 : ~은(는) ~이다. (is-a)
		 * 			포함관계 : ~은(는) ~을(를) 가지고 있다. (has-a) 
		 * 
		 */
		
		Parent p1 = new Parent(); // 생성자를 만들지 않아서, 기본생성자 호출!
		System.out.println(p1.numOfParent);
		p1.funcOfParent();
		
		Child c1 = new Child();
		System.out.println(c1.numOfParent);
		c1.funcOfParent();
	}
}

// 1. 클래스를 하나 만들었다.
// 3. Child가 나를 상속해서 부모클래스가 됐다.
class Parent {
	int numOfParent = 10; // 인스턴스 변수의 명시적 초기화
	
	void funcOfParent() {
		System.out.println("funcOfParent()");
	}
}

// 2. 새로운 클래스를 만들며 Parent를 상속받았다. --> 자식클래스
class Child extends Parent { // extends --> 확장
//	아무것도 만들지 않았지만 Parent를 상속 받았기 때문에
//	Parent의 멤버들을 사용할 수 있는 클래스이다.
	int numOfChild = 0;
}





