package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "c##ezen";
	private String password = "ezen1234";
	
	private Connection con; 
	private Statement stmt;
	private ResultSet rs;
	
	public ArrayList<MemberVo> sellList() {
		conDB();
		
		ArrayList<MemberVo> list = new ArrayList<>();
		try {
			String sql = "select * from seller";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString("sell_id");
				String password = rs.getString("sell_pwd");
				String name = rs.getString("sell_name");
				String address = rs.getString("sell_address");
				
				MemberVo date = new MemberVo(id, password, name, address);
				list.add(date);
			}
		}catch(Exception e) {
			
		}finally {
			try {
				con.close();
				stmt.close();
			}catch(Exception e){
				
			}
		}
		return list;
		
	}
	public ArrayList<MemberVo> cusList() {
		conDB();
		
		ArrayList<MemberVo> list = new ArrayList<>();
		try {
			String sql = "select * from customer";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString("cus_id");
				String password = rs.getString("cus_pwd");
				String name = rs.getString("cus_name");
				String address = rs.getString("cus_address");
				
				MemberVo date = new MemberVo(id, password, name, address);
				list.add(date);
			}
		}catch(Exception e) {
			
		}finally {
			try {
				con.close();
				stmt.close();
			}catch(Exception e){
				
			}
		}
		return list;
		
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
