package Day_12.JavaScriptExcutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPages {

	public static void main(String[] args) throws InterruptedException {
	    
		
      WebDriver driver = new ChromeDriver();
 
      driver.get("https://demo.nopcommerce.com/");
      
      driver.manage().window().maximize();
      
      JavascriptExecutor js = (JavascriptExecutor)driver;
      
      // 1) scroll down page by pixcels
      js.executeScript("window scrollBy(0, 1500)","");
      System.out.println(js.executeScript("return  window.pageYOffset;"));
      
      // 2)Scroll the page till element is visible
//      WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='Featured products']"));
      
//      js.executeScript("arguments[0], scrollIntoView();",ele);
//	  System.out.println(js.executeScript("return window.pageYoffset"));
	  
	  // 3) scroll page till element is visible
//	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//	  System.out.print(js.executeScript("return window.pageYoffset;"));
//	
//	  Thread.sleep(5000);
	  
	  // scrolling up to initial position
//	  js.executeScript("Window.scrollBy(0,-document.body.scrollHeight)");
	}

}
