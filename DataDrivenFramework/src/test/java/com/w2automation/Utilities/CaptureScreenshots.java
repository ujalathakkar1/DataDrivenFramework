package com.w2automation.Utilities;

import java.io.File;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CaptureScreenshots {
	
	static String filname=null;
	public static void TakeScreenshots(WebDriver driver,String name) {
		// TODO Auto-generated method stub
		try
		{
			Calendar c1=Calendar.getInstance();
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			filname="./screenshots/"+name+c1.getTime().toString().replace(":","").replace("","")+".png";
			File f=screenshot.getScreenshotAs(OutputType.FILE);
			File fd=new File(filname);
			FileUtils.copyFile(f, fd);
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to task screenshot");
		}
		
		attachedscreenshotReport();
	}
	
	
	public static void attachedscreenshotReport() {
		// TODO Auto-generated method stub
		try
		{
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			File f1=new File(filname);
			Reporter.log(
					"<a title=\"snapshot\" href=\"" +f1.getAbsolutePath()+"\">"+
							"<img width=\"418\" height=\"240\" alt=\"alternativeName\" title=\"title\" src=\"../surefire-reports/html/screenShots/"+filname+"\"</a>");
					
		}
		catch(Exception e)
		{
			System.out.println("Not able to take screenshot");
		}

	}


}
