package GUI;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import Backend.Login;
import Backend.OpenFile;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import java.awt.Canvas;

public class GUI_Author_Main {

	private JFrame frmAuthorMainPage;
	private JTextField txtSubmitPaper;
	private String[] Ticket = new String[1];
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
		frmAuthorMainPage.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmAuthorMainPage.setTitle("Author Main Page");
		frmAuthorMainPage.setBounds(100, 100, 688, 425);
		frmAuthorMainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAuthorMainPage.getContentPane().setLayout(null);
		frmAuthorMainPage.setLocationRelativeTo(null);
		
		JLabel lblPaper = new JLabel("Paper");
		lblPaper.setBounds(10, 11, 46, 14);
		frmAuthorMainPage.getContentPane().add(lblPaper);
		
		Icon logoImage;
		
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
		btnUploadPaper.setBounds(292, 32, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnUploadPaper);
		
		txtSubmitPaper = new JTextField();
		txtSubmitPaper.setBounds(90, 33, 192, 20);
		frmAuthorMainPage.getContentPane().add(txtSubmitPaper);
		txtSubmitPaper.setColumns(10);
		
		JLabel lblReviewStatus = new JLabel("Review Status:");
		lblReviewStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblReviewStatus.setBounds(561, 61, 101, 14);
		frmAuthorMainPage.getContentPane().add(lblReviewStatus);
		
		//Displays the reviewers most recent revisions *not used for submissions
		JScrollPane scrollPaneReview = new JScrollPane();
		scrollPaneReview.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneReview.setBounds(343, 86, 319, 255);
		frmAuthorMainPage.getContentPane().add(scrollPaneReview);
		
		JTextArea textAreaReview = new JTextArea();
		scrollPaneReview.setViewportView(textAreaReview);
		
		JLabel lblSubmitSupportTicket = new JLabel("Submit Support Ticket:");
		lblSubmitSupportTicket.setBounds(10, 61, 157, 14);
		frmAuthorMainPage.getContentPane().add(lblSubmitSupportTicket);
		
		JScrollPane scrollPaneSupport = new JScrollPane();
		scrollPaneSupport.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneSupport.setBounds(10, 86, 323, 255);
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
		btnSubmitSupport.setBounds(121, 352, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnSubmitSupport);
		
		JButton btnBack = new JButton("Sign Out");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAuthorMainPage.dispose();
				GUI_Login.main(Ticket);
			}
		});
		btnBack.setBounds(10, 352, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnBack);
		
		JButton btnReviewer = new JButton("Reviewer");
		btnReviewer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Login.newUser.getRole().equals("Reviewer")|Login.newUser.getRole().equals("Administrator")) {
					frmAuthorMainPage.dispose();
					GUI_Reviewer.main(null);
				}
			}
		});
		btnReviewer.setBounds(573, 7, 89, 23);
		frmAuthorMainPage.getContentPane().add(btnReviewer);
		
		
		logoImage = new ImageIcon("U:\\Desktop\\eclipseWorkspace\\SENG300GroupProject\\GUI\\uofcsuckss.jpg");
		
	
	}
}
