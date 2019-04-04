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

import Backend.Login;

import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

/**
 * 
 * @author taylor.skaalrud1
 * Sign up features 4 fields (2 text, 1 password, and 1 drop-down selection) 
 * "Submit" will store the values
 * "Back closes the window and *should* open a login window"
 */
public class GUI_Sign_Up {

	private JFrame frmSignUp;
	private JTextField Sign_Up_Username;
	private JPasswordField Sign_Up_Password;
	private JTextField Sign_Up_Email;
	private String roles[] = {"Author", "Reviewer", "Administrator"};
	private String currentRole = "Author"; //Defaults to Author
	private String[] Entry = new String[4];
	
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
		frmSignUp.setTitle("Sign Up");
		frmSignUp.setBounds(100, 100, 396, 245);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		frmSignUp.setLocationRelativeTo(null);
		
		
		JLabel lblUsername = new JLabel("Enter your username:");
		lblUsername.setBounds(20, 24, 123, 22);
		frmSignUp.getContentPane().add(lblUsername);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password:");
		lblEnterYourPassword.setBounds(20, 76, 123, 29);
		frmSignUp.getContentPane().add(lblEnterYourPassword);
		
		JLabel lblRole = new JLabel("Enter your role:");
		lblRole.setBounds(20, 57, 123, 14);
		frmSignUp.getContentPane().add(lblRole);
		
		JLabel lblEnterYourEmail = new JLabel("Enter your Email:");
		lblEnterYourEmail.setBounds(20, 110, 123, 14);
		frmSignUp.getContentPane().add(lblEnterYourEmail);
		
		//Text field for username
		Sign_Up_Username = new JTextField();
		Sign_Up_Username.setHorizontalAlignment(SwingConstants.LEFT);
		Sign_Up_Username.setBounds(153, 21, 210, 29);
		frmSignUp.getContentPane().add(Sign_Up_Username);
		Sign_Up_Username.setColumns(10);
		
		//Drop down role selector; current Role contains the selection
		JComboBox Sign_Up_Role = new JComboBox(roles);
		Sign_Up_Role.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (arg0.getSource() == Sign_Up_Role) {
					currentRole = roles[Sign_Up_Role.getSelectedIndex()];
				}
			}
		});
		Sign_Up_Role.setBounds(153, 50, 210, 29);
		frmSignUp.getContentPane().add(Sign_Up_Role);
		
		//text field for password
		Sign_Up_Password = new JPasswordField();
		Sign_Up_Password.setHorizontalAlignment(SwingConstants.LEFT);
		Sign_Up_Password.setBounds(153, 76, 210, 29);
		frmSignUp.getContentPane().add(Sign_Up_Password);
		
		//text field for email
		Sign_Up_Email = new JTextField();
		Sign_Up_Email.setHorizontalAlignment(SwingConstants.LEFT);
		Sign_Up_Email.setColumns(10);
		Sign_Up_Email.setBounds(153, 103, 210, 29);
		frmSignUp.getContentPane().add(Sign_Up_Email);
		
		//Submit button places the 4 values entered into "Entry" for retrieval and returns to "Login"
				JButton btnSubmit = new JButton("Submit");
				btnSubmit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						GUI_Confirmation_Window.main(null);
						Entry[0] = Sign_Up_Username.getText();
						Entry[1] = currentRole;
						Entry[2] = String.copyValueOf(Sign_Up_Password.getPassword());
						Entry[3] = Sign_Up_Email.getText();
						try {
							Login.signUp(Entry[0], Entry[2], Entry[1]);
						} catch (Exception signUpException) {
							signUpException.printStackTrace();
						}
						frmSignUp.dispose();
						GUI_Login.main(Entry);				
					}
				});
				
				//Back button just takes you back to previous screen "GUI_Login"
				JButton btnBack = new JButton("Back");
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frmSignUp.dispose();
						GUI_Login.main(null);				
					}
				});
				btnBack.setBounds(20, 172, 89, 23);
				frmSignUp.getContentPane().add(btnBack);
				btnSubmit.setBounds(274, 172, 89, 23);
				frmSignUp.getContentPane().add(btnSubmit);
		
	}
}
