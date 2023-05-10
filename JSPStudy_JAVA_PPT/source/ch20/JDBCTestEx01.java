package ch20;
// 주의 java.sql.* 인걸로 import 해야 정상동작함
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTestEx01 {

	public static Connection makeConnection(){ 
		String url = "jdbc:mysql://localhost/myjava";
		String id = "root"; 
		String password ="1111"; 
		Connection con = null; 

		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			System.out.println("드라이버 찾았어~~ ^^");

			con = DriverManager.getConnection(url, id, password); 
			System.out.println("DBMS연결에 성공하였어~~ ^^");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 못 찾았어요~~ ㅠㅠ");
		} catch (SQLException e) {
			System.out.println("DBMS 연결에 실패했어요 ~~ ㅠㅠ");
		}
		return con; 
	}
	
	public static void main(String[] args) {

		try {
			Connection con = makeConnection(); 
			Statement stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");

			while(rs.next()){ 
				int id = rs.getInt("id"); 
				String name = rs.getString("name");
				System.out.println(id+" "+name); 
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}