package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.HomePage;
import com.DemoWebShop.pages.RegisterPage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_REGISTER_004 extends BaseTest{
	
	@DataProvider(name="TestData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("Demowebshop", this.getClass().getSimpleName());
		return lib.getTestdata();
	}
	
	@Test
	public void TC04() {
		HomePage register=new HomePage(driver);
		register.click_Register();
		RegisterPage radio=new RegisterPage(driver);
		radio.click_radio();
	}
	
	
	

}
