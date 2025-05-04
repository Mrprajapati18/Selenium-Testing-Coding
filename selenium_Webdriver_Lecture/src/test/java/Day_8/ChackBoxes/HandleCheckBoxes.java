package Day_8.ChackBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {
      public static void main(String[] args) throws InterruptedException {
		
    	  WebDriver driver = new ChromeDriver();
    	  driver.get("https://testautomationpractice.blogspot.com/");
    	  
    	  driver.manage().window().maximize();
    	  
    	  // 1) select specific checkboxes
    	  
    	  //driver.findElement(By.xpath("//input[@id='tuesday']")).click(); // single select check box
    	  
    	  // 2) Select the all check  boxes
    	  
    	 List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
    	 
         //using for loop
    	 /*for(int i = 0; i<checkboxes.size(); i++)
    	 {
    		 checkboxes.get(i).click();
    	 }
    	  */
    	  
    	  // Inhance loop method
    	  /*for( WebElement checkbox : checkboxes) {
    		  checkbox.click();
    	  } 
    	  */
    	  // 3) Select last 3 check boxes
    	  
    	  // total no of select check boxes - how many no of checkboxse want to selecet = stating index
    	  // 7-3 = 4 starting index
    	  
    	  /*for (int i = 4; i<checkboxes.size(); i++) {
    		  checkboxes.get(i).click();
    	  }
    	  */
    	  
    	  // 4) select first 3 check  boxes
    	  /*
    	  for(int i = 0; i < 3;i++) {
    		  checkboxes.get(i).click();
    	  }
    	  */
    	 
    	  // 5) Unselect checkbox if they are selected
    	  
    	  for(int i = 0; i<3; i++) {
    		  checkboxes.get(i).click();
    	  }
    	  
    	  Thread.sleep(5000);
    	  
    	  for(int i = 0; i<checkboxes.size();i++) {
    		  
    		  if(checkboxes.get(i).isSelected()) {
    			  
    		  checkboxes.get(i).click();
    	  }
    	  
       }
    	  // close the webpages
    	  driver.close();
	}
}
