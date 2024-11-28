package com.opencart.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressBookEntryPage {
	
	WebDriver driver;
	
	public AddressBookEntryPage(WebDriver d)
	{
		driver = d;
	}
	
	//===== Object Repository =====
	
	By NewAddress_Button = By.xpath("//a[text()='New Address']");
	By EditAddress_button = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[2]/a[1]");
	By DeleteAddress_button = By.xpath("//a[text()='Delete']");
	
	By AddressDeletedSuccessfully = By.xpath("//div[text()=' Your address has been successfully deleted']");
	By AddressUpdatedSuccessfully = By.xpath("//div[text()=' Your address has been successfully updated']");
	By AddressAddedSuccessfully = By.xpath("//div[text()=' Your address has been successfully added']");
	//===== Action Method =========
	
	public void clickOnNewAddressButton()
	{
		driver.findElement(NewAddress_Button).click();
	}	
	public String getAddressAddedMessage()
	{
		String AddressAdded = driver.findElement(AddressAddedSuccessfully).getText();
		return AddressAdded;
	}
	public void clickOnEditButton()
	{
		driver.findElement(EditAddress_button).click();
	}
	public void clickOnDeleteButton()
	{
		driver.findElement(DeleteAddress_button).click();
	}
	public String getAddressUpdatedMessage()
	{
		String AddressUpdated = driver.findElement(AddressUpdatedSuccessfully).getText();
		return AddressUpdated;
	}
	public String getAddressDeletedMessage()
	{
		String AddressDeleted = driver.findElement(AddressDeletedSuccessfully).getText();
		return AddressDeleted;
	}

}
