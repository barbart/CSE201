import java.util.Scanner;

/**
 * @author linyuan zhang
 *
 */


public class developer extends user{
	private String password;
	private String username;
	private String userID;
	/**
	 * @param username
	 * @param password
	 * @param permission
	 */
	public developer(String username, String password, int permission) {
        super();
}

	public String getPassword() {
        return password;
    }

    public int getpermission(int permission) {
		return permission;
    }  
    
    
public boolean login() {
	 Scanner in = new Scanner(System.in);
	 String temp = in.nextLine();
	 String temp2 = in.nextLine();
    final boolean log = login();
    final boolean authorized = permission();
    return log && authorized;
}

/**
 * @param newName
 */
public void changeName(String newName) {
    this.username = newName;

}

/**
 * @return
 */
public String getUserID() {
    return userID;
}

/**
 * @return
 */
public String getUsername() {
    return username;
}
 
 private boolean permission() {
	int permission = 0;
	// TODO Auto-generated method stub
	 if (permission == 2) {
		 return true;
	 }
	return false;
}
/**
 * @param password
 * @return
 */
public Boolean CheckPassword(String password) {         
	    return this.password.equals(password);
	}   

	/**
	 * @param username
	 * @return
	 */
	public Boolean CheckUsername(String username) {         
	    return this.username.equals(username);
	}
	
	
	
	/**
	 * @return
	 */
	public Boolean delete(){
		if (permission() == true) return true ;					
		return false;		
	}

}
