package dy0503;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx( ){
		setTitle("라디오 버튼 만들기 에제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryicon = new ImageIcon("images/ch1.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/Ch.jpg");
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton rb_apple = new JRadioButton("사과");
		JRadioButton rb_pear = new JRadioButton("배",true);
		JRadioButton rb_cherry = new JRadioButton("체리",cherryicon);
		
		rb_cherry.setBorderPainted(true);
		rb_cherry.setSelectedIcon(selectedCherryIcon);
		
		g.add(rb_apple);
		g.add(rb_pear);
		g.add(rb_cherry);
		
		c.add(rb_apple);
		c.add(rb_pear);
		c.add(rb_cherry);
		
		setSize(800,500);
		setVisible(true);
		
		
	}

}
