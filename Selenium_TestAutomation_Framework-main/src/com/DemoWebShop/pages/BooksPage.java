package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class BooksPage extends FrameworkUtility {
	
	public BooksPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//select[@id='products-viewmode']")
	WebElement Grid;
	
	public void viewmode() throws InterruptedException {
		selectItemFromListBoxByIndex(Grid, 0);
	}

}
