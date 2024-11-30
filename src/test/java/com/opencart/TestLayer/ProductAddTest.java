package com.opencart.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.PageLayer.HomePage;
import com.opencart.PageLayer.SearchProductPage;
import com.opencart.PageLayer.ShoppingCartPage;
import com.opencart.TestBase.TestBase;

public class ProductAddTest extends TestBase {
	
	@Test
	public void verifySuccessfullyAddToCartText()
	{
		String product_name = "MacBook";
		
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.enterProductName(product_name);
		HomePage_obj.clickOnSearchButton();
		
		SearchProductPage SearchProductPage_obj = new SearchProductPage(driver);
		SearchProductPage_obj.clickOnAddToCartButton();
		
		HomePage_obj.clickOnShoppingcartLink();
		
		ShoppingCartPage ShoppingCartPage_obj = new ShoppingCartPage(driver);
		String actual_name = ShoppingCartPage_obj.getProductName();
		
		Assert.assertEquals(actual_name, product_name);
		
	}
	
	@Test
	public void verifyProductRemoveFromShoppingCart() throws InterruptedException
	{
		String product_name = "MacBook";
		
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.enterProductName(product_name);
		HomePage_obj.clickOnSearchButton();
		
		SearchProductPage SearchProductPage_obj = new SearchProductPage(driver);
		SearchProductPage_obj.clickOnAddToCartButton();
		
		HomePage_obj.clickOnShoppingcartLink();
		
		ShoppingCartPage ShoppingCartPage_obj = new ShoppingCartPage(driver);
		ShoppingCartPage_obj.clickOnProductRemoveButton();
		
		Thread.sleep(3000);
		
		String actual_reult = ShoppingCartPage_obj.getEmptyCartText();
		String expected_result = "Your shopping cart is empty!";
		
		Assert.assertEquals(actual_reult, expected_result);
	}

}
