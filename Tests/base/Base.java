package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.Login_page;

public class Base 
{
	public  WebDriver driver;
    public  WebDriverWait wait;
    public SoftAssert sft=new SoftAssert();
	
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
    		driver= WebDriverManager.edgedriver().create();
    	break;
        }
    	driver.manage().window().maximize();
    	driver.get(url);
    	Login_page lgn=new Login_page(driver);
    	lgn.get_un().sendKeys(un);
    	lgn.get_pwd().sendKeys(pwd);
    	lgn.get_login().click();
    }
    
    @AfterMethod
    public void logout_actitime()
    {
    	driver.findElement(By.xpath("//a[@class='logout']")).click();
    	driver.close();
    }	
    
   
}
