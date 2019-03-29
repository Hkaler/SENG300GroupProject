package GUI;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Admin {

	private JFrame frmAdministratorMainPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Admin window = new GUI_Admin();
					window.frmAdministratorMainPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministratorMainPage = new JFrame();
		frmAdministratorMainPage.setTitle("Administrator Main Page");
		frmAdministratorMainPage.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmAdministratorMainPage.setBounds(100, 100, 447, 83);
		frmAdministratorMainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdministratorMainPage.getContentPane().setLayout(null);
		
		//Switch to reviewer mode
		JButton btnReviewer = new JButton("Reviewer");
		btnReviewer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdministratorMainPage.dispose();
				GUI_Reviewer.main(null);
			}
		});
		btnReviewer.setBounds(10, 11, 89, 23);
		frmAdministratorMainPage.getContentPane().add(btnReviewer);
		
		//Opens GUI_AdminReviewProc window
		JButton btnReviewProcesses = new JButton("Review Processes");
		btnReviewProcesses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdministratorMainPage.dispose();
				GUI_AdminReviewProc.main(null);
			}
		});
		btnReviewProcesses.setToolTipText("");
		btnReviewProcesses.setBounds(277, 11, 143, 23);
		frmAdministratorMainPage.getContentPane().add(btnReviewProcesses);
		
		//opens GUI_AdminTickets window
		JButton btnReviewTickets = new JButton("Review Tickets");
		btnReviewTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdministratorMainPage.dispose();
				GUI_AdminTickets.main(null);
			}
		});
		btnReviewTickets.setBounds(109, 11, 158, 23);
		frmAdministratorMainPage.getContentPane().add(btnReviewTickets);
	}
}
