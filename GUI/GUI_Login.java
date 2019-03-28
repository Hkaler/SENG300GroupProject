package GUI;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Login;

public class GUI_Login {

	private JFrame frmJournalPublicationLogin;
	private static JTextField txtUsername;
	private static JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Login window = new GUI_Login();
					window.frmJournalPublicationLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Login() {
		initialize();
	}

	/**
	 * Get user name.
	 */
	public static String getUsername() {
		return (txtUsername.getText());
	}
	
	/**
	 * Get password.
	 */
	@SuppressWarnings("deprecation")
	public static String getPassword() {
		return (passwordField.getText());
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJournalPublicationLogin = new JFrame();
		frmJournalPublicationLogin.setTitle("Journal Publication Login");
		frmJournalPublicationLogin.setBounds(100, 100, 415, 273);
		frmJournalPublicationLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJournalPublicationLogin.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setBounds(25, 39, 80, 14);
		frmJournalPublicationLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(25, 82, 80, 14);
		frmJournalPublicationLogin.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setBounds(132, 36, 219, 20);
		frmJournalPublicationLogin.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		//This button validates credentials and determines which GUI to direct you to upon clicking "Login"
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			/* we're creating a demo format for linking login credentials to appropriate GUI
			i.e logging in with admin credentials means getting the admin GUI*/
			//Make an asynchronous thread to handle new windows
			public void actionPerformed(ActionEvent arg0) {
				if (Login.newUser.getRole().equals("admin")) {
					try {
						new GUI_Author_Main();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		});
		btnLogin.setBounds(25, 128, 89, 23);
		frmJournalPublicationLogin.getContentPane().add(btnLogin);
		//Sign up button directs you to GUI_Sign_UP to create an account 
		JButton btnSignUp = new JButton("Sign Up");
		//btnSignUp.addActionListener(l);
		btnSignUp.setBounds(262, 128, 89, 23);
		frmJournalPublicationLogin.getContentPane().add(btnSignUp);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(132, 79, 219, 20);
		frmJournalPublicationLogin.getContentPane().add(passwordField);
	}
}
