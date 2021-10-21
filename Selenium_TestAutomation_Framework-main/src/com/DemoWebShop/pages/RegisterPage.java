package com.DemoWebShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.framework.FrameworkUtility;

public class RegisterPage extends FrameworkUtility {
	
	public RegisterPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath="//input[@name='FirstName']")
	WebElement fname;
	
	public void enter_text(String firstname) {
	enterText(fname, firstname);
	}
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement Radio;
	
	public void click_radio() {
		clickElement(Radio);
	}
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lname;
	
	public void enter_text_lname(String lastname) {
		enterText(lname, lastname);
	}
	
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	public void enter_text_email(String email) {
		enterText(Email, email);
	}
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement Password;
	
	public void enter_text_password(String password) {
		enterText(Password, password);
	}
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement Cpassword;
	
	public void enter_text_Cpassword(String cpassword) {
		enterText(Cpassword, cpassword);
	}
	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement RegButton;
	
	public void click_register() {
		clickElement(RegButton);
	}
	
	
	public void validate() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='page-title']")).isDisplayed());
		System.out.println("Registration successfull");
	}
	
	

}
