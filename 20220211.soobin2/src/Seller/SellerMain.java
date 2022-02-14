package Seller;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.Login;

public class SellerMain extends JFrame {
	
	private String id;
	private JPanel contentPane;
	ImageIcon bt1_img = new ImageIcon("./image/trolley.png");
	ImageIcon bt2_img = new ImageIcon("./image/to-do.png");
	
	/**
	 * Create the frame.
	 */
	
	public SellerMain() {
		initialize();
	}
	
	public SellerMain(String id) {
		this.id = id;
		initialize();
	}
	
	private void initialize() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JButton bt_insert = new JButton(bt1_img);
		bt_insert.setBackground(new Color(224, 255, 255));
		bt_insert.setBounds(66, 95, 120, 120);
		bt_insert.setBorderPainted(false);
		contentPane.add(bt_insert);
		
		JButton bt_select = new JButton(bt2_img);
		bt_select.setBackground(new Color(224, 255, 255));
		bt_select.setBounds(248, 95, 120, 120);
		bt_select.setBorderPainted(false);
		contentPane.add(bt_select);
		
		JLabel lb_intro = new JLabel("\uD310\uB9E4\uC790 OOO\uB2D8, \uD658\uC601\uD569\uB2C8\uB2E4.");
		lb_intro.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		lb_intro.setBounds(20, 20, 301, 15);
		lb_intro.setText("판매자 "+id+"님 " + "환영합니다.");
		contentPane.add(lb_intro);
		
		JButton bt_logout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		bt_logout.setBackground(SystemColor.inactiveCaptionBorder);
		bt_logout.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_logout.setBounds(320, 15, 97, 25);
		contentPane.add(bt_logout);
		
		JLabel lblNewLabel_1 = new JLabel("\uC0C1\uD488 \uB4F1\uB85D");
		lblNewLabel_1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(93, 70, 65, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC0C1\uD488 \uC870\uD68C");
		lblNewLabel_1_1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(277, 70, 65, 20);
		contentPane.add(lblNewLabel_1_1);
		
		bt_insert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				new Seller_registration(id);
			}
			
		});
		
		bt_logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login();
			}
			
		});
		
	}
}
