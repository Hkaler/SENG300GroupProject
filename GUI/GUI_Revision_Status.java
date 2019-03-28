package GUI;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

public class GUI_Revision_Status {

	private JFrame frame;

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
		frame.getContentPane().setBackground(Color.decode("#cee5f2"));
		frame.setBounds(100, 100, 494, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRevisionFeedback = new JLabel("Revision Feedback");
		lblRevisionFeedback.setBounds(10, 16, 98, 14);
		frame.getContentPane().add(lblRevisionFeedback);
		//Submit lets you submit your revisions
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(363, 397, 89, 23);
		frame.getContentPane().add(btnSubmit);
		//Back button just takes you back to previous screen
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 397, 89, 23);
		frame.getContentPane().add(btnBack);
		//Radio button "Under Review" lets you place the selected submission as "Under Review"
		JRadioButton rdbtnUnderReview = new JRadioButton("Under Review");
		rdbtnUnderReview.setBounds(121, 342, 109, 23);
		frame.getContentPane().add(rdbtnUnderReview);
		//Radio button "Revised" lets you place the selected submission as "Revised"
		JRadioButton rdbtnRevised = new JRadioButton("Revised");
		rdbtnRevised.setBounds(232, 342, 109, 23);
		frame.getContentPane().add(rdbtnRevised);
		//Radio button "Received" lets you place the selected submission as "Received"
		JRadioButton rdbtnReceived = new JRadioButton("Received");
		rdbtnReceived.setBackground(Color.decode("#97d7ff"));
		rdbtnReceived.setBounds(10, 342, 109, 23);
		frame.getContentPane().add(rdbtnReceived);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(20, 321, 46, 14);
		frame.getContentPane().add(lblStatus);
		//Radio button "Finalize" lets you place the selected submission as "Finalize"
		JRadioButton rdbtnFinalize = new JRadioButton("Finalize");
		rdbtnFinalize.setBounds(343, 342, 109, 23);
		frame.getContentPane().add(rdbtnFinalize);
		
		
		/*This scroll pane allows the reviewer to write their revision suggestions to the author who will be 
		* be able to read them. Display any previous revision suggestions and upon hitting "submit" store them 
		* for the author or reviewer to view later. 
		*/
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 42, 443, 268);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
	
		
				
				
		

	}
}
