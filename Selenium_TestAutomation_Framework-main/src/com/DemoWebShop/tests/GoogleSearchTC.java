package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.GoogleSearchPage;
import com.selenium.framework.BaseTest;
//import com.selenium.framework.ExcelLib;
import com.selenium.framework.TestDataProv;

//import jxl.read.biff.BiffException;

public class GoogleSearchTC extends BaseTest {
	
	
	
	@Test(dataProvider="data")
	public void TC01(String Search_Value){
		
		GoogleSearchPage page=new GoogleSearchPage(driver);
		page.enter_value_to_search(Search_Value);
		page.click_Search();
	}
	
	@DataProvider(name="data")
	public Object[][] data() throws  IOException {
		
		/*ExcelLib lib=new ExcelLib("Search", this.getClass().getSimpleName());
		return lib.getTestdata();*/
		
		Object[][] data= TestDataProv.testData("Search");
		return data;
	}

}
