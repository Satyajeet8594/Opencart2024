package com.opencart.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
	
	WebDriver driver;
	
	public MyAccountPage(WebDriver d)
	{
		driver = d;
	}
	
	//===== Object Repository =====
	
	By Logout_link = By.xpath("//li/a[text()='Logout']");
	By AddressBook_Link = By.xpath("//a[text()='Address Book']");
	
	//===== Action Method =========
	
	public void clickOnLogoutLink()
	{
		driver.findElement(Logout_link).click();
	}
	public void clickOnAddressBookLink()
	{
		driver.findElement(AddressBook_Link).click();
	}

}
