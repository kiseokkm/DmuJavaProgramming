package dy0412;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import dy0412.IndepList.MyActionList;

public class TwoButton extends JFrame{
	TwoButton(){
		this.setTitle("버튼 엑션이벤트 리스너 2방법");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.setBackground(Color.blue);
		JButton btn = new JButton("확인");
		JButton btn1 = new JButton("취소");
		con.add(btn);
		con.add(btn1);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("확인 버튼을 클릭함");
			}
		
		});
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("취소 버튼을 클릭함");
			}
		
		});
		
		
		
		this.setSize(350,150);
		this.setVisible(true);

 }
}
