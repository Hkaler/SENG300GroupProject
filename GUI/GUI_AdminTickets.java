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

/**
 * 
 * @author taylor.skaalrud1
 * Creates the frame containing a list of tickets for the administrator to resolve
 */

public class GUI_AdminTickets {

	private JFrame frmAdminTickets;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_AdminTickets window = new GUI_AdminTickets();
					window.frmAdminTickets.setVisible(true);
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
	 * Initialize the contents of the frmAdminTickets.
	 */
	private void initialize() {
		frmAdminTickets = new JFrame();
		frmAdminTickets.getContentPane().setBackground(Color.decode("#cee5f2"));
		frmAdminTickets.setBounds(100, 100, 450, 278);
		frmAdminTickets.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminTickets.getContentPane().setLayout(null);
		frmAdminTickets.setLocationRelativeTo(null);
		
				JLabel lblTickets = new JLabel("Tickets");
				lblTickets.setHorizontalAlignment(SwingConstants.CENTER);
				lblTickets.setBounds(184, 11, 46, 14);
				frmAdminTickets.getContentPane().add(lblTickets);
		
		//Displays a selectable list of tickets
		JList listTickets = new JList();
		listTickets.setBounds(45, 35, 339, 159);
		frmAdminTickets.getContentPane().add(listTickets);
		
		//move selected ticket to 'resolved' list 
		JButton btnResolve = new JButton("Resolve");
		btnResolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_Confirmation_Window.main(null);

				//Delete the selected element of the list on backend
				//listTickets.getSelectedIndex()
				frmAdminTickets.dispose();
				GUI_Admin.main(null);
			}
		});
		btnResolve.setBounds(165, 205, 89, 23);
		frmAdminTickets.getContentPane().add(btnResolve);
	}

}
