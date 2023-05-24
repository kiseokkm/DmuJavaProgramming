package dy0524;

import java.io.*;
import java.sql.*;
	public class JDBC_Ex3 {
		public static void main (String[] args) {
			Connection conn;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root","dongyang");
				System.out.println("DB 연결 완료");
				stmt = conn.createStatement();
				stmt.executeUpdate("insert into studenttbl values('21007','아무개','경영학과');");
				stmt.executeUpdate("insert into studenttbl values('21008','리사','스포츠학과');");
				stmt.executeUpdate("update studenttbl set name = '제임스본드', where id = '21007'" );
				stmt.executeUpdate("delete from student where name='제임스본드'");
				
				
			} catch (ClassNotFoundException e) {
				System.out.println("JDBC 드라이버 로드 에러");
			} catch (SQLException e) {
				System.out.println("SQL 실행 에러");
			}
		}
	}