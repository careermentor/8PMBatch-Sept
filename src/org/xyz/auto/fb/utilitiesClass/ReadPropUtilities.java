package org.xyz.auto.fb.utilitiesClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ReadPropUtilities

{

	public static String readconfigProp(String Key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		
		return prop.get(Key).toString();  //BrowserName = Chrome
		
	}
	
	public static String readElementProp(String Key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/Element.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		return prop.get(Key).toString();
		
	}
}
