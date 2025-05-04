package TestNg_Day_6.Dependencymethods;

import org.testng.annotations.Test;

public class paymentTests {
	@Test(priority=1, groups = {"sanity", "regression"})
	public void PaymentinRupees() 
	{
		System.out.println("Payment in rupees...");
	}
    
	@Test(priority=2, groups = {"sanity", "regression"})
	public void PaymentinDoller() 
	{
		System.out.println("Payment in Dollers");
	}
	
	@Test(priority=3, groups = {"sanity", "regression"})
	public void PaymentinYens() 
	{
		System.out.println("Payment in Yens");
	}
}
