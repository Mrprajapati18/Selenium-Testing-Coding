package TestNG_Day_2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * TC_1
  1) Login ---@BeforeMethod
  2) Search ----@Test
  3) LogOut ----@ Aftermethod
  4) Login
  5) Advanced Search ---@Test
  6) LogOut
 */
public class AnnotationsDemo_2 {
    @BeforeMethod
	void login()
	{
		System.out.println("This is login....");
	}
	
	@Test(priority=1)
	void search() 
	{
		System.out.println("This is search...");
	}
	
	@Test(priority=2)
	void advancedseach() 
	{
		System.out.println("This is advanced search...");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout...");
	}
}
