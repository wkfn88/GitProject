package customer;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Main2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;




	public Main2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("∞Ê±‚√µ≥‚πŸ≈¡OTF Regular", Font.PLAIN, 14));
		frame.setBounds(100, 100, 687, 286);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("\uC131\uD568");
		lblNewLabel.setFont(new Font("∞Ê±‚√µ≥‚πŸ≈¡OTF Regular", Font.PLAIN, 14));
		lblNewLabel.setBounds(35, 48, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_1.setFont(new Font("∞Ê±‚√µ≥‚πŸ≈¡OTF Regular", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(35, 96, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC694\uAD6C\uC0AC\uD56D");
		lblNewLabel_2.setFont(new Font("∞Ê±‚√µ≥‚πŸ≈¡OTF Regular", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(35, 144, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("±º∏≤", Font.PLAIN, 16));
		textField.setBounds(141, 45, 116, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("±º∏≤", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(141, 93, 116, 21);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("\uC8FC\uBB38");
		btnNewButton.setFont(new Font("∞Ê±‚√µ≥‚πŸ≈¡OTF Regular", Font.PLAIN, 16));
		btnNewButton.setBounds(93, 202, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uC8FC\uBB38\uBAA9\uB85D");
		lblNewLabel_2_1.setFont(new Font("∞Ê±‚√µ≥‚πŸ≈¡OTF Regular", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(431, 10, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(141, 128, 116, 64);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(308, 48, 325, 144);
		frame.getContentPane().add(scrollPane_1);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"\uC0C1\uD488\uBA85", "\uAC00\uACA9", "\uC218\uB7C9"
			}
		));
		scrollPane_1.setViewportView(table);
	}
}
