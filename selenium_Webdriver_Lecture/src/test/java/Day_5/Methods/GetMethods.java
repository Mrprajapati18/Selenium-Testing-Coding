package Day_5.Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the Window
		driver.manage().window().maximize();
		
		// get() Open the url of the browser
 		driver.get("https://www.amazon.in/");
 		Thread.sleep(5000);
		
		// getTitle() Returns title of the pages
		//System.out.println(driver.getTitle());
		
		// getCurrent Url - returns the current url of the web page
		//System.out.println(driver.getCurrentUrl());
		
		// getPageSource() returns the page source of the web page
        //System.out.println(driver.getPageSource());
      
        
        // getWindowHandle() - returns Id is single browser Window (it is every time change )
        //String WindowId = driver.getWindowHandle();
        //System.out.println("Window Id " + WindowId); // Window Id F76AF92425468A784AB9685DDABAC905
                                                     // Window Id 1C94EC02DFC655FEA7B557BA386DBA0B
        
        // getWindowHandles() - returns Id's is multiple browser Window
        
        driver.findElement(By.linkText("Best Sellers")).click(); // This will open the new browser window
        Set<String> windowId= driver.getWindowHandles();   // [E17E37F9B79FA47BFA4617A524CAD25A],[6886DFAF20F2A575F316CCCD561F2F51]
        System.out.println(windowId);
        
        // Close the browser
        driver.close();
	}

}
