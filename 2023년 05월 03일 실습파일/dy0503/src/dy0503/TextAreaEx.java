package dy0503;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {
	public TextAreaEx() {
		// TODO Auto-generated constructor stub
	
	
	
	
	this.setTitle("레이블 예제");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container con = this.getContentPane();
	con.setLayout(new FlowLayout());
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7,20);
	JLabel lb = new JLabel("입력 후 <enter>키를 입력하시오.");
	
	con.add(lb);
	con.add(tf);
	con.add(new JScrollPane(ta));
	tf.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ta.append(tf.getText()+"\n");
			tf.setText("");
			
		}
	});
	
	
	
	
	
	this.setSize(350,300);
	this.setVisible(true);
	}
}
