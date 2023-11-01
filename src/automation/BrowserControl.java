package automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserControl
{
	WebDriver driver;
	
	@Test
	public void thetestingworld() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  //
		
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.name("fld_username")).sendKeys("test");
		driver.findElement(By.cssSelector("[value='office']")).click();
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.className("displayPopup")).click();
		
		
		WebElement genName = driver.findElement(By.name("sex"));
		
		
		Select gen = new Select(genName);
		//gen.selectByIndex(2);
		
		//gen.selectByValue("1");
		
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		//con.selectByVisibleText("India");
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//Thread.sleep(4000);
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Washington"));
		
		st.selectByVisibleText("Florida");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Beach"));
		
		ct.selectByVisibleText("Dora");
		
		
		
		
		
		
		
		
		
		
	}
	
	@Test(enabled=false)
	public void launchBrowser() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  //
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//driver.close();  //will close only one window
		driver.quit();  //will close multiple tab/winodw
		
	}
		
}
