package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class RegisterDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@121.189.160.252:1521:xe";
	private String user = "c##scott";
	private String password = "tiger";
	
	private Connection con; 
	private Statement stmt;
	private ResultSet rs;
	
	public void createId(String id, String pwd) {
		conDB();
		try {
			String sqr = String.format("INSERT INTO seller VALUES ('%s', '%s')", id, pwd);
			int is = stmt.executeUpdate(sqr);
			System.out.println("생성된 값 : " + is);
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
	
	public void createTable(String id) {
		conDB();
		
		try {
			String sqr = String.format("CREATE TABLE seller%s ( item_name varchar2(50), item_price varchar(20), item_stock varchar(10), PRIMARY KEY(item_name) )", id);
			boolean b = stmt.execute(sqr);
			System.out.println("테이블생성 결과" + b);
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
	
	public ArrayList<MemberVo> list() {
		conDB();
		ArrayList<MemberVo> list = new ArrayList<>();
		
		try {
			String sqr = "SELECT * FROM seller";
			rs = stmt.executeQuery(sqr);
			while(rs.next()) {
				String id = rs.getString("seller_id");
				String pwd = rs.getString("seller_pwd");
				
				MemberVo data = new MemberVo(id, pwd);
				list.add(data);
			}

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
