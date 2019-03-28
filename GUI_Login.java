import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;

public class GUI_Login  extends JFrame{

	private JFrame frmJournalPublicationLogin;
	private static JTextField txtUsername;
	private static JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_Login window = new GUI_Login();
//					window.
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
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(133, 58, 226, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setBounds(29, 27, 80, 14);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(29, 55, 112, 19);
		getContentPane().add(lblPassword);
		
		
		//This button validates credentials and determines which GUI to direct you to upon clicking "Login"
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(29, 201, 89, 23);
		getContentPane().add(btnLogin);
		
		
		//Sign up button directs you to GUI_Sign_UP to create an account 
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(260, 200, 89, 23);
		getContentPane().add(btnSignUp);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 124, 226, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(133, 26, 219, 20);
		getContentPane().add(txtUsername);
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 89, 219, 20);
		getContentPane().add(passwordField);
		
		JLabel lblRole = new JLabel("ROLE");
		lblRole.setBounds(29, 94, 70, 15);
		getContentPane().add(lblRole);
		
		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setBounds(29, 126, 70, 15);
		getContentPane().add(lblEmail);
		btnSignUp.addActionListener(listen);
		btnLogin.addActionListener(listen);
		//this.frmJournalPublicationLogin.setVisible(true);
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
	//@SuppressWarnings("deprecation")
	public  char[] getPassword() {
		return (passwordField.getPassword());
	}
	
	/**
	 * Initialize the contents of the frame.
	 * @param listen 
	 */
	private void initialize(ActionListener listen) {
		//frmJournalPublicationLogin = new JFrame();
		super.setTitle("Journal Publication Login");
		super.setBounds(100, 100, 415, 273);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.getContentPane().setLayout(null);
		Container container = super.getContentPane();
		Container container_3 = super.getContentPane();
		Container container_4 = super.getContentPane();
		Container container_1 = super.getContentPane();
		Container container_2 = super.getContentPane();
		Container container_5 = super.getContentPane();
	}
}
