package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Connect {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@121.189.160.252:1521:xe";
	private String user = "c##scott";
	private String password = "tiger";
	
	private Connection con; 
	private Statement stmt;
	private ResultSet rs;
	
	public ArrayList<MemberVo> list() {
		ArrayList<MemberVo> list = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM infomation";
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String division_id = rs.getString("division_id");
				String division_name = rs.getString("division_name");
				String step0 = rs.getString("step0");
				String step1 = rs.getString("step1");
				
				MemberVo data = new MemberVo(division_id, division_name, step0, step1);
				list.add(data);
			}
		}catch(Exception e) {
			
		}
		return list;
	}
	
	
	public Connect() {
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
