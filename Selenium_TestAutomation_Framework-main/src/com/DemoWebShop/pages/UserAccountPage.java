package com.DemoWebShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.framework.FrameworkUtility;

public class UserAccountPage extends FrameworkUtility {
	
	public UserAccountPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Books')]")
	WebElement Books;
	
	public void click_books() {
		clickElement(Books);
	}
	
	@FindBy(xpath="(//input[@value='Add to cart'])[2]")
	WebElement AddToCart;
	
	public void click_AddToCart() {
		clickElement(AddToCart);
	}
	
	@FindBy(xpath="//input[@value='Add to cart']")
	WebElement Book2;
	
	public void click_book2() {
		clickElement(Book2);
	}
	
	@FindBy(xpath="(//input[@value='Add to cart'])[3]")
	WebElement Book3;
	
	public void click_book3() {
		clickElement(Book3);
	}
	
	@FindBy(xpath="//a[contains(text(),'shopping cart')]")
	WebElement shopping_cart;
	
	public void click_shoppingcart() {
		clickElement(shopping_cart);
	}
	
	@FindBy(xpath="//span[@class='cart-label']")
	WebElement ShoppingCart;
	
	public void click_ShoppingCart() {
		clickElement(ShoppingCart);
	}
	
	@FindBy(xpath="(//span[@class='cart-label'])[2]")
	WebElement Wishlist;
	
	public void click_wishlist() {
		clickElement(Wishlist);
	}
	
	@FindBy(xpath="//input[@id='small-searchterms']")
	WebElement Search;
	
	public void enter_search_text(String search) {
		enterText(Search, search);
	}
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement SearchButton;
	
	public void clickSearch() {
		clickElement(SearchButton);
	}
	
	@FindBy(xpath="//a[contains(text(),'Contact us')]")
	WebElement ContactUs;
	
	public void click_contactUs() {
		clickElement(ContactUs);
	}
	
	public void validate_addToCart() {
		Assert.assertTrue(driver.findElement(By.xpath(("//input[@value='Add to cart'])[2]"))).isEnabled());
		System.out.println("add to cart is enabled");
	}

}
