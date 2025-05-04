package Day_10.DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenSelecterHub {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		//Login Steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// clicking on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		// Click on Dropdown
		driver.findElement(By.xpath("driver.findElement(By.xpath(\"//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]\"))")).click();
		
		// Find the single element
		driver.findElement(By.xpath("//span[normalize-space()='Financial Analysist']")).click();
		
	}

}
