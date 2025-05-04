package TestNG_Day_7.Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo_1 {
	WebDriver driver;

    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dataProvider = "dp")
    void testlogIn(String email, String pwd) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(2000);

        try {
            boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
            if (status) {
                driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
                Assert.assertTrue(true);
            }
        } catch (Exception e) {
            Assert.fail("Login failed for email: " + email);
        }
    }

    @AfterClass
    void tearDown() {
        driver.close();
    }

    @DataProvider(name = "dp", indices = {0,1,2,3})
    Object[][] loginData() {
         Object data [][] = {
            {"abc@gmail.com", "test@123"},
            {"bhd@gmail.com", "test@145"},
            {"jdk@gmail.com", "test@7809"},
            {"durgeshkumar778080@gmail.com", "Durg@8080"},
            {"kdl@gmail.com", "tst@749"},
        };
        return data;
    }
}

