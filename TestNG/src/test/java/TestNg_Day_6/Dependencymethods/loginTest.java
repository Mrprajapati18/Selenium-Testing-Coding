package TestNg_Day_6.Dependencymethods;

import org.testng.annotations.Test;

@Test(priority=1, groups = {"sanity"})
public class loginTest {
	
	public void loginByEmail()
	{
		System.out.println("Log in by email.....");
	}
	@Test(priority=2, groups = {"sanity"})
   void loginByFacebook() 
   {
	   System.out.println("Log in by facebook....");
   }
	@Test(priority=3, groups = {"sanity"})
	void loginByTwitter()
	{
		System.out.println("Log in by twitter...");
	}
}
