package Day_6.WaitMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitCommand {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		 // Pause the execution for few seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Lanch the url of webpage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
	     
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
       driver.close();
	}

}
