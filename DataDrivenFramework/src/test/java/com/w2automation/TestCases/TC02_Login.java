package com.w2automation.TestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.automation.DataGeneration.Datagen;
import com.w2automation.base.Base;
import com.w2automation.pages.LoginPage;


public class TC02_Login extends Base{
	@Test(priority=1,dataProvider="dp1",dataProviderClass=Datagen.class)
	public void login(Hashtable<String, String> data) throws IOException, InterruptedException
	{
		System.out.println(data.get("Email")+"and"+data.get("Pass"));
		LoginPage l1=new LoginPage(driver);
		l1.clickSignIn();
		l1.enterusername(data.get("Email"));
		l1.enterpassword(data.get("Pass"));
		l1.dologin();
		l1.clickLogout();
	}
	
	

}
