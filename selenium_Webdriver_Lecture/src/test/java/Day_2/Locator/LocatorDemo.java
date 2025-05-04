package Day_2.Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {
     public static void main(String[] args) {
	
    	 // Lunch the Browser
    	 WebDriver driver = new ChromeDriver();
    	 
    	 // Open URL https://www.amazon.in//
    	 driver.get("https://www.amazon.in/");
    	 
    	 // Maximize the window 
    	 driver.manage().window().maximize();
    	 
    	 // by Name Locator
    	 driver.findElement(By.name("field-keywords")).sendKeys("Durgesh");
    	 
    	 
    	 // By Id Locator
    	 boolean logoDisplaystatus = driver.findElement(By.id("nav-logo")).isDisplayed();
    	 System.out.println(logoDisplaystatus);
    	 
    	 
    	 // By LinkText Locator
    	 
    	 driver.findElement(By.linkText("Best Sellers")).click();
    	 
    	 // By PartialLinkText Locator
    	 
    	 driver.findElement(By.partialLinkText("Best")).click();
    	 
    	 // By ClassName
    	 
    	 List<WebElement> headerlinks = driver.findElements(By.className("nav-progressive-content"));
    	 
    	// TO capture the total number of header link tags
    	 System.out.println("Total number of Header links: " + headerlinks.size()); 
    	 
    	 // By Tags Name
    	 
    	 // Total Number of Link present in this web page
    	 
    	 List<WebElement> links = driver.findElements(By.tagName("a"));
    	 System.out.println("Total Number of Link present in this web page: " + links.size());
    	 
    	 // Total Number of Images present in this web page
    	 
    	 List<WebElement> images = driver.findElements(By.tagName("img"));
    	 System.out.println("Total Number of Images present in this web page: " + images.size());
    	 
    	 // close 
    	 driver.quit();
    }
}
