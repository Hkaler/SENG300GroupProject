import java.util.*;
import java.io.*;

public class Login {
	public static User newUser;

	// Authenticate user and create instance with correct role
	public static void logIn(String username, String password) throws Exception {
	  String dir = System.getProperty("user.dir");
	  String tempUsername, tempPassword, role;
	  try {
	  dir += "\\users.txt";
	  File users = new File(dir);
	  Scanner sc = new Scanner(users);
	  while (sc.hasNextLine()) {
		  tempUsername = sc.next();
		  tempPassword = sc.next();
		  if (username.equals(tempUsername) && password.equals(tempPassword)) {
				  role = sc.next();
				  newUser = new User(username,password,role);
				  //System.out.printf("User <%s> is now active under <%s> role.",username,role);
				  break;
			  }
			  else {
				  sc.nextLine();


	// Add new user to the system
	public User signUp(String username, String password, String role) throws Exception {
		try {
			FileWriter fw = new FileWriter("users.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.printf("\n" + username + " " + password + " " + role);
			User newUser = new User(username,password,role);
			pw.close();
			return newUser;
		}
		catch (Exception e) {
			System.out.println("Error: unable to write to file");
			e.printStackTrace();
		}
		return null;
	}

	// Authenticate user and create instance
	public User logIn(String username, String password) throws Exception {
	  String tempUsername, tempPassword, role;
	  try {
		  String dir = System.getProperty("user.dir");
		  dir += "\\users.txt";
		  File users = new File(dir);
		  Scanner sc = new Scanner(users);
		  while (sc.hasNextLine()) {
			  tempUsername = sc.next();
			  tempPassword = sc.next();
			  if (username.equals(tempUsername) && password.equals(tempPassword)) {
					  role = sc.next();
					  User newUser = new User(username,password,role);
					  System.out.printf("User <%s> is now active under <%s> role.",username,role);
					  sc.close();
					  return newUser;
				  }
				  else {
					  sc.nextLine();
				  }
			  }
		  	sc.close();
	 }
	 catch (Exception e) {
		 e.printStackTrace();
	 }
	 return null;
  }
}


//  public static void main(String[] args) throws Exception {
//	  Scanner kb = new Scanner(System.in);
//	  System.out.print("Username: ");
//	  String username = kb.next();
//	  System.out.print("\nPassword: ");
//	  String password = kb.next();
//	  Login log = new Login();
//	  User newUser = log.logIn(username,password);
//	  System.out.println("<"+newUser.getRole()+">");
//	  kb.close();
//  }
//}
