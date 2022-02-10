package app;

import java.awt.EventQueue;
import java.awt.Font;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main {

	private JFrame frame;
	private JTextField nowDate;
	private JTextField textField_check;
	private Connect c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
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
		c = new Connect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("\uC0AC\uD68C\uC801 \uAC70\uB9AC\uB450\uAE30 \uD604\uD669");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("서울남산 장체B", Font.BOLD, 20));
		title.setBounds(127, 10, 183, 33);
		frame.getContentPane().add(title);
		
		JLabel lblNewLabel = new JLabel("\uD604\uC7AC \uB0A0\uC9DC :");
		lblNewLabel.setFont(new Font("서울남산 장체B", Font.PLAIN, 14));
		lblNewLabel.setBounds(22, 56, 68, 15);
		frame.getContentPane().add(lblNewLabel);
		
		nowDate = new JTextField();
		nowDate.setBounds(90, 53, 96, 21);
		LocalDate now = LocalDate.now();
		nowDate.setText(now.toString());
		frame.getContentPane().add(nowDate);
		nowDate.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uAC70\uB9AC\uB450\uAE30 :");
		lblNewLabel_1.setFont(new Font("서울남산 장체B", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(203, 56, 68, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JList list = new JList();
		DefaultListModel listModel = new DefaultListModel();
		listModel.addElement("00 사적모임");
		listModel.addElement("01 음식점·카페");
		listModel.addElement("02 독서실·스터디카페");
		listModel.addElement("03 영화관람");
		listModel.addElement("04 학원·교습소");
		listModel.addElement("05 헬스장");
		listModel.addElement("06 노래연습장");
		listModel.addElement("07 프로스포츠 경기 관람");
		list.setModel(listModel);
		
		JScrollPane p = new JScrollPane(list);
		p.setBounds(22, 95, 164, 143);
		frame.getContentPane().add(p);
		
		textField_check = new JTextField();
		textField_check.setColumns(10);
		textField_check.setBounds(265, 53, 146, 21);
		textField_check.setText("한시적 거리두기 재강화");
		frame.getContentPane().add(textField_check);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(198, 95, 213, 143);
		frame.getContentPane().add(textPane);
		
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				ArrayList<MemberVo> alist = c.list();
				String str = (String)list.getSelectedValue();
				StringTokenizer st = new StringTokenizer(str);
				str = st.nextToken();
				
				for( int i = 0; i < alist.size(); i++ ) {
					if( str.equals(alist.get(i).getDivision_id()) ) {
						textPane.setText(alist.get(i).getStep1());
					}
				}
			}
			
		});
		
		
	}
}
