package dy0510;

import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class CountEvent extends JFrame{
	int rndNum = (int)(Math.random()*100)+1;
	
	
	public CountEvent() {
		System.out.println("정답~~"+rndNum);
		
		setTitle("숫자 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JPanel top_pa = new JPanel();
		JPanel mid_pa = new JPanel();
		JPanel bottom_pa = new JPanel();
		JLabel mid_la = new JLabel("시작");
		
		mid_la.setOpaque(true);
		mid_la.setBackground(Color.YELLOW);
		
		JLabel top_la = new JLabel("숫자 추측 : ");
		top_pa.add(top_la);
		JTextField top_tf = new JTextField(10);
		top_tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int input = Integer.parseInt(top_tf.getText());
				if(input<rndNum) {
					mid_la.setText("숫자가 작습니다");
					mid_la.setBackground(Color.red);
				}
				else if (input == rndNum) {
					mid_la.setText("정답~");
					mid_la.setBackground(Color.green);
				}
				else {
					mid_la.setText("숫자가 큽니다");
					mid_la.setBackground(Color.cyan);
				}
			}
		});
		
		top_pa.add(top_tf);
		c.add(top_pa);
		
		mid_pa.add(mid_la);
		c.add(mid_pa);
		
		JButton btn_re = new JButton("다시 한번");
		JButton btn_end = new JButton("종료");
		bottom_pa.add(btn_re);
		
		bottom_pa.add(btn_end);
		btn_end.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("시스템 종료");
				System.exit(0);
			}
		});
		c.add(bottom_pa);

		setSize(220, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new CountEvent();
	}

}
