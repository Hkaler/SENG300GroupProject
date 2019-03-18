import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;

public class GUI_Sign_Up extends JFrame{

	private JFrame frmSignUp;
	private JTextField txtEnterYourEmail;
	private JTextField txtEnterYourPassword;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_Sign_Up window = new GUI_Sign_Up();
//					window.frmSignUp.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public GUI_Sign_Up(ActionListener l) {
		initialize(l);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param l 
	 */
	private void initialize(ActionListener l) {
		//frmSignUp = new JFrame();
		super.setTitle("Sign Up");
		super.setBounds(100, 100, 450, 300);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.getContentPane().setLayout(null);
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.setBounds(153, 21, 210, 29);
		super.getContentPane().add(txtEnterYourEmail);
		txtEnterYourEmail.setColumns(10);
		
		txtEnterYourPassword = new JTextField();
		txtEnterYourPassword.setBounds(153, 104, 210, 29);
		super.getContentPane().add(txtEnterYourPassword);
		txtEnterYourPassword.setColumns(10);
		
		//Submit button allows you to submit your newly created login credentials
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(l);
		btnSubmit.setBounds(20, 227, 89, 23);
		super.getContentPane().add(btnSubmit);
		
		JLabel lblEnterYourEmail = new JLabel("Enter your email");
		lblEnterYourEmail.setBounds(20, 24, 123, 22);
		super.getContentPane().add(lblEnterYourEmail);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password");
		lblEnterYourPassword.setBounds(20, 104, 123, 29);
		super.getContentPane().add(lblEnterYourPassword);
		//Back button just takes you back to previous screen "GUI_Login"
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(l);
		btnBack.setBounds(335, 227, 89, 23);
		super.getContentPane().add(btnBack);
	}
}
