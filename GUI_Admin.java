import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Admin  extends JFrame{
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_Admin window = new GUI_Admin();
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
	public GUI_Admin(ActionListener listen) {
		getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(319, 225, 117, 25);
		getContentPane().add(btnBack);
		initialize(listen);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param listen 
	 */
	private void initialize(ActionListener listen) {
		//frame = new JFrame();
		super.setBounds(100, 100, 450, 300);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.getContentPane().setLayout(null);
		
		//Switch to reviewer mode
		JButton btnReviewer = new JButton("Reviewer");
		btnReviewer.addActionListener(listen);
		btnReviewer.setBounds(10, 227, 113, 23);
		super.getContentPane().add(btnReviewer);
		
		//Opens GUI_AdminReviewProc window
		JButton btnReviewProcesses = new JButton("Review Processes");
		btnReviewProcesses.setBounds(10, 24, 171, 23);
		btnReviewProcesses.addActionListener(listen);
		super.getContentPane().add(btnReviewProcesses);
		
		//opens GUI_AdminTickets window
		JButton btnReviewTickets = new JButton("Review Tickets");
		btnReviewTickets.addActionListener(listen);
		btnReviewTickets.setBounds(10, 120, 158, 23);
		super.getContentPane().add(btnReviewTickets);
	}


}
