package TestNG_Day_1;

import org.testng.annotations.Test;

/* 
   1) Open App
   2) Login
   3) LogOut
   
   Priority is control the Order of Excution it take the palce afetr the @Test always(priority=1, priority=2,priority=3......and so on=)
 */
public class FirstTestcase
{
	@Test(priority=1)
  void openApp() 
  {
	  System.out.println("Open the Application......?");
  }
  
	@ Test(priority=2)
  void logIn() 
  {
	  System.out.println("Login the Application......?");
  }
  
	@Test(priority=3)
  void logOut() 
  {
	  System.out.println("Logout the Application...?");
  }
}
