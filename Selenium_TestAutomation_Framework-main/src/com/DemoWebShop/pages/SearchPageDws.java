package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class SearchPageDws extends FrameworkUtility {
	
	public SearchPageDws(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@value='Add to cart']")
	WebElement AddLaptop;
	
	public void AddProduct() {
		clickElement(AddLaptop);
	}

}
