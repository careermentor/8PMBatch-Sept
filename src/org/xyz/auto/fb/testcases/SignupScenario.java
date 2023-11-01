package org.xyz.auto.fb.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.xyz.auto.fb.baseClass.InitiateBrowser;
import org.xyz.auto.fb.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void signupFunc() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccount();
		sign.enter_firstname("java");
		sign.enter_lastname("Selenium");
		
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("28");
		
		
		sign.click_signupbttn();
	}
	
}
