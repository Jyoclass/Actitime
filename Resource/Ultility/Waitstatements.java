package Ultility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitstatements 
{
	private static WebDriverWait wait;
	public static void explicitwait_10(WebElement wb,WebDriver driver)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(wb));
		
	}
	
	

}
