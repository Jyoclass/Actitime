package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack_page
{
   WebDriver driver;
   
   @FindBy (xpath = "//a[@class='content tasks']//img[@class='sizer']")
   private WebElement task;
   
   @FindBy (xpath="//a[@class='logout']")
   private WebElement logout;
   
   
  public WebElement get_task()
   {	   
	   return task;
   }
   
   
   public EnterTimeTrack_page(WebDriver driver) 
    {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
