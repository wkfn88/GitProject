package Seller;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Seller_registration {
	
	private JFrame frame;
	private String id;
	
	ImageIcon bt1_img = new ImageIcon("./image/customer10.png");
	ImageIcon bt2_img = new ImageIcon("./image/seller10.png");
	private JTable table;

	
	
	public Seller_registration(String id) {
		this.id = id;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 551, 331);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 40, 402, 241);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		Object[][] objArr = null;
		String[] strArr = {"상품명", "상품가격", "재고"};
		DefaultTableModel model = new DefaultTableModel(objArr, strArr);
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(154);
		table.getColumnModel().getColumn(1).setPreferredWidth(122);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("\uD604\uC7AC \uB4F1\uB85D\uB41C \uC0C1\uD488 \uBAA9\uB85D");
		lblNewLabel.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 19));
		lblNewLabel.setBounds(128, 10, 185, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton bt_regist = new JButton("\uC0C1\uD488\uB4F1\uB85D");
		bt_regist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_regist.setBackground(SystemColor.inactiveCaptionBorder);
		bt_regist.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_regist.setBounds(426, 40, 97, 30);
		frame.getContentPane().add(bt_regist);
		
		JButton bt_correct = new JButton("\uC0C1\uD488\uC218\uC815");
		bt_correct.setBackground(SystemColor.inactiveCaptionBorder);
		bt_correct.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_correct.setBounds(426, 80, 97, 30);
		frame.getContentPane().add(bt_correct);
		
		JButton bt_remove = new JButton("\uC0C1\uD488\uC81C\uAC70");
		bt_remove.setBackground(SystemColor.inactiveCaptionBorder);
		bt_remove.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_remove.setBounds(426, 120, 97, 30);
		frame.getContentPane().add(bt_remove);
		
		JButton bt_cancel = new JButton("\uCDE8\uC18C");
		bt_cancel.setBackground(SystemColor.inactiveCaptionBorder);
		bt_cancel.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_cancel.setBounds(426, 211, 97, 30);
		frame.getContentPane().add(bt_cancel);
		
		JButton bt_ok = new JButton("\uD655\uC778");
		bt_ok.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_ok.setBackground(SystemColor.inactiveCaptionBorder);
		bt_ok.setBounds(426, 251, 97, 30);
		frame.getContentPane().add(bt_ok);
		frame.setVisible(true);
		frame.setVisible(true);
		
		bt_ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Item> list = new ArrayList<>();
				System.out.println(table.getRowCount());
				
				for( int i = 0; i < table.getRowCount(); i++ ) {
					String name = (String)table.getValueAt(i, 0);
					int price = Integer.parseInt((String)table.getValueAt(i, 1));
					int stock = Integer.parseInt((String)table.getValueAt(i, 2));
					Item item = new Item(name, price, stock);
					list.add(item);
				}
				SellerDAO dao = new SellerDAO(id);
				dao.createItem(list);
				
				
			}
			
		});
		
		
		bt_regist.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String[] strArr = {"", "", ""};
				model.addRow(objArr);
			}
			
		});
		
		
	}
}

class Item {
	private String item_name;
	private int item_price;
	private int item_stock;
	
	public Item(String name, int price, int stock) {
		item_name = name;
		item_price = price;
		item_stock = stock;
	}
	
	public String getItem_name() {
		return item_name;
	}
	
	public int getItem_price() {
		return item_price;
	}
	
	public int getItem_stock() {
		return item_stock;
	}
}
