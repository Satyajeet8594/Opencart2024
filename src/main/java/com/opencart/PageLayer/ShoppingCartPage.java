package com.opencart.PageLayer;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {
	
	private WebDriver driver;
	WebDriverWait wait ;
	
	public ShoppingCartPage(WebDriver d)
	{
		driver = d;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	//========== Object Repository =============================================
	private By Prod_text = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[@class='text-left']/a");
	private By ProductRemoveFromShoppingCart_button = By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[2]");
	private By ShoppingCartEmpty_text = By.xpath("//div[@id='content']/p");
	private By ShoppingCart_table = By.xpath("//div[@class='table-responsive']");
	
	//============ Actions Method ==============================================

	public String getProductName()
	{
		String abc = driver.findElement(Prod_text).getText();
		return abc;
	}
	public void clickOnProductRemoveButton()
	{
		driver.findElement(ProductRemoveFromShoppingCart_button).click();
		
	}	
	public String getEmptyCartText()
	{
		String EmptyCarttext = driver.findElement(ShoppingCartEmpty_text).getText();
		return EmptyCarttext;
	}
	
}
