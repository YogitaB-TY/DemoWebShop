package com.DemoWebShop.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.HomePage;
import com.DemoWebShop.pages.LoginPage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_LOGIN_006 extends BaseTest {
		
		@DataProvider(name="TestData")
		public Object[][] data() throws BiffException, IOException{
			ExcelLib lib=new ExcelLib("Demowebshop", this.getClass().getSimpleName());
			return lib.getTestdata();
		}
		
		@Test(dataProvider="TestData")
		public void TC06(String email,String pwd) {
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		
		 	
		LoginPage lp=new LoginPage(driver);
		lp.enter_text_loginemail(email);
		lp.enter_text_loginPwd(pwd);
		lp.click_login();
		lp.validate_errorMessage();
			
					
		}
		

	}


