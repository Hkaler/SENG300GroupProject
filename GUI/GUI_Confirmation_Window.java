package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Confirmation_Window {

	private JFrame Confirmation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Confirmation_Window window = new GUI_Confirmation_Window();
					window.Confirmation.setVisible(true);
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Confirmation_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Confirmation = new JFrame();
		Confirmation.getContentPane().setBackground(Color.decode("#cee5f2"));
		Confirmation.setBounds(100, 100, 341, 109);
		Confirmation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Confirmation.getContentPane().setLayout(null);
		Confirmation.setLocationRelativeTo(null);

		
		JLabel lblConfirmed = new JLabel("Confirmed");
		lblConfirmed.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConfirmed.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmed.setBounds(10, 11, 305, 48);
		Confirmation.getContentPane().add(lblConfirmed);
		
		Timer timer = new Timer(1500, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Confirmation.dispose();
	}
		});
		timer.setRepeats(false);
		timer.start();
	}
}
