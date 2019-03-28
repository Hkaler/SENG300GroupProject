import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Container;

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
		getContentPane().setLayout(null);
		
		//Submit button allows you to submit your newly created login credentials
		JButton btnSubmit = new JButton("Continue");
		btnSubmit.setBounds(325, 227, 111, 23);
		getContentPane().add(btnSubmit);
		//Back button just takes you back to previous screen "GUI_Login"
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(12, 227, 89, 23);
		getContentPane().add(btnBack);
		
		txtEnterYourPassword = new JTextField();
		txtEnterYourPassword.setBounds(191, 104, 210, 29);
		getContentPane().add(txtEnterYourPassword);
		txtEnterYourPassword.setColumns(10);
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.setBounds(191, 12, 210, 29);
		getContentPane().add(txtEnterYourEmail);
		txtEnterYourEmail.setColumns(10);
		btnBack.addActionListener(l);
		btnSubmit.addActionListener(l);
		initialize(l);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param l 
	 */
	private void initialize(ActionListener l) {
		super.setTitle("Sign Up");
		super.setBounds(100, 100, 450, 300);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.getContentPane().setLayout(null);
		Container container_3 = super.getContentPane();
		Container container_2 = super.getContentPane();
		Container container = super.getContentPane();
		
		JLabel lblEnterYourEmail = new JLabel("Enter your email");
		lblEnterYourEmail.setBounds(20, 24, 123, 22);
		super.getContentPane().add(lblEnterYourEmail);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password");
		lblEnterYourPassword.setBounds(20, 104, 159, 29);
		super.getContentPane().add(lblEnterYourPassword);
		Container container_1 = super.getContentPane();
	}
}
