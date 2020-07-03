import javax.swing.JFrame;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 	Swing으로 GUI 만들기!
		 * 		> 프레임(Frame)	= 하나의 창(Window)
		 * 		> 프레임이 있어야 화면이 출력된다
		 * 			JFrame 클래스
		 * 				Frame (창의 전체 영역)
		 * 				MenuBar (메뉴가 부착)
		 * 				ContentPane (패널)
		 * 					>메뉴를 제외한 모든 컴퓨넌트가 부착
		 * 
		 */

		// 1) 직접 JFrame 인스턴스를 생성
		JFrame frame = new JFrame();
		frame.setTitle("Exam01");
		frame.setSize(300, 300);		// 폭300, 높이300 크기로 설정
		frame.setLocation(300, 300);	// 현재 내 화면에서 300,300위치로 창을 띄운다
		frame.setVisible(true);		// 화면에 보이도록 설정하겠다
		
		// 2) JFrame을 상속받는 인스턴스 생성
		//	  생성자에 기본 코드들을 넣어놓으면 편하다!
		MyFrame myframe = new MyFrame();
	}

}

// JFrame을 상속 받았다! -> 인스턴스를 만들면 프레임이 생성된다 
class MyFrame extends JFrame {
	MyFrame() {
		setTitle("Exam01 - MyFrame");
		setSize(300, 300);		// 폭300, 높이300 크기로 설정
		setLocation(300, 300);	// 현재 내 화면에서 300,300위치로 창을 띄운다
		setVisible(true);		// 화면에 보이도록 설정하겠다
	}
}
