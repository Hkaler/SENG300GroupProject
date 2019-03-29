package Backend;
import java.util.*;

public class Reviewer extends User {
	
	String paperStatus; 
	ArrayList<String> papersForReview = new ArrayList<String>();
	
	public Reviewer(String username, String password, String role, String email) {
		super(username,password,role,email);
	}
	
	public User getUser() {
		return this;
	}

}
