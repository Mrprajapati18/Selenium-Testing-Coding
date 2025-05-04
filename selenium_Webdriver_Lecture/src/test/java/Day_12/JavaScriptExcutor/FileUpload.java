package Day_12.JavaScriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		
		// Single file upload - 
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Selelium_Notes\\Selenium_class_notes\\Collection Framework class 1.txt");

		if (driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("Collection Framework class 1.txt"))
		
		{
			System.out.println("File is Successfully Uploaded");
		} 
		else 
		{
			 System.out.println("File is Failed to uploaded");
		}
		*/
		
		// Multiple file uploaded
		
		String file1 = "D:\\\\Selelium_Notes\\\\Selenium_class_notes\\\\Collection Framework class 1.txt";
		String file2 = "D:\\\\Selelium_Notes\\\\Selenium_class_notes\\\\Collection Framework class 2.txt";
		String file3 = "D:\\\\Selelium_Notes\\\\Selenium_class_notes\\\\Collection Framework class 3.txt";
		String file4 = "D:\\\\Selelium_Notes\\\\Selenium_class_notes\\\\Collection Framework class 4.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2+"\n"+file3+"\n"+file4);
		
	}

}
