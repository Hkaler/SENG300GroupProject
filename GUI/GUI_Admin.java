package GUI;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import Backend.Driver;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Admin {

	private JFrame frame;
	private Driver drive;

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
	public GUI_Admin(Driver d) {
		frame = new JFrame();
		this.drive = d;
		initialize(d.getAction());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ActionListener listen) {
		frame.getContentPane().setBackground(Color.decode("#cee5f2"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnReviewer = new JButton("Reviewer");
		btnReviewer.addActionListener(listen);
		btnReviewer.setBounds(10, 227, 113, 23);
		frame.getContentPane().add(btnReviewer);
		
		//Opens GUI_AdminReviewProc window
		JButton btnReviewProcesses = new JButton("Review Processes");
		btnReviewProcesses.setBounds(10, 24, 171, 23);
		btnReviewProcesses.addActionListener(listen);
		frame.getContentPane().add(btnReviewProcesses);
		
		//opens GUI_AdminTickets window
		JButton btnReviewTickets = new JButton("Review Tickets");
		btnReviewTickets.addActionListener(listen);
		btnReviewTickets.setBounds(10, 120, 158, 23);
		frame.getContentPane().add(btnReviewTickets);
	}
	
	public void setVisible(boolean x) {
		frame.setVisible(x);
	}
}




//
//	/**
//	 * Initialize the contents of the frame.
//	 * @param listen 
//	 */
//	private void initialize(ActionListener listen) {
//		//frame = new JFrame();
//		super.setBounds(100, 100, 450, 300);
//		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		super.getContentPane().setLayout(null);
//		
//		//Switch to reviewer mode
//		
//	}
//
//
//}