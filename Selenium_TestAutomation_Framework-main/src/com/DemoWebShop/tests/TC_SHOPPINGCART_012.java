package com.DemoWebShop.tests;

import org.testng.annotations.Test;

import com.DemoWebShop.pages.DemoWebShopWelcomePage;
import com.DemoWebShop.pages.DemoWebShopWishlistPage;
import com.selenium.framework.BaseTest;

public class TC_SHOPPINGCART_012 extends BaseTest{
	
	@Test
	public void testcase12(){
		DemoWebShopWelcomePage Wpage=new DemoWebShopWelcomePage(driver);
		Wpage.Click_Wishlist();
		
		DemoWebShopWishlistPage Wishlist=new DemoWebShopWishlistPage(driver);
		Wishlist.title();
	}

}
