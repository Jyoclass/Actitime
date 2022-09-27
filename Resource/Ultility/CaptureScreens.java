package Ultility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreens
{
	 WebDriver driver;
	 TakesScreenshot  scrshot;
	 File src;
	 File dest;
	public CaptureScreens(WebDriver driver)
	{
		this.driver=driver;
	}

	public void capturescreenshot(String name) throws IOException
	{
		scrshot=(TakesScreenshot )driver;		
		src=scrshot.getScreenshotAs(OutputType.FILE);		
		dest=new File(".\\Screenshots\\"+name+".png");
		FileUtils.copyFile(src, dest);
		
	
	}
	
	
	
}
