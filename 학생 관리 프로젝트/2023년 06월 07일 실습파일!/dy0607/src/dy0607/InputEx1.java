package dy0607;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class InputEx1 extends JFrame{
	JButton       btnInsert, btnSelect, btnSearch;
	JTextField    tfId, tfName, tfDept, tfSearch;
	JTextArea     ta;
	JRadioButton  rbId, rbName, rbDept;
	Connection    conn;
	Statement     stmt;   
	ResultSet     rs;
	PreparedStatement pstmt;
	//생성자 
	public InputEx1() {
		this.setTitle("학생 관리 프로젝트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGUI();
		btnInsert.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbInsert();
			}
		});		
		btnSelect.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbSelect();
			}
		});
		btnSearch.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbSearch();
			}
		});
		
		this.setSize(300,550);
		this.setVisible(true);
	}
	//화면구현
	public void createGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		//학번 학과 이름 입력버튼, 조회버튼 
		c.add(new JLabel("학번"));
		tfId = new JTextField(20);
		c.add(tfId);		
		c.add(new JLabel("학과"));
		tfDept = new JTextField(20);
		c.add(tfDept);
		c.add(new JLabel("이름"));
		tfName = new JTextField(20);
		c.add(tfName);
		btnInsert = new JButton("입력");
		c.add(btnInsert);
		btnSelect = new JButton("조회");
		c.add(btnSelect);
		
		// 검색부분
		tfSearch = new JTextField(18);
		rbId     = new JRadioButton("학번",true);
		rbName   = new JRadioButton("이름");
		rbDept   = new JRadioButton("학과");
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
		pMiddle.add(BorderLayout.NORTH,pn1);
		pMiddle.add(BorderLayout.CENTER,pn2);
		TitledBorder tb = new TitledBorder("검색");
		pMiddle.setBorder(tb);
		c.add(pMiddle);		
		//
		ta = new JTextArea(15,20);
		c.add(ta);
	}


	public void dbInsert() {
		//입력
		conn = DBConn.dbConnection();
		String sql = "insert into testtbl values( ? , ? , ? );";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			String id = tfId.getText();
			String name = tfName.getText();
			String dept = tfDept.getText();
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, dept);
			
			
			pstmt.executeUpdate();
			System.out.println("입력완료 ~"+ id+name+dept);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void dbSelect() {
	    // 조회
	    conn = DBConn.dbConnection();
	    try {
	        stmt = conn.createStatement();
	        String sql = "select * from testtbl;";
	        rs = stmt.executeQuery(sql); // rs 변수 초기화
	        
	        ta.setText(" ");
	        while (rs.next()) {
	            String id = rs.getString("id");
	            String name = rs.getString("name");
	            String dept = rs.getString("dept");
	            ta.append(id + "\t" + name + " " + dept + "\n");
	        }
	        System.out.println("조회완료 ~");

	        rs.close(); // 결과 집합(rs) 닫기
	        stmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	public void dbSearch() {
	    // 조회
	    conn = DBConn.dbConnection();
	    String searchValue = tfSearch.getText();
	    String selectedOption = "";
	    
	    if (rbId.isSelected()) {
	        selectedOption = "id";
	    } else if (rbName.isSelected()) {
	        selectedOption = "name";
	    } else if (rbDept.isSelected()) {
	        selectedOption = "dept";
	    }
	    
	    String sql = "SELECT * FROM testtbl WHERE " + selectedOption + " = ?;";
	    
	    try {
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, searchValue);
	        
	        ResultSet rs = pstmt.executeQuery();
	        ta.setText(""); // 이전 결과를 지우고 새로운 결과 출력
	        
	        while (rs.next()) {
	            String id = rs.getString("id");
	            String name = rs.getString("name");
	            String dept = rs.getString("dept");
	            ta.append(id + ", " + name + ", " + dept + "\n");
	        }
	        
	        rs.close(); // ResultSet 닫기
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            pstmt.close(); // PreparedStatement 닫기
	            conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

		
		
	}
	

