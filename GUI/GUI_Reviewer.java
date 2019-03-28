package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class GUI_Reviewer {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Reviewer window = new GUI_Reviewer();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 437, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//Lets you switch to author page
		JButton btnAuthorPage = new JButton("Author Page");
		btnAuthorPage.setBounds(10, 494, 104, 23);
		frame.getContentPane().add(btnAuthorPage);
		//Back brings you back to last page "Login"
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(308, 494, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblSubmittedPapersFor = new JLabel("Submitted Papers for Review");
		lblSubmittedPapersFor.setBounds(10, 30, 228, 14);
		frame.getContentPane().add(lblSubmittedPapersFor);
		//Select submission to review
		JButton btnReview = new JButton("Review");
		btnReview.setBounds(10, 279, 89, 23);
		frame.getContentPane().add(btnReview);
		
		JLabel lblAuthorTicket = new JLabel("Reviewer Ticket");
		lblAuthorTicket.setBounds(10, 313, 104, 14);
		frame.getContentPane().add(lblAuthorTicket);
		//This List provides all the submitted tickets by authors
		JList listAuthorTickets = new JList();
		listAuthorTickets.setBounds(10, 338, 401, 145);
		frame.getContentPane().add(listAuthorTickets);
		//This list provides all the submitted papers by authors.
		JList listSubmittedPapers = new JList();
		listSubmittedPapers.setBounds(10, 55, 401, 213);
		frame.getContentPane().add(listSubmittedPapers);
	}
}
