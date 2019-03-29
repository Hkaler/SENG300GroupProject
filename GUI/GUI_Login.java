package GUI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Backend.Login;

public class GUI_Login extends JFrame{

	private JFrame frmJournalPublicationLogin;
	private static JTextField txtUsername;
	private static JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_Login window = new GUI_Login();
//					window.frmJournalPublicationLogin.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public GUI_Login(ActionListener listen) {
		initialize(listen);
	}

	/**
	 * Get user name.
	 */
	public String getUsername() {
		return (txtUsername.getText());
	}
	
	/**
	 * Get password.
	 */
	@SuppressWarnings("deprecation")
	public String getPassword() {
		String temp = new String(passwordField.getPassword());
		return temp;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ActionListener listen) {
		//frmJournalPublicationLogin = new JFrame();
		super.getContentPane().setBackground(Color.decode("#cee5f2"));
		super.setTitle("Journal Publication Login");
		super.setBounds(100, 100, 415, 273);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setBounds(25, 39, 80, 14);
		super.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(25, 82, 80, 14);
		super.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setBounds(132, 36, 219, 20);
		super.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		//This button validates credentials and determines which GUI to direct you to upon clicking "Login"
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(listen);
		btnLogin.setBounds(25, 128, 89, 23);
		super.getContentPane().add(btnLogin);
		
		//Sign up button directs you to GUI_Sign_UP to create an account 
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(listen);
		btnSignUp.setBounds(262, 128, 89, 23);
		super.getContentPane().add(btnSignUp);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(132, 79, 219, 20);
		super.getContentPane().add(passwordField);
	}
}
