package Day_12.JavaScriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement  inputbox = driver.findElement(By.xpath("//input[@id='name']"));
        
		// passing the text into inputbox - alternate of sendkeys
		// javascriptExctor js= driver;
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("arguments[0].setAttribute('value', 'John')",inputbox);
		
		// Clicking on element - alternate of click()
	    WebElement radiobtn =driver.findElement(By.xpath("//input[@id='male']"));
	    js.executeScript("arguments[0].click()",radiobtn);
	    
	    
	}
}
