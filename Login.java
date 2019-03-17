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
			  }
		  }
	  	sc.close();
	 }
	 catch (Exception e) {
		 e.printStackTrace();
	 }
  }
  
  /**
  public static void main(String[] args) throws Exception {
	  Scanner kb = new Scanner(System.in);
	  System.out.print("Username: ");
	  String username = kb.next();
	  System.out.print("\nPassword: ");
	  String password = kb.next();
	  logIn(username,password);
	  kb.close();
  }
  **/
}
