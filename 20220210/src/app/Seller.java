package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Seller extends JFrame {

	private JPanel contentPane;
	private JTextField tf_id;
	private String sellerId;


	/**
	 * Create the frame.
	 */
	public Seller(String id) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 353, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JButton bt_insert = new JButton("\uC0C1\uD488\uB4F1\uB85D");
		bt_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_insert.setBounds(12, 52, 97, 63);
		contentPane.add(bt_insert);
		
		JButton btnNewButton_1 = new JButton("\uC8FC\uBB38\uC870\uD68C");
		btnNewButton_1.setBounds(121, 52, 97, 63);
		contentPane.add(btnNewButton_1);
		
		JButton bt_logout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		bt_logout.setBounds(228, 10, 97, 23);
		contentPane.add(bt_logout);
		
		JLabel lblNewLabel = new JLabel("\uD310\uB9E4\uC790 \uC544\uC774\uB514");
		lblNewLabel.setBounds(12, 14, 81, 15);
		contentPane.add(lblNewLabel);
		
		sellerId = id;
		tf_id = new JTextField();
		tf_id.setEditable(false);
		tf_id.setBounds(102, 11, 116, 21);
		tf_id.setText(id);
		contentPane.add(tf_id);
		
		JButton btnNewButton_3 = new JButton("\uB9E4\uC7A5\uB4F1\uB85D");
		btnNewButton_3.setBounds(230, 52, 97, 63);
		contentPane.add(btnNewButton_3);
		
		bt_insert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ItemInsert();
			}
			
		});
		
		bt_logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Main();
			}		
		});

	}

}
