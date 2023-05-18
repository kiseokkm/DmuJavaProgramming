package dy0510;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class SliderChangeEx extends JFrame {
	
	
	private JLabel colorLabel;
	private JSlider [] sl1 = new JSlider [3];
	int r,g,b;
	public SliderChangeEx() {
	setTitle("슬라이더와 ChangeEvent 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	colorLabel = new JLabel(" SLIDER EXAMPLE ");
	
	for(int i=0; i<sl1.length; i++) {
	sl1[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
	sl1[i].setPaintLabels(true);
	sl1[i].setPaintTicks(true);
	sl1[i].setPaintTrack(true);
	sl1[i].setMajorTickSpacing(50);
	sl1[i].setMinorTickSpacing(10);
	
	c.add(sl1[i]);
	}
	sl1[0].setForeground(Color.RED);
	sl1[1].setForeground(Color.GREEN);
	sl1[2].setForeground(Color.BLUE);
	
	 r = sl1[0].getValue();
	 g = sl1[1].getValue();
	 b = sl1[2].getValue(); 
	 
	colorLabel.setOpaque(true); 
	colorLabel.setBackground(new Color(r,g,b));
	
	
	
	JButton btn0k = new JButton("확인");
	c.add(btn0k);
	JButton btncancel = new JButton("취소");
	c.add(btncancel);
	btn0k.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			r = sl1[0].getValue();
			g = sl1[1].getValue();
			b = sl1[2].getValue(); 
			
			colorLabel.setBackground(new Color(r,g,b));
			
			
		}
	});
	btncancel.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			sl1[0].setValue(0);
			sl1[1].setValue(0);
			sl1[2].setValue(0);
			r=0; g=0; b=0;
		}
	});
	
	
	
	
	
	colorLabel.setOpaque(true);
	colorLabel.setBackground(new Color(r,g,b));
	c.add(colorLabel);
	setSize(300,230);
	setVisible(true);
	}
	}

