package org.xyz.auto.fb.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.xyz.auto.fb.baseClass.InitiateBrowser;
import org.xyz.auto.fb.dastagenerators.DataGeneraorClass;
import org.xyz.auto.fb.pages.LoginPage;

public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="ddfdata",dataProviderClass=DataGeneraorClass.class)
	public void loginfunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	}
	
	
	
	
	
}
