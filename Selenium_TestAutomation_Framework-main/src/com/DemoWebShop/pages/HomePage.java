package com.DemoWebShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.framework.FrameworkUtility;

public class HomePage extends FrameworkUtility {
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement Register;
	
	public void click_Register() {
		clickElement(Register);
	}
	
	public void Validate() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Register']")).isEnabled());
		System.out.println("Register link is enabled");
	}
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement Login;
	
	public void click_Login() {
		clickElement(Login);
	}

}
