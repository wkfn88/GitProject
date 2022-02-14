package customer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class Main {

	private JFrame frame;
	private JTextField textField;


	public Main() {
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
		
		JLabel lblNewLabel = new JLabel("\uB9C8\uD2B8 \uAC80\uC0C9");
		lblNewLabel.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 14));
		lblNewLabel.setBounds(39, 51, 67, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(108, 53, 218, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bt1 = new JButton("\uAC80\uC0C9");
		bt1.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 12));
		bt1.setBounds(338, 52, 67, 23);
		frame.getContentPane().add(bt1);
		
		JLabel lblNewLabel_1 = new JLabel("\uC0AC\uC6A9\uC790 \uB2C9\uB124\uC784\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
		lblNewLabel_1.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(29, 10, 393, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton bt2 = new JButton("\uD655\uC778");
		bt2.setFont(new Font("경기천년바탕OTF Regular", Font.PLAIN, 12));
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Main1();
				
			}
			
		});
		bt2.setBounds(338, 190, 67, 23);
		frame.getContentPane().add(bt2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 86, 287, 127);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
	}
}
