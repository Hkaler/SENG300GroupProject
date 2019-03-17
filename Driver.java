import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver implements ActionListener{

	public static boolean loginFlag = false; 
	private GUI_Login login = new GUI_Login(this);
	private GUI_Admin admin = new GUI_Admin(this);
//	private GUI_AdminReviewProc reviewProc = new GUI_AdminReviewProc(this);
	private GUI_AdminTickets adminTics = new GUI_AdminTickets(this);
//	private GUI_Author_Main authorMain = new GUI_Author_Main(this);
//	private GUI_Reviewer reviewer = new GUI_Reviewer(this);
//	private GUI_Revision_Status revisionStatus = new GUI_Revision_Status(this);
//	private GUI_Sign_Up signUp = new GUI_Sign_Up(this);
//	
	public Driver() {
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		char [] password;
		Login log = new Login();
		if(e.getActionCommand().equals("Login")) {
			try {
				password = login.getPassword();
				
//				StringBuilder build = new StringBuilder();
//				for (char ch: password) {
//					build.append(password);
//					System.out.println(password);
//				}
				
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
			} else if (userRole.equals("reviewer")) {
				// open reviewer window
			} else if (userRole.equals("author")) {
				// open author window
			}
		}
		if(e.getActionCommand().equals("Sign Up")) {
			// open Sign Up window
			//GUI_Sign_Up.main(args);
		}
		if(e.getActionCommand().equals("Reviewer")) {
			
		}
		if(e.getActionCommand().equals("Review Process")) {
			
		}
		if(e.getActionCommand().equals("Review Tickets")) {
			
		}
		if(e.getActionCommand().equals("Assign")) {
			
		}
		if(e.getActionCommand().equals("Judge")) {
	
		}
		if(e.getActionCommand().equals("Tickets")) {
			
		}
		if(e.getActionCommand().equals("Resolve")) {
			
		}
	}
	
	public static void main(String[] args) {
		Driver drive = new Driver();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
					drive.login.setVisible(true);
					drive.admin.setVisible(true);
					drive.adminTics.setVisible(true);
//					drive.authorMain.setVisible(true);
				 }
		 	});
	}

}