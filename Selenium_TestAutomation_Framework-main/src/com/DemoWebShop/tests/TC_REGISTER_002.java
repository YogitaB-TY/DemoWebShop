package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.DemoWebShopRegisterPage;
import com.DemoWebShop.pages.DemoWebShopWelcomePage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_REGISTER_002 extends BaseTest{
	
	@DataProvider(name="testData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("TestData", this.getClass().getSimpleName());
		return lib.getTestdata();
		
	}
	
	@Test(dataProvider="testData")
	public void testcase2(String FN, String LN, String email, String pwd, String Cpwd){
	
	DemoWebShopWelcomePage Wpage=new DemoWebShopWelcomePage(driver);
	Wpage.Click_Register();
	
	DemoWebShopRegisterPage Reg_Page=new DemoWebShopRegisterPage(driver);
	Reg_Page.Firstname(FN);
	Reg_Page.lastName(LN);
	Reg_Page.email(email);
	Reg_Page.pwd(pwd);
	Reg_Page.confirmPassword(Cpwd);
	Reg_Page.RegButton();
	
	//DemoWebShopHomePage home=new DemoWebShopHomePage(driver);
	//home.Validate_Login();
	
	}
}
