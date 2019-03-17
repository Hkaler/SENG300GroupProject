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
			try {
				Login.logIn(GUI_Login.getUsername(), GUI_Login.getPassword());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			// Check value for User.role and from there open up the respective GUI
			String userRole = Login.newUser.getRole();
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
}