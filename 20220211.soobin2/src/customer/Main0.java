package customer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main0 {

	private JFrame frame;

	
	public Main0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 350);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("\uC0AC\uC6A9\uC790 \uB2C9\uB124\uC784\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
		lblNewLabel.setFont(new Font("∞Ê±‚√µ≥‚πŸ≈¡OTF Regular", Font.PLAIN, 18));
		lblNewLabel.setBounds(32, 26, 393, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JButton bt1 = new JButton("");
		bt1.setIcon(new ImageIcon("C:\\Users\\Si7A-00\\Desktop\\Background.png"));
		bt1.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.BOLD, 16));
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Main();
				
			}
			
		});
		bt1.setBounds(48, 122, 150, 130);
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("");
		bt2.setIcon(new ImageIcon("C:\\Users\\Si7A-00\\Desktop\\checklist-gc6efdb05e_1280.png"));
		bt2.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.BOLD, 16));
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Main3();
				
			}
			
		});
		bt2.setBounds(234, 122, 150, 130);
		frame.getContentPane().add(bt2);
		
		JLabel lblNewLabel_1 = new JLabel("\uC1FC\uD551\uD558\uAE30");
		lblNewLabel_1.setFont(new Font("∞Ê±‚√µ≥‚πŸ≈¡OTF Regular", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(96, 96, 64, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uC8FC\uBB38\uC870\uD68C");
		lblNewLabel_1_2.setFont(new Font("∞Ê±‚√µ≥‚πŸ≈¡OTF Regular", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(266, 96, 64, 15);
		frame.getContentPane().add(lblNewLabel_1_2);
	}
}
