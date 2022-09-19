package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task_page
{

	WebDriver driver;
	
	@FindBy(xpath = "//a[normalize-space()='Projects & Customers']")
	private WebElement project_cust;
	
	@FindBy (xpath = "//input[@value='Create New Customer']")
	private WebElement createcust_new_customer;
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy (name="description")
	private WebElement description;
	
	@FindBy (xpath = "//input[@name='createCustomerSubmit']")
    private WebElement createcust_button;	
	
	public WebElement get_projectcustomer()
	{
		return project_cust;
	}
	public WebElement get_createcust_new_customer()
	{
		return createcust_new_customer;
	}
	
	public WebElement get_name()
	{
		return name;
	}
	public WebElement get_description()
	{
		return description;
	}
	public WebElement get_createcust_button()
	{
		return createcust_button;
	}
	
	
	public Task_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
