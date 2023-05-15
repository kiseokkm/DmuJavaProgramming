package dy0412;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import dy0412.IndepList.MyActionList;

public class AnonyList extends JFrame{
	AnonyList(){
		this.setTitle("독립 클래스 리스너");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.setBackground(Color.pink);
		JButton btn = new JButton("Action");
		con.add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b =(JButton) e.getSource();
				if (b.getText().equals("Action"))
					b.setText("한글액션");
				else
					b.setText("Action");
				
			}
		});
		
		
		this.setSize(350,150);
		this.setVisible(true);

 }
}
