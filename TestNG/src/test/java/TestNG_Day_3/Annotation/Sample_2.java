package TestNG_Day_3.Annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Sample_2 {
	@Test
void xyz() {
	System.out.println("This is Xyz form C2....");
}
	@AfterTest
	void at() {
		System.out.println("This is after test....");
	}
}
