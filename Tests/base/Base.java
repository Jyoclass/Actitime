package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
    @BeforeMethod
    public void login_actitime()
    {
    	System.out.println("Login to actitime application");
    }
    
    @AfterMethod
    public void logout_actitime()
    {
    	System.out.println("Logout from the application");
    }	
}
