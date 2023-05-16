package dy0419;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//설계도
public class JpanelTest extends JFrame {
	//생성자
	JpanelTest(){
		this.setTitle("판넬예제 학번 이름");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane(); //기본 borderlayout (셤문제)
		
		JPanel pan = new JPanel(); // flowlayout =기본레이아웃(셤문제)
		pan.add(new JLabel("아이스크림 좋아하나요?"));
		
		
		JButton BTNYES = new JButton("yes");
		JButton BTNNo = new JButton("no");
		pan.add(BTNYES);
		pan.add(BTNNo);
		con.add(pan);
		
		BTNYES.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("yes"))
					b.setText("네 ,아이크스림을좋아합니다");
				
			}
		});
		BTNNo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b1 = (JButton)e.getSource();
				if(b1.getText().equals("no"))
					b1.setText("아니오 ,아이스크림을 싫어합니다");
			}
		});
		
		this.setSize(350,150);
		this.setVisible(true);
	}
	
}
