package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class DemoWebShopLoginPage extends FrameworkUtility{
	
	public DemoWebShopLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement EmailText_Field;
	public void Enter_Login_email(String email){
		enterText(EmailText_Field, email);
	}
	
	@FindBy(id="Password")
	WebElement Password_Field;
	public void Enter_Password(String pwd){
		enterText(Password_Field, pwd);
	}
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement Login_Button;
	public void clickLogin_Button(){
		clickElement(Login_Button);
	}


}
