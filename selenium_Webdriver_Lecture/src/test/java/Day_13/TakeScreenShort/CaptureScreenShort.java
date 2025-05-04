package Day_13.TakeScreenShort;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShort {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		driver.manage().window().maximize();
		
		// Full page take Screen short
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// Screen shot file name store
		File soursefile = ts.getScreenshotAs(OutputType.FILE);
		
		// Location of the file in current page
//		File targetFile = new File(System.getProperty("user.dir")+"\\ScreenShot\\fullPage.png");
		
		File targetFile = new File(System.getProperty("user.dir")+"\\ScreenShot\\fullPage_2.png");
		
		soursefile.renameTo(targetFile); // copy to source file to target file
		
		
		// Capture the screen short of the specific Section
		
		WebElement storeFrant = driver.findElement(By.xpath("//div[@id='cms-demo']//div[@class='row']"));
		File sourcefile = storeFrant.getScreenshotAs(OutputType.FILE);
		File targetFile1 = new File(System.getProperty("User.dir")+"\\ScreenShot\\Specific.png");
		
		
		sourcefile.renameTo(targetFile1);
		
		
	}

}
