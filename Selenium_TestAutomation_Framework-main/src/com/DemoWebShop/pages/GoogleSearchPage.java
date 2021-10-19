package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class GoogleSearchPage extends FrameworkUtility{
	
	public GoogleSearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	WebElement Search_Text_Field;
	public void enter_value_to_search(String Value){
		enterText(Search_Text_Field, Value);
	}
	
	@FindBy(xpath="(//input[@name='btnK'])[1]")
	WebElement Search_Button;
	public void click_Search(){
		clickElement(Search_Button);
	}

}
