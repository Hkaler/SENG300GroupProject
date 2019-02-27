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
		
		JButton btnAuthorPage = new JButton("Author Page");
		btnAuthorPage.setBounds(10, 494, 104, 23);
		frame.getContentPane().add(btnAuthorPage);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(308, 494, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblSubmittedPapersFor = new JLabel("Submitted Papers for Review");
		lblSubmittedPapersFor.setBounds(10, 30, 228, 14);
		frame.getContentPane().add(lblSubmittedPapersFor);
		
		JButton btnReview = new JButton("Review");
		btnReview.setBounds(10, 279, 89, 23);
		frame.getContentPane().add(btnReview);
		
		JLabel lblAuthorTicket = new JLabel("Author Ticket");
		lblAuthorTicket.setBounds(10, 313, 104, 14);
		frame.getContentPane().add(lblAuthorTicket);
		
		JList listAuthorTickets = new JList();
		listAuthorTickets.setBounds(10, 338, 401, 145);
		frame.getContentPane().add(listAuthorTickets);
		
		JList listSubmittedPapers = new JList();
		listSubmittedPapers.setBounds(10, 55, 401, 213);
		frame.getContentPane().add(listSubmittedPapers);
	}
}
