package test1113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyDbConnect {

	public static void main(String[] args) {
		String Driver="com.mysql.cj.jdbc.Driver";
		String Dburl="jdbc:mysql://localhost:3306/javadb?serverTimezone=Asia/Seoul";
		String Dbid="root";
		String Dbpw="1234";
		try {
			Class.forName(Driver);
			Connection con= DriverManager.getConnection(Dburl,Dbid,Dbpw);
			System.out.println("연결되었습니다.");
			String sql="insert into member(id_name, pw_name) values(?,password(?))";
			PreparedStatement pstmt1=con.prepareStatement(sql);
			pstmt1.setString(1,"kim3");
			pstmt1.setString(2, "1234");
			int rowCnt=pstmt1.executeUpdate();
			System.out.println("입력완료");
			
			
			con.close();
		}catch (Exception e) {
			System.out.println(e+"db연결오류");
		}
		
	}

}
