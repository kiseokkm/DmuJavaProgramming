package dy0531;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx3 {

	//db 연결 코드 ( insert in to ~ 원래 db sampledb 테이블에 홍길동 추가했음) try catch 문으로 실행되면
	// db 연결 완료 , sql 실행완료  ,    catch문으로 실행이 안되면 db 연결 에러 라고 나옴 .
	// inId 로 사용자를 입력받고 insert into 에다가 사람이름대신 변수를 넣음 . ( inId , inName , inDept )
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","dongyang");
			System.out.println("db 연결 완료~");
			String inId = "2020103", inName = "동미래" , inDept ="컴퓨터" ;
			//방식2  , 사용자한테 입력받음 , ?로 , 
			String sql = "insert into studenttbl(id,name,dept) values (?,?,?);";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inId); // 1번 ?
			pstmt.setString(2, inName);
			pstmt.setString(3, inDept);
			pstmt.executeUpdate();
			
			
			
	
			

			System.out.println("sql 실행완료");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db연결 에러");
			e.printStackTrace();
		}

	}

}
