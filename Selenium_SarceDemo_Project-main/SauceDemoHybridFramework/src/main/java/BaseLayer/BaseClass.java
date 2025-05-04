package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static void initialization(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("incognito"))
		{
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		}
		else {
			System.out.println("Enter valid browsername");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
}
