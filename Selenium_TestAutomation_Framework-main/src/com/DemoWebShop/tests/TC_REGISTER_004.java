package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.DemoWebShopRegisterPage;
import com.DemoWebShop.pages.DemoWebShopWelcomePage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;


import jxl.read.biff.BiffException;

public class TC_REGISTER_004 extends BaseTest{	
	@DataProvider(name="testData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("TestData", this.getClass().getSimpleName());
		return lib.getTestdata();
		
	}
	
	@Test(dataProvider="testData")
	public void testcase4(String gender){
		
		DemoWebShopWelcomePage Wel_page=new  DemoWebShopWelcomePage(driver);
		Wel_page.Click_Register();
		
		DemoWebShopRegisterPage reg_page=new DemoWebShopRegisterPage(driver);
		reg_page.click_Radio(gender);
		
	}
	
	

}
