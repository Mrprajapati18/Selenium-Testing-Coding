package Day_5.Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		// Is displayed()
           
		// WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		// System.out.println("Display status logo : " + logo.isDisplayed());
		
		// On Other Methods is 
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display status : " + status);
		
		// IsEnabled()
		boolean status1 = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Display status is : " + status1);
		
		// IsSelected()
		
		System.out.println("Before Selected..................");
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(male_rd.isSelected()); // false
		
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(female_rd.isSelected()); // false
		
		System.out.println("After selecting male........................");
		
		male_rd.click();// select male radio button
		System.out.println(male_rd.isSelected()); // true
		System.out.println(female_rd.isSelected()); // false
		
		System.out.println("After selecting female.......................");
		female_rd.click(); // Select female redio button
		System.out.println(male_rd.isSelected());// false
		System.out.println(female_rd.isSelected()); // true
		
		boolean newsLetterStatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("News Letter status is: " + newsLetterStatus ); // select the drop down button
		
		// Close the webpage 
		driver.close();
	}

}
