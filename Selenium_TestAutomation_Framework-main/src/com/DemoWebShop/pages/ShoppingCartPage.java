package com.DemoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.framework.FrameworkUtility;

public class ShoppingCartPage extends FrameworkUtility{
	
	public ShoppingCartPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement Quantity;
	
	public void change_Quantity(String quantity) {
		enterText(Quantity,quantity); 
	}
	
	@FindBy(xpath="//input[@name='updatecart']")
	WebElement updateQuantity;
	
	public void update_quantity() {
		clickElement(updateQuantity);
	}
	
	@FindBy(xpath="(//input[@name='removefromcart'])[2]")
	WebElement remove;
	
	public void Remove() {
		clickElement(remove);
	}
	
	@FindBy(xpath="//input[@name='discountcouponcode']")
	WebElement coupon;
	
	public void enter_coupon(String code) {
		enterText(coupon, code);
	}
	
	@FindBy(xpath="//input[@name='applydiscountcouponcode']")
	WebElement Apply;
	
	public void apply_coupon() {
		clickElement(Apply);
	}
	
	@FindBy(xpath="//input[@name='giftcardcouponcode']")
	WebElement gift;
	
	public void enter_Giftcard(String giftCardCode) {
		enterText(gift, giftCardCode);
	}
	
	@FindBy(xpath="//input[@name='applygiftcardcouponcode']")
	WebElement applyGift;
	
	public void apply_giftcard() {
		clickElement(applyGift);
	}
	
	@FindBy(xpath="//select[@id='CountryId']")
	WebElement Country;
	
	public void select_country(String country) throws InterruptedException {
		selectItemFromListBoxByText(Country, country);
	}
	
	@FindBy(xpath="//select[@id='StateProvinceId']")
	WebElement State;
	
	public void select_state(String state) throws InterruptedException {
		selectItemFromListBoxByText(State, state);
	}
	
	@FindBy(xpath="//input[@class='zip-input']")
	WebElement zipCode;
	
	public void enter_zipCode(String zipcode) {
		enterText(zipCode, zipcode);
	}
	
	
	@FindBy(xpath="//input[@name='estimateshipping']")
	WebElement Estimate;
	
	public void estimate_shipping() {
		clickElement(Estimate);
	}
	
	@FindBy(xpath="//span[@class='option-description']")
	WebElement shipping;
	
	public void Validate_shipping() {
		String ExpectedText="Compared to other shipping methods, like by flight or over seas, ground shipping is carried out closer to the earth";
		Assert.assertEquals(shipping.getText(),ExpectedText,"text is matching");
		System.out.println(shipping.getText());
	}
	
	

}
