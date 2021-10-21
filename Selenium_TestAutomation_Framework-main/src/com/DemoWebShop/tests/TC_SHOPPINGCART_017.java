package com.DemoWebShop.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.HomePage;
import com.DemoWebShop.pages.LoginPage;
import com.DemoWebShop.pages.ShoppingCartPage;
import com.DemoWebShop.pages.UserAccountPage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_SHOPPINGCART_017 extends BaseTest {
	
	@DataProvider(name="TestData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("Demowebshop", this.getClass().getSimpleName());
		return lib.getTestdata();
	}
	@Test(dataProvider="TestData")
	public void TC017(String email,String pwd) throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		
		 	
		LoginPage lp=new LoginPage(driver);
		lp.enter_text_loginemail(email);
		lp.enter_text_loginPwd(pwd);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		lp.click_login();
		
		UserAccountPage ua=new UserAccountPage(driver);
		ua.click_books();
		ua.click_AddToCart();
		ua.click_shoppingcart();
		
		ShoppingCartPage sp=new ShoppingCartPage(driver);
		sp.Remove();
		sp.update_quantity();
		Thread.sleep(5000);
	}

}
