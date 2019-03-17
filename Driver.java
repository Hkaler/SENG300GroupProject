import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver implements ActionListener{

	public static boolean loginFlag = false; 
	
	public static void main(String[] args) {
		GUI_Login.main(args);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Login")) {
			//Login.login();
			// Check value for User.role and from there open up the respective GUI
			String userRole = newUser.getRole();
			if (userRole.equals(admin)) {
				
			} else if (userRole.equals(reviewer)) {
				
			} else if (userRole.equals(author)) {
				
			}
		}
		if(e.getActionCommand().equals("Sign Up")) {
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
}