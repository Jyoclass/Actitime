package Task;

import org.testng.annotations.Test;

import base.Base;

public class Customer extends Base
{

	@Test(priority = 1)
	public void createcustomer()
	{
		System.out.println("customer creation");
	}
	
	@Test(priority=2)
	public void deletcustomer()
	{
		System.out.println("delete customer");
	}
	
	@Test(priority=3)
	public void archivecustomer()
	{
		System.out.println("Archive the customer");
	}
}
