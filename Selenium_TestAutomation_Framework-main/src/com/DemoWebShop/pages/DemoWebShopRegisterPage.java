package com.DemoWebShop.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.selenium.framework.FrameworkUtility;

public class DemoWebShopRegisterPage extends FrameworkUtility{
	
	public DemoWebShopRegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1")
	WebElement RegisterText;
	public void Validate_Register_Text(){
		
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(RegisterText.getText(), "Register" );
		
		System.out.println("Register page is displayed");
		
		ast.assertAll();
	}
	
	@FindBy(id="gender-male")
	WebElement MaleRadio;
	
	
	@FindBy(id="gender-female")
	WebElement FemaleRadio;
	
	public void click_Radio(String gender){
		
		if(gender.equalsIgnoreCase("Female")){
			clickElement(FemaleRadio);
		} else if (gender.equalsIgnoreCase("Male")){
			clickElement(MaleRadio);
		}
	}
	
	
	@FindBy(id="FirstName")
	WebElement First_Name_TextField;
	public void Firstname(String value){
		enterText(First_Name_TextField, value);
	}
	
	@FindBy(xpath="//input[@name='LastName']")
	WebElement LastName;
	public void lastName(String LN){
		enterText(LastName, LN);
	}
	
	
	@FindBy(xpath="//input[@name='Email']")
	WebElement Email;
	public void email(String mail){
		enterText(Email, mail);
	}
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement password;
	public void pwd(String Password){
		enterText(password, Password);
	}
	
	
	@FindBy(xpath="//input[@name='ConfirmPassword']")
	WebElement confirm;
	public void confirmPassword(String cpwd){
		enterText(confirm, cpwd);
	}
	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement reggButton;
	public void RegButton(){
		clickElement(reggButton);
	}
	
	
}
