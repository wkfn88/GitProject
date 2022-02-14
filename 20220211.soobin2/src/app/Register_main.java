package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Register_main {

	private JFrame frame;
	
	ImageIcon bt1_img = new ImageIcon("./image/customer10.png");
	ImageIcon bt2_img = new ImageIcon("./image/seller10.png");

	/**
	 * Create the application.
	 */
	public Register_main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("\uAD6C\uB9E4\uC790 \uAC00\uC785");
		lblNewLabel.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		lblNewLabel.setBounds(100, 65, 85, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD310\uB9E4\uC790 \uAC00\uC785");
		lblNewLabel_1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(255, 65, 85, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton bt_customer = new JButton(bt1_img);
		bt_customer.setForeground(Color.BLACK);
		bt_customer.setBackground(SystemColor.inactiveCaptionBorder);
		bt_customer.setBorderPainted(false);
		bt_customer.setBounds(90, 93, 100, 100);
		frame.getContentPane().add(bt_customer);
		
		JButton bt_seller = new JButton(bt2_img);
		bt_seller.setBackground(SystemColor.inactiveCaptionBorder);
		bt_seller.setBorderPainted(false);
		bt_seller.setBounds(245, 93, 100, 100);
		frame.getContentPane().add(bt_seller);
		
		JButton bt_back = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		bt_back.setBackground(SystemColor.inactiveCaptionBorder);
		bt_back.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_back.setBounds(12, 10, 92, 25);
		frame.getContentPane().add(bt_back);
		
		bt_customer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Register_customer();
				frame.dispose();
			}
			
		});
		
		bt_seller.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Register_seller();
				frame.dispose();
			}
		});
		
		bt_back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Login();
				frame.dispose();
			}
			
		});
		
	}
}
