package Day_4.X_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_pathDemo {

	public static void main(String[] args) {
     
		// lunch the browser
		WebDriver driver  = new ChromeDriver();
		
		// URL of browser
		driver.get("https://www.amazon.in/");
		
		// Mixmize the webpage
		driver.manage().window().maximize();
		
		// X-Path with single attribute
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		// X-path with multiple attribute
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'][@name='field-keywords']")).sendKeys("Washing machine");
		
		// X-path with Or Operators(means atleast one attribute match)
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='twotabsearchtextbox']")).sendKeys("Shirt");
		
		// X-path with And Operators(Means both attribute match)
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='twotabsearchtextbox']")).sendKeys("Laptop");
		
		// x-path  with text()  inner text
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		// x-path with text()  inner text value
		
		/*boolean displayStatus = driver.findElement(By.xpath("//h2[text()='Feature']")).isDisplayed();
		System.out.println(displayStatus); // Display the text 
		
		String value = driver.findElement(By.xpath("//h2[text()='Feature']")).getText();
	    System.out.println(value); // Capture the text 
		*/
		
		// x-path with Contains() it include the partial value  anywhere
		driver.findElement(By.xpath("//input[contains(@name,'field-keywor')]")).sendKeys("Laptops");
		
		// X-path Starts with() it always begin with starting 
		driver.findElement(By.xpath("//input[contains(@name,'field-keywor')]")).sendKeys("Laptops");
		// Close the webpages
 		driver.quit();
	}

}
