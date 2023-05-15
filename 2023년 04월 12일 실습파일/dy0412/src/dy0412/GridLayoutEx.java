package dy0412;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	ArrayList<Student> stulist = new ArrayList<Student>();

		public GridLayoutEx() {
			setTitle("GridLayout Sample");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			GridLayout grid = new GridLayout(6, 2);
			grid.setVgap(5);
			
			Container c = getContentPane();
			c.setLayout(grid);
			c.add(new JLabel(" 이름"));
			JTextField txtName = new JTextField();
			c.add(txtName);
			c.add(new JLabel(" 학번"));
			JTextField txthb = new JTextField();
			c.add(txthb);
			c.add(new JLabel(" 학과"));
			JTextField txthk = new JTextField();
			c.add(txthk);
			c.add(new JLabel(" 과목"));
			JTextField txtgm = new JTextField();
			c.add(txtgm);
			
			JButton btnok = new JButton("확인");
			c.add(btnok);
			btnok.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String name = txtName.getText();
					String hb = txthb.getText();
					String hk = txthk.getText();
					String gm = txtgm.getText();
					System.out.println(name+hb+hk+gm);
					stulist.add(new Student(name,hb,hk,gm));
				}
			});
			JButton btncancel = new JButton("취소");;
			c.add(btncancel);
			btncancel.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					txtName.setText(""); txthb.setText("");
					txthk.setText(""); txtgm.setText("");
					
				}
			});
			JButton btnJohoi = new JButton("조회");
			c.add(btnJohoi);
			
			btnJohoi.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					for (Student stu : stulist) {
						System.out.println(stu);
					}			
				}
			});
					
			setSize(300, 200);
			setVisible(true);
		}
		
	}


