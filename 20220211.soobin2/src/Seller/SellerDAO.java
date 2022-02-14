package Seller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SellerDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "c##ezen";
	private String password = "ezen1234";
	
	private Connection con; 
	private Statement stmt;
	private ResultSet rs;
	private String id;
	
	public SellerDAO(String id) {
		this.id = id;
	}
	
	public void createItem(ArrayList<Item> item) {
		conDB();
		ArrayList<Item> list = item;


		try {
			for( int i = 0; i < list.size(); i++ ) {
				String sql1 = String.format("SELECT * FROM seller WHERE sell_id = '%s'", id);
				rs = stmt.executeQuery(sql1);
				String martName = "";
				while(rs.next()) {
					martName = rs.getString("sell_name");
				}
				String itemName = list.get(i).getItem_name();
				String itemId = martName + " " + itemName;
				int itemPrice = list.get(i).getItem_price();
				int itemStock = list.get(i).getItem_stock();
				
				
				String sql2 = String.format("INSERT INTO itemlist VALUES ('%s', '%s', '%s', '%s', %d, %d)", id, martName, itemId, itemName, itemPrice, itemStock);
				int rsi = stmt.executeUpdate(sql2);
				System.out.println("인서트 결과 : " + rsi );
				
			}
			
		}catch(Exception e) {
			
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
