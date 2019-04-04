package GUI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Backend.Login;

/**
 * 
 * @author taylor.skaalrud1
 * Login allows the user to enter the credentials and login to their highest permission level main-page or sign-up
 */
public class GUI_Login {

	private JFrame frmLogin;
	private static JTextField Login_Username;
	private static JPasswordField Login_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Login window = new GUI_Login();
					window.frmLogin.setVisible(true);
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
		return (Login_Username.getText());
	}
	
	/**
	 * Get password.
	 */
	@SuppressWarnings("deprecation")
	public static String getPassword() {
		return (Login_Password.getText());
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 415, 256);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		frmLogin.setLocationRelativeTo(null);
		
		//U of C Icon
		Icon logoImage = new ImageIcon("GUI\\uofclogo.jpg");;
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(24, 39, 89, 14);
		frmLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(24, 82, 83, 14);
		frmLogin.getContentPane().add(lblPassword);
		JLabel lblIcon = new JLabel(logoImage);
		lblIcon.setBounds(109, 110, 180, 97);
		frmLogin.getContentPane().add(lblIcon);
		
		//Username field
		Login_Username = new JTextField();
		Login_Username.setHorizontalAlignment(SwingConstants.LEFT);
		Login_Username.setBounds(109, 36, 280, 20);
		frmLogin.getContentPane().add(Login_Username);
		Login_Username.setColumns(10);
		
		//This button validates credentials and determines which GUI to direct you to upon clicking "Login"
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			//Make an asynchronous thread to handle new windows
			public void actionPerformed(ActionEvent arg0) {
				try {
					Login.logIn(Login_Username.getText(), (String.valueOf(Login_Password.getPassword())));
				} catch (Exception LoginError) {
					LoginError.printStackTrace();
				}
				if (Login.newUser.getRole().equals("Administrator")) {
					frmLogin.dispose();
					GUI_Admin.main(null);
				}	else if (Login.newUser.getRole().equals("Reviewer")) {
						frmLogin.dispose();
						GUI_Reviewer.main(null);
					 } 	else if (Login.newUser.getRole().equals("Author")) {
						 frmLogin.dispose();
						 GUI_Author_Main.main(null);	
					 }
				}
			}
		);
		
		//Password field
		Login_Password = new JPasswordField();
		Login_Password.setBounds(109, 79, 280, 20);
		frmLogin.getContentPane().add(Login_Password);
		
		btnLogin.setBounds(300, 183, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		
		//switches to Sign Up page
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.dispose();
				GUI_Sign_Up.main(null);;
			}
		});
		btnSignUp.setBounds(10, 183, 89, 23);
		frmLogin.getContentPane().add(btnSignUp);

	
		
	}
}
