package Day_7.Nevigational;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		
       ChromeDriver driver = new ChromeDriver();
       
       // Wait for loading the web pages
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       
       // Lanch the webpages
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
       // Maxmize the window
       driver.manage().window().maximize();
       
       driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
       
       Set<String> windowIds = driver.getWindowHandles();
       
       // Approche1
       
       List<String> windowList = new ArrayList<String>(windowIds);
       
       String parentID = windowList.get(0);
       String childID = windowList.get(1);
       
       // Switch to child window
       driver.switchTo().window(childID);
       System.out.println(driver.getTitle());
       
       // switch to parent window
       driver.switchTo().window(parentID);
       System.out.println(driver.getTitle());
       
       
       // close the browser
       driver.quit();
	}

}
