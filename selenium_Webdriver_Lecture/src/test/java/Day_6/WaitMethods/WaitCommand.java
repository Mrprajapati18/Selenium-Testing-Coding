package Day_6.WaitMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitCommand {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000); // Pause the execution for few seconds
		
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		

	}

}
