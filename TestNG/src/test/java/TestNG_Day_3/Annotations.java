package TestNG_Day_3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Annotations {
@BeforeSuite
public void beforetMethod() {
	System.out.println("Excuting all test before suite");
 }
@Test 
public void mainTest() {
	System.out.println("This is main test");
}
@AfterSuite
public void afterSuiteMethod() {
	System.out.println("Excuting all test after suite");
}
}
