package app;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {

	private String item1;
	private String item2;
	private String item3;
	private int num = 0;
	
	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Main();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 229, 205);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf_id = new JTextField();
		tf_id.setBounds(76, 64, 116, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		tf_pwd = new JPasswordField();
		tf_pwd.setBounds(76, 95, 116, 21);
		frame.getContentPane().add(tf_pwd);
		tf_pwd.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(19, 67, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		lblNewLabel_1.setBounds(19, 98, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton bt_login = new JButton("\uB85C\uADF8\uC778");
		bt_login.setFont(new Font("굴림", Font.PLAIN, 12));
		bt_login.setBounds(19, 126, 79, 21);
		frame.getContentPane().add(bt_login);
		
		JButton bt_reg = new JButton("\uD68C\uC6D0\uAC00\uC785");
		bt_reg.setFont(new Font("굴림", Font.PLAIN, 12));
		bt_reg.setBounds(110, 126, 82, 21);
		frame.getContentPane().add(bt_reg);
		
		JLabel lblNewLabel_2 = new JLabel("\uD310\uB9E4\uC790 \uB85C\uADF8\uC778 \uC2DC\uC2A4\uD15C");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2.setBounds(35, 15, 145, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		bt_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = tf_id.getText();
				String pwd = tf_pwd.getText();
				if( id.equals("") || pwd.equals("") ) {
					JOptionPane.showMessageDialog(frame, "아이디, 비밀번호를 확인하십시오.", "오류", JOptionPane.ERROR_MESSAGE);
				}else {
					RegisterDAO dao = new RegisterDAO();
					ArrayList<MemberVo> list = dao.list();
					
					if(list.size() == 0) {
						JOptionPane.showMessageDialog(frame, "해당 아이디가 틀렸거나 존재하지 않습니다.", "오류", JOptionPane.ERROR_MESSAGE);
					}else {
						for( int i = 0; i < list.size(); i++ ) {
							if( id.equals(list.get(i).getId()) && pwd.equals(list.get(i).getPwd()) ) {
								new Seller(id);
								frame.dispose();
								break;
							}
							
							if( i == list.size()-1 ) {
								JOptionPane.showMessageDialog(frame, "해당 아이디가 틀렸거나 존재하지 않습니다.", "오류", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
				}
			}
		});
		
		bt_reg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Register();
				
			}
			
		});
		
	}
}
