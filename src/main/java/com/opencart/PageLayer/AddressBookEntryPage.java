package com.opencart.PageLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressBookEntryPage {
	
	private WebDriver driver;
	
	public AddressBookEntryPage(WebDriver d)
	{
		driver = d;
	}
	
	//===== Object Repository ============================================
	
	private By NewAddress_Button = By.xpath("//a[text()='New Address']");
	private By EditAddress_button = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[2]/a[1]");
	private By DeleteAddress_button = By.xpath("//a[text()='Delete']");
	
	private By AddressDeletedSuccessfully = By.xpath("//div[text()=' Your address has been successfully deleted']");
	private By AddressUpdatedSuccessfully = By.xpath("//div[text()=' Your address has been successfully updated']");
	private By AddressAddedSuccessfully = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	//===== Action Method =================================================
	
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String AddressDeleted = driver.findElement(AddressDeletedSuccessfully).getText();
		return AddressDeleted;
	}
	public void acceptAlert()
	{
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
	}

}
