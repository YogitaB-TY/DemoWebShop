package com.DemoWebShop.tests;

import org.testng.annotations.Test;

import com.DemoWebShop.pages.DemoWebShopBooksPage;
import com.DemoWebShop.pages.DemoWebShopCartPage;
import com.DemoWebShop.pages.DemoWebShopWelcomePage;
import com.selenium.framework.BaseTest;

public class TC_SHOPPINGCART_010 extends BaseTest{
	
	@Test
	public void testcase10(){
		
		DemoWebShopWelcomePage Wpage=new DemoWebShopWelcomePage(driver);
		Wpage.Click_BookLink();
		
		DemoWebShopBooksPage BooksP=new DemoWebShopBooksPage(driver);
		BooksP.Click_AddTo_Cart();
		BooksP.Click_Cart();
		
		DemoWebShopCartPage cart=new DemoWebShopCartPage(driver);
		cart.compare_Product();
	}

}
