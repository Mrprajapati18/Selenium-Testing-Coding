package TestNg_Day_6.Dependencymethods;

import org.testng.annotations.Test;

public class signUpTest {
	
	@Test(priority=1, groups = {"regression"})
	public void signupByEmail() 
	{
		System.out.println("Sing up by email....");
	}
	
	@Test(priority=2, groups = {"regression"})
    public void singupByFacebook()
	{
    	System.out.println("Sign up by Facebook...");
    }
	@Test(priority=3, groups = {"regression"})
	public void signupByTwitter()
	{
		System.out.println("Sign up by twitter");
	}
}
