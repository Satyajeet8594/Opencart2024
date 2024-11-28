package com.opencart.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	private WebDriver driver;
	
	public RegisterPage(WebDriver d)
	{
		driver = d;
	}
	
	//===== Object Repository =====
	
	private By FirstName_textbox = By.xpath("//input[@id='input-firstname']");
	private By LastName_textbox = By.xpath("//input[@id='input-lastname']");
	private By Email_textbox = By.xpath("//input[@id='input-email']");
	private By Telephone_textbox = By.xpath("//input[@id='input-telephone']");
	private By Password_textbox = By.xpath("//input[@id='input-password']");
	private By ConfirmPassord_textbox = By.xpath("//input[@id='input-confirm']");
	private By Agree_checkbox = By.xpath("//input[@name='agree']");
	private By Continue_button = By.xpath("//input[@value='Continue']");
	
	//===== Action Method =========
	
	public void enterFirstName(String firstname)
	{
		driver.findElement(FirstName_textbox).sendKeys(firstname);
	}
	
	public void enterLastName(String lastname)
	{
		driver.findElement(LastName_textbox).sendKeys(lastname);
	}
	
	public void enterEmailAddress(String emailId)
	{
		driver.findElement(Email_textbox).sendKeys(emailId);
	}
	
	public void enterTelephoneNo(String telephone)
	{
		driver.findElement(Telephone_textbox).sendKeys(telephone);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(Password_textbox).sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirm_password)
	{
		driver.findElement(ConfirmPassord_textbox).sendKeys(confirm_password);
	}
	
	public void selectAgreeCheckbox()
	{
		driver.findElement(Agree_checkbox).click();
	}
	
	public void clickOnContinueButton()
	{
		driver.findElement(Continue_button).click();
	}
	
	
	
	
	
	
}
