package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.DemoWebShopSearchResultPage;
import com.DemoWebShop.pages.DemoWebShopWelcomePage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_SHOPPINGCART_013 extends BaseTest{
	
	@DataProvider(name="testData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("TestData", this.getClass().getSimpleName());
		return lib.getTestdata();
	}
	
	@Test(dataProvider="testData")
	public void testCase13(String SearchValue){
		DemoWebShopWelcomePage Wpage=new DemoWebShopWelcomePage(driver);
		Wpage.EnterSearch(SearchValue);
		Wpage.ClickSeaarchButton();
		
		DemoWebShopSearchResultPage searchP=new DemoWebShopSearchResultPage(driver);
		searchP.CompareTitle(SearchValue);
	}

}
