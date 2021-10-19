package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.DemoWebShopHomePage;
import com.DemoWebShop.pages.DemoWebShopLoginPage;
import com.DemoWebShop.pages.DemoWebShopWelcomePage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_LOGIN_008 extends BaseTest {
	
	
	@DataProvider(name="testData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("TestData", this.getClass().getSimpleName());
		return lib.getTestdata();
		
	}
	
	@Test(dataProvider="testData")
	public void testCase8(String email){
		DemoWebShopWelcomePage Wel_page=new  DemoWebShopWelcomePage(driver);
		Wel_page.Click_Login();
		
		DemoWebShopLoginPage loginPage=new DemoWebShopLoginPage(driver);
		loginPage.Enter_Login_email(email);
		
		loginPage.clickLogin_Button();
		
		DemoWebShopHomePage Home=new DemoWebShopHomePage(driver);
		Home.Validate_Login();
	}

}
