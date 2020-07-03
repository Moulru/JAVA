public class Exam08 { // extends Object �� �����Ǿ� �ִ�!
	public static void main(String[] args) {
		/*
		 * 	Object Ŭ���� --> ���Ŭ������ ���� (�ڵ� ���)
		 * 		toString() �������̵�
		 * 			> Ŭ������@��ü�ּҰ� �� ��ȯ�Ѵ�.
		 * 
		 * 			> �Ϲ������� �ν��Ͻ��� ������
		 * 			  ���ڿ��� �������ִ� �뵵�� �������̵�
		 * 				(�����ִ� ����)
		 */
		
		Exam08 ex = new Exam08();
		System.out.println(ex.toString());
		
//		���������� �׳� ����ϸ� toString() ����� ����.
//		-> �ڵ����� toString() �޼��尡 ȣ��ȴ�.
		System.out.println(ex);

		System.out.println("=============================");
		
		// �����ڿ� �� �־�� ��
		Person08 han = new Person08("�Ѽ�â", 20);
		// ���� �̸��� ����, �� �ν��Ͻ� ����� ���� ���!
		// toString() �������̵��ؼ� ������������ ������ �������
		System.out.println(han);
		
	} // main() ��
	
	// ��� ���� Ŭ����(�θ�Ŭ����)�� �޼��带 �������̵��ϴ¹�
	// �������̵��� �޼��� �̸� �Ϻθ� ���� Ctrl + Space
	// Override ��� �Ǿ��ִ� ���� ���� -> �ڵ��ϼ�
	
	@Override
	public String toString() {
//		�������̵��ϸ� �θ�Ŭ������ ���ǵ� �޼���� ���õȴ�.
		System.out.println("�������̵���");
		return super.toString();
	}
	
} // class Exam08 ��

class Person08 {
	private String 	name; // �ܺ� ���� �Ұ� + �ν��Ͻ�����
	private int 	age;
	
//	������ -> �ν��Ͻ� ���� �� String,int ���� �����ؾ� ��������
	Person08( String name, int age ) {
		this.name = name; // �������� ������ ��������� ���
		this.age = age;
	}
	
	@Override
	public String toString() {
//		return super.toString();
//		toString()�� �������̵��� ������ ����.
//		���� ������� �� �ν��Ͻ��� ������ ǥ���� ������ ��ȯ
		return "�̸� : " + name + ", ���� : " + age + "��";
	}
}





