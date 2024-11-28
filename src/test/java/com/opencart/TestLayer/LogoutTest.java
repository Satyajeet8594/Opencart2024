package com.opencart.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.PageLayer.HomePage;
import com.opencart.PageLayer.LoginPage;
import com.opencart.TestBase.TestBase;

public class LogoutTest extends TestBase{
	
	@Test
	public void verifyLogout()
	{
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();
		
		LoginPage LoginPage_obj = new LoginPage(driver);
		LoginPage_obj.enterEmailAddress("test102user@gmail.com");	//valid cred
		LoginPage_obj.enterPassword("Test@1234");
		LoginPage_obj.clickOnLoginButton();
		
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLogoutLink();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Account Logout");
	}

}
