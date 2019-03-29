package GUI;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class GUI_Sign_Up extends JFrame{

	private JFrame frmSignUp;
	private JTextField txtEnterYourEmail;
	private JTextField textField;
	private JPasswordField signup_passwordField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_Sign_Up window = new GUI_Sign_Up();
//					window.frmSignUp.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public GUI_Sign_Up(ActionListener l) {
		initialize(l);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param l 
	 */
	private void initialize(ActionListener l) {
//		frmSignUp = new JFrame();
		super.getContentPane().setBackground(Color.decode("#cee5f2"));
		super.setTitle("Continue");
		super.setBounds(100, 100, 396, 245);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.getContentPane().setLayout(null);
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterYourEmail.setBounds(153, 21, 210, 29);
		super.getContentPane().add(txtEnterYourEmail);
		txtEnterYourEmail.setColumns(10);
		//Submit button allows you to submit your newly created login credentials
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(274, 172, 89, 23);
		btnSubmit.addActionListener(l);
		super.getContentPane().add(btnSubmit);
		
		JLabel lblUsername = new JLabel("Enter your username:");
		lblUsername.setBounds(20, 24, 123, 22);
		super.getContentPane().add(lblUsername);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password");
		lblEnterYourPassword.setBounds(20, 76, 123, 29);
		super.getContentPane().add(lblEnterYourPassword);
		//Back button just takes you back to previous screen "GUI_Login"
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(20, 172, 89, 23);
		btnBack.addActionListener(l);
		super.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(153, 49, 210, 29);
		textField.setColumns(10);
		super.getContentPane().add(textField);
		
		JLabel lblRole = new JLabel("Enter your role::");
		lblRole.setBounds(20, 57, 123, 14);
		super.getContentPane().add(lblRole);
		
		signup_passwordField = new JPasswordField();
		signup_passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		signup_passwordField.setBounds(153, 78, 210, 25);
		super.getContentPane().add(signup_passwordField);
	}
}
