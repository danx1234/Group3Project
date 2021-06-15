package LoginSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import ProjectLayout.StudentRecord;

import java.awt.Color;
import java.awt.Font;

public class LoginSys {

	private JFrame frmDddd;
	private JTextField txtAdmin;
	private JPasswordField txtPassword;
	private JLabel txtTeacher;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSys window = new LoginSys();
					window.frmDddd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDddd = new JFrame();
		frmDddd.setBackground(Color.PINK);
		frmDddd.setForeground(Color.WHITE);
		frmDddd.getContentPane().setBackground(new Color(255, 255, 153));
		frmDddd.getContentPane().setForeground(Color.LIGHT_GRAY);
		frmDddd.setBounds(200, 200, 500, 300);
		frmDddd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDddd.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Class Record");
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
		lblNewLabel.setBounds(171, 12, 214, 14);
		frmDddd.getContentPane().add(lblNewLabel);
		
		JLabel lblTeacher = new JLabel("Teacher:");
		lblTeacher.setBounds(94, 67, 58, 17);
		frmDddd.getContentPane().add(lblTeacher);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(94, 125, 67, 20);
		frmDddd.getContentPane().add(lblPassword);
		
		txtAdmin = new JTextField();
		txtAdmin.setBounds(171, 65, 163, 20);
		frmDddd.getContentPane().add(txtAdmin);
		txtAdmin.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 37, 464, 2);
		frmDddd.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 190, 464, 2);
		frmDddd.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = txtPassword.getText();
				String Teacher = txtAdmin.getText();
				
				if (password.contains("School") && Teacher.contains("ADMIN")) {
					txtPassword.setText(null);
					txtAdmin.setText(null);
					
					StudentRecord info = new StudentRecord();
					StudentRecord.main(null);
				}
				
				else 
				 { 
					JOptionPane.showMessageDialog(null, "Invalid Login Details","login Error", JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtTeacher.setText(null);				
				 }
			}
		});
		btnNewButton.setBounds(147, 212, 89, 23);
		frmDddd.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			private JLabel txtUsername;
			public void actionPerformed(ActionEvent e) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
				
			}
		});
		btnNewButton_1.setBounds(270, 212, 89, 23);
		frmDddd.getContentPane().add(btnNewButton_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(171, 125, 163, 20);
		frmDddd.getContentPane().add(txtPassword);
	}
}
