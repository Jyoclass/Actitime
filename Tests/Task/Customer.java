package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Ultility.Actitime_Select;
import Ultility.Logreport;
import Ultility.Waitstatements;
import base.Base;
import datadroviders.Customer_dp;
import pagefactory.EnterTimeTrack_page;
import pagefactory.Task_page;

public class Customer extends Base
{
	
	

	@Test(dataProvider ="createcustomer" ,dataProviderClass = Customer_dp.class)
	
	void createcustomer(String customer_name,String customer_description)
	{
		new EnterTimeTrack_page(driver).get_task().click();		
		Task_page task=new Task_page(driver);
		Waitstatements.explicitwait_10(task.get_projectcustomer(), driver);
		task.get_projectcustomer().click();
		Waitstatements.explicitwait_10(task.get_createcust_new_customer(), driver);
		task.get_createcust_new_customer().click();
		task.get_name().sendKeys(customer_name);
		task.get_description().sendKeys( customer_description);
		task.get_createcust_button().click();
		Waitstatements.explicitwait_10(task.get_message(), driver);
		String actual_text=task.get_message().getText();
		Logreport.loginfo(actual_text);
		Assert.assertEquals("Customer \""+customer_name+"\" has been successfully created.",actual_text);
		
	}
	
	@Test(dataProvider ="deletecustomer" ,dataProviderClass = Customer_dp.class,priority=2,enabled = false)
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
