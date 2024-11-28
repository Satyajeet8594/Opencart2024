package com.opencart.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.PageLayer.HomePage;
import com.opencart.PageLayer.RegisterPage;
import com.opencart.PageLayer.SuccessLoginPage;
import com.opencart.TestBase.TestBase;

public class RegisterTest extends TestBase {

	@Test
	public void verifyRegisterTestWithvalidDetails()
	{
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnRegisterLink();
		
		RegisterPage RegisterPage_obj = new RegisterPage(driver);
		RegisterPage_obj.enterFirstName("test3");
		RegisterPage_obj.enterLastName("user");
		RegisterPage_obj.enterEmailAddress("test102user@gmail.com");
		RegisterPage_obj.enterTelephoneNo("123456789");
		RegisterPage_obj.enterPassword("Test@1234");
		RegisterPage_obj.enterConfirmPassword("Test@1234");
		RegisterPage_obj.selectAgreeCheckbox();
		RegisterPage_obj.clickOnContinueButton();
		
		String title = driver.getTitle();	
		Assert.assertEquals(title, "Your Account Has Been Created!");	
		
		SuccessLoginPage SuccessLoginPage_obj = new SuccessLoginPage(driver);
		String AccountCreatedSuccessfully = SuccessLoginPage_obj.getAccountCreatedSuccessText();

		Assert.assertEquals(AccountCreatedSuccessfully, "Congratulations! Your new account has been successfully created!" );
	}
	
	@Test
	public void verifyRegisterWithSameCred()
	{
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnRegisterLink();
		
		RegisterPage RegisterPage_obj = new RegisterPage(driver);
		RegisterPage_obj.enterFirstName("test1");
		RegisterPage_obj.enterLastName("user");
		RegisterPage_obj.enterEmailAddress("test1user@gmail.com");
		RegisterPage_obj.enterTelephoneNo("123456789");
		RegisterPage_obj.enterPassword("Tester@123");
		RegisterPage_obj.enterConfirmPassword("Tester@123");
		RegisterPage_obj.selectAgreeCheckbox();
		RegisterPage_obj.clickOnContinueButton();
		
		String title = driver.getTitle();	
		Assert.assertEquals(title, "Register Account");
		
	}
	
	
}

