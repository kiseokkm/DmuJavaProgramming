package dy0510;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame {
	
	public ListEx() {
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
		
		this.setSize(300,300);
		this.setVisible(true);
	}

}
