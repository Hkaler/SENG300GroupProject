package GUI;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Admin tickets should be tagged with the 

public class GUI_AdminTickets {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_AdminTickets window = new GUI_AdminTickets();
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
	public GUI_AdminTickets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.decode("#cee5f2"));
		frame.setBounds(100, 100, 450, 278);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JList listTickets = new JList();
		listTickets.setBounds(45, 35, 339, 159);
		frame.getContentPane().add(listTickets);
		//select a ticket
		JLabel lblTickets = new JLabel("Tickets");
		lblTickets.setHorizontalAlignment(SwingConstants.CENTER);
		lblTickets.setBounds(184, 11, 46, 14);
		frame.getContentPane().add(lblTickets);
		//move selected ticket to 'resolved' list
		JButton btnResolve = new JButton("Resolve");
		btnResolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Delete the selected element of the list on backend
				//listTickets.getSelectedIndex()
				frame.dispose();
				GUI_Admin.main(null);
			}
		});
		btnResolve.setBounds(165, 205, 89, 23);
		frame.getContentPane().add(btnResolve);
	}

}
