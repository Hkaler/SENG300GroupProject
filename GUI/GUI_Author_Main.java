package GUI;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import OpenFile;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUI_Author_Main {

	private JFrame frmAuthorMainPage;
	private JTextField txtSupportTicket;
	private JTextField txtSubmitPaper;
	private JTextField txtRevision;
	private JTextField txtReviewStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Author_Main window = new GUI_Author_Main();
					window.frmAuthorMainPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public GUI_Author_Main() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception {
		
		File file = new File(System.getenv("programfiles"));
		frmAuthorMainPage = new JFrame();
		frmAuthorMainPage.setTitle("Author Main Page");
		frmAuthorMainPage.setBounds(100, 100, 437, 594);
		frmAuthorMainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAuthorMainPage.getContentPane().setLayout(null);
		
		JLabel lblSubmitPaper = new JLabel("Submit Paper:");
		lblSubmitPaper.setBounds(10, 49, 157, 14);
		frmAuthorMainPage.getContentPane().add(lblSubmitPaper);
		
		/* btnUploadPaper opens a file window upload page and allows a user to choose which paper they want to upload. 
		 * The file name will be shown on the textfield
		 */
		JButton btnUploadPaper = new JButton("Upload");
		btnUploadPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* This opens the actual file contents into the textfield */
				OpenFile of = new OpenFile();
				
				try {
					of.PickMe();
				} catch (Exception f) {
					f.printStackTrace();
				}
				txtSubmitPaper.setText(of.fileChooser.getSelectedFile().getName());
			}
		});
		btnUploadPaper.setBounds(314, 45, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnUploadPaper);
		
		JLabel lblSubmitSupportTicket = new JLabel("Submit Support Ticket:");
		lblSubmitSupportTicket.setBounds(10, 105, 157, 14);
		frmAuthorMainPage.getContentPane().add(lblSubmitSupportTicket);
		
		txtSupportTicket = new JTextField();
		txtSupportTicket.setBounds(10, 130, 393, 96);
		frmAuthorMainPage.getContentPane().add(txtSupportTicket);
		txtSupportTicket.setColumns(10);
		//Submit button is used to submit a support ticket
		JButton btnSubmitSupport = new JButton("Submit");
		btnSubmitSupport.setBounds(314, 237, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnSubmitSupport);
		
		JLabel lblUploadRevisions = new JLabel("Upload Revisions:");
		lblUploadRevisions.setBounds(10, 300, 217, 14);
		frmAuthorMainPage.getContentPane().add(lblUploadRevisions);
		
		/* btnUploadRevision opens a file window upload page and allows a user to choose which revised paper they want to upload. 
		 * The file name will be shown on the textfield
		 */
		JButton btnUploadRevision = new JButton("Upload");
		btnUploadRevision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* This opens the actual file contents into the textfield */
				OpenFile of = new OpenFile();
				
				try {
					of.PickMe();
				} catch (Exception f) {
					f.printStackTrace();
				}
				txtRevision.setText(of.fileChooser.getSelectedFile().getName());
			}
		});
		btnUploadRevision.setBounds(314, 296, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnUploadRevision);
		
		txtSubmitPaper = new JTextField();
		txtSubmitPaper.setBounds(10, 74, 393, 20);
		frmAuthorMainPage.getContentPane().add(txtSubmitPaper);
		txtSubmitPaper.setColumns(10);
		
		txtRevision = new JTextField();
		txtRevision.setColumns(10);
		txtRevision.setBounds(10, 325, 393, 20);
		frmAuthorMainPage.getContentPane().add(txtRevision);
		
		/* btnSignout lets the user go back to the login page  */
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignOut.setBounds(314, 521, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnSignOut);
		
		JLabel lblReviewStatus = new JLabel("Review Status:");
		lblReviewStatus.setBounds(10, 374, 101, 14);
		frmAuthorMainPage.getContentPane().add(lblReviewStatus);
		
		txtReviewStatus = new JTextField();
		txtReviewStatus.setBounds(10, 410, 393, 100);
		frmAuthorMainPage.getContentPane().add(txtReviewStatus);
		txtReviewStatus.setColumns(10);
		
	}
}
