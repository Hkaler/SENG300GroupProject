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
				new GUI_Admin();
			} else if (userRole.equals("reviewer")) {
				// open reviewer window
				new GUI_Reviewer();
			} else if (userRole.equals("author")) {
				// open author window
				try {
					new GUI_Author_Main();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
		if(e.getActionCommand().equals("Continue")) {
			
		}
		if(e.getActionCommand().equals("Back")) {
			
		}
	}
}