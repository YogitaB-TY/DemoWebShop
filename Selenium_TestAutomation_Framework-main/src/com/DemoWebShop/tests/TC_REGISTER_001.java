package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.HomePage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_REGISTER_001 extends BaseTest{
	
	@DataProvider()
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("Reservation", this.getClass().getSimpleName());
		return lib.getTestdata();
		
	}
	
	@Test
	public void TC01() {
		HomePage register=new HomePage(driver);
		register.click_Register();
		register.Validate();		
		
	}

}
