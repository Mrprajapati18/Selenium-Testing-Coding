package Day_7.Nevigational;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {
       public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
    	   // Lanch the application
      WebDriver driver = new ChromeDriver();	   
      
      // driver.get("https://www.amazon.in/");
      
      // driver.navigate().to("https://www.amazon.in/");
      
      // navigate to mrthod is pass the object url
      
      //URL myurl=new URL("https://www.amazon.in/");
      //driver.navigate().to(myurl);
      
      // these weblink open same tab  ...........> (Navigate.to())
      driver.navigate().to("https://www.amazon.in/");
      
      driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      
      // Navigate back method()
      driver.navigate().back();
      System.out.println(driver.getCurrentUrl());   //"https://www.amazon.in/"
      
      // Navigate forword method()
      driver.navigate().forward();
      System.out.println(driver.getCurrentUrl());    // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
      
      
      //  Refresh the page or reload the webPage
      driver.navigate().refresh();
      
      // Close the web page
      driver.close();
	}
}
