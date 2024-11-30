package com.opencart.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddAddressPage {
	
	WebDriver driver;
	
	public AddAddressPage(WebDriver d)
	{
		driver = d;
	}
	
	//===== Object Repository =====
	
	By firstname_textbox = By.xpath("//input[@id='input-firstname']");
	By lastname_textbox = By.xpath("//input[@id='input-lastname']");
	By company_textbox = By.xpath("//input[@id='input-company']");
	By address1_textbox = By.xpath("//input[@id='input-address-1']");
	By address2_textbox = By.xpath("//input[@id='input-address-2']");
	By city_textbox = By.xpath("//input[@id='input-city']");
	By postcode_textbox = By.xpath("//input[@id='input-postcode']");
	By country_dropdown = By.xpath("//select[@id='input-country']");
	By inputzone_dropdown = By.xpath("//select[@id='input-zone']");
	By continue_button = By.xpath("//input[@value='Continue']");
	
	
	//===== Action Method =========
	
	public void enterFirstname(String firstname)
	{
		driver.findElement(firstname_textbox).sendKeys(firstname);
	}
	public void enterLastname(String lastname)
	{
		driver.findElement(lastname_textbox).sendKeys(lastname);
	}
	public void enterCompanyName(String companyName)
	{
		driver.findElement(company_textbox).sendKeys(companyName);
	}
	public void enterAddress1(String address1)
	{
		driver.findElement(address1_textbox).sendKeys(address1);
	}
	public void enterAddress2(String address2)
	{
		driver.findElement(address1_textbox).sendKeys(address2);
	}
	public void enterCity(String city)
	{
		driver.findElement(city_textbox).sendKeys(city);
	}
	public void enterPostcode(String postcode)
	{
		driver.findElement(postcode_textbox).sendKeys(postcode);
	}
	public void selectCountry()
	{
		WebElement country = driver.findElement(country_dropdown);
		Select sel = new Select(country);
		sel.selectByValue("99");
	}
	public void selectState()
	{
		WebElement state = driver.findElement(inputzone_dropdown);
		Select sel = new Select(state);
		sel.selectByVisibleText("Maharashtra");
	}
	public void clickOnContinueButton()
	{
		driver.findElement(continue_button).click();
	}
	public void clearCityTextbox()
	{
		driver.findElement(city_textbox).clear();
	}
	
	
	

}
