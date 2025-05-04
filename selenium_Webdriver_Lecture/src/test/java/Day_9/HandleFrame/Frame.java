package Day_9.HandleFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
       public static void main(String[] args) throws InterruptedException {
		
    	   WebDriver driver = new ChromeDriver();
    	   
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	   
    	   driver.get("https://ui.vision/demo/webtest/frames/");
    	   
    	   driver.manage().window().maximize();
    	   
    	   // Frame 1
    	   WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));   	   
    	   driver.switchTo().frame(frame1); // passed as a web element and this command switch to the web element   	   
    	   driver.findElement(By.xpath("(//input[@name='mytext1'])[1]")).sendKeys("Welcome");
    	   
    	   
    	   driver.switchTo().defaultContent(); // go back to page
    	   // Frame 2
    	   Thread.sleep(5000);
    	   
    	   WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
    	   driver.switchTo().frame(frame2);
    	   
    	   Thread.sleep(5000);
    	   
    	   driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium4");
    	   driver.switchTo().defaultContent(); // go back to pages
    	   
    	   // Frame 3
    	   
    	   WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
    	   driver.switchTo().frame(frame3);
    	   Thread.sleep(3000);
    	   driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java Programming");   	   
    	   driver.switchTo().defaultContent(); // Go back to web page
    	   
    	   // Inner iframe - part of frame 3
    	   
    	   driver.switchTo().frame(0); 
    	   driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();    	   
    	   driver.switchTo().defaultContent();
    	   
    	   // Close the webpages
    	   
    	   driver.close();
	}
}
