package ProjectLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JList;

public class StudentRecord {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JPanel panel_2;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JTextField textField_17;
	private JTextField textField_18;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecord window = new StudentRecord();
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
	public StudentRecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(new Color(51, 255, 153));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1450, 600);
		panel.setToolTipText("");
		panel.setBorder(new LineBorder(new Color(0, 255, 0), 5));
		panel.setBackground(new Color(255, 255, 153));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 255, 0), 6));
		panel_1.setBackground(new Color(255, 255, 153));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 204, 51), 5));
		panel_2.setBackground(new Color(255, 255, 102));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE))
				.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Result");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(261, 11, 89, 38);
		panel_2.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Transcript");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(23, 11, 105, 38);
		panel_2.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Print");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(150, 11, 89, 38);
		panel_2.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Reset");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(1162, 11, 89, 38);
		panel_2.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(1261, 11, 89, 38);
		panel_2.add(btnNewButton_4);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(154, 27, 180, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 62, 180, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(154, 96, 180, 29);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(154, 131, 180, 29);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(154, 165, 180, 29);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(154, 199, 180, 29);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(154, 234, 180, 29);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Student ID:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(30, 30, 89, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Firstname:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(30, 70, 89, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Surname:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(30, 102, 89, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Course Code:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3.setBounds(30, 173, 114, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Exam No:");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_4.setBounds(30, 207, 89, 21);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender:");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_5.setBounds(30, 139, 89, 21);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Dob:");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_6.setBounds(30, 242, 89, 21);
		panel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(30, 249, 46, 14);
		panel.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Address:");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_8.setBounds(30, 274, 89, 14);
		panel.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(570, 27, 180, 29);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(570, 62, 180, 29);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(570, 96, 180, 29);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(570, 131, 180, 29);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(570, 169, 180, 29);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(570, 203, 180, 29);
		panel.add(textField_13);
		
		lblNewLabel_9 = new JLabel("Maths:");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_9.setBounds(450, 35, 89, 21);
		panel.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("English:");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_10.setBounds(450, 70, 89, 21);
		panel.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Biology:");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_11.setBounds(450, 104, 89, 21);
		panel.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Computing:");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_12.setBounds(450, 141, 89, 21);
		panel.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Chemistry:");
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_13.setBounds(450, 177, 89, 21);
		panel.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("Physics:");
		lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_14.setBounds(450, 207, 89, 21);
		panel.add(lblNewLabel_14);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(570, 238, 180, 29);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(570, 273, 180, 29);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(570, 307, 180, 29);
		panel.add(textField_16);
		
		lblNewLabel_15 = new JLabel("Add Maths:");
		lblNewLabel_15.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15.setBounds(450, 242, 89, 21);
		panel.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Bussiness:");
		lblNewLabel_16.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_16.setBounds(450, 281, 89, 21);
		panel.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("Total Score:");
		lblNewLabel_17.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_17.setBounds(450, 315, 112, 21);
		panel.add(lblNewLabel_17);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(570, 342, 180, 29);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(570, 377, 180, 29);
		panel.add(textField_18);
		
		lblNewLabel_18 = new JLabel("Average:");
		lblNewLabel_18.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_18.setBounds(450, 354, 112, 21);
		panel.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("Ranking:");
		lblNewLabel_19.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_19.setBounds(450, 379, 112, 21);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Student Class Record");
		lblNewLabel_20.setFont(new Font("Lucida Calligraphy", Font.BOLD, 27));
		lblNewLabel_20.setBackground(new Color(230, 230, 250));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setBounds(413, 417, 385, 62);
		panel.add(lblNewLabel_20);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setToolTipText("");
		textArea_1.setColumns(10);
		textArea_1.setBounds(154, 270, 180, 209);
		panel.add(textArea_1);
		panel_1.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 11, 512, 468);
		panel_1.add(textArea);
		frame.getContentPane().setLayout(groupLayout);
	}
}
