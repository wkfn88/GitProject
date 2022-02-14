package customer;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main4 {

	private JFrame frame;
	private JTable table;


	public Main4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 364);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38\uC870\uD68C");
		lblNewLabel.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 16));
		lblNewLabel.setBounds(175, 10, 69, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD1D\uAE08\uC561 : ");
		lblNewLabel_1.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(53, 257, 143, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC774\uB984 :");
		lblNewLabel_1_1.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(53, 183, 143, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uC8FC\uC18C :");
		lblNewLabel_1_2.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(53, 220, 143, 27);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 42, 316, 121);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\uC0C1\uD488\uBA85", "\uAC00\uACA9", "\uC218\uB7C9"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		scrollPane.setViewportView(table);
	}
}
