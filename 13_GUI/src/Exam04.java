import java.awt.*;
import javax.swing.*;

public class Exam04 extends JFrame{
	Exam04() {
		setTitle("Exam04");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(null);		// 배치관리자 없이 하겠다
		// 배치관리자가 없으면 각 컴포넌트들의 크기와 위치를 지정해줘야 나타난다!
		
		con.setBackground( Color.WHITE );	// 기본 배경색 변경 (default : 회색)
		
		JLabel label1 = new JLabel();
		label1.setBounds(10,10,70,15);		// (x좌표,y좌표,너비,높이)
		label1.setText("안녕하세요");
		con.add(label1);
		
		// 컴포넌틍 써지는 글씨는 생성자에서 처리가능!
		JLabel label2 = new JLabel("반갑습니다.");
		label2.setBounds(10,30,70,15);
		
		// 글씨의 배경색 변경
		label2.setOpaque(true);		// 배경을 칠하겠다!
		label2.setBackground( Color.black );
//		label2.setForeground( Color.white );
//		Color 클래스로 색을 지정할 때 RGB 값으로 지정 가능!!
		label2.setForeground( new Color(255,255,255) );
		
		con.add(label2);
		
		
		// 화면에 보이기
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam04();	// 프레임을 만들겠다!

		
	}
}
