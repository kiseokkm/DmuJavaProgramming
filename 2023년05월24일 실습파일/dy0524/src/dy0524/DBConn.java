package dy0524;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			System.out.println("db연결완료~");
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스 not found 또는 주소 게정 에러~");
			e.printStackTrace();
		}
	}

}
