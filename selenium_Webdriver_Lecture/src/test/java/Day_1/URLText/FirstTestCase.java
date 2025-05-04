package Day_1.URLText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Test case
 ......................
 1) Launch Browser (chrome) 
 2) Open URL https://demo.OpenCart.com/
 3) Validate title should be "Your Store"
 4) Close Browser
 */
public class FirstTestCase {

	public static void main(String[] args) {
	
		// 1) Launch Browser (chrome) 
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();

		 // 2) Open URL https://demo.OpenCart.com/
		
		driver.get("https://demo.OpenCart.com/");
		
		
		// 3) Validate title should be "Your Store"
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("Your Store")) 
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		
		// 4) Close Browser
		driver.close();
	}

}
