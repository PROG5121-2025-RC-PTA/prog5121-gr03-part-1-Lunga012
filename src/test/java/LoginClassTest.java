
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class LoginClassTest {
    
    LoginClass loginClass = new LoginClass();
    public LoginClassTest() {
    }
@Test
public void checkPasswordComplexity() {
        assertTrue(loginClass.checkPasswordComplexity("Ch&&sec@ke99!"));
        assertFalse(loginClass.checkPasswordComplexity("password"));
    }
@Test
public void checkUserName(){
        assertTrue(loginClass.checkUserName("kyl_1"));
        assertFalse(loginClass.checkUserName("kyle!!!!!!!"));
}
@Test
    public void testValidUsername() {
        assertTrue(loginClass.checkUserName("kyl_1"));
        assertFalse(loginClass.checkUserName("kyle!!!!!!!"));
    }

    public void testInvalidUsername() {
        String expected = "The username is incorrectly formatted";
        String actual = loginClass.registerUser("kyle!!!!!!!","password");
        assertEquals(expected, actual);
    }
    @Test
    public void testInvalidPassword(){
        String expected = "The password does not meet the complexity requirements.";
        String actual = loginClass.registerUser("kyl_1","password");
        assertEquals(expected, actual);
    }
    @Test
    void checkCellPhoneNumber(){
        assertTrue(loginClass.checkCellPhoneNumber("+27838968976"));
        assertFalse(loginClass.checkCellPhoneNumber("08966553"));
    }
    @Test
    public void testLoginUser(){
        assertTrue(loginClass.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }
    @Test
    public void UsernameCorrectlyformatted_returnsTrue(){
        assertTrue(loginClass.checkUserName("kyl_1"));
    }
    @Test
    public void UsernameIncorrectlyformatted_returnsFalse(){
       assertFalse(loginClass.checkUserName("kyle!!!!!!"));
    }
    @Test
    public void PasswordMeetsComplexityRequirements_returnsTrue(){
        assertTrue(loginClass.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
   @Test
    public void PasswordDoesNotMeetComplexityRequirements_returnsFalse(){
        assertFalse(loginClass.checkPasswordComplexity("password")); 
}
    @Test
    public void testReturnLoginStatus_Success() {
        String expected = "A successful login.";
        String actual = loginClass.returnLoginStatus(true);
        assertEquals(expected, actual);
    }

    @Test
    public void testReturnLoginStatus_Failure() {
        String expected = "A failed login.";
        String actual = loginClass.returnLoginStatus(false);
        assertEquals(expected, actual);
    }
    @Test 
    void CellphoneNumberCorrectlyFormatted_returnsTrue(){
        assertTrue(loginClass.checkCellPhoneNumber("+27838968976"));
    }
    @Test 
    void CellphoneNumberIncorrectlyFormatted_returnsFalse(){
        assertFalse(loginClass.checkCellPhoneNumber("08966553"));
}
}







