package com.w2automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.w2a.automation.excel.Utilities.Xls_Reader;
import com.w2automation.Utilities.Utility;





public class Base {
	
	public static WebDriver driver;
	public static Xls_Reader excel = new Xls_Reader(
			System.getProperty("user.dir") + "\\TestData\\Data.xlsx");
	public static Logger log=Logger.getLogger(Base.class.getName());
	
	@BeforeClass
	public void InitializeBrowser() throws IOException
	{
		if(Utility.fetchApplicationValue("Browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
			log.info("chrome is Initianlized!!!!!!!!");
		}
		else if(Utility.fetchApplicationValue("Browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
			log.info("Firefox is Initianlized!!!!!!!!");
		}
		else if(Utility.fetchApplicationValue("Browser").equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			log.info("IE is Initianlized!!!!!!!!");
		}
		
			
		
		driver.get(Utility.fetchApplicationValue("Application_url"));
		driver.manage().window().maximize();
		//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		//driver.manage().Timeout().ImplicitlyWait(TimeUnit.SECONDS,20);
		
		
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		if (driver!=null)
		{
			driver.quit();
		}
		log.info("Log Execution is completed!!!!!!!!");
	}
	
	
	

}
