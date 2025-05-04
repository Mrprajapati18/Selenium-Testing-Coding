package TestNG_Day_3.Annotation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample_1 {
   @Test
	void abc() 
	{
		System.out.println("This is abc form c1....");
	}
	@BeforeTest
	void bt() 
	{
		System.out.println("This is before test method C1...");
	}
}
