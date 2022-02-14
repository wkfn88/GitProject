package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisterDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "c##ezen";
	private String password = "ezen1234";
	
	private Connection con; 
	private Statement stmt;
	private ResultSet rs;
	
	public void createId(String id, String pwd, String name, String address) {
		conDB();
		try {
			String sqr = String.format("INSERT INTO seller VALUES ('%s', '%s', '%s', '%s')", id, pwd, name, address);
			int is = stmt.executeUpdate(sqr);
			System.out.println("积己等 蔼 : " + is);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void createCusId(String id, String pwd, String name, String address) {
		conDB();
		try {
			String sqr = String.format("INSERT INTO customer VALUES ('%s', '%s', '%s', '%s')", id, pwd, name, address);
			int is = stmt.executeUpdate(sqr);
			System.out.println("积己等 蔼 : " + is);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void conDB() {
		try {
			Class.forName(driver);
			System.out.println("driver check");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("connection check");
			stmt = con.createStatement();
			System.out.println("statement check");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
