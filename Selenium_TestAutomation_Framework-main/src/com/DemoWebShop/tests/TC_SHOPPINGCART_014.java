package com.DemoWebShop.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.DemoWebShop.pages.DemoWebShopBooksPage;
import com.DemoWebShop.pages.DemoWebShopCartPage;
import com.DemoWebShop.pages.DemoWebShopWelcomePage;
import com.selenium.framework.BaseTest;

public class TC_SHOPPINGCART_014 extends BaseTest{
	
	@Test
	public void testcase14() throws InterruptedException {
		DemoWebShopWelcomePage wPage=new DemoWebShopWelcomePage(driver);
		wPage.Click_BookLink();
		
		DemoWebShopBooksPage book=new DemoWebShopBooksPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    book.Click_AddTo_Cart();
		book.Click_Fiction_AddTo_Cart();
		book.Click_Health_AddTo_Cart();
		book.Click_Cart();
		
		DemoWebShopCartPage cart=new DemoWebShopCartPage(driver);
		cart.comparingProducts();
		
	}
	

}
