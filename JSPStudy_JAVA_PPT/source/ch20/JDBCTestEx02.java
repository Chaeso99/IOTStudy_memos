package ch20;

//주의 java.sql.* 인걸로 import 해야 정상동작함
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTestEx02 {

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

	//DB데이터 삽입
	public static void insertDB(Statement stmt, String table, int id, String name){
		String query = "INSERT INTO "+table+" (id, name) VALUES ("+id+",'"+name+"')";
		try {
			stmt.executeUpdate(query); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//DB데이터 검색
	public static void selectDB(Statement stmt, String table){
		String query = "SELECT * FROM "+table; 

		try {
			ResultSet rs = stmt.executeQuery(query);

			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println(id+" "+name); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//DB데이터 수정
	public static void alterDB(Statement stmt, String table, String oldName, String newName){
		String query = "UPDATE "+table+" SET name='"+newName+"' WHERE name='"+oldName+"'"; 
		try {
			stmt.executeUpdate(query); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//DB 데이터 삭제
	public static void deleteDB(Statement stmt, String table, String name){
		String query = "DELETE FROM "+table+" WHERE name = " + "'"+name+"'";
		try {
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			Connection con = makeConnection(); 
			Statement stmt = con.createStatement();
			String table = "books"; 
			
			System.out.println("----------------검색결과---------------");
			selectDB(stmt, table); 
			
			System.out.println("----------------삽입결과---------------");
			insertDB(stmt, table, 10, "국어책"); 
			selectDB(stmt, table); 
			
			System.out.println("----------------수정결과---------------");
			alterDB(stmt, table, "국어책", "수학책"); 
			selectDB(stmt, table); 
			
			System.out.println("----------------삭제결과---------------");
			deleteDB(stmt, table, "수학책");
			selectDB(stmt, table); 
			
			stmt.close(); 
			con.close(); 
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}