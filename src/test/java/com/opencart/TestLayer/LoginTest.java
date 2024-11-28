package com.opencart.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.PageLayer.HomePage;
import com.opencart.PageLayer.LoginPage;
import com.opencart.TestBase.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void verifyLoginWithValidCred() {
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();

		LoginPage LoginPage_obj = new LoginPage(driver);
		LoginPage_obj.enterEmailAddress("test102user@gmail.com"); // valid cred
		LoginPage_obj.enterPassword("Test@123");
		LoginPage_obj.clickOnLoginButton();

		String title = driver.getTitle();
		Assert.assertEquals(title, "Account Login");

	}

	@Test
	public void verifyLoginWithInvalidCred() {

		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();

		LoginPage LoginPage_obj = new LoginPage(driver);
		LoginPage_obj.enterEmailAddress("test4user@gmail.com"); // invalid credentials
		LoginPage_obj.enterPassword("Tester@123");
		LoginPage_obj.clickOnLoginButton();

		String title = driver.getTitle();
		Assert.assertEquals(title, "Account Login");
	}

	@Test
	public void verifyErrorMessageLoginWithInvalidCred() {

		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();

		LoginPage LoginPage_obj = new LoginPage(driver);
		LoginPage_obj.enterEmailAddress("test5user@gmail.com"); // invalid credentials
		LoginPage_obj.enterPassword("Tester@123");
		LoginPage_obj.clickOnLoginButton();

		String Error_Message = LoginPage_obj.getErrorMessageText();
		Assert.assertEquals(Error_Message, "Warning: No match for E-Mail Address and/or Password.");

	}

}
