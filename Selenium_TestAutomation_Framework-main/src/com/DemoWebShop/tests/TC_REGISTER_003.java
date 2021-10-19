package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.DemoWebShopHomePage;
import com.DemoWebShop.pages.DemoWebShopRegisterPage;
import com.DemoWebShop.pages.DemoWebShopWelcomePage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_REGISTER_003 extends BaseTest{
	
	@DataProvider(name="testData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("TestData", this.getClass().getSimpleName());
		return lib.getTestdata();
		
	}
	
	
	@Test(dataProvider="testData")
	public void testcase3(String FN, String LN, String email, String pwd, String Cpwd){
		
		DemoWebShopWelcomePage WPage=new DemoWebShopWelcomePage(driver);
		WPage.Click_Register();
		
		DemoWebShopRegisterPage reg_page=new DemoWebShopRegisterPage(driver);
		reg_page.Firstname(FN);
		reg_page.lastName(LN);
		reg_page.email(email);
		reg_page.pwd(pwd);
		reg_page.confirmPassword(Cpwd);
		reg_page.RegButton();
		
		DemoWebShopHomePage home=new DemoWebShopHomePage(driver);
		home.Validate_Login();
	}

}
