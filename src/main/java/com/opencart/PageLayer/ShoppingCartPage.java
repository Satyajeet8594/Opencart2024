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
	
	//==========================================================
	private By Prod_text = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[@class='text-left']/a");
	
	//*[@id='content']/form/div/table/tbody/tr/td[2]
	
	private By ProductRemoveFromShoppingCart_button = By.xpath("(//span[@class='input-group-btn'])[2]/button[@type='button']");
	
	private By ShoppingCartEmpty_text = By.xpath("//div[@id='content']/p");
	
	private By ShoppingCart_table = By.xpath("//div[@class='table-responsive']");
	
	//==========================================================

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
	public boolean tablePresentOrNot()
	{
		WebElement table = driver.findElement(ShoppingCart_table);
			
		boolean value1 = driver.findElement(ShoppingCart_table).isDisplayed();
		
		while(value1==true)
		{
			wait.until(ExpectedConditions.invisibilityOf(table));
			break;
		}
		try 
		{
			boolean value = driver.findElement(ShoppingCart_table).isDisplayed();
		}
		catch(NoSuchElementException e )
		{
			System.out.println(e);
		}
		return value;
		// code push28112024
		
		
		

	}
}
