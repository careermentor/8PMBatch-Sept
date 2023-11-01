package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Automation
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  //
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
	//	driver.close();
	}
	
	@Test
	public void signfunc() throws Exception
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//Thread.sleep(2000);  //waits in Java for 2 seconds
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Java");
		
	}

	@Test(enabled=false)
	public void loginfunc()
	{
		WebElement abc = driver.findElement(By.id("email"));
		abc.sendKeys("modisantosh@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("pass12345");
		
		WebElement xyz = driver.findElement(By.cssSelector("[type='submit']"));
		xyz.click();
		
		String c = "Java";
		
		System.out.println(c);
		
		System.out.println("Java");
		
		
	}
	
}
