package Day_1.URLText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
Test case
......................
1) Launch Browser (Edge) 
2) Open URL https://demo.nopcommerce.com/
3) Validate title should be "nopCommerce demo store"
4) Close Browser
*/

public class Assignment {

	public static void main(String[] args) {
		// 1) Launch Browser (Edge)
		
		WebDriver driver = new EdgeDriver();
		
		// 2) Open URL https://demo.nopcommerce.com/
        
		driver.get("https://demo.nopcommerce.com/");
		
		// 3) Validate title should be "nopCommerce demo store"
		
		String act_Title = driver.getTitle();
		
		if(act_Title.equals("nopCommerce demo store"))
		{
		  System.out.println("Test Passsed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		// 4) Close Browser
		driver.close();
	   // driver.quit();
	}

}
