package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setResizable(false);
		frame.setBounds(100, 100, 520, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		ImagePanel IPanel = new ImagePanel(new ImageIcon("./image/mart.png").getImage());
		IPanel.setBounds(0, 0, 260, 370);
		IPanel.setLayout(null);
		frame.getContentPane().add(IPanel);
		
		tf_id = new JTextField();
		tf_id.setBounds(283, 179, 193, 28);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		tf_password = new JTextField();
		tf_password.setColumns(10);
		tf_password.setBounds(283, 237, 193, 28);
		frame.getContentPane().add(tf_password);
		
		JRadioButton rb_consumer = new JRadioButton("\uAD6C\uB9E4\uC790");
		rb_consumer.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		rb_consumer.setBackground(Color.WHITE);
		rb_consumer.setBounds(298, 128, 70, 25);
		frame.getContentPane().add(rb_consumer);
		
		JRadioButton rb_seller = new JRadioButton("\uD310\uB9E4\uC790");
		rb_seller.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		rb_seller.setBackground(Color.WHITE);
		rb_seller.setBounds(383, 128, 70, 25);
		frame.getContentPane().add(rb_seller);
		
		ButtonGroup rg = new ButtonGroup();
		rg.add(rb_seller);
		rg.add(rb_consumer);
		
		JLabel label_id = new JLabel("\uC544\uC774\uB514");
		label_id.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		label_id.setBounds(283, 159, 57, 20);
		frame.getContentPane().add(label_id);
		
		JLabel label_id_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_id_1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		label_id_1.setBounds(283, 217, 85, 20);
		frame.getContentPane().add(label_id_1);
		
		JButton bt_login = new JButton("\uB85C\uADF8\uC778");
		bt_login.setBackground(SystemColor.inactiveCaptionBorder);
		bt_login.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_login.setBounds(283, 283, 90, 28);
		frame.getContentPane().add(bt_login);
		
		JButton bt_register = new JButton("\uD68C\uC6D0\uAC00\uC785");
		bt_register.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		bt_register.setBackground(SystemColor.inactiveCaptionBorder);
		bt_register.setBounds(387, 283, 90, 28);
		frame.getContentPane().add(bt_register);
		
		JLabel label_title = new JLabel("\uBC30\uB2EC\uB9C8\uD2B8 \uC2DC\uC2A4\uD15C");
		label_title.setBackground(Color.WHITE);
		label_title.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 27));
		label_title.setHorizontalAlignment(SwingConstants.CENTER);
		label_title.setBounds(283, 29, 193, 75);
		frame.getContentPane().add(label_title);
		
		
		
		
		bt_register.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Register_main();
				frame.dispose();
				
			}
			
		});
		

	}
}

class ImagePanel extends JPanel {
	  private Image img;
	  
	  public ImagePanel(Image img) {
	      this.img = img;
	      setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
	      setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
	      setLayout(null);
	  }
	  
	  public void paintComponent(Graphics g) {
	      g.drawImage(img, 3, 0, null);
	  }
	}
