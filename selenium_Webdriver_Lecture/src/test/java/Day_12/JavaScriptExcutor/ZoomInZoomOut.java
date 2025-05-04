package Day_12.JavaScriptExcutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 
	      driver.get("https://www.opencart.com/index.php?route=cms/demo");
	      //Thread.sleep(5000);
	      
	      // Minimize the Window
	      //driver.manage().window().minimize();
	     
	      //Maxmize the window
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      
	      js.executeScript("document.boddy.style.zoom='50%'"); // set zoom level 50%
	      Thread.sleep(5000);
	      
	      
	      js.executeScript("document.boddy.style.zoom='80%'"); // set zoom level 80%
	      Thread.sleep(5000);
	      
	}

}
