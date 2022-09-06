package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base 
{
	

	
    @BeforeMethod
    @Parameters({"url","username","password"}) 
    public void login_actitime(String url,String un,String pwd)
    {
    	System.out.println("Login to actitime application "+url+" "+un+" "+pwd);
    }
    
    @AfterMethod
    public void logout_actitime()
    {
    	System.out.println("Logout from the application");
    }	
}
