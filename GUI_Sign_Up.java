import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;

public class GUI_Sign_Up {

	private JFrame frmSignUp;
	private JTextField txtEnterYourEmail;
	private JTextField txtEnterYourPassword;

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
		frmSignUp.setTitle("Sign Up");
		frmSignUp.setBounds(100, 100, 450, 300);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.setBounds(153, 21, 210, 29);
		frmSignUp.getContentPane().add(txtEnterYourEmail);
		txtEnterYourEmail.setColumns(10);
		
		txtEnterYourPassword = new JTextField();
		txtEnterYourPassword.setBounds(153, 104, 210, 29);
		frmSignUp.getContentPane().add(txtEnterYourPassword);
		txtEnterYourPassword.setColumns(10);
		//Submit button allows you to submit your newly created login credentials
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(20, 227, 89, 23);
		frmSignUp.getContentPane().add(btnSubmit);
		
		JLabel lblEnterYourEmail = new JLabel("Enter your email");
		lblEnterYourEmail.setBounds(20, 24, 123, 22);
		frmSignUp.getContentPane().add(lblEnterYourEmail);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password");
		lblEnterYourPassword.setBounds(20, 104, 123, 29);
		frmSignUp.getContentPane().add(lblEnterYourPassword);
		//Back button just takes you back to previous screen "GUI_Login"
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(335, 227, 89, 23);
		frmSignUp.getContentPane().add(btnBack);
	}
}
