package pagefactory;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login_page
{

	 WebDriver driver;
	
	 @FindBy(name="username")
	 private WebElement un;
	
	 @FindBy(name="pwd")
	 private WebElement pwd;
	 
	 @FindBy(xpath = "//a[@id='loginButton']")
     private WebElement lgn;	
	
	public WebElement   get_un()
	{
		return un;
	}
	
	public WebElement   get_pwd()
	{
		return pwd;
	}
	
	public WebElement   get_login()
	{
		return lgn;
	}
	
	public Login_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	 
}
