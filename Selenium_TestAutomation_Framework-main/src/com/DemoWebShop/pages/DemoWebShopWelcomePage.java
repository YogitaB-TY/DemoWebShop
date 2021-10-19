package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.framework.FrameworkUtility;

public class DemoWebShopWelcomePage extends FrameworkUtility {
	
	public DemoWebShopWelcomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement Register_Link;
	public void Click_Register(){
		clickElement(Register_Link);
	}
	
	public void Validate_Register(){
		Assert.assertTrue(Register_Link.isEnabled()); 
	}
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement Login_Link;
	public void Click_Login(){
		clickElement(Login_Link);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	WebElement Books_Link;
	public void Click_BookLink(){
		clickElement(Books_Link);
	}
	
	@FindBy(xpath="(//a[@class='ico-wishlist'])[1]")
	WebElement Wishlist_Link;
	public void Click_Wishlist(){
		clickElement(Wishlist_Link);
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement SearchText;
	public void EnterSearch(String SearchValue){
		enterText(SearchText, SearchValue);
	}
	
	@FindBy(xpath="//input[@class='button-1 search-box-button']")
	WebElement SearchButton;
	public void ClickSeaarchButton(){
		clickElement(SearchButton);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Apparel')])[3]")
	WebElement ApparelLink;
	public void ClickApparel(){
		clickElement(ApparelLink);
	}
	
	
	
	
	
	
	
}
