package com.opencart.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.PageLayer.HomePage;
import com.opencart.PageLayer.LoginPage;
import com.opencart.PageLayer.MyWishListpage;
import com.opencart.PageLayer.SearchProductPage;
import com.opencart.PageLayer.ShoppingCartPage;
import com.opencart.TestBase.TestBase;

public class Dummy extends TestBase {
	
	@Test
	public void verifyProductAddToWishlist()
	{
		
		String expected_result_1 = "iPhone";
		String expected_result_2 = "MacBook"	;	
				
		HomePage HomePage_obj = new HomePage(driver);
		LoginPage LoginPage_obj = new LoginPage(driver);
		MyWishListpage MyWishListpage_obj = new MyWishListpage(driver);
		
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();
		
		LoginPage_obj.enterEmailAddress("test101user@gmail.com");
		LoginPage_obj.enterPassword("Test@1234");
		LoginPage_obj.clickOnLoginButton();
		
		HomePage_obj.clickOnHomeIcon();
		
		HomePage_obj.addMacBookToWishList();
		HomePage_obj.addIPhoneToWishList();
		
		HomePage_obj.clickOnWishListLink();
		
		String actual_result_2 = MyWishListpage_obj.getIphoneiPhoneInWishListText();
		String actual_result_1 = MyWishListpage_obj.getMacBookInWishListText();
		
		Assert.assertEquals(actual_result_1, expected_result_1);
		Assert.assertEquals(actual_result_2, expected_result_2);
		
	}
	
	@Test
	public void verifyProductRemoveFromWishList()
	{
		
		String expected_result = "Your wish list is empty.";
		
		HomePage HomePage_obj = new HomePage(driver);
		LoginPage LoginPage_obj = new LoginPage(driver);
		MyWishListpage MyWishListpage_obj = new MyWishListpage(driver);
		
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();
		
		LoginPage_obj.enterEmailAddress("test101user@gmail.com");
		LoginPage_obj.enterPassword("Test@1234");
		LoginPage_obj.clickOnLoginButton();
		
		HomePage_obj.clickOnWishListLink();
		
		MyWishListpage_obj.removeSecondProductFromWishList();
		MyWishListpage_obj.removeFirstProductFromWishList();
		
		String actual_result = MyWishListpage_obj.getMacBookInWishListText();
		
		Assert.assertEquals(actual_result, expected_result);
		
		
	}

}
