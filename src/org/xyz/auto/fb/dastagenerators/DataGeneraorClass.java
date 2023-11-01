package org.xyz.auto.fb.dastagenerators;

import org.testng.annotations.DataProvider;

public class DataGeneraorClass 
{

	@DataProvider(name="ddfdata")
	public Object[][] datagenerator()
	{
		//Object[] data = {"user1","user2","user3"};   //1-D array
		Object[][] testdata = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-D array
		return testdata;
		
	}
	
}
