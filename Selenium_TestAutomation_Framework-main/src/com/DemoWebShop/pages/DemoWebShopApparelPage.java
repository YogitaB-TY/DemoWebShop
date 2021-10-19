package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class DemoWebShopApparelPage extends FrameworkUtility{
	
	public DemoWebShopApparelPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[1]")
	WebElement PolkaDot_AddtoCart;
	public void ClickAddTocartPolka(){
		clickElement(PolkaDot_AddtoCart);
	}
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[2]")
	WebElement Sneakers;
	public void ClickAddToCartSneakers(){
		clickElement(Sneakers);
	}
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[3]")
	WebElement BlueJeans_AddtoCart;
	public void Click_AddTocartJEans(){
		clickElement(BlueJeans_AddtoCart);
	}

}
