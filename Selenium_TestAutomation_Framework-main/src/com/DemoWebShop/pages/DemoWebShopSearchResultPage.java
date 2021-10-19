package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.framework.FrameworkUtility;

public class DemoWebShopSearchResultPage extends FrameworkUtility{
	
	public DemoWebShopSearchResultPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void CompareTitle(String Value){
		Assert.assertTrue(driver.getCurrentUrl().contains(Value), "Search Results are displayed");
	}


}
