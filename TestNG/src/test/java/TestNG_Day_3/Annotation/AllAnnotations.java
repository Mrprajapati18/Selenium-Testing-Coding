package TestNG_Day_3.Annotation;

import org.testng.annotations.*;

public class AllAnnotations {
	@BeforeSuite
	public void bs() {
		System.out.println("This is before suite....");
	}
   @AfterSuite
   public void as() {
	   System.out.println("This is after suite.....");
   }
   @BeforeTest
   public void bt() {
	   System.out.println("This is before test suite.....");
   }
   @AfterTest
   public void at() {
	   System.out.println("This is after test suite");
   }
   @BeforeClass
   public void bc() {
	   System.out.println("This is before test class");
   }
   @AfterClass
   public void ac() {
	   System.out.println("This is After class...");
   }
   @BeforeMethod
   public void bm() {
	   System.out.println("This is before method....");
   }
   @AfterMethod
   public void am() {
	   System.out.println("This is after method...");
   }
   @Test(priority=1)
   public void tm1() {
	   System.out.println("This is the test Methods1...");
   }
   @Test(priority=2)
   public void tm2 (){
	   System.out.println("This is the test Methods2...");
   }
}
