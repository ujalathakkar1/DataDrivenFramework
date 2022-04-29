package com.w2automation.TestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.automation.DataGeneration.Datagen;
import com.w2automation.base.Base;
import com.w2automation.pages.RegistrationPage;


public class TC01_Registration extends Base{
	
	
	
	@Test(priority=1,dataProvider="dp1",dataProviderClass=Datagen.class)
	public void Registration(Hashtable<String, String> data) throws IOException, InterruptedException
	{
		RegistrationPage r1=new RegistrationPage(driver);
		r1.clickSignIn();
		
		r1.enteremail(data.get("Email"));
		r1.SubmitBtn();
		Thread.sleep(5000);
		r1.enterfname(data.get("fname"));
		r1.enterlname(data.get("lname"));
		r1.enterPassword(data.get("pass"));
		r1.enterAddress(data.get("Address"));
		r1.enterCity(data.get("City"));
		//Thread.sleep(4000);
		r1.SelectState(data.get("State"));
		r1.enterpostcode(data.get("postcode"));
		r1.enterPhone(data.get("phone"));
		r1.SubmitAccount();
		//Thread.sleep(4000);
		r1.clickLogout();
		//Thread.sleep(4000);
		
		
		
	}

}
