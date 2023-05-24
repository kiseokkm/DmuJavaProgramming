package dy0524;

import java.io.*;
import java.sql.*;
	public class JDBC_Ex2 {
		public static void main (String[] args) {
			Connection conn;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root","dongyang");
				System.out.println("DB 연결 완료");
				stmt = conn.createStatement();
				ResultSet results = stmt.executeQuery("select * from studenttbl");			
			while ( results.next()) {
				System.out.println( results.getString("id")+ results.getString(2)+ results.getString(3));			
			}		
			} catch (ClassNotFoundException e) {
				System.out.println("JDBC 드라이버 로드 에러");
			} catch (SQLException e) {
				System.out.println("SQL 실행 에러");
			}
		}
	}