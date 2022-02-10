package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class ItemInsert extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public ItemInsert() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 487, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBB3C\uD488\uBA85 :");
		lblNewLabel.setBounds(18, 20, 44, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 17, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uAC00\uACA9 :");
		lblNewLabel_1.setBounds(200, 20, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 17, 102, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC6D0");
		lblNewLabel_2.setBounds(341, 20, 17, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC218\uB7C9 :");
		lblNewLabel_3.setBounds(370, 20, 44, 15);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(406, 17, 48, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		btnNewButton.setBounds(18, 56, 65, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 89, 436, 162);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnNewButton_2 = new JButton("\uD655\uC778");
		btnNewButton_2.setBounds(159, 261, 72, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(88, 56, 65, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_2_1.setBounds(240, 261, 72, 23);
		contentPane.add(btnNewButton_2_1);
		setVisible(true);
	}
}
