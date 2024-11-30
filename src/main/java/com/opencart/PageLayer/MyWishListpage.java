package com.opencart.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyWishListpage {
	
	private WebDriver driver;
	
	public MyWishListpage(WebDriver d)
	{
		driver = d;
	}
	
	//===== Object Repository ==============================================
	
	private By iPhoneInWishList_text = By.xpath("(//div[@class='table-responsive']/table/tbody/tr/td[@class='text-left'])");
	private By MacBookInWishList_text = By.xpath("(//div[@class='table-responsive']/table/tbody/tr/td[@class='text-left'])[3]");
	
	private By remove2ndProdctfromWishList_button = By.xpath("(//a[@data-original-title='Remove'])[2]");
	private By remove1stProdctfromWishList_button = By.xpath("(//a[@data-original-title='Remove'])");
	private By wishListEmpty_text = By.xpath("//div[@id='content']/p");	
	private By wishListModified_text = By.xpath("fake");
	private By modified_popup = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	//===== Action Method ==================================================
	
	public String getMacBookInWishListText()
	{
		String Iphone_text = driver.findElement(iPhoneInWishList_text).getText();
		return Iphone_text;			
	}	
	public String getIphoneiPhoneInWishListText()
	{
		String MacBook_Text = driver.findElement(MacBookInWishList_text).getText();
		return MacBook_Text;			
	}
	public void removeSecondProductFromWishList()
	{
		driver.findElement(remove2ndProdctfromWishList_button).click();
	}
	public void removeFirstProductFromWishList()
	{
		driver.findElement(remove1stProdctfromWishList_button).click();
	}
	public String getEmptyWishListText()
	{
		String EmptyWishListText = driver.findElement(wishListEmpty_text).getText();
		return EmptyWishListText;
	}
	public String getWishListModifiedText()
	{
		String WishListModifiedText = driver.findElement(wishListModified_text).getText();
		return WishListModifiedText;
	}
	public boolean IsPopupAvailable()
	{
		Boolean Pop_available = driver.findElement(modified_popup).isDisplayed();
		return Pop_available;
	}
	
	
}
