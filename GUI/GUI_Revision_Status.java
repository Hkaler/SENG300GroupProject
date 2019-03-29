package GUI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import Backend.Driver;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Revision_Status {

	private JFrame frmRevision;
	private String[] Revisions = new String[1];
	private Driver drive;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_Revision_Status window = new GUI_Revision_Status();
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
	public GUI_Revision_Status(Driver d) {
		//frame = new JFrame();
		this.drive = d;
		initialize(drive.getAction());
	}

	/**
	 * Initialize the contents of the frame.
	 * @param l
	 */
	private void initialize(ActionListener l) {
		frmRevision = new JFrame();
		frmRevision.setTitle("Revision");
		frmRevision.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmRevision.setBounds(100, 100, 494, 469);
		frmRevision.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRevision.getContentPane().setLayout(null);


		//Back button just takes you back to previous screen
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmRevision.dispose();
				drive.setReviewerVisible(true);
			}
		});
		btnBack.setBounds(10, 397, 89, 23);
		frmRevision.getContentPane().add(btnBack);
		
		//Radio button "Under Review" lets you place the selected submission as "Under Review"
		JRadioButton rdbtnUnderReview = new JRadioButton("Under Review");
		rdbtnUnderReview.setBackground(Color.decode("#97d7ff"));
		rdbtnUnderReview.setBounds(124, 342, 112, 23);
		
		//Radio button "Revised" lets you place the selected submission as "Revised"
		JRadioButton rdbtnRevised = new JRadioButton("Revised");
		rdbtnRevised.setBackground(Color.decode("#97d7ff"));
		rdbtnRevised.setBounds(238, 342, 112, 23);
		
		//Radio button "Received" lets you place the selected submission as "Received"
		JRadioButton rdbtnReceived = new JRadioButton("Received");
		rdbtnReceived.setBackground(Color.decode("#97d7ff"));
		rdbtnReceived.setBounds(10, 342, 112, 23);

		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(10, 321, 46, 14);
		frmRevision.getContentPane().add(lblStatus);
		
		//Radio button "Finalize" lets you place the selected submission as "Finalize"
		JRadioButton rdbtnFinalize = new JRadioButton("Finalize");
		rdbtnFinalize.setBackground(Color.decode("#97d7ff"));
		rdbtnFinalize.setBounds(352, 342, 112, 23);


		/*This scroll pane allows the reviewer to write their revision suggestions to the author who will be
		* be able to read them. Display any previous revision suggestions and upon hitting "submit" store them
		* for the author or reviewer to view later.
		*/
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 42, 458, 268);
		frmRevision.getContentPane().add(scrollPane);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnReceived);
		bg.add(rdbtnFinalize);
		bg.add(rdbtnUnderReview);
		bg.add(rdbtnRevised);

		frmRevision.getContentPane().add(rdbtnRevised);
		frmRevision.getContentPane().add(rdbtnUnderReview);
		frmRevision.getContentPane().add(rdbtnReceived);
		frmRevision.getContentPane().add(rdbtnFinalize);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JLabel lblRevisionFeedback = new JLabel("Revision Feedback");
		lblRevisionFeedback.setBounds(10, 16, 98, 14);
		frmRevision.getContentPane().add(lblRevisionFeedback);
		
		//Submit lets you submit your revisions
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Revisions[0] = textArea.getText();
			}
		});
		btnSubmit.setBounds(375, 397, 89, 23);
		frmRevision.getContentPane().add(btnSubmit);





	}

	public void setVisible(boolean x) {
		frmRevision.setVisible(x);
		
	}
}
