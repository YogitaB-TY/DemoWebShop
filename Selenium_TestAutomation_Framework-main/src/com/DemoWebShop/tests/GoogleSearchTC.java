package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.GoogleSearchPage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class GoogleSearchTC extends BaseTest {
	

    @DataProvider(name="TestData")
    public Object[][] data() throws BiffException, IOException{
	ExcelLib lib=new ExcelLib("search", this.getClass().getSimpleName());
	return lib.getTestdata();
    }
	
	
	@Test(dataProvider="TestData")
	public void TC01(String search_value){
		GoogleSearchPage page=new GoogleSearchPage(driver);
		page.Enter_search_text(search_value);
		page.click_Search_Button();
	}

}
