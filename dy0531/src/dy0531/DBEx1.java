package dy0531;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx1 {

	//db 연결 코드 ( insert in to ~ 원래 db sampledb 테이블에 홍길동 추가했음) try catch 문으로 실행되면
	// db 연결 완료 , sql 실행완료  ,    catch문으로 실행이 안되면 db 연결 에러 라고 나옴 .
	//이 파일은 사용자로부터 입력 받지 않고 , 정적인 값 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","dongyang");
			System.out.println("db 연결 완료~");
			Statement stmt = conn.createStatement();
			String sql = "insert into studenttbl(id,name,dept) values ('2020101','홍길동','컴퓨터');";
			stmt.executeUpdate(sql);
			System.out.println("sql 실행완료");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db연결 에러");
			e.printStackTrace();
		}

	}

}
