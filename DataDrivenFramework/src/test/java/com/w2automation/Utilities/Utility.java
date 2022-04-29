package com.w2automation.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	
	
	public static String fetchLocatorValue(String key) throws IOException
	{
		try
		{
			FileInputStream f1=new FileInputStream("./ElementLocators/Locators.propeties");
			Properties pr=new Properties();
			pr.load(f1);
			return pr.get(key).toString();	
			
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	
	public static String fetchApplicationValue(String key) throws IOException
	{
		try
		{
			FileInputStream f1=new FileInputStream("./ElementLocators/Application.propeties");
			Properties pr=new Properties();
			pr.load(f1);
			return pr.get(key).toString();	
		}
		catch(Exception e)
		{
			return null;
		}
		
		
	}
	
	
		
		
		
		 
	
	

}
