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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Seller_registration {
	
	public static void main(String[] args) {
		new Seller_registration();
	}

	private JFrame frame;
	
	ImageIcon bt1_img = new ImageIcon("./image/customer10.png");
	ImageIcon bt2_img = new ImageIcon("./image/seller10.png");
	private JTable table;

	/**
	 * Create the application.
	 */
	public Seller_registration() {
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
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("\uD604\uC7AC \uB4F1\uB85D\uB41C \uC0C1\uD488 \uBAA9\uB85D");
		lblNewLabel.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 19));
		lblNewLabel.setBounds(128, 10, 185, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uC0C1\uD488\uB4F1\uB85D");
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		btnNewButton.setBounds(426, 40, 97, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0C1\uD488\uC218\uC815");
		btnNewButton_1.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		btnNewButton_1.setBounds(426, 80, 97, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC0C1\uD488\uC81C\uAC70");
		btnNewButton_2.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_2.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		btnNewButton_2.setBounds(426, 120, 97, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_3.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		btnNewButton_3.setBounds(426, 251, 97, 30);
		frame.getContentPane().add(btnNewButton_3);
		frame.setVisible(true);
		frame.setVisible(true);
		
		
	}
}
