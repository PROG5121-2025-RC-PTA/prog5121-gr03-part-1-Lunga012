
public class LoginClass {
    
public boolean checkUserName(String username) {
    return username.contains("_") && username.length() <= 5;
}
       
      public boolean checkPasswordComplexity(String password) {
        // Evaluate the password's complexity using a boolean
        return password.length() > 8 &&
                            password.matches(".*[A-Z].*") &&
                            password.matches(".*[0-9].*") &&
                            password.matches(".*[!@#$%].*");

}
/**
     * Registers the user by validating the username format.The username must contain an underscore ("_") and be no more than five characters in length.
     * @param username
     * @param password
     * @return A welcome message if valid, otherwise an error message.
     */
public String registerUser(String username, String password) {
    //String password = null;
    if (username == null || !(username.contains("_") && username.length() <= 5)) {
        return "The username is incorrectly formatted";
    } else if (password == null || !(password.length() > 8
                        && password.matches(".*[A-Z].*") 
                        && password.matches(".*[0-9].*")
                        && password.matches(".*[!@#$%].*"))) {
        return "The password does not meet the complexity requirements.";
    } else {
        return "The two above conditions have been met, and the user has been registered successfully";
    }
} 
    public boolean checkCellPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\+\\d{1,3}[ -]?\\d{10}$");
    }
   // Stored login details from registration.
private String storedUsername;
private String storedPassword;

public boolean loginUser(String username, String password) {
    return password.length() > 8 &&
           password.matches(".*[A-Z].*") &&
           password.matches(".*[0-9].*") &&
           password.matches(".*[!@#$%].*") &&
           username.contains("_") &&
           username.length() <= 5;
}
public String returnLoginStatus(boolean loginUser) {
    if (loginUser) {
        return "A successful login.";
    } else {
        return "A failed login.";
    }
}
}




        



      

        


