package customer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Main1 {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTable table_1;

	
	public Main1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 799, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		textField = new JTextField();
		textField.setBounds(12, 73, 353, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bt1 = new JButton("\uAC80\uC0C9");
		bt1.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 15));
		bt1.setBounds(377, 71, 77, 38);
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("\uC8FC\uBB38\uD558\uAE30");
		bt2.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 22));
		bt2.setBounds(466, 363, 273, 57);
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {	
				new Main2();
			}
			
		});
		frame.getContentPane().add(bt2);
		
		JLabel lblNewLabel_1 = new JLabel("\uC0AC\uC6A9\uC790 \uB2C9\uB124\uC784\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
		lblNewLabel_1.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(22, 10, 393, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		Object[][] ob = null;
		String [] arr = {"상품명", "가격"};
		DefaultTableModel model = new DefaultTableModel(ob, arr);
		
		JLabel lblNewLabel = new JLabel("\uCD1D \uAE08\uC561 : ");
		lblNewLabel.setBounds(466, 317, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton bt4 = new JButton("\uC0AD\uC81C");
		bt4.setBounds(642, 317, 97, 23);
		frame.getContentPane().add(bt4);
		
		
		JButton bt3 = new JButton("\uCD94\uAC00");
		bt3.setBounds(357, 430, 97, 23);
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
			
		});
		frame.getContentPane().add(bt3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 118, 442, 302);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"\uC0C1\uD488\uBA85", "\uAC00\uACA9", "\uC7AC\uACE0"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(466, 73, 273, 230);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"\uC0C1\uD488\uBA85", "\uAC00\uACA9", "\uC218\uB7C9"
			}
		));
		scrollPane_1.setViewportView(table_1);
	}
}
