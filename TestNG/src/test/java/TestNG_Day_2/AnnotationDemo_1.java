package TestNG_Day_2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/* TC_2
 * 1)  login ----@BeforeClass
 * 2) Search ---@Test
 * 3) Adv Search ---@Test
 * 4) LogOut -----@AfterClass
 */
public class AnnotationDemo_1 {
	
      @BeforeClass
	void login()
	{
		System.out.println("This is login...");
	}
	
      @Test(priority=1)
	void search() 
	{
		System.out.println("This is logout....");
	}
	
      @Test(priority=2)
	void advSearch()
	{
		System.out.println("This is Advance Search..");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout...");
	}
}
