package dy0412;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import dy0412.IndepList.MyActionList;

public class InnerList extends JFrame {
	
	InnerList(){
		this.setTitle("독립 클래스 리스너");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.setBackground(Color.GREEN);
		JButton btn = new JButton("Action");
		con.add(btn);
		MyActonListener lis = new MyActonListener();
	
		btn.addActionListener(lis);
		this.setSize(350,150);
		this.setVisible(true);
 }
	
	//클래스 myactionlistener 이너클래스
	class MyActonListener implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭됨~~");
				System.out.println(e);
				JButton b = (JButton) e.getSource();
				if ( b.getText().equals("Action"))
					b.setText("한글액션");
				else
					b.setText("Action");
		}
		
	}
}
