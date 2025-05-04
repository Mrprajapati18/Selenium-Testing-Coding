package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class AddToCartPage extends BaseClass {
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	@FindBy(name="add-to-cart-sauce-labs-bike-light")
	private WebElement addToCart1;
	
	@FindBy(name="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addToCart2;

	@FindBy(xpath="//div[@class='shopping_cart_container']")
	private WebElement cart;
	
	@FindBy(name="checkout")
	private WebElement checkout;
	
	public AddToCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addToCartFunctionality() throws InterruptedException
	{
		Wait.click(addToCart);
		Wait.click(addToCart1);
		Wait.click(addToCart2);
		Thread.sleep(3000);
		Wait.click(cart);
		Thread.sleep(3000);
		Wait.click(checkout);
	}
}
