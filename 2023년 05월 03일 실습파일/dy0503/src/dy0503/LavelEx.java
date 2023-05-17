package dy0503;


import javax.swing.*;
import java.awt.*;
public class LavelEx extends JFrame {
	public LavelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("사랑합니다.");
		ImageIcon beauty = new ImageIcon("images/abc.jpg");
		JLabel imageLabel = new JLabel(beauty);
		c.add(textLabel);
		c.add(imageLabel);
		setSize(400,600);
		setVisible(true);
	}
}