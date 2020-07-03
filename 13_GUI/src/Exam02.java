import java.awt.*;
import javax.swing.*;

public class Exam02 extends JFrame {

	Exam02() {
		setTitle("Exam02");
		setSize(300,300);
		setLocation(300,300);
	}
	
	public static void main(String[] args) {

		Exam02 frame = new Exam02();
		
		// 프레임에 연결된 컨텐트팬을 구해온다(컨테이너)
		Container con = frame.getContentPane();
		con.setLayout(null);
		// layout : 어떻게 항목을 채울 것인가
		
		JButton btn1 = new JButton();	// 버튼 인스턴스 생성
		btn1.setText("버튼1");
		btn1.setSize(100,20);			// 버튼의 크기 설정
		btn1.setLocation(50, 50);		// 버튼의 위치 설정
		con.add(btn1);
		
		JButton btn2 = new JButton("버튼2");	// 버튼 인스턴스 생성
		btn2.setSize(100,20);			// 버튼의 크기 설정
		btn2.setLocation(50, 100);		// 버튼의 위치 설정
		con.add(btn2);
		
		// 글씨를 입력하는 텍스트필드 (ID, PW 입력 칸 같은 것)
		JTextField text = new JTextField();
		text.setSize(100,20);
		text.setLocation(50,150);
		con.add(text);
		
		// 화면에 보여지는 것은 가급적 마지막에!
		frame.setVisible(true);
		
		// 프레임을 닫는다 = 화면에 보여지지 않는다 (프로그램은 아직 실행 중)
		// 아래 메서드를 호출해줘야 프레임을 닫았을 때 프로그램이 종료되도록 설정
		// main()이 끝났는데 이걸 해줘야 프로그램이 종료된다 = 프레임 생성 시 쓰레드가 새로 생성된다
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );		// 프로그램을 닫을때 프로그램도 종료되는 메서드
		
	}
}

// 프레임을 다룰 때 필수 요소!
// setVisible(true) : 화면에 보임
// setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) : 프레임을 닫으면 프로그램도 종료