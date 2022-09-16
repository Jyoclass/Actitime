package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Ultility.Actitime_Select;
import base.Base;
import datadroviders.Customer_dp;

public class Customer extends Base
{

	@Test(dataProvider ="createcustomer" ,dataProviderClass = Customer_dp.class,priority=1)
	
	void createcustomer(String customer_name,String customer_description)
	{
		driver.findElement(By.xpath("//a[@class='content tasks']//img[@class='sizer']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(customer_name);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys( customer_description);
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		
		
	}
	
	@Test(dataProvider ="deletecustomer" ,dataProviderClass = Customer_dp.class,priority=2)
	void deletecustomer(String custname)
	{

		driver.findElement(By.xpath("//a[@class='content tasks']//img[@class='sizer']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Projects & Customers']")).click();
		WebElement wb=driver.findElement(By.xpath("//select[@name='selectedCustomer']"));
		new Actitime_Select().select(custname, wb);
		driver.findElement(By.xpath("//input[contains(@onclick,'showCustomersProjects(this.form);')]")).click();
		driver.findElement(By.xpath("//td[table[tbody[tr[td[a[text()='"+custname+"']]]]]]/following-sibling::td[5]/descendant::input")).click();
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		WebElement pop=driver.findElement(By.xpath("//td[@id='deleteHeader']"));	
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(pop));	
		driver.findElement(By.xpath("//input[@id='deleteButton']")).click();
	 	
	}
	
	
}
