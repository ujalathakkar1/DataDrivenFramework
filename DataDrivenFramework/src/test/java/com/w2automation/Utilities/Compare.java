package com.w2automation.Utilities;

import org.openqa.selenium.WebDriver;

public class Compare {
	
	
	public boolean validatepageURL(WebDriver driver,String expURL)
	{
		boolean flag=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			flag=true;
		}
		
		
		return flag;
		
	}
	public boolean validatepageTitle(WebDriver driver,String expTitle)
	{
		boolean flag=false;
		if(driver.getTitle().equalsIgnoreCase(expTitle))
		{
			flag=true;
		}
		
		
		return flag;
		
	}
	
	
	
	
	

}
