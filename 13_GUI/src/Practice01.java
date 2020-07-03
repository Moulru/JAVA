import java.awt.*;
import javax.swing.*;

public class Practice01 extends JFrame{

	Practice01() {
		setTitle("Practice04");
		setBounds(500, 500, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(null);
		con.setBackground(Color.WHITE);
		
		for(int i=1;i<=20;i++) {
			JLabel label = new JLabel();
			int r1 = (int)(Math.random() * 450)+15;
			int r2 = (int)(Math.random() * 450)+15;
			label.setBounds(r1, r2, 15, 15);
			label.setText(i+"");
			label.setBackground(Color.black);
			con.add(label);
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		/*
		 * 	500×500 프레임에 20개의 JLabel 붙이기
		 * 		- 크기 : 15x15
		 * 		- 위치 : 랜덤 (컨테이너 영역 벗어나지 않게)
		 * 		- 배경 : 검은색
		 * 		- 글씨 : 흰색
		 * 		- text : 1~20
		 * 
		 */

		new Practice01();
	}
}
