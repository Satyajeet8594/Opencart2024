package com.opencart.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver d) {
		driver = d;
	}

	// ===== Object Repository =====

	private By EmailAddress_textbox = By.xpath("//input[@id='input-email']");
	private By Password_textbox = By.xpath("//input[@id='input-password']");
	private By Login_button = By.xpath("//input[@value='Login']");
	private By ErrorMessage_text = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

	// ===== Action Method =========

	public void enterEmailAddress(String email) {
		driver.findElement(EmailAddress_textbox).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(Password_textbox).sendKeys(password);
	}

	public void clickOnLoginButton() {
		driver.findElement(Login_button).click();
	}

	public String getErrorMessageText() {
		String Error_Message = driver.findElement(ErrorMessage_text).getText();
		return Error_Message;
	}

}
