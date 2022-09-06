package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	 static WebDriver driver=null;

	
    @BeforeMethod
    @Parameters({"browser","url","username","password"}) 
    public void login_actitime(String browser,String url,String un,String pwd)
    {
    	switch(browser)
    	{
    	case "chrome":  
    	driver= WebDriverManager.chromedriver().create();
    	break;
    	case "firfox":
    		driver= WebDriverManager.firefoxdriver().create();
    	break;
    	case "ie":
    		driver= WebDriverManager.iedriver().create();
    	break;
        }
    	
    	driver.get(url);
    	driver.findElement(By.name("username")).sendKeys(un);
    	driver.findElement(By.name("pwd")).sendKeys(pwd);
    	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
    }
    
    @AfterMethod
    public void logout_actitime()
    {
    	driver.close();
    }	
}
