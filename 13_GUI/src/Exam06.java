import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/*
 *  자바의 이벤트 처리
 *  	이벤트 : 어떠한 사건
 *  	이벤트 객체 : 발생한 이벤트에 대한 여러정보를 가진객체
 *  	이벤트 소스 : 이벤트를 발생시킨 컴포넌트(버튼 같은거)
 *  	이벤트 리스터 : 이벤트를 처리하는 객체 
 */

public class Exam06 extends JFrame{
	int width = 300;	// setSize() 를 먼저 안하겠다
	int height = 300;
	
	Exam06() {
		setTitle("Exam06");
		
		// 화면 정가운데에 창 띄우기!
		Dimension screen = new Dimension();
		screen = Toolkit.getDefaultToolkit().getScreenSize();
		// screen 변수를 사용하지 않고, getScreenSize()를 사용할 수 있지만,
		// 화면의 크기를 여러번 구하는 행위는 비효율 적이다! (변수에 저장해놓고 사용)
		int xPos = (screen.width/2) - (this.width/2);
		int yPos = (screen.height/2) - (this.height/2);
		setBounds(xPos,yPos,this.width,this.height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setBounds(50, 150, 100, 100);
		con.add(textField);
		
		
		JButton btn = new JButton("버튼");
		btn.setBounds(50,50,100,100);
		
		// 이벤트 처리를 위한 리스너 시작
		
		// 클래스 내부의 클래스 = 내부 클래스
		// 이름이 없는 내부클래스 = 익명 클래스
		// 이 클래스는 이때만 사용할 수 있는 코드구혀
		
		btn.addMouseListener( new MouseListener() {
			// MouseListener는 인터페이스이다!
			// 인터페이스는 추상메서드를 구현해야 한다
			@Override
			public void mouseReleased(MouseEvent e) {
				// 마우스 버튼이 눌렸다가 놓았을 때
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// 마우스 버튼이 눌렸을 때
			}
			public void mouseExited(MouseEvent e) {
				// 마우스 커서가 버튼에서 나왔을 때
				JButton b = (JButton)e.getSource();
				
				b.setBackground(Color.red);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// 마우스 커서가 버튼에 올라왔을 때
				JButton b = (JButton)e.getSource();		// 어떤 컴포넌트인지 get!
				// 이 때의 b 인스턴스는 마우스 이벤트가 발생한 위의 btn이 된다
				
				b.setBackground(Color.gray);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// 마우스클릭 (눌렀다가 놓음)
				JButton b = (JButton)e.getSource();
				JOptionPane.showMessageDialog(b, "클릭됨");
				
				// 버튼에 써져있는 문자열은 "버튼"
				if (b.getText().equals("버튼")) {
				b.setText("button");
				}
				else {
					b.setText("버튼");
				}
				
				String text = textField.getText();
				System.out.println(text);
				textField.setText("");
			}
		});
		
		
		
		// 컨테이너에 
		con.add(btn);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Exam06();
	}

}
