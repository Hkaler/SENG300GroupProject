import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Login  extends JFrame{

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
		//this.frmJournalPublicationLogin.setVisible(true);
		initialize(listen);
	}

	/**
	 * Get user name.
<<<<<<< HEAD
=======
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
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
		btnLogin.addActionListener(listen);
=======
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
>>>>>>> refs/remotes/origin/master
		btnLogin.setBounds(25, 128, 89, 23);
		super.getContentPane().add(btnLogin);
		
		
		//Sign up button directs you to GUI_Sign_UP to create an account 
		JButton btnSignUp = new JButton("Sign Up");
<<<<<<< HEAD
		btnSignUp.addActionListener(listen);
=======
		//btnSignUp.addActionListener(l);
>>>>>>> refs/remotes/origin/master
		btnSignUp.setBounds(262, 128, 89, 23);
		super.getContentPane().add(btnSignUp);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(132, 79, 219, 20);
		super.getContentPane().add(passwordField);
	}
}
