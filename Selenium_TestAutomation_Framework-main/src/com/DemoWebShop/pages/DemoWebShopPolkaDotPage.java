package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class DemoWebShopPolkaDotPage extends FrameworkUtility{
	
	public DemoWebShopPolkaDotPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	WebElement AddToCart_Polka;
	public void clickPolkaAddToCart(){
	clickElement(AddToCart_Polka);
	}
	
	@FindBy(xpath="(//input[@value='Add to cart'])[2]")
	WebElement AddToCart_Jeans;
	public void clickJeansAddToCart(){
		clickElement(AddToCart_Jeans);
	}
	
	@FindBy(xpath="(//input[@value='Add to cart'])[3]")
	WebElement SmartPhoneAddToCart;
	public void clickSmartPhoneAddToCart(){
		clickElement(SmartPhoneAddToCart);
	}

}
