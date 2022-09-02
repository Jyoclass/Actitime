package Task;

import org.testng.annotations.Test;

import base.Base;

public class Project extends Base
{

	@Test
	public void createproject()
	{
		System.out.println("create the project for the customer");
	}
	
	@Test
	public void deleteproject()
	{
		System.out.println("delete the project for the customer");
	}
	
	@Test
	public void add_task_project()
	{
		System.out.println("add task to the project");
	}
	
}
