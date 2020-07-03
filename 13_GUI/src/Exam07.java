import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam07 extends JFrame{

	Exam07(String title) {
		
		super(title);	// JFrame의 생성자 호출!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,300,500,500);
		
		Container con = getContentPane();
		con.setLayout(null);
		
		JButton btn = new JButton("구매하기");
		btn.setBounds(50,50,100,50);
		con.add(btn);
		
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String strMoney = JOptionPane.showInputDialog( btn , "장바구니 금액 입력");
				
//				System.out.println(strMoney);
				
				int iMoney = Integer.parseInt( strMoney );
				int iPay = 0;
				
				if( iMoney>=10000 ) {
					iPay = (int)(iMoney*0.8);		// 20% 할인
				}
				else if( iMoney>=50000 ) {
					iPay = (int)(iMoney*0.9);		// 10% 할인
				}
				else if( iMoney>=10000 ) {
					iPay = (int)(iMoney*0.95);		// 5% 할인
				}
				
				String msg = "".format("장바구니금액 : %d원\n최종 결제액 : %d", iMoney,iPay);
				
				JOptionPane.showMessageDialog(btn, msg);
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam07("Exam07");
	}

}
