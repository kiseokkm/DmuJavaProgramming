package dy0329;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	ContentPaneEx(){
		this.setTitle("버튼 추가 학번 이름");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		con.setBackground(Color.blue);
		con.setLayout(new FlowLayout());
		JButton btnok = new JButton("확인");
		con.add(btnok);
		JButton btncance1 = new JButton("취소");
		con.add(btncance1);
		con.add(new JButton("ignore"));
		
		
		
		
		this.setSize(300,150);
		this.setVisible(true);
		
	}

}
