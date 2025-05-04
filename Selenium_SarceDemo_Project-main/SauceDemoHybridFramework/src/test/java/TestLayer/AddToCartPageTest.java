package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.AddToCartPage;

public class AddToCartPageTest extends BaseClass{
	
	@Test
	public void validateAddToCart() throws InterruptedException
	{
		AddToCartPage addToCart = new AddToCartPage();
		addToCart.addToCartFunctionality();
	}

}
