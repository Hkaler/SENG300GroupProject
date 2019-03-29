package GUI;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GUI_AdminReviewProc {

	private JFrame frmAdministratorReviewProcesses;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_AdminReviewProc window = new GUI_AdminReviewProc();
					window.frmAdministratorReviewProcesses.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_AdminReviewProc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministratorReviewProcesses = new JFrame();
		frmAdministratorReviewProcesses.setTitle("Administrator Review Processes");
		frmAdministratorReviewProcesses.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmAdministratorReviewProcesses.setBounds(100, 100, 578, 357);
		frmAdministratorReviewProcesses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdministratorReviewProcesses.getContentPane().setLayout(null);
		
		//displays the list of submissions
		JList listSubmissionList = new JList();
		listSubmissionList.setBounds(10, 29, 190, 141);
		frmAdministratorReviewProcesses.getContentPane().add(listSubmissionList);
		
		//Use to assign a reviewer (need 3 min) to an submission TBD
		//Select a submission and a reviewer then press assign to pair them on backend
		JButton btnAssign = new JButton("Assign");
		btnAssign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAssign.setBounds(420, 76, 89, 23);
		frmAdministratorReviewProcesses.getContentPane().add(btnAssign);
		//Judge button allows the reviewer to determine if the paper is good for publication determined by the status of the radio button
		JButton btnJudge = new JButton("Judge");
		btnJudge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJudge.setBounds(10, 181, 89, 23);
		frmAdministratorReviewProcesses.getContentPane().add(btnJudge);
		
		//displays info about the selected submission
		JList listSubmissionInfo = new JList();
		listSubmissionInfo.setBounds(210, 29, 142, 278);
		frmAdministratorReviewProcesses.getContentPane().add(listSubmissionInfo);
		
		//Dropdown box of all the available Reviewers
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(362, 29, 190, 36);
		frmAdministratorReviewProcesses.getContentPane().add(comboBox);
		
		JRadioButton rdbtnPublish = new JRadioButton("Publish");
		rdbtnPublish.setBounds(10, 211, 89, 23);
		frmAdministratorReviewProcesses.getContentPane().add(rdbtnPublish);
		
		JLabel lblSubmissions = new JLabel("Submissions");
		lblSubmissions.setBounds(10, 12, 79, 14);
		frmAdministratorReviewProcesses.getContentPane().add(lblSubmissions);
		
		JLabel lblReviewers = new JLabel("Reviewers");
		lblReviewers.setHorizontalAlignment(SwingConstants.RIGHT);
		lblReviewers.setBounds(493, 12, 59, 14);
		frmAdministratorReviewProcesses.getContentPane().add(lblReviewers);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdministratorReviewProcesses.dispose();
				GUI_Admin.main(null);
			}
		});
		btnBack.setBounds(10, 284, 89, 23);
		frmAdministratorReviewProcesses.getContentPane().add(btnBack);
	}
}
