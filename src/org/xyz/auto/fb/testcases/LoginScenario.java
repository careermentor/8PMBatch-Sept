package org.xyz.auto.fb.testcases;

import org.testng.annotations.Test;
import org.xyz.auto.fb.baseClass.InitiateBrowser;
import org.xyz.auto.fb.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void loginfunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
	}
	
}
