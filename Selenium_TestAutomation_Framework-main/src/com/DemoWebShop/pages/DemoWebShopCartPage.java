package com.DemoWebShop.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class DemoWebShopCartPage extends FrameworkUtility {
	public DemoWebShopCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Fiction')])[2]")
	WebElement Product_Link;
	public void compare_Product(){
		if(Product_Link.isDisplayed()){
			System.out.println("Item is added to cart");
		}
	}
	
	@FindBy(xpath="//input[@class='qty-input']")
	WebElement item_quantity;
	public void Item_Text_field(String q){
		item_quantity.clear();
		enterText(item_quantity, q );
		
	}
	
	public void Item_quantityValue(){
		
	}
	
	@FindBy(xpath="//input[@class='button-2 update-cart-button']")
	WebElement UpdateCart;
	public void Click_Update_cart(){
		clickElement(UpdateCart);
	}
	
    public void comparingProducts(){
    	int count=0;
    	List<WebElement> elements = driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
    			for(int i=1;i<=elements.size();i++){
    				count++;
    			}
    		System.out.println("The number of items added to cart are "+count);
    }


}
