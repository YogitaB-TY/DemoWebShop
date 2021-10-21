package com.DemoWebShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.framework.FrameworkUtility;

public class EnquiryPage extends FrameworkUtility{
	
	public EnquiryPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@id='FullName']")
	WebElement fullname;
	
	public void enter_name(String name) {
		enterText(fullname, name);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement yourEmail;
	
	public void enter_your_email(String mailID) {
		enterText(yourEmail, mailID);
	}
	
	@FindBy(xpath="//textarea[@class='enquiry']")
	WebElement EnquiryTextField;
	
	public void enquiry_textField(String query) {
		enterText(EnquiryTextField, query);
	}
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement submit;
	
	public void click_submit() {
		clickElement(submit);
	}
	
	@FindBy(xpath="//div[@class='result']")
	WebElement result;
	
	public void Validate_submit() {
		String ExpectedText="Your enquiry has been successfully sent to the store owner.";
		Assert.assertEquals(result.getText(),ExpectedText,"text is matching");
		System.out.println(result.getText());
	}
	
	@FindBy(xpath="//span[contains(text(),'Wrong email')]")
	WebElement errorMessage;
	
	public void Validate_Error_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Wrong email')]")).isDisplayed());
		System.out.println("Error message is displayed");
	}

}
