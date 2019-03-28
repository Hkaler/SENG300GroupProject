package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class GUI_Sign_Up {

	private JFrame frmSignUp;
	private JTextField txtEnterYourEmail;
	private JTextField textField;
	private JPasswordField signup_passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Sign_Up window = new GUI_Sign_Up();
					window.frmSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Sign_Up() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUp = new JFrame();
		frmSignUp.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmSignUp.setTitle("Continue");
		frmSignUp.setBounds(100, 100, 450, 300);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterYourEmail.setBounds(153, 21, 210, 29);
		frmSignUp.getContentPane().add(txtEnterYourEmail);
		txtEnterYourEmail.setColumns(10);
		//Submit button allows you to submit your newly created login credentials
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(335, 227, 89, 23);
		frmSignUp.getContentPane().add(btnSubmit);
		
		JLabel lblUsername = new JLabel("Enter your username:");
		lblUsername.setBounds(20, 24, 123, 22);
		frmSignUp.getContentPane().add(lblUsername);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password");
		lblEnterYourPassword.setBounds(20, 76, 123, 29);
		frmSignUp.getContentPane().add(lblEnterYourPassword);
		//Back button just takes you back to previous screen "GUI_Login"
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(20, 227, 89, 23);
		frmSignUp.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(153, 49, 210, 29);
		textField.setColumns(10);
		frmSignUp.getContentPane().add(textField);
		
		JLabel lblRole = new JLabel("Enter your role::");
		lblRole.setBounds(20, 57, 123, 14);
		frmSignUp.getContentPane().add(lblRole);
		
		signup_passwordField = new JPasswordField();
		signup_passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		signup_passwordField.setBounds(153, 78, 210, 25);
		frmSignUp.getContentPane().add(signup_passwordField);
	}
}
