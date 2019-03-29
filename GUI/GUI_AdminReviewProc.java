package GUI;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GUI_AdminReviewProc {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_AdminReviewProc window = new GUI_AdminReviewProc();
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
	public GUI_AdminReviewProc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.decode("#cee5f2"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//displays the list of submissions
		JList listSubmissionList = new JList();
		listSubmissionList.setBounds(37, 30, 190, 36);
		frame.getContentPane().add(listSubmissionList);
		//Assigns 3 reviewers to a selected paper
		JButton btnAssign = new JButton("Assign");
		btnAssign.setBounds(37, 88, 89, 23);
		frame.getContentPane().add(btnAssign);
		//Judge button allows the reviewer to determine if the paper is good for publication
		JButton btnJudge = new JButton("Judge");
		btnJudge.setBounds(155, 88, 89, 23);
		frame.getContentPane().add(btnJudge);
		//displays info about the selected submission
		JList listSubmissionInfo = new JList();
		listSubmissionInfo.setBounds(281, 57, 125, 159);
		frame.getContentPane().add(listSubmissionInfo);
	}
}
