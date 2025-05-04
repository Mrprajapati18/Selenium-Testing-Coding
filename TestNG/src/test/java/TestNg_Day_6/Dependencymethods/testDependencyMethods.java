package TestNg_Day_6.Dependencymethods;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(priority=1)
public class testDependencyMethods
   {
	public void openapp()
	{
//		Assert.assertTrue(false);
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods = {"openapp"})
	public void login() 
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods = {"login"})
    public void Search() {
    	Assert.assertTrue(false);
    }
	@Test(priority=4, dependsOnMethods = {"login", "Search"})
	public void advSearch() {
		Assert.assertTrue(true);
	}
	@Test(priority=5, dependsOnMethods = {"login"})
	public void logout()
	{
		Assert.assertTrue(true);
	}
}
