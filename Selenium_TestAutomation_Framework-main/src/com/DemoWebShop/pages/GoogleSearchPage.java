package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class GoogleSearchPage extends FrameworkUtility{
	
	 public GoogleSearchPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			}
	 
	 @FindBy(xpath="//input[@name='q']")
	 WebElement Search_text;
	 
	 public void Enter_search_text(String value) {
		 enterText(Search_text,value);
	 }
	 
	 @FindBy(xpath="(//input[@name='btnK'])")
	 WebElement click_search;
	 
	 public void click_Search_Button() {
	 clickElement(click_search);
	 }

}
