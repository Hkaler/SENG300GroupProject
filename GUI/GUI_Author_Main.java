package GUI;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import Backend.OpenFile;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI_Author_Main {

//	protected static final ActionListener ActionListener = null;
	private JFrame frmAuthorMainPage;
	private JTextField txtSubmitPaper;
	private JTextField txtRevision;
	private String[] Ticket = new String[1];
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_Author_Main window = new GUI_Author_Main(ActionListener);
//					window.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public GUI_Author_Main(ActionListener listen)  {
		frmAuthorMainPage = new JFrame();
		try {
			initialize(listen);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * @param listen 
	 */
	private void initialize(ActionListener listen) throws Exception {
		
		File file = new File(System.getenv("programfiles"));
		frmAuthorMainPage.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmAuthorMainPage.setTitle("Author Main Page");
		frmAuthorMainPage.setBounds(100, 100, 688, 425);
		frmAuthorMainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAuthorMainPage.getContentPane().setLayout(null);
		
		JLabel lblPaper = new JLabel("Paper");
		lblPaper.setBounds(10, 11, 46, 14);
		frmAuthorMainPage.getContentPane().add(lblPaper);
		
		JLabel lblSubmitPaper = new JLabel("Submit Paper:");
		lblSubmitPaper.setBounds(10, 36, 157, 14);
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
		btnUploadPaper.setBounds(244, 60, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnUploadPaper);
		
		txtSubmitPaper = new JTextField();
		txtSubmitPaper.setBounds(10, 61, 224, 20);
		frmAuthorMainPage.getContentPane().add(txtSubmitPaper);
		txtSubmitPaper.setColumns(10);
		
		JLabel lblRevision = new JLabel("Revision");
		lblRevision.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRevision.setBounds(616, 11, 46, 14);
		frmAuthorMainPage.getContentPane().add(lblRevision);
		

		
		JLabel lblUploadRevisions = new JLabel("Upload Revisions:");
		lblUploadRevisions.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUploadRevisions.setBounds(573, 36, 89, 14);
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
		btnUploadRevision.setBounds(343, 60, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnUploadRevision);
		
		txtRevision = new JTextField();
		txtRevision.setColumns(10);
		txtRevision.setBounds(442, 61, 220, 20);
		frmAuthorMainPage.getContentPane().add(txtRevision);
		
		JLabel lblReviewStatus = new JLabel("Review Status:");
		lblReviewStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblReviewStatus.setBounds(561, 105, 101, 14);
		frmAuthorMainPage.getContentPane().add(lblReviewStatus);
		
		//Displays the reviewers most recent revisions *not used for submissions
		JScrollPane scrollPaneReview = new JScrollPane();
		scrollPaneReview.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneReview.setBounds(343, 130, 319, 211);
		frmAuthorMainPage.getContentPane().add(scrollPaneReview);
		
		JTextArea textAreaReview = new JTextArea();
		scrollPaneReview.setViewportView(textAreaReview);
		
		JLabel lblSubmitSupportTicket = new JLabel("Submit Support Ticket:");
		lblSubmitSupportTicket.setBounds(10, 105, 157, 14);
		frmAuthorMainPage.getContentPane().add(lblSubmitSupportTicket);
		
		JScrollPane scrollPaneSupport = new JScrollPane();
		scrollPaneSupport.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneSupport.setBounds(10, 130, 323, 211);
		frmAuthorMainPage.getContentPane().add(scrollPaneSupport);
		
		JTextArea textAreaSupport = new JTextArea();
		scrollPaneSupport.setViewportView(textAreaSupport);
		//Submit button is used to submit a support ticket
		JButton btnSubmitSupport = new JButton("Submit");
		btnSubmitSupport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ticket[0] = textAreaReview.getText();
			}
		});
		btnSubmitSupport.setBounds(125, 352, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnSubmitSupport);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAuthorMainPage.dispose();
				GUI_Login.main(Ticket);
			}
		});
		btnBack.setBounds(10, 352, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnBack);
	}
	
	public void setVisible(boolean x) {
		frmAuthorMainPage.setVisible(x);
	}
}
