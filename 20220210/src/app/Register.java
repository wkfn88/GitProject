package app;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField tf_id;
	private JTextField tf_pwd;
	private JTextField tf_pwd2;
	
	private boolean isIdCheck = false;
	private boolean isPwdCheck = false;

	public Register() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 218, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf_id = new JTextField();
		tf_id.setBounds(12, 33, 180, 21);
		contentPane.add(tf_id);
		tf_id.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel.setBounds(81, 14, 41, 15);
		contentPane.add(lblNewLabel);
		
		JButton bt_idCheck = new JButton("\uC544\uC774\uB514 \uC911\uBCF5\uD655\uC778");
		bt_idCheck.setBounds(12, 60, 180, 23);
		contentPane.add(bt_idCheck);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1.setBounds(75, 113, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tf_pwd = new JPasswordField();
		tf_pwd.setColumns(10);
		tf_pwd.setBounds(12, 133, 180, 21);
		contentPane.add(tf_pwd);
		
		tf_pwd2 = new JPasswordField();
		tf_pwd2.setColumns(10);
		tf_pwd2.setBounds(12, 160, 180, 21);
		contentPane.add(tf_pwd2);
		
		JButton bt_pwdCheck = new JButton("\uBE44\uBC00\uBC88\uD638 \uAC80\uC0AC");
		bt_pwdCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_pwdCheck.setBounds(12, 187, 180, 23);
		contentPane.add(bt_pwdCheck);
		
		JButton bt_ok = new JButton("\uAC00\uC785");
		bt_ok.setBounds(25, 234, 70, 23);
		contentPane.add(bt_ok);
		
		JButton bt_cancel = new JButton("\uCDE8\uC18C");
		bt_cancel.setBounds(107, 234, 70, 23);
		contentPane.add(bt_cancel);
		setVisible(true);
		
		bt_ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if( isIdCheck && isPwdCheck ) {
					RegisterDAO dao = new RegisterDAO();
					dao.createId(tf_id.getText(), tf_pwd.getText());
					dao.createTable(tf_id.getText());
					isIdCheck = false;
					isPwdCheck = false;
					JOptionPane.showMessageDialog(contentPane, "아이디가 생성되었습니다.");
					dispose();
				}else {
					JOptionPane.showMessageDialog(contentPane, "아이디, 비밀번호를 확인하십시오.", "오류", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		});
		
		bt_cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		bt_idCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RegisterDAO dao = new RegisterDAO();
				ArrayList<MemberVo> list = dao.list();
				
				String str = tf_id.getText();
				if( str.equals("") ) {
					JOptionPane.showMessageDialog(contentPane, "아이디를 입력해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
					isIdCheck = false;
				}else {
					if( list.size() == 0 ) {
						JOptionPane.showMessageDialog(contentPane, "사용가능한 아이디입니다.");
						isIdCheck = true;
					}else {
						for( int i = 0; i < list.size(); i++ ) {
							if( str.equals(list.get(i).getId()) ) {
								JOptionPane.showMessageDialog(contentPane, "중복된 아이디가 있습니다.", "오류", JOptionPane.ERROR_MESSAGE);
								isIdCheck = false;
								break;
							}else {
								JOptionPane.showMessageDialog(contentPane, "사용가능한 아이디입니다.");
								isIdCheck = true;
								break;
							}
						}
					}			
				}
			}
		});
		
		bt_pwdCheck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if( tf_pwd.getText().equals("") || tf_pwd2.getText().equals("") ) {
					JOptionPane.showMessageDialog(contentPane, "비밀번호를 입력해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
					isPwdCheck = false;
				}else {
					String pwd1 = tf_pwd.getText();
					String pwd2 = tf_pwd2.getText();
					if( pwd1.equals(pwd2)) {
						JOptionPane.showMessageDialog(contentPane, "비밀번호가 일치합니다.");
						isPwdCheck = true;
					}else {
						JOptionPane.showMessageDialog(contentPane, "비밀번호가 일치하지 않습니다.", "오류", JOptionPane.ERROR_MESSAGE);
						isPwdCheck = false;
					}
				}
			}
		});
	}

}
