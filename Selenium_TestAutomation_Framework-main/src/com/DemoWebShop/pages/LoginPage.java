package com.DemoWebShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.framework.FrameworkUtility;

public class LoginPage extends FrameworkUtility {
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//input[@id='Email']")
	WebElement loginEmail;
	
	public void enter_text_loginemail(String email) {
	enterText(loginEmail, email);
	}
	
	@FindBy(xpath="//input[@id='Password']") 
	WebElement loginPwd;
	
	public void enter_text_loginPwd(String pwd) {
	enterText(loginPwd, pwd);
	}
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement clickLogin;
	
	public void click_login() {
    clickElement(clickLogin);
	}
	
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement Logout;
	
	public void click_logout() {
		clickElement(Logout);
	}
	
	public void validate_login() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).isDisplayed());
		System.out.println("login is successful if logout link is displayed");
	}
	
    public void validate_errorMessage() {
    	Assert.assertTrue(driver.findElement(By.xpath("//div[@class='message-error']")).isDisplayed());
    	System.out.println("Error message is displayed");
    }

}
