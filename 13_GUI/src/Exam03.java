import java.awt.*;
import javax.swing.*;

/*
 * 	배치관리자
 * 		컴포넌트를 배치하는 유형들
 * 
 * 		FlowLayout
 * 			순서대로 왼쪽 -> 오른쪽, 공간이 없으면 아래로 내려가서 다시 배치
 * 		BorderLayout
 * 			동,서,남,북,중앙 5개의 영역에 배치 / add 할 때 반드시 영역 지정을 해줘야 함
 * 		GridLayout
 * 			2차원 그리드 (2차원 배열 모양)
 * 			좌->우 , 위->아래 순서로 배치
 * 			컨테이너를 정확하게 그리드로 나눈다
 * 		CardLayout
 * 			카드 쌓듯이 포개어서 배치
 * 
 * 	배치관리자를 지정하지 않았을때 default로 설정되는 배치관리자
 * 		JFrame, JDialog, JWindow : BorderLayout
 * 		JPanel, JApplet : FlowLayout
 * 
 */
public class Exam03 {
	public static void main(String[] args) {
		new FlowTest();		// 참조변수를 사용하지 않고 인스턴스를 생성했다!
		// --> 참조변수를 다루지 않겠다. 생성했을 때 모든 코드를 다 수행!
		new BorderTest();
		new GridTest();
	}
}

class FlowTest extends JFrame {
	FlowTest() {	// GUI 다루는 코드들을 생성자에 모두 넣기
		setTitle("Exam03 - FlowTest");
//				   x ,  y ,  w ,  h			(w = 길이 , h = 높이)
		setBounds(100, 100, 500, 500);	// setSize , setLocation 을 합쳐 놓은 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setBackground( Color.orange );		// Color클래스의 ORANGE 가져다씀
		
		// FlowLayout 배치관리자
		con.setLayout( new FlowLayout() );
		/*
		 * 	생성자에 들어갈 수 있는 값
		 * 		new FlowLayout( int align, int hGap, int vGap )
		 * 			align : 컴포넌트가 정렬되는 기준
		 * 				FlowLayout.LEFT
		 * 				FlowLayout.RIGHT
		 * 				FlowLayout.CENTER (default)
		 * 			hGap : 좌우 두 컴포넌트 사이의 간격(픽셀) , default = 5
		 * 			vGap : 상하 두 컴포넌트 사이의 간격(픽셀) , default = 5
		 */
		
		for( int i=0; i<10; i++ ) {
			con.add( new JButton("".format( "%d", (i+1) )) );
		}
		
		// 프레임에 할 일들을 다 마치고 화면에 보여준다
		setVisible(true);
	}
}

class BorderTest extends JFrame {
	BorderTest() {	// GUI 다루는 코드들을 생성자에 모두 넣기
		setTitle("Exam03 - BorderTest");
//				   x ,  y ,  w ,  h			(w = 길이 , h = 높이)
		setBounds(200, 200, 500, 500);	// setSize , setLocation 을 합쳐 놓은 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setBackground( Color.green );		// Color클래스의 green 가져다씀
		
		// BorderLayout 배치관리자
		con.setLayout( new BorderLayout(10,10) );
		/*
		 * 	생성자에 들어갈 수 있는 값
		 * 		new BorderLayout( int hGap, int vGap )
		 * 			hGap : 좌우 두 컴포넌트 사이의 간격(픽셀) , default = 0
		 * 			vGap : 상하 두 컴포넌트 사이의 간격(픽셀) , default = 0
		 */
		
		// 컴포넌트가 배치할 영역을 지정해야한다
		con.add( new JButton("중앙"), BorderLayout.CENTER );
		con.add( new JButton("동"), BorderLayout.EAST );
		con.add( new JButton("서"), BorderLayout.WEST );
		con.add( new JButton("남"), BorderLayout.SOUTH );
		con.add( new JButton("북"), BorderLayout.NORTH );
		
		// 프레임에 할 일들을 다 마치고 화면에 보여준다
		setVisible(true);
	}
}

class GridTest extends JFrame {
	GridTest() {	// GUI 다루는 코드들을 생성자에 모두 넣기
		setTitle("Exam03 - GridTest");
//				   x ,  y ,  w ,  h			(w = 길이 , h = 높이)
		setBounds(300, 300, 500, 500);	// setSize , setLocation 을 합쳐 놓은 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setBackground( Color.orange );		// Color클래스의 ORANGE 가져다씀
		
		// FlowLayout 배치관리자
		con.setLayout( new GridLayout() );
		/*
		 * 	생성자에 들어갈 수 있는 값
		 * 		new GridLayout( int rows, int cols, int hGap, int vGap )
		 * 			rows : 행의 개수 , default = 1
		 * 			cols : 열의 개수 , default = 1
		 * 			hGap : 좌우 두 컴포넌트 사이의 간격(픽셀) , default = 0
		 * 			vGap : 상하 두 컴포넌트 사이의 간격(픽셀) , default = 0
		 */
		
		// 정해진 그리드의 칸보다 더 많은 컴포넌트가 추가되면, 적당히 알아서 배치된다!
		for( int i=0; i<10; i++ ) {
			con.add( new JButton("".format( "%d", (i+1) )) );
		}
		
		// 프레임에 할 일들을 다 마치고 화면에 보여준다
		setVisible(true);
	}
}