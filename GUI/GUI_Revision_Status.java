package GUI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.ScrollPane;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Revision_Status {

	private JFrame frmRevision;
	private String[] Revisions = new String[1];
	private String paper;

	/**
	 * Launch the application.
	 */
	public static void main(String paper) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Revision_Status window = new GUI_Revision_Status(paper);
					window.frmRevision.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param paper is the String of the submitted paper
	 */
	public GUI_Revision_Status(String paper) {
		this.paper = paper;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmRevision = new JFrame();
		frmRevision.setTitle("Revision");
		frmRevision.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmRevision.setBounds(100, 100, 494, 469);
		frmRevision.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRevision.getContentPane().setLayout(null);
		frmRevision.setLocationRelativeTo(null);
		
		JLabel lblRevisionFeedback = new JLabel("Revision Feedback");
		lblRevisionFeedback.setBounds(10, 16, 98, 14);
		frmRevision.getContentPane().add(lblRevisionFeedback);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(10, 321, 46, 14);
		frmRevision.getContentPane().add(lblStatus);
		
		//Radio buttons add meta data to a submission, indicating its status to the author as well as the admin
		//Radio button "Under Review" lets you place the selected submission as "Under Review"
		JRadioButton rdbtnUnderReview = new JRadioButton("Under Review");
		rdbtnUnderReview.setBackground(Color.decode("#97d7ff"));
		rdbtnUnderReview.setBounds(124, 342, 112, 23);
		frmRevision.getContentPane().add(rdbtnUnderReview);
		//Radio button "Revised" lets you place the selected submission as "Revised"
		JRadioButton rdbtnRevised = new JRadioButton("Revised");
		rdbtnRevised.setBackground(Color.decode("#97d7ff"));
		rdbtnRevised.setBounds(238, 342, 112, 23);
		frmRevision.getContentPane().add(rdbtnRevised);
		//Radio button "Received" lets you place the selected submission as "Received"
		JRadioButton rdbtnReceived = new JRadioButton("Received");
		rdbtnReceived.setBackground(Color.decode("#97d7ff"));
		rdbtnReceived.setBounds(10, 342, 112, 23);
		frmRevision.getContentPane().add(rdbtnReceived);
		//Radio button "Finalize" lets you place the selected submission as "Finalize"
		JRadioButton rdbtnFinalize = new JRadioButton("Finalize");
		rdbtnFinalize.setBackground(Color.decode("#97d7ff"));
		rdbtnFinalize.setBounds(352, 342, 112, 23);
		frmRevision.getContentPane().add(rdbtnFinalize);
		
		
		/*This scroll pane allows the reviewer to write their revision suggestions to the author who will be 
		* be able to read them. Display any previous revision suggestions and upon hitting "submit" store them 
		* for the author or reviewer to view later. 
		*/
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 42, 458, 268);
		frmRevision.getContentPane().add(scrollPane);
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		//Submit lets you submit your revisions
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_Confirmation_Window.main(null);
				Revisions[0] = textArea.getText();
			}
		});
		
				//Back button just takes you back to previous screen
				JButton btnBack = new JButton("Back");
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						frmRevision.dispose();
						GUI_Reviewer.main(Revisions);
					}
				});
				btnBack.setBounds(10, 397, 89, 23);
				frmRevision.getContentPane().add(btnBack);
		btnSubmit.setBounds(375, 397, 89, 23);
		frmRevision.getContentPane().add(btnSubmit);
		
				
				
		

	}
}
