package org.xyz.auto.fb.baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.xyz.auto.fb.utilitiesClass.ReadPropUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitiateBrowser
{
	public WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropUtilities.readconfigProp("BrowserName").equalsIgnoreCase("chrome"))
		{

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver(); 
		}
		 
		else if(ReadPropUtilities.readconfigProp("BrowserName").equalsIgnoreCase("edge"))
		{

			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver(); 
		}
		
		else
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver(); 
		}
		
		driver.get(ReadPropUtilities.readconfigProp("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
		
}
