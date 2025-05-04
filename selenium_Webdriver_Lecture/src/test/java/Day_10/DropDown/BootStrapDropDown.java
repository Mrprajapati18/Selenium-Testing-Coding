package Day_10.DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
	    driver.manage().window().maximize();
	    
	    // Select single options
	    //driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	    
	    // When the x-path are so long then using the contains() and sort it like
	    driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); // Open the drop down options
	    
       // 1) Select the single Options along with default selection
	    
	    //driver.findElement(By.xpath("//input[@value='Java']")).click();
	    
	    // 2) Capture all the option and find out size
	    
	    List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	    
         System.out.println("Number of Options: " + options.size()); // 14
         
         // 3) printting the options from dropDown
         // using for loop
         
//         for(int i = 0; i<options.size(); i++) 
//         {
//        	 System.out.println(options.get(i).getText());
//         }
         
         // using Enhanced for loop
         for(WebElement  op:options)
         {
        	 System.out.println(op.getText());
         }
         
         // 4) Select multi Options
         for (WebElement op:options) 
         {
        	 
        	 if(op.getText().equals("Java") || op.getText().equals("Python") || op.getText().equals("JQuery") || op.getText().equals("Boootstrap"))
        	 {
        		 op.click();
        	 }
         }
      }
  }