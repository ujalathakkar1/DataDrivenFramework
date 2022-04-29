package com.w2automation.Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PageAction {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	public PageAction(WebDriver driver)
	{
		this.driver=driver;
		
		
		 wait = new WebDriverWait(driver,80);
	}
	
	
	public void clickbtn(WebElement element)
	{
		
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	
	public void enteredDataintotxtbox(WebElement element,String text)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(text);
	}
	
	
	
	public void selectedvisibletextDropdown(WebElement element,String text)
	{
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		Select s1=new Select(element);
		s1.selectByVisibleText(text);
		
	}
	
	
	
	

}
