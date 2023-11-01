package testPkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileHandling 
{

	public static void readProp() throws Exception
	{
		FileReader fr = new FileReader("./TestData/data.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		System.out.println(prop.get("name"));
		System.out.println(prop.get("automation"));
	}
	
	
	public static void readData() throws Exception 
	{
		
		File f = new File("./TestData/abc.txt");  //file connection
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();  //T = 84, h=104
		
		while(r!=-1)  //84!=-1
		{
			System.out.print((char)r); //Th
			r=fr.read();
		}
		
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nThis is forth line");
		fw.flush();
		fw.close();
		
	}
	
	
	public static void main(String[] args) throws Exception
	{
		//FileHandling.readData();
		//FileHandling.writedata();
		FileHandling.readProp();
	}
	
}
