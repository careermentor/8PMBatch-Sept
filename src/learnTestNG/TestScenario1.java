package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1 
{

	
	//step1 - install testng in eclipse marketplace
	//step2 - add dependecnies 
	
	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("this is my first test case");
		
		Assert.assertEquals("Hello1", "Hello");
		
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("this is my second test case");
	}
	
	@Test(priority=3)
	public void third_testcase()
	{
		System.out.println("this is my third test case");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is my forth test case");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is my fifth test case");
	}
	
	@Test(priority=-3)
	public void sixth_testcase()
	{
		System.out.println("this is my sixth test case");
	}
	
	@Test(priority=-2)
	public void seven_testcase()
	{
		System.out.println("this is my seventh test case");
	}
	
	@Test(priority=-1)
	public void eight_testcase()
	{
		System.out.println("this is my eight test case");
	}
	
	
}
