package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.selenium.framework.FrameworkUtility;

public class DemoWebShopHomePage extends FrameworkUtility{
	
	public DemoWebShopHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement Logout_Button;
	
	public void click_Logout(){
		clickElement(Logout_Button);
	}
	
	public void Validate_Login(){
		
		SoftAssert ast=new SoftAssert();
		ast.assertTrue(Logout_Button.isDisplayed());
		ast.assertAll();
	}

}
