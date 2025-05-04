package Day_3.CSS.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorDemo {

	public static void main(String[] args) {

	// Lunch the Browser
   	 WebDriver driver = new ChromeDriver();
   	 driver.get("https://www.amazon.in/");
   	 
   	 // Maximize the window
   	 driver.manage().window().maximize();
   	 
   	 // CSS Selector (id tag) tag#id
   	 //driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("T-shirt");
   	 // tag Name is optional (input)
   	 // driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("T-shirt");
   	 
   	 
   	 // tag class    tag.classname
   	 driver.findElement(By.cssSelector("input.nav-input")).sendKeys("Laptops");
   	 // tag name optional (input) but . is required
   	 //driver.findElement(By.cssSelector(".nav-input")).sendKeys("Laptops");
   	 
   	 
   	 // tag attribute     tag[attribute="value"]
   	 
   	 driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon.in\"]")).sendKeys("Shirts");
   	 // other method to write this bcz java is not allow to double court inside the double court so using the backward salce
   	 driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("Mobiles");
   	 // Without using tag name
   	 driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']")).sendKeys("Study Lights");
   	 
   	 
   	 
   	 // tag class attribute  tag.class[attribute="value"]
   	 
   	 driver.findElement(By.cssSelector("input.ac-input-overlay[id=\"ac-predictive-text\"]")).sendKeys("Washing machine");
	}

}
