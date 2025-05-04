package TestNG_Day_4.Priority;

import org.testng.annotations.Test;

public class Sample1
{
  @Test(priority=1)
  public void login() 
  {
	  System.out.println("Log in test case");
  }
  @Test(priority=2)
  public void home() 
  {
	  System.out.println("Home page test case");
  }
  @Test(priority=3)
  public void searchProduct()
  {
	  System.out.println("Search product test case");
  }
  @Test(priority=4)
  public void addToCart() 
  {
	  System.out.println("Add to cart product");
  }
}
