package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Register_seller {

	private JFrame frame;
	
	ImageIcon bt1_img = new ImageIcon("./image/customer10.png");
	ImageIcon bt2_img = new ImageIcon("./image/seller10.png");
	private JTextField tf_id;
	private JPasswordField tf_pwd;
	private JPasswordField tf_pwd2;
	private JTextField tf_adress;
	private JTextField tf_martName;
	
	private boolean isIdOnOff = false;
	private boolean isPwdOnOff = false;

	/**
	 * Create the application.
	 */
	public Register_seller() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 250, 503);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lb_pwdCheck = new JLabel("");
		lb_pwdCheck.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 12));
		lb_pwdCheck.setHorizontalAlignment(SwingConstants.CENTER);
		lb_pwdCheck.setBounds(31, 251, 172, 15);
		frame.getContentPane().add(lb_pwdCheck);
		frame.setVisible(true);
		
		tf_id = new JTextField();
		tf_id.setBounds(31, 57, 172, 25);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		tf_pwd = new JPasswordField();
		tf_pwd.setColumns(10);
		tf_pwd.setBounds(31, 170, 172, 25);
		frame.getContentPane().add(tf_pwd);
		
		tf_pwd2 = new JPasswordField();
		tf_pwd2.setColumns(10);
		tf_pwd2.setBounds(31, 216, 172, 25);
		frame.getContentPane().add(tf_pwd2);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		lblNewLabel.setBounds(31, 37, 57, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(31, 150, 57, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_1_1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(31, 196, 83, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton bt_idCheck = new JButton("\uC544\uC774\uB514 \uC911\uBCF5\uD655\uC778");
		bt_idCheck.setBackground(SystemColor.inactiveCaptionBorder);
		bt_idCheck.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_idCheck.setBounds(31, 92, 172, 23);
		frame.getContentPane().add(bt_idCheck);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uB9E4\uC7A5\uC8FC\uC18C");
		lblNewLabel_1_2.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(31, 314, 57, 20);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		tf_adress = new JTextField();
		tf_adress.setColumns(10);
		tf_adress.setBounds(31, 335, 172, 25);
		frame.getContentPane().add(tf_adress);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("\uB9E4\uC7A5\uBA85");
		lblNewLabel_1_2_1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(31, 360, 57, 20);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		tf_martName = new JTextField();
		tf_martName.setColumns(10);
		tf_martName.setBounds(31, 381, 172, 25);
		frame.getContentPane().add(tf_martName);
		
		JButton bt_ok = new JButton("\uAC00\uC785");
		bt_ok.setBackground(SystemColor.inactiveCaptionBorder);
		bt_ok.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_ok.setBounds(31, 416, 68, 23);
		frame.getContentPane().add(bt_ok);
		
		JButton bt_cancel = new JButton("\uCDE8\uC18C");
		bt_cancel.setBackground(SystemColor.inactiveCaptionBorder);
		bt_cancel.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_cancel.setBounds(135, 416, 68, 23);
		frame.getContentPane().add(bt_cancel);
		
		JLabel lblNewLabel_2 = new JLabel("\uD310\uB9E4\uC790 \uD68C\uC6D0\uAC00\uC785");
		lblNewLabel_2.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(63, 12, 114, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		tf_pwd2.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				String str = tf_pwd.getText();
				if(str.equals(tf_pwd2.getText())) {
					isPwdOnOff = true;
					lb_pwdCheck.setText("비밀번호가 일치합니다.");
				}else {
					isPwdOnOff = false;
					lb_pwdCheck.setText("비밀번호가 일치하지 않습니다.");
				}
			}
			
		});
		
		bt_ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tf_martName.getText();
				String address = tf_martName.getText();
				
				if( name.equals("") || address.equals("") ) {
					JOptionPane.showMessageDialog(frame, "매장명과 주소를 입력해주세요", "오류", JOptionPane.ERROR_MESSAGE);
				}else if(isIdOnOff && isPwdOnOff) {
					RegisterDAO dao = new RegisterDAO();
					String id = tf_id.getText();
					String pwd = tf_pwd.getText();
					String Sname = tf_martName.getText();
					String Saddress = tf_adress.getText();
					dao.createId(id, pwd, Sname, Saddress);
					JOptionPane.showMessageDialog(frame, "아이디 생성이 완료되었습니다.");
					isIdOnOff = false;
					isPwdOnOff = false;
					frame.dispose();
					new Login();
				}else {
					JOptionPane.showMessageDialog(frame, "아이디 비밀번호를 확인해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		
		bt_idCheck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LoginDAO dao = new LoginDAO();
				ArrayList<MemberVo> list = dao.sellList();
				
				if( tf_id.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "아이디를 입력해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
				}else if(list.size() == 0 ) {
					isIdOnOff = true;
					JOptionPane.showMessageDialog(frame, "사용가능한 아이디입니다.");
				}else {
					for( int i = 0; i < list.size(); i++ ) {
						String id = list.get(i).getId();
						if( tf_id.getText().equals(id) ) {
							isIdOnOff = false;
							JOptionPane.showMessageDialog(frame, "중복된 아이디가 있습니다.", "오류", JOptionPane.ERROR_MESSAGE);
						}else {
							isIdOnOff = true;
							JOptionPane.showMessageDialog(frame, "사용가능한 아이디입니다.");
						}
					}
				}
			}
			
		});
		
		bt_cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				new Register_main();
			}
			
		});
		
		
	}
}
