package GUI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;

//Admin tickets should be tagged with the 

public class GUI_AdminTickets{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_AdminTickets window = new GUI_AdminTickets();
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
	public GUI_AdminTickets(ActionListener listen) {
		frame = new JFrame();
		initialize(listen);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ActionListener listen) {
		frame.getContentPane().setBackground(Color.decode("#cee5f2"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList listTickets = new JList();
		listTickets.setBounds(29, 52, 214, 82);
		frame.getContentPane().add(listTickets);
		
		//select a ticket
		JLabel lblTickets = new JLabel("Tickets");
		lblTickets.setBounds(32, 27, 46, 14);
		frame.getContentPane().add(lblTickets);
		
		//move selected ticket to 'resolved' list
		JButton btnResolve = new JButton("Resolve");
		btnResolve.addActionListener(listen);
		btnResolve.setBounds(29, 163, 89, 23);
		frame.getContentPane().add(btnResolve);
	}
	
	public void setVisible(boolean x) {
		frame.setVisible(x);
	}

}
