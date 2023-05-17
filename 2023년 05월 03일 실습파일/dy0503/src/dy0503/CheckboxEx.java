package dy0503;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckboxEx extends JFrame {
	public CheckboxEx() {
		this.setTitle("레이블 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		
		JPanel pan = new JPanel();
		JCheckBox cb_apple = new JCheckBox("사과");
		pan.add(cb_apple);
		
		JCheckBox cb_bae = new JCheckBox("배",true);
		ImageIcon cherryIcon = new ImageIcon("images/ch1.jpg");
		
		JCheckBox cb_cherry = new JCheckBox("체리",cherryIcon);
		cb_cherry.setBorderPainted(true);
		ImageIcon selCherryiIcon = new ImageIcon("images/ch.jpg");
		cb_cherry.setSelectedIcon(selCherryiIcon);
		
		pan.add(cb_bae);
		pan.add(cb_cherry);
		
		cb_apple.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				// TODO Auto-generated method stub
				System.out.println("사과를선택/비선택 체크함 .");
				if(cb_apple.isSelected() == true)
					System.out.println("사과가 선택됨");
				else
					System.out.println("사과가 선택 안돔");
			}
		});
		
		cb_bae.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				// TODO Auto-generated method stub
				System.out.println("배를 선택/비선택 체크함 .");
				if(cb_bae.isSelected() == true)
					System.out.println("배가 선택 됨");
				else
					System.out.println("배가 선택 안됨");
			}
		});
		
		cb_cherry.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				// TODO Auto-generated method stub
				System.out.println("체리를 선택/비선택 체크함.");
				if(cb_cherry.isSelected() == true)
					System.out.println("체리가 선택 됨");
				else
					System.out.println("체리가 선택 안돔");
			}
		});
		
		con.add(pan);
		this.setSize(800,500);
		setVisible(true);
		
		
	}

}
