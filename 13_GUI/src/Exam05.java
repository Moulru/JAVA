import java.awt.*;
import javax.swing.*;

public class Exam05 extends JFrame{
	
	public static void main(String[] args) {
		/*
		 * 	Dimension 클래스
		 * 		> 특정한사각형 영역을 관리하기 편한 클래스
		 * 		> 주로 화면 영역의 정보를 다룰 때 사용
		 */

		new Exam05();
	}
	
	Exam05() {
		setTitle("Exam05()");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screen1 = new Dimension();
		Dimension screen2 = new Dimension();
		
		// 현재 내 PC의 해상도 정보를 구하기
		screen1 = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(screen1);	// toString()이 오버라이딩되어 있다
		System.out.printf("해상도 : %d*%d\n",screen1.width,screen1.height);
		
		screen2 = getSize();		// 위에 있는 setSze의 값이 반환(300,300)
		System.out.println(screen2);
		System.out.printf("우리 프레임의 크기 : %d*%d\n",screen2.width,screen2.height);
		
		// 2개의 정보가 있으면 프레임을 화면 정중앙에 띄울 수 있다
		int xPos = (screen1.width/2) - (screen2.width/2);
		int yPos = (screen1.height/2) - (screen2.height/2);
		
		setLocation(xPos, yPos);	// x,y 좌표로 이동
		// setSize() + setLocation() = setBounds()
		
		setVisible(true);
	}
}