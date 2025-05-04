package TestNG_Day_4.Priority;

import org.testng.annotations.Test;

//there are 2 ways we can control the test execution flow in testNG
//1) priority attribute
//2) dependsOnMethods attribute

public class Sample3 {
	@Test
	public void registerPage()
	{
		System.out.println("Register page test case");
	}
	@Test(dependsOnMethods= {"registerPage"})
    public void login()
    {
    	System.out.println("Login page test case");
    }
	@Test(dependsOnMethods= {"login"})
	public void homePage()
	{
		System.out.println("Home page test case");
	}
}
