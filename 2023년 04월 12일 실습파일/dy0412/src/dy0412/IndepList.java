package dy0412;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepList extends JFrame {
	IndepList(){
		this.setTitle("독립 클래스 리스너");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.setBackground(Color.yellow);
		JButton btn = new JButton("Action");
		con.add(btn);
		MyActionList lis = new MyActionList();
		
		btn.addActionListener(lis);
		this.setSize(350,150);
		this.setVisible(true);
	}
	
class MyActionList implements ActionListener{

	@Override
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
