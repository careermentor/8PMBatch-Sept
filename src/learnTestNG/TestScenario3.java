package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario3 
{

	
	//step1 - install testng in eclipse marketplace
	//step2 - add dependecnies 
	
	@Test
	public void first_testcase()
	{
		System.out.println("this is my first test case");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("this is my second test case");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is my third test case");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is my forth test case");
		Assert.assertEquals("Hello1", "Hello");
	}
	
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is my fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is my sixth test case");
	}
	
	@Test
	public void seven_testcase()
	{
		System.out.println("this is my seventh test case");
	}
	
	@Test
	public void eight_testcase()
	{
		System.out.println("this is my eight test case");
	}
	
	
}
