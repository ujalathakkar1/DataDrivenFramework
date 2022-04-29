package com.w2automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.w2automation.Utilities.CaptureScreenshots;
import com.w2automation.Utilities.PageAction;
import com.w2automation.Utilities.Utility;

public class RegistrationPage {

	WebDriver driver;
	PageAction action;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		action = new PageAction(driver);
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

	public void enteremail(String email) throws IOException {
		try
		{
			action.enteredDataintotxtbox(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Emailtxt_css"))),
					email);
			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Emailtxt_css"))).sendKeys(email);

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}

	public void SubmitBtn() throws IOException {
		try
		{
			action.clickbtn(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("CreateBtn_css"))));
			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("CreateBtn_css"))).click();

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}

	public void enterfname(String fname) throws IOException {
		try
		{
			action.enteredDataintotxtbox(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Fname_css"))), fname);
			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Fname_css"))).sendKeys(fname);

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}

	public void enterlname(String lname) throws IOException {
		try
		{
			action.enteredDataintotxtbox(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Lname_css"))), lname);
			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Lname_css"))).sendKeys(lname);

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}

	public void enterPassword(String password) throws IOException {
		try
		{
			action.enteredDataintotxtbox(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("password_css"))),
					password);
			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("password_css"))).sendKeys(password);

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}

	public void enterAddress(String address1) throws IOException {
		try
		{
			action.enteredDataintotxtbox(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("address1_css"))),
					address1);
			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("address1_css"))).sendKeys(address1);

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}

	public void enterCity(String city) throws IOException {
		try
		{
			action.enteredDataintotxtbox(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("city_css"))), city);
			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("city_css"))).sendKeys(city);

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}

	public void SelectState(String state) throws IOException {
		try
		{
			action.selectedvisibletextDropdown(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("state_css"))), state);
			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("state_css"))).sendKeys(state);

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}

	public void enterpostcode(String postcode) throws IOException {
		try
		{
			action.enteredDataintotxtbox(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("postcode_css"))),
					postcode);
			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("postcode_css"))).sendKeys(postcode);

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}

	public void enterPhone(String phone) throws IOException {
		try
		{
			action.enteredDataintotxtbox(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("phone_css"))), phone);
			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("phone_css"))).sendKeys(phone);

		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}

	public void SubmitAccount() throws IOException {
		try
		{
			action.clickbtn(driver.findElement(By.cssSelector(Utility.fetchLocatorValue("submitAccount_css"))));

			// driver.findElement(By.cssSelector(Utility.fetchLocatorValue("submitAccount_css"))).click();

			
		}
		catch(Exception e)
		{
			System.out.println("******************Exception**************");
			e.printStackTrace();
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
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
			CaptureScreenshots.TakeScreenshots(driver, "Registration error");
			Assert.fail();
		}
		
	}
}
