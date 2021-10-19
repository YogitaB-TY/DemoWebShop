package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.DemoWebShopBooksPage;
import com.DemoWebShop.pages.DemoWebShopCartPage;
import com.DemoWebShop.pages.DemoWebShopWelcomePage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_SHOPPINGCART_011 extends BaseTest {
	
	
	@DataProvider(name="testData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("TestData", this.getClass().getSimpleName());
		return lib.getTestdata();
		
	}
	
	@Test(dataProvider="testData")
	public void testcase11(String quantity){
		
		DemoWebShopWelcomePage Wpage=new DemoWebShopWelcomePage(driver);
		Wpage.Click_BookLink();
		
		DemoWebShopBooksPage BooksP=new DemoWebShopBooksPage(driver);
		BooksP.Click_AddTo_Cart();
		BooksP.Click_Cart();
		
		DemoWebShopCartPage cart=new DemoWebShopCartPage(driver);
		cart.Item_Text_field(quantity);
		cart.Click_Update_cart();
		

	}

}
