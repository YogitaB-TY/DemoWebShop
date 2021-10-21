package com.DemoWebShop.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShop.pages.EnquiryPage;
import com.DemoWebShop.pages.HomePage;
import com.DemoWebShop.pages.LoginPage;
import com.DemoWebShop.pages.UserAccountPage;
import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import jxl.read.biff.BiffException;

public class TC_ENQUIRY_024 extends BaseTest {
	
	@DataProvider(name="TestData")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib lib=new ExcelLib("Demowebshop", this.getClass().getSimpleName());
		return lib.getTestdata();
	}
	@Test(dataProvider="TestData")
	public void TC024(String email,String pwd,String name,String mailID,String query) throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		
		LoginPage lp=new LoginPage(driver);
		lp.enter_text_loginemail(email);
		lp.enter_text_loginPwd(pwd);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		lp.click_login();
		
		UserAccountPage ua=new UserAccountPage(driver);
		ua.click_contactUs();
		
		EnquiryPage en= new EnquiryPage(driver);
		en.enter_name(name);
		en.enter_your_email(mailID);
		en.enquiry_textField(query);
		en.click_submit();
		en.Validate_Error_message();
	}

}