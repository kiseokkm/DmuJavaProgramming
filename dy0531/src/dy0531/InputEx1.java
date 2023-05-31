package dy0531;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.mysql.cj.xdevapi.Statement;

public class InputEx1 extends JFrame {
	JButton btnInsert, btnDelete, btnUpdate, btnSelect, btnSearch;
	JTextField tfid, tfName, tfDept, tfSearch;
	JTextArea ta;
	JRadioButton rbId, rbName, rbDept;
	Connection conn;
	java.sql.Statement stmt;
	ResultSet rs;
	public InputEx1() {
		this.setTitle("학생 관리 프로젝트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGUI();
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				dbInsert();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) {
				dbDelete();
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) { 
				dbUpdate();
				}
		});
		btnSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) {
				dbSelect();
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dbSearch();
			}
		});
		this.setSize(280,500);
		this.setVisible(true);
	}
	public void createGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("학번"));
		tfid = new JTextField(20);
		c.add(tfid);
		c.add(new JLabel("이름"));
		
		tfName = new JTextField(20);
		c.add(tfName);
		c.add(new JLabel("학과"));
		tfDept = new JTextField(20);
		c.add(tfDept);
		
		btnInsert = new JButton("입력");
		c.add(btnInsert);
		btnUpdate = new JButton("수정");
		c.add(btnUpdate);
		btnDelete = new JButton("삭제");
		c.add(btnDelete);
		btnSelect = new JButton("조회");
		c.add(btnSelect);
		
	//검색 부분
		tfSearch = new JTextField(18);
		
		rbId = new JRadioButton("학번",true);
		rbName = new JRadioButton("이름");
		rbDept = new JRadioButton("학과");
		ButtonGroup group = new ButtonGroup();
		group.add(rbId);
		group.add(rbName);
		group.add(rbDept);
		
		btnSearch = new JButton("검색");
		JPanel pn1 = new JPanel();
		pn1.add(new JLabel(" "));
		pn1.add(tfSearch);
		pn1.add(btnSearch);
		
		JPanel pn2 = new JPanel();
		pn2.add(rbId);
		pn2.add(rbName);
		pn2.add(rbDept);
		
		JPanel pMiddle = new JPanel(new BorderLayout(0,0));
		pMiddle.add(BorderLayout.NORTH , pn1);
		pMiddle.add(BorderLayout.CENTER , pn2);
		
		TitledBorder tb = new TitledBorder("검색");
		pMiddle.setBorder(tb);
		c.add(pMiddle);
		ta = new JTextArea(15,20);
		c.add(ta);
	};
	//검색부분
	public void dbSearch() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			
			var searchText = tfSearch.getText().toString();
			var searchSql = "";
			
			if (rbId.isSelected()) {
				searchSql = "select * from studenttbl where id = '" + searchText + "';";
			} else if (rbName.isSelected()) {
				searchSql =  " select * from studenttbl where name = '"+ searchText+"';";
			} else {
				searchSql = "select * from studenttbl where dept = '" + searchText +"';";
			}
			rs = stmt.executeQuery(searchSql);
			var line = "";
			
			ta.setText("        id                  name                   dept \n");
			ta.append("----------------------------------------------------------\n");
			while ( rs.next()) {
				var name = rs.getString("name");
				var dept = rs.getString("dept");
				var id = rs.getString("id");
				
				line = " | " + id + " | " + name +  " | " + dept + "\n";
				System.out.println("rs => " + line);
				ta.append(line);
			}
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//조회
	public void dbSelect() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from studenttbl;");
			var line = "";
			/*
			  Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?serverTimezone=UTC","root","dongyang");
			 System.out.println("db 연결 완료");
			 stmt = conn.createStatement();
			 */
			 
			ta.setText("        id                  name                   dept \n");
			ta.append("----------------------------------------------------------\n");
			while ( rs.next()) {
				var name = rs.getString("name");
				var dept = rs.getString("dept");
				var id = rs.getString("id");
				
				line = " | " + id + " | " + name +  " | " + dept + "\n";
				System.out.println("rs => " + line);
				ta.append(line);
			}
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void dbUpdate() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			String in_id = tfid.getText().toString();
			String in_name = tfName.getText().toString();
			String in_dept = tfDept.getText().toString();
			
			stmt.executeUpdate("update studenttbl set dept='" + in_dept+"', name='"+in_name+"' where id = '" +in_id +"'");
			System.out.println(in_name+"수정 완료");
			tfid.setText("");
			tfName.setText("");
			tfDept.setText("");
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("수정 에러");
		}
	}
	public void dbInsert() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			String in_id = tfid.getText().toString();
			String in_name = tfName.getText().toString();
			String in_dept = tfDept.getText().toString();
			
			stmt.executeUpdate("INSERT INTO studenttbl (id, name, dept) VALUES ('" + in_id + "', '" + in_name + "', '" + in_dept + "')");
			System.out.println(in_name + " 추가 완료");
			tfid.setText("");
			tfName.setText("");
			tfDept.setText("");
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("추가 에러");
		}
	}

	public void dbDelete() {
		try {
			conn = DBConn.dbConnection();
			stmt = conn.createStatement();
			String delete_id = tfid.getText().toString();
			
			stmt.executeUpdate("DELETE FROM studenttbl WHERE id = '" + delete_id + "'");
			System.out.println(delete_id + " 삭제 완료");
			tfid.setText("");
			tfName.setText("");
			tfDept.setText("");
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("삭제 에러");
		}
	}
}
	
	
	
	
	
	
	

