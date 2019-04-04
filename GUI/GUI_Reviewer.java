package GUI;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

import Backend.Login;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/** 
 * 
 * @author taylor.skaalrud1
 * Reviewer allows the user to switch to author; to admin if they possess admin level access, select papers to review, & 
 * submit support tickets to the admin
 */
public class GUI_Reviewer {

	private JFrame frmReviewerMainPage;
	private String[] Ticket = new String[1];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Reviewer window = new GUI_Reviewer();
					window.frmReviewerMainPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Reviewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReviewerMainPage = new JFrame();
		frmReviewerMainPage.setTitle("Reviewer Main Page");
		frmReviewerMainPage.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmReviewerMainPage.setBounds(100, 100, 644, 398);
		frmReviewerMainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReviewerMainPage.getContentPane().setLayout(null);
		frmReviewerMainPage.setLocationRelativeTo(null);
		
		//Switches to the author page
		JButton btnAuthorPage = new JButton("Author Page");
		btnAuthorPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmReviewerMainPage.dispose();
				GUI_Author_Main.main(Ticket);
			}
		});
		
		JLabel lblSubmittedPapersFor = new JLabel("Submitted Papers for Review");
		lblSubmittedPapersFor.setBounds(10, 48, 228, 14);
		frmReviewerMainPage.getContentPane().add(lblSubmittedPapersFor);
		
		JLabel lblReviewerTicket = new JLabel("Reviewer Tickets");
		lblReviewerTicket.setHorizontalAlignment(SwingConstants.RIGHT);
		lblReviewerTicket.setBounds(514, 48, 104, 14);
		frmReviewerMainPage.getContentPane().add(lblReviewerTicket);
		
		//Displays the list of all the papers the reviewer is assigned to
		JList listSubmittedPapers = new JList();
		listSubmittedPapers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listSubmittedPapers.setBounds(10, 73, 297, 207);
		frmReviewerMainPage.getContentPane().add(listSubmittedPapers);	
		
		//Text field used to enter a support ticket
		JScrollPane scrollPaneReviewerTicket = new JScrollPane();
		scrollPaneReviewerTicket.setBounds(321, 73, 297, 207);
		frmReviewerMainPage.getContentPane().add(scrollPaneReviewerTicket);
		JTextArea textAreaReviewerTicket = new JTextArea();
		scrollPaneReviewerTicket.setViewportView(textAreaReviewerTicket);
		btnAuthorPage.setBounds(10, 11, 104, 23);
		frmReviewerMainPage.getContentPane().add(btnAuthorPage);
		
		//Signs out to the login screen
		JButton btnBack = new JButton("Sign Out");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmReviewerMainPage.dispose();
				GUI_Login.main(Ticket);
			}
		});
		btnBack.setBounds(10, 325, 89, 23);
		frmReviewerMainPage.getContentPane().add(btnBack);
		
		//switch to Admin if the user has at admin privileges
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Login.newUser.getRole().equals("Administrator")) {
					frmReviewerMainPage.dispose();
					GUI_Admin.main(null);
				}
			}
		});
		btnAdmin.setBounds(529, 11, 89, 23);
		frmReviewerMainPage.getContentPane().add(btnAdmin);
		
		//switches to the revision status page for a selected paper, passing it the String value of the selected paper
		JButton btnReview = new JButton("Review");
		btnReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmReviewerMainPage.dispose();
				GUI_Revision_Status.main(String.valueOf(listSubmittedPapers.getSelectedValue()));
			}
		});
		btnReview.setBounds(96, 291, 89, 23);
		frmReviewerMainPage.getContentPane().add(btnReview);
		
		//Used to submit a ticket to the admin
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_Confirmation_Window.main(null);
				Ticket[0] = textAreaReviewerTicket.getText();
			}
		});
		btnSubmit.setBounds(425, 291, 89, 23);
		frmReviewerMainPage.getContentPane().add(btnSubmit);
	}
}
