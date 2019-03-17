import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Admin  {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Admin window = new GUI_Admin();
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
	public GUI_Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Switch to reviewer mode
		JButton btnReviewer = new JButton("Reviewer");
		btnReviewer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnReviewer.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnReviewer);
		
		//Opens GUI_AdminReviewProc window
		JButton btnReviewProcesses = new JButton("Review Processes");
		btnReviewProcesses.setBounds(10, 24, 143, 23);
		btnReviewProcesses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnReviewProcesses);
		
		//opens GUI_AdminTickets window
		JButton btnReviewTickets = new JButton("Review Tickets");
		btnReviewTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReviewTickets.setBounds(10, 120, 158, 23);
		frame.getContentPane().add(btnReviewTickets);
	}


}
