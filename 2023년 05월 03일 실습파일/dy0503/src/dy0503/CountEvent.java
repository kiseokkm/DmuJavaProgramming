package dy0503;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CountEvent extends JFrame {
	public CountEvent() {
	
	this.setTitle("숫자 예제");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = this.getContentPane();
	c.setLayout(new FlowLayout());
	JPanel tpanel = new JPanel();
	JPanel mpanel = new JPanel();
	JPanel lpanel = new JPanel();
	JLabel tlabel = new JLabel("입력:");
	JTextField tf = new JTextField(10);
	JLabel mlabel = new JLabel("숫자입력");
	JButton restart = new JButton("다시한번");
	JButton exit = new JButton("종료");
	tpanel.add(tlabel);
	tpanel.add(tf);
	mpanel.add(mlabel);
	lpanel.add(restart);
	lpanel.add(exit);
	
	c.add(tpanel);
	c.add(mpanel);
	c.add(lpanel);
	
	
	
	this.setSize(350,300);
	this.setVisible(true);
}
}
