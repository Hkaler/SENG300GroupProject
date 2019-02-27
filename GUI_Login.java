import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class GUI_Login {

	private JFrame frmJournalPublicationLogin;
	private JTextField txtUsername;
	private JPasswordField passwordField;

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
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setBounds(132, 36, 219, 20);
		frmJournalPublicationLogin.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(25, 128, 89, 23);
		frmJournalPublicationLogin.getContentPane().add(btnLogin);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(262, 128, 89, 23);
		frmJournalPublicationLogin.getContentPane().add(btnSignUp);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(132, 79, 219, 20);
		frmJournalPublicationLogin.getContentPane().add(passwordField);
	}
}
