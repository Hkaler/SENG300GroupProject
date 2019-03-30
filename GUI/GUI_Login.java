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

import Backend.Driver;
import Backend.Login;

public class GUI_Login {

	private JFrame frmLogin;
	private JTextField Login_Username;
	private JPasswordField Login_Password;
	private Driver d;

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
	public GUI_Login(Driver d) {
		this.d = d;
		frmLogin = new JFrame();
		initialize(d.getAction());
	}

	/**
	 * Get user name.
	 */
	public String getUsername() {
		return (Login_Username.getText());
	}

	/**
	 * Get password.
	 */
	@SuppressWarnings("deprecation")
	public String getPassword() {
		String temp = new String(Login_Password.getPassword());
		return temp;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ActionListener l) {
		//frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 415, 256);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblUsername = new JLabel("Enter your Username");
		lblUsername.setBounds(10, 39, 126, 14);
		frmLogin.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Enter your Password");
		lblPassword.setBounds(10, 82, 126, 14);
		frmLogin.getContentPane().add(lblPassword);

		Login_Username = new JTextField();
		Login_Username.setHorizontalAlignment(SwingConstants.LEFT);
		Login_Username.setBounds(146, 36, 243, 20);
		frmLogin.getContentPane().add(Login_Username);
		Login_Username.setColumns(10);
		//This button validates credentials and determines which GUI to direct you to upon clicking "Login"
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(l);
		btnLogin.setBounds(300, 183, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		
		//"Sign Up" closes this frame and opens a Sign up frame.
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.dispose();
				d.setSignupVisibile(true);
			}
		});
		//btnSignUp.addActionListener(l);
		btnSignUp.setBounds(10, 183, 89, 23);
		frmLogin.getContentPane().add(btnSignUp);

		Login_Password = new JPasswordField();
		Login_Password.setBounds(146, 79, 243, 20);
		frmLogin.getContentPane().add(Login_Password);
	}
	
	public void dispose() {
		frmLogin.dispose();
	}
	
	public void clearFields() {
		Login_Username.setText("");
		Login_Password.setText("");
	}
	

	public void setVisible (boolean x) {
		frmLogin.setVisible(x);
	}
}
