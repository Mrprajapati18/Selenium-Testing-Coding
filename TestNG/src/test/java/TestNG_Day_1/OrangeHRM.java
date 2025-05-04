package TestNG_Day_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
  1) open Application
  2) test logo presence
  3) Login
  4) close
 */
public class OrangeHRM {
	
	WebDriver driver;
	
	@Test(priority=1)
   void openapp() 
   {
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   
   }
	@Test(priority=2) 
	void testlogopresence() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo Displayed......" + status);
	}
	
	@Test(priority=3)
	void testLogin() 
	{
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Password");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@Test(priority=5)
	void close() 
	{
		driver.quit();
	}
}
