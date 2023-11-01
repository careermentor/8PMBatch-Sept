package org.xyz.auto.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xyz.auto.fb.utilitiesClass.ReadPropUtilities;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_createnewaccount() throws Exception
	{
		driver.findElement(By.xpath(ReadPropUtilities.readElementProp("FB_Signup_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropUtilities.readElementProp("FB_Signup_firstname_name"))).sendKeys(fname);
	}
	
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(ReadPropUtilities.readElementProp("FB_Signup_lastname_name"))).sendKeys(lname);
	}
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropUtilities.readElementProp("FB_Signup_signupbttn_name"))).click();
	}
}
