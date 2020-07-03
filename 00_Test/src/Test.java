import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test extends JFrame {
	protected static int count = 0;
	
	Test() {
		setTitle("FindMine");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con1 = getContentPane();
		con1.setLayout( new GridLayout(10,10) );
		int pers=10;
		int cc = 1;
		
		if (count > 0) {
			for (int i = 0; i < 100; i++) {
				if (Math.random() * pers + 1 > 5) {
					if (count > 0) {
						con1.add(new JButton("".format("%d", (cc))));
						count--;
						pers--;
						cc++;
					} else {
						con1.add(new JButton(""));
						pers--;
					}
				}
				else {
					if(pers==0) {
						pers=10;
					}
					con1.add(new JButton(""));
					pers++;
				}
			}
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Select();
		
	}
}

class Select extends Test {
	
	Select() {
		setTitle("Select Difficult");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout( new GridLayout() );
		
		JButton easy = new JButton();
		easy.setText("EASY");
		easy.setSize(100,100);
		
		ActionListener ea = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Test.count = 10;
				new Test();
			}
		};
		easy.addActionListener(ea);
		
		JButton normal = new JButton();
		normal.setText("NORMAL");
		normal.setSize(100,100);
		ActionListener no = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Test.count = 30;
				new Test();
			}
		};
		normal.addActionListener(no);
		
		JButton hard = new JButton();
		hard.setText("HARD");
		hard.setSize(100,100);
		ActionListener ha = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Test.count = 50;
				new Test();
			}
		};
		hard.addActionListener(ha);
		
		con.add(easy);
		con.add(normal);
		con.add(hard);
		
		setVisible(true);
	}

}