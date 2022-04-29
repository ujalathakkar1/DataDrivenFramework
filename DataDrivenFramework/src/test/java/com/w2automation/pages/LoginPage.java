package com.w2automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.w2automation.Utilities.CaptureScreenshots;
import com.w2automation.Utilities.PageAction;
import com.w2automation.Utilities.Utility;

public class LoginPage {
	
	WebDriver driver;
	PageAction action;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		action=new PageAction(driver);
	}
	
	public void enterusername(String username) throws IOException
	{
		try
		{
			action.enteredDataintotxtbox(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("email_css"))), username);
			//driver.findElement(By.cssSelector(Utility.fetchLocatorValue("email_css"))).sendKeys(username);
			
		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Login error");
			Assert.fail();
		}
		
	}
	public void clickSignIn() 
	{
		try
		{
			action.clickbtn(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("SignInBtn_css"))));
			//driver.findElement(By.cssSelector(Utility.fetchLocatorValue("SignInBtn_css"))).click();
			
		
		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}

	}
	public void enterpassword(String password) throws IOException
	{
		try
		{
			action.enteredDataintotxtbox(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("password_css"))), password);
			//driver.findElement(By.cssSelector(Utility.fetchLocatorValue("password_css"))).sendKeys(password);

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Login error");
			Assert.fail();
		}
			}
	
	
	
	
	public void dologin() throws IOException
	{
		try
		{
			action.clickbtn(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Submit_css"))));
			//driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Submit_css"))).click();
		
		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Login error");
			Assert.fail();
		}
		}
	public void clickLogout() throws IOException {
		try
		{
			action.clickbtn(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Logout_css"))));

		// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Logout_css"))).click();

			
		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Login error");
			Assert.fail();
		}
		
	}

}
