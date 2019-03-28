import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver implements ActionListener{

	public static boolean loginFlag = false; 
	private GUI_Login login = new GUI_Login(this);
	private GUI_Admin admin = new GUI_Admin(this);
	private GUI_AdminReviewProc reviewProc = new GUI_AdminReviewProc(this);
	private GUI_AdminTickets adminTics = new GUI_AdminTickets(this);
	private GUI_Author_Main authorMain = new GUI_Author_Main(this);
	private GUI_Reviewer reviewer = new GUI_Reviewer(this);
	private GUI_Revision_Status revisionStatus = new GUI_Revision_Status(this);
	private GUI_Sign_Up signUp = new GUI_Sign_Up(this);

	public Driver() {
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		char [] password;
		Login log = new Login();
		if(e.getActionCommand().equals("Login")) {
			try {
				password = login.getPassword();

				String sPassword = String.copyValueOf(password);
				System.out.println(sPassword);
				log.logIn(login.getUsername(), sPassword);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			// Check value for User.role and from there open up the respective GUI
			String userRole = log.newUser.getRole();
			if (userRole.equals("admin")) {
				// open admin window
				login.setVisible(false);
				admin.setVisible(true);
			} else if (userRole.equals("reviewer")) {
				// open reviewer window
				login.setVisible(false);
				//reviewer.setVisible(true);

			} else if (userRole.equals("author")) {
				// open author window
				login.setVisible(false);
				authorMain.setVisible(true);
			}
		}
		if(e.getActionCommand().equals("Sign Up")) {
			// open Sign Up window
			login.setVisible(false);
			signUp.setVisible(true);
		}
		if(e.getActionCommand().equals("Reviewer")) {
			admin.setVisible(false);
			reviewer.setVisible(true);
		}
		if(e.getActionCommand().equals("Review Process")) {
			admin.setVisible(false);
			reviewProc.setVisible(true);
		}
		if(e.getActionCommand().equals("Review Tickets")) {
			admin.setVisible(false);
			adminTics.setVisible(true);
		}
		if(e.getActionCommand().equals("Assign")) {

			reviewProc.setVisible(false);
		}
		if(e.getActionCommand().equals("Judge")) {
			reviewProc.setVisible(false);
		}
		if(e.getActionCommand().equals("Tickets")) {
			adminTics.setVisible(false);
		}
		if(e.getActionCommand().equals("Resolve")) {
			adminTics.setVisible(false);
		}
		// this is the "sign up" button in the Sign_Up GUI to create a new record for a new user
		if(e.getActionCommand().equals("Continue")) {
			signUp.setVisible(false);
		}
		if(e.getActionCommand().equals("Back")) {
			signUp.setVisible(false);
			adminTics.setVisible(false);
		}
		// this is the "sign up" button in the Sign_Up GUI to create a new record for a new user
		if(e.getActionCommand().equals("Continue")) {
			signUp.setVisible(false);
		}
		if(e.getActionCommand().equals("Back")) {
			signUp.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		Driver drive = new Driver();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
					drive.login.setVisible(true);
					drive.admin.setVisible(false);
					drive.adminTics.setVisible(false);
					drive.reviewProc.setVisible(false);
					drive.authorMain.setVisible(false);
					drive.reviewer.setVisible(false);
					drive.revisionStatus.setVisible(false);
					drive.signUp.setVisible(false);

				 }
		 	}); 
	}

}