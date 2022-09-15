package Task;

import org.testng.annotations.Test;

import base.Base;
import datadroviders.Customer_dp;

public class Customer 
{

	@Test(dataProvider ="createcustomer" ,dataProviderClass = Customer_dp.class)
	
	void createcustomer(String customer_name,String customer_description)
	{
		System.out.println("customer created "+customer_name+" "+customer_description);
	}
	
}
