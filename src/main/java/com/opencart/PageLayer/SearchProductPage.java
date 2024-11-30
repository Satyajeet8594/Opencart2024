package com.opencart.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductPage {
	
	private WebDriver driver;
	public SearchProductPage(WebDriver d)
	{
		driver = d;
	}
	
	//===== Object Repository ==================================================
	
	private By AddToCart_button = By.xpath("//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[1]");
	private By SuccessfullyAddedProduct_text = By.xpath("//*[@id=\"product-search\"]/div[1]");
	
	//===== Action Method ======================================================
	
	public void clickOnAddToCartButton()
	{
		driver.findElement(AddToCart_button).click();
	}
	public String getSuccessfullyProductAddedtext()
	{
		String Product_name = driver.findElement(SuccessfullyAddedProduct_text).getText();
		return Product_name;
	}
}
