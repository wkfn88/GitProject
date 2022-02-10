package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		
		JButton btnNewButton = new JButton("\uC0C1\uD488\uB4F1\uB85D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(12, 52, 97, 63);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC8FC\uBB38\uC870\uD68C");
		btnNewButton_1.setBounds(121, 52, 97, 63);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton_2.setBounds(228, 10, 97, 23);
		contentPane.add(btnNewButton_2);
		
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

	}

}
