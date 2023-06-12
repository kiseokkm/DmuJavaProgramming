package dy0607;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public static Connection dbConnection() {
		Connection conn;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC&characterEncoding=utf-8","root","dongyang");
			System.out.println("db연결 성공");
			return conn;
		} catch(ClassNotFoundException| SQLException e) {
			e.printStackTrace();
			System.out.println("db class or sql error~");
			return null;
		}
	}

}
//mydb에 testtbl 만들음.
