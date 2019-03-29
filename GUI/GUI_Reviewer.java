package GUI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class GUI_Reviewer extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_Reviewer window = new GUI_Reviewer();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public GUI_Reviewer(ActionListener l) {
		initialize(l);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param l 
	 */
	private void initialize(ActionListener l) {
		//frame = new JFrame();
		super.getContentPane().setBackground(Color.decode("#cee5f2"));
		super.setBounds(100, 100, 437, 594);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.getContentPane().setLayout(null);
		//Lets you switch to author page
		JButton btnAuthorPage = new JButton("Author Page");
		btnAuthorPage.setBounds(10, 494, 104, 23);
		super.getContentPane().add(btnAuthorPage);
		//Back brings you back to last page "Login"
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(308, 494, 89, 23);
		super.getContentPane().add(btnBack);
		
		JLabel lblSubmittedPapersFor = new JLabel("Submitted Papers for Review");
		lblSubmittedPapersFor.setBounds(10, 30, 228, 14);
		super.getContentPane().add(lblSubmittedPapersFor);
		//Select submission to review
		JButton btnReview = new JButton("Review");
		btnReview.setBounds(10, 279, 89, 23);
		super.getContentPane().add(btnReview);
		
		JLabel lblAuthorTicket = new JLabel("Reviewer Ticket");
		lblAuthorTicket.setBounds(10, 313, 104, 14);
		super.getContentPane().add(lblAuthorTicket);
		//This List provides all the submitted tickets by authors
		JList listAuthorTickets = new JList();
		listAuthorTickets.setBounds(10, 338, 401, 145);
		super.getContentPane().add(listAuthorTickets);
		//This list provides all the submitted papers by authors.
		JList listSubmittedPapers = new JList();
		listSubmittedPapers.setBounds(10, 55, 401, 213);
		super.getContentPane().add(listSubmittedPapers);
	}
}
