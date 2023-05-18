package dy0510;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ComboboxEx2 extends JFrame {
		ComboboxEx2(){
			this.setTitle("리스트 만들기 예제");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container con = this.getContentPane();
			con.setLayout(new FlowLayout());
			
			String [] fruits = {"apple","banana","kiwi","mango","pear",
					"peach","berry","strawberry","blackberry"};
			
			JList <String> strList = new JList<String>(fruits);
			con.add(strList);
			
			Integer[] numbers = {100,200,300,400,500,600,700,800,900};
			JList<Integer> intList = new JList<Integer>(numbers);
			con.add(new JScrollPane(intList));
			
			JComboBox<String> strCom = new JComboBox<String>(fruits);
			con.add(strCom);
			
			JComboBox<Integer> intCom = new JComboBox<Integer>();
			for(int i = 0; i<numbers.length; i++) {
				intCom.addItem(numbers[i]);
			}
			for (Integer num:numbers) {
				intCom.addItem(num);
			}
			
			strCom.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String selitem = (String) strCom.getSelectedItem();
					System.out.println(strCom.getSelectedIndex()+""+selitem);
				}
			});
			
			con.add(new JScrollPane(intCom));
			this.setSize(300,300);
			this.setVisible(true);
		}

	}


