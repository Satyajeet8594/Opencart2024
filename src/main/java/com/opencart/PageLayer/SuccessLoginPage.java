package com.opencart.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessLoginPage {
	
	private WebDriver driver;
	
	public SuccessLoginPage(WebDriver d)
	{
		driver = d;
	}
	
	//===== Object Repository =====
	
	private By AccountCreateSuccess_text = By.xpath("//div[@id='content']/p[1]");
	
	//===== Action Method =========
	
	public String getAccountCreatedSuccessText()
	{
		String successfullyAccountCreatedMessage = driver.findElement(AccountCreateSuccess_text).getText();
		return successfullyAccountCreatedMessage;
	}
	
	
	
	

}
