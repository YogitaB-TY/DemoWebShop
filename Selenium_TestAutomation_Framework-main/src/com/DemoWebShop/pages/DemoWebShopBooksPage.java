package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class DemoWebShopBooksPage extends FrameworkUtility {
	
	public DemoWebShopBooksPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[1]")
	WebElement Add_To_Cart_Button;
	public void Click_AddTo_Cart(){
		clickElement(Add_To_Cart_Button);
	}
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[2]")
	WebElement FictionAddTocart;
	public void Click_Fiction_AddTo_Cart(){
		clickElement(FictionAddTocart);
	}
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[3]")
	WebElement HealthAddTocart;
	public void Click_Health_AddTo_Cart(){
		clickElement(HealthAddTocart);
	}
	
	@FindBy(xpath="//a[contains(text(),'shopping')]")
	WebElement cart_link;
	public void Click_Cart(){
		clickElement(cart_link);
	}
	
	
	

}
