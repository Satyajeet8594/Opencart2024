package com.opencart.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.PageLayer.HomePage;
import com.opencart.PageLayer.LoginPage;
import com.opencart.TestBase.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void verifyLoginWithValidCred() {

		String expected_result = "My Account";
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();

		LoginPage LoginPage_obj = new LoginPage(driver);
		LoginPage_obj.enterEmailAddress("test103user@gmail.com"); // valid cred
		LoginPage_obj.enterPassword("Test@1234");
		LoginPage_obj.clickOnLoginButton();

		String actual_result = driver.getTitle();
		Assert.assertEquals(actual_result, expected_result);

	}

	@Test
	public void verifyLoginWithInvalidCred() {

		String expected_result = "Account Login";

		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();

		LoginPage LoginPage_obj = new LoginPage(driver);
		LoginPage_obj.enterEmailAddress("test102user@gmail.com"); // invalid credentials
		LoginPage_obj.enterPassword("Tester@1234");
		LoginPage_obj.clickOnLoginButton();

		String actual_result = driver.getTitle();
		Assert.assertEquals(actual_result, expected_result);
	}

	@Test
	public void verifyErrorMessageLoginWithInvalidCred() {

		String expected_result = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";

		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();

		LoginPage LoginPage_obj = new LoginPage(driver);
		LoginPage_obj.enterEmailAddress("test5user@gmail.com"); // invalid credentials
		LoginPage_obj.enterPassword("Tester@123");
		LoginPage_obj.clickOnLoginButton();

		String actual_result = LoginPage_obj.getErrorMessageText();
		Assert.assertEquals(actual_result, expected_result);

	}

}
