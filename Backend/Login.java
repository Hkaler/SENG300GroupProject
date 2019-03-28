package Backend;
import java.util.*;
import java.io.*;

public class Login {
	
	public static User newUser; 
	
	// Add new user to the system 
	public static void signUp(String username, String password, String role) throws Exception {
		try {
			FileWriter fw = new FileWriter("users.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.printf("\n" + username + " " + password + " " + role);
			newUser = new User(username,password,role);
			pw.close();
		}
		catch (Exception e) {
			System.out.println("Error: unable to write to file");
			e.printStackTrace();
		}
	}
	
	// Authenticate user and create instance 
	public static void logIn(String username, String password) throws Exception {
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
					  newUser = new User(username,password,role);
					  System.out.printf("User <%s> is now active under <%s> role.",username,role);
					  break;
				  }
				  else {
					  sc.nextLine();
				  }
			  }
		  	sc.close();
	 }
	 catch (Exception e) {
		 System.out.println("Error: unable to read file");
		 e.printStackTrace();
	 }
  }
}
  
  /**
  public static void main(String[] args) throws Exception {
	  Scanner kb = new Scanner(System.in);
	  System.out.print("Username: ");
	  String username = kb.next();
	  System.out.print("Password: ");
	  String password = kb.next();
	  System.out.print("Role: ");
	  String role = kb.next();
	  signUp(username,password,role);
	  kb.close();
  } 
  **/

