package Day_2.Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1) Open Application https://demoblaze.com/
// 2) Window Maximize 
// 3) Click on any product using link on LinkText/ PartialLinks
// 4) Total Number of Links
// 5) Total Number of images

public class Assignment_2 {
   public static void main(String[] args) {
	   
	 //1) Open Application https://demoblaze.com/
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demoblaze.com/");
	     
	  // 2) Window Maximize
	     driver.manage().window().maximize();
	     
	  // 3) Click on any product using link on LinkText/ PartialLinks
	     // LinkText
	     driver.findElement(By.linkText("card-img-top img-fluid")).click();
	     
	     // Partial Link Text
	     driver.findElement(By.partialLinkText("nav-li")).click();
	     
	  // 4) Total Number of Links
	     List<WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println("Total number of link present this web page: " + links.size());
	     
	  // 5) Total Number of images
	     List<WebElement> images = driver.findElements(By.tagName("img"));
	     System.out.println("Total number of image present in this web page: " + images.size());
	     
	   // Total table close
	    driver.quit(); 
    }
}
