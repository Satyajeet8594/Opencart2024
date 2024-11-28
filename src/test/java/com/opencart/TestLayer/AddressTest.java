package com.opencart.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.PageLayer.AddAddressPage;
import com.opencart.PageLayer.AddressBookEntryPage;
import com.opencart.PageLayer.HomePage;
import com.opencart.PageLayer.LoginPage;
import com.opencart.PageLayer.MyAccountPage;
import com.opencart.TestBase.TestBase;

public class AddressTest extends TestBase {
	
	//@Test
	public void verifyAddressSaveSuccessfully()
	{
		String Expected_Result = "Your address has been successfully added";
		
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();
		
		LoginPage LoginPage_obj = new LoginPage(driver);
		LoginPage_obj.enterEmailAddress("test101user@gmail.com"); // valid cred
		LoginPage_obj.enterPassword("Test@1234");
		LoginPage_obj.clickOnLoginButton();
		
		MyAccountPage MyAccountPage_obj = new MyAccountPage(driver);
		MyAccountPage_obj.clickOnAddressBookLink();
		
		AddressBookEntryPage AddressBookEntryPage_obj = new AddressBookEntryPage(driver);
		AddressBookEntryPage_obj.clickOnNewAddressButton();
		
		AddAddressPage AddAddressPage_obj = new AddAddressPage(driver);
		AddAddressPage_obj.enterFirstname("Test");
		AddAddressPage_obj.enterLastname("User");
		AddAddressPage_obj.enterCompanyName("Dummy");
		AddAddressPage_obj.enterAddress1("Pune");
		AddAddressPage_obj.enterAddress2("Swargate");
		AddAddressPage_obj.enterCity("pune");
		AddAddressPage_obj.enterPostcode("123456");
		AddAddressPage_obj.selectCountry();
		AddAddressPage_obj.selectState();
		AddAddressPage_obj.clickOnContinueButton();
		
		String Actual_Result = AddressBookEntryPage_obj.getAddressAddedMessage();
		Assert.assertEquals
		(Actual_Result, Expected_Result);
	}
	
	@Test
	public void verifyAddressEditSuccessfully()
	{
		String Expected_Result = "Your address has been successfully updated";
		
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();
		
		LoginPage LoginPage_obj = new LoginPage(driver);
		LoginPage_obj.enterEmailAddress("test10user@gmail.com"); // valid cred
		LoginPage_obj.enterPassword("Test@1234");
		LoginPage_obj.clickOnLoginButton();
		
		MyAccountPage MyAccountPage_obj = new MyAccountPage(driver);
		MyAccountPage_obj.clickOnAddressBookLink();
		
		AddressBookEntryPage AddressBookEntryPage_obj = new AddressBookEntryPage(driver);
		//AddressBookEntryPage_obj.clickOnNewAddressButton();
		
		AddAddressPage AddAddressPage_obj = new AddAddressPage(driver);
		/*AddAddressPage_obj.enterFirstname("Test");
		AddAddressPage_obj.enterLastname("User");
		AddAddressPage_obj.enterCompanyName("Dummy");
		AddAddressPage_obj.enterAddress1("pune, add1");
		AddAddressPage_obj.enterAddress2("pune, add2");
		AddAddressPage_obj.enterCity("pune");
		AddAddressPage_obj.enterPostcode("123456");
		AddAddressPage_obj.selectCountry();
		AddAddressPage_obj.selectState();
		AddAddressPage_obj.clickOnContinueButton();*/
		
		AddressBookEntryPage_obj.clickOnEditButton();
		
		AddAddressPage_obj.enterCity("Satara");
		AddAddressPage_obj.clickOnContinueButton();
		
		String Actual_Result = AddressBookEntryPage_obj.getAddressUpdatedMessage();
		
		Assert.assertEquals(Actual_Result, Expected_Result);
	}
	
	//@Test
	public void verifyAddressDeleteSuccessfully()
	{
		String Expected_Result = "Your address has been successfully deleted";
		
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.clickOnMyAccountLink();
		HomePage_obj.clickOnLoginLink();
		
		LoginPage LoginPage_obj = new LoginPage(driver);
		LoginPage_obj.enterEmailAddress("test10user@gmail.com"); // valid cred
		LoginPage_obj.enterPassword("Test@1234");
		LoginPage_obj.clickOnLoginButton();
		
		MyAccountPage MyAccountPage_obj = new MyAccountPage(driver);
		MyAccountPage_obj.clickOnAddressBookLink();
		
		AddressBookEntryPage AddressBookEntryPage_obj = new AddressBookEntryPage(driver);
		AddressBookEntryPage_obj.clickOnNewAddressButton();
		
		AddAddressPage AddAddressPage_obj = new AddAddressPage(driver);
		AddAddressPage_obj.enterFirstname("Test");
		AddAddressPage_obj.enterLastname("User");
		AddAddressPage_obj.enterCompanyName("Dummy");
		AddAddressPage_obj.enterAddress1("pune, add1");
		AddAddressPage_obj.enterAddress2("pune, add2");
		AddAddressPage_obj.enterCity("pune");
		AddAddressPage_obj.enterPostcode("123456");
		AddAddressPage_obj.selectCountry();
		AddAddressPage_obj.selectState();
		AddAddressPage_obj.clickOnContinueButton();
		
		AddressBookEntryPage_obj.clickOnEditButton();
		
		AddAddressPage_obj.enterCity("Sangli");
		AddAddressPage_obj.clickOnContinueButton();
		
		AddressBookEntryPage_obj.clickOnEditButton();
		
		AddAddressPage_obj.enterCity("Mumbai");
		AddAddressPage_obj.clickOnContinueButton();
		
		String Actual_Result = AddressBookEntryPage_obj.getAddressDeletedMessage();
		
		Assert.assertEquals(Actual_Result, Expected_Result);
	}

}
