package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.framework.FrameworkUtility;

public class DemoWebShopWishlistPage extends FrameworkUtility{
	
	public DemoWebShopWishlistPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void title(){
		Assert.assertTrue(driver.getTitle().contains("Wishlist"), "User is redirected to wishlist");
		}
	
}
