package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class GUI_Revision_Status {

	private JFrame frame;
	private JTextField textRevisionNotes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Revision_Status window = new GUI_Revision_Status();
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
	public GUI_Revision_Status() {
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
		
		textRevisionNotes = new JTextField();
		textRevisionNotes.setBounds(10, 41, 401, 270);
		frame.getContentPane().add(textRevisionNotes);
		textRevisionNotes.setColumns(10);
		
		JLabel lblRevisionFeedback = new JLabel("Revision Feedback");
		lblRevisionFeedback.setBounds(10, 16, 98, 14);
		frame.getContentPane().add(lblRevisionFeedback);
		//Submit lets you submit your revisions
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(229, 521, 89, 23);
		frame.getContentPane().add(btnSubmit);
		//Back button just takes you back to previous screen
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(322, 521, 89, 23);
		frame.getContentPane().add(btnBack);
		//Radio button "Under Review" lets you place the selected submission as "Under Review"
		JRadioButton rdbtnUnderReview = new JRadioButton("Under Review");
		rdbtnUnderReview.setBounds(10, 368, 109, 23);
		frame.getContentPane().add(rdbtnUnderReview);
		//Radio button "Revised" lets you place the selected submission as "Revised"
		JRadioButton rdbtnRevised = new JRadioButton("Revised");
		rdbtnRevised.setBounds(10, 394, 109, 23);
		frame.getContentPane().add(rdbtnRevised);
		//Radio button "Received" lets you place the selected submission as "Received"
		JRadioButton rdbtnReceived = new JRadioButton("Received");
		rdbtnReceived.setBounds(10, 342, 109, 23);
		frame.getContentPane().add(rdbtnReceived);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(20, 321, 46, 14);
		frame.getContentPane().add(lblStatus);
		//Radio button "Finalize" lets you place the selected submission as "Finalize"
		JRadioButton rdbtnFinalize = new JRadioButton("Finalize");
		rdbtnFinalize.setBounds(10, 419, 109, 23);
		frame.getContentPane().add(rdbtnFinalize);
	}
}
