package com.DemoWebShop.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.HomePage;
import com.DemoWebShop.pages.LoginPage;
import com.DemoWebShop.pages.SearchPageDws;
import com.DemoWebShop.pages.ShoppingCartPage;
import com.DemoWebShop.pages.UserAccountPage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_BILLING_023 extends BaseTest {
	
	@DataProvider(name="TestData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("Demowebshop", this.getClass().getSimpleName());
		return lib.getTestdata();
	}
	@Test(dataProvider="TestData")
	public void TC022(String email,String pwd,String search,String state,String country) throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		
		LoginPage lp=new LoginPage(driver);
		lp.enter_text_loginemail(email);
		lp.enter_text_loginPwd(pwd);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		lp.click_login();
		
		UserAccountPage ua=new UserAccountPage(driver);
		ua.enter_search_text(search);
		ua.clickSearch();
		
		SearchPageDws sp= new SearchPageDws(driver);
		sp.AddProduct();
		
		ua.click_shoppingcart();
		
		ShoppingCartPage sc=new ShoppingCartPage(driver);
		sc.select_country(country);
		sc.select_state(state);
		sc.estimate_shipping();
		sc.Validate_shipping();
	}

}
