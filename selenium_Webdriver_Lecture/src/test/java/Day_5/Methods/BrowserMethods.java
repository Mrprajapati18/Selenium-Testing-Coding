package Day_5.Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
          
		WebDriver driver = new ChromeDriver();
		// Lanch the URl 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Wait and load the webpage
		Thread.sleep(5000);
		
		// Mixmize the window
		driver.manage().window().maximize();
		
		// This will be open the other browser window
		driver.findElement(By.linkText("OrangeHRM, Inc")); 
		Thread.sleep(5000);
		
		// Close the browser
		//driver.close(); // close the single webpage
		
		// quit browser
		driver.quit();  // close the multiple webpages
	}

}
