public class User {

	private String username;
	private String password;
	private String role;
	private boolean loginStatus;
	private String email;
	
	public User() {
		this.loginStatus = false;
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void setUsername(String newUser) {
		username = newUser;
	}
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String newPassword) {
		password = newPassword;
	}
	public String getPassword(){
		return password;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}
	public String getEmail() {
		return email;
	}
	
	public void setStatus(boolean newStatus) {
		loginStatus = newStatus;
	}
	public boolean getStatus() {
		return loginStatus;
	}
	
	public void setRole(String newRole) {
		role = newRole;
	}
	public String getRole() {
		return role;
	}
	
}
