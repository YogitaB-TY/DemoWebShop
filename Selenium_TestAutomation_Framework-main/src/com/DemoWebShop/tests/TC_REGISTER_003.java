package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.HomePage;
import com.DemoWebShop.pages.RegisterPage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_REGISTER_003 extends BaseTest {
	
	@DataProvider(name="TestData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("Demowebshop", this.getClass().getSimpleName());
		return lib.getTestdata();
		
	}
	
	@Test(dataProvider="TestData")
	public void TC03(String firstname,String lastname,String email,String password,String cpassword) {
		HomePage register=new HomePage(driver);
		register.click_Register();
		
		
		RegisterPage rp1=new RegisterPage(driver);
		rp1.enter_text(firstname);
		rp1.enter_text_lname(lastname);
		rp1.enter_text_email(email);
		rp1.enter_text_password(cpassword);
		rp1.enter_text_Cpassword(cpassword);
		rp1.click_register();
		rp1.validate();
		
		
	}

}
