package Backend;

public class Admin extends User {
	
	public Admin(String username, String password, String role, String email) {
		super(username,password,role,email);
	}
	
	public User getUser() {
		return this;
	}

}
