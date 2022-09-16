package Ultility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actitime_Select
{
    Select sel;
	public void select(String custname,WebElement wb)
	{
		sel=new Select(wb);
		sel.selectByVisibleText(custname);
	}
	
	
	
}
