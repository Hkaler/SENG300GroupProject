package Backend;

public class Author extends User {
	
	String paperStatus;
	
	public Author(String username, String password, String role, String email) {
		super(username,password,role,email);
	}
	
	public User getUser() {
		return this;
	}

}
