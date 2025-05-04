package Day_15.AlertButton;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertHandeler {

	public static void main(String[] args) throws InterruptedException {
		// set up the web driver
		WebDriver driver  = new ChromeDriver();
		
		// open the website
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		// Click on the click button
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(30000);;
		
		// Switch to alert button
		Alert wbAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		
		wbAlert.sendKeys("Selenium Training");
		Thread.sleep(3000);
		
		
		// Click ok to confirm
		wbAlert.accept();
		
		// Close the driver
		driver.close();
	}

}


