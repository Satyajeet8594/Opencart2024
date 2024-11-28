package com.opencart.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver d) {
		driver = d;
	}

	// ===== Object Repository =====

	private By MyAccount_link = By.xpath("//span[text()='My Account']");
	private By Register_link = By.xpath("//a[text()='Register']");
	private By Login_link = By.xpath("//a[text()='Login']");
	private By Logout_link = By.xpath("//li/a[text()='Logout']");
	private By Search_textbox = By.xpath("//input[@name='search']");
	private By Search_button = By.xpath("//button[@class='btn btn-default btn-lg']");
	private By ShoppingCart_Link = By.xpath("//span[text()='Shopping Cart']");
	private By WishList_link = By.xpath("(//li/a)[8]");

	private By addWishList_MacBook_button = By
			.xpath("(//div[@class='button-group']/button[contains(@onclick,'wishlist')])[1]");
	private By addWishList_iPhone_button = By
			.xpath("(//div[@class='button-group']/button[contains(@onclick,'wishlist')])[2]");

	private By compare_button = By.xpath("(//div[@class='button-group']/button[contains(@onclick,'compare')])[1]");
	
	private By Home_icon = By.xpath("//ul[@class='breadcrumb']/li");
	
	// ===== Action Method =========

	public void clickOnMyAccountLink() {
		driver.findElement(MyAccount_link).click();
	}

	public void clickOnRegisterLink() {
		driver.findElement(Register_link).click();
	}

	public void clickOnLoginLink() {
		driver.findElement(Login_link).click();
	}

	public void clickOnLogoutLink() {
		driver.findElement(Logout_link).click();
	}

	public void enterProductName(String product_name) {
		driver.findElement(Search_textbox).sendKeys(product_name);
	}

	public void clickOnSearchButton() {
		driver.findElement(Search_button).click();
	}

	public void clickOnShoppingcartLink() {
		driver.findElement(ShoppingCart_Link).click();
	}

	public void clickOnWishListLink() {
		driver.findElement(WishList_link).click();
	}

	public void addMacBookToWishList() {
		driver.findElement(addWishList_MacBook_button).click();
	}

	public void addIPhoneToWishList() {
		driver.findElement(addWishList_iPhone_button).click();
	}
	public void clickOnHomeIcon()
	{
		driver.findElement(Home_icon).click();
	}

}
