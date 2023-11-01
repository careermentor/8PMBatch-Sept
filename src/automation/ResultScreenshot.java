package automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ResultScreenshot 
{

	
	
	public static void saveresult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;  //take screenshot like prtsc (keyboard)
		
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResults/"  + name + ".png");  //g2
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
