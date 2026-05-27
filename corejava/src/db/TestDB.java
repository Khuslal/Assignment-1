package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// getConnection(url, username, password);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","password");
		
		//=====Insert SQL==========
		// 1. write sql
//		String sql = "insert into user(username, password) values('admin2','123456')";
//		// 2. create sql
//		Statement stmt = conn.createStatement();
//		// 3. execute statement
//		stmt.execute(sql);
//		conn.close();
//		System.out.println("Data Inserted Successfully");
		
		//=======Delete SQL========
//		String sql = "delete from user where id=2";
//		Statement stmt = conn.createStatement();
//		stmt.execute(sql);
//		System.out.println("Data Deleted Successfully");
		
		//========Select SQL=========
		String sql = "select * from user where id=3";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("ID : "+rs.getInt("id"));
			System.out.println("Username : "+rs.getString(2));
			System.out.println("Password : "+rs.getString(3));
			System.out.println("----------------------");
		}
		System.out.println("Data Fetched Successfully");
		conn.close();
	}
}
