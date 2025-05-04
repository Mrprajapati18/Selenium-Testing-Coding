package Day_8.ChackBoxes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Handle Alert without using switchTo().alert()
// Using Explict Wait


public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
         
		ChromeDriver driver = new ChromeDriver();
		
		// Decleration of explicit wait command
	  WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	  
	  // Lanching the browser
  	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
  	  
  	  // maximize the window
  	  driver.manage().window().maximize();
  	  
      // Finnd the element using x-path
	  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
       Thread.sleep(5000);
	 
	  // This commond switch to the alert window and close it
	
	Alert myalert=myWait.until(ExpectedConditions.alertIsPresent()); // Wait for alert text and capture the alert massege
	
	System.out.println(myalert.getText());
	myalert.accept();
	
	// Close the window
	driver.close();
		
	}

}
