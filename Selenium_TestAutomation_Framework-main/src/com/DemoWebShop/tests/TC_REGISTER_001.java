package com.DemoWebShop.tests;



import org.testng.annotations.Test;

import com.DemoWebShop.pages.DemoWebShopRegisterPage;
import com.DemoWebShop.pages.DemoWebShopWelcomePage;
import com.selenium.framework.BaseTest;

public class TC_REGISTER_001 extends BaseTest{
	
	@Test
	public void testcase1(){
		DemoWebShopWelcomePage WPage=new DemoWebShopWelcomePage(driver);
		WPage.Validate_Register();
		WPage.Click_Register();
		
		DemoWebShopRegisterPage Reg_Page=new DemoWebShopRegisterPage(driver);
		Reg_Page.Validate_Register_Text();
		
		
	}
	

}
