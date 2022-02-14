package customer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main3 {

	private JFrame frame;
	private JTable table;
	private JLabel lblNewLabel_1;

	public Main3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		table = new JTable();
		table.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"\uC8FC\uBB38\uB0A0\uC9DC", "\uC774\uB984"
			}
		));
		table.setBounds(49, 49, 351, 161);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38 \uC77C\uC2DC");
		lblNewLabel.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 16));
		lblNewLabel.setBounds(100, 12, 77, 27);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\uB9C8\uD2B8");
		lblNewLabel_1.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(290, 12, 39, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton bt = new JButton("\uD655\uC778");
		bt.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 14));
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Main4();
			}
		});
		bt.setBounds(161, 228, 97, 23);
		frame.getContentPane().add(bt);
	}
}
