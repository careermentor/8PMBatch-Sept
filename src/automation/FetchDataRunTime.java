package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataRunTime
{
	WebDriver driver;
	
	@Test
	public void thetestingworld() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  //
		driver.get("https://thetestingworld.com/testings/");  //page load time = 60 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS); //300 sec
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());   //false
		
		boolean actFlag = driver.findElement(By.name("terms")).isSelected();
		
		Assert.assertEquals(actFlag, false);
		
		driver.findElement(By.name("terms")).click();
		System.out.println(driver.findElement(By.name("terms")).isSelected());   //true
		
		System.out.println(driver.findElement(By.cssSelector("[value='Sign up']")).isDisplayed());
		
	}
	
	@Test(enabled=false)
	public void facebook() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  //
		
		String ExpURL = "https://www.facebook.com";
		
		driver.get(ExpURL);  //pass the URL in the browser
		
		String ActURL = driver.getCurrentUrl();  //fetch the URL from the browser
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL,"URL did not matched");
		
		//Assert.assertEquals(ActURL, ExpURL,"URL did not matched");  //compare- Hard assertion
		System.out.println("this step pass successfully");
		
		String ExpTitle = "Facebook – log in or sign up";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);   //compare
		
		String ExpUName= "Email address or phone number";
		String ActUname = driver.findElement(By.name("email")).getAttribute("placeholder");
		System.out.println(ActUname);
		
		sa.assertEquals(ActUname, ExpUName);
		
		String ExpLoginBtn = "Log in";
		String ActLoginBtn = driver.findElement(By.name("login")).getText();
		System.out.println(ActLoginBtn);
		
		sa.assertEquals(ActLoginBtn, ExpLoginBtn);
		
		Point loc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loc);
		
		System.out.println(driver.getPageSource());
		sa.assertAll();
		
		
	}
		
}
