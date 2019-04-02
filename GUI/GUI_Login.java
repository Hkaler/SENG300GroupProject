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
		Icon logoImage;
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(24, 39, 89, 14);
		frmLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(24, 82, 83, 14);
		frmLogin.getContentPane().add(lblPassword);
		
		Login_Username = new JTextField();
		Login_Username.setHorizontalAlignment(SwingConstants.LEFT);
		Login_Username.setBounds(109, 36, 280, 20);
		frmLogin.getContentPane().add(Login_Username);
		Login_Username.setColumns(10);
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
		btnLogin.setBounds(300, 183, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		//"Sign Up" closes this frame and opens a Sign up frame.
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.dispose();
				GUI_Sign_Up.main(null);;
			}
		});
		//btnSignUp.addActionListener(l);
		btnSignUp.setBounds(10, 183, 89, 23);
		frmLogin.getContentPane().add(btnSignUp);
		
		Login_Password = new JPasswordField();
		Login_Password.setBounds(109, 79, 280, 20);
		frmLogin.getContentPane().add(Login_Password);
		
		logoImage = new ImageIcon("U:\\Desktop\\eclipseWorkspace\\SENG300GroupProject\\GUI\\uofcsuckss.jpg");
		JLabel lblIcon = new JLabel(logoImage);
		lblIcon.setBounds(109, 110, 180, 97);
		frmLogin.getContentPane().add(lblIcon);
		
	}
}
