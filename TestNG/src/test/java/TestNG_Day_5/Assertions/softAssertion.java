package TestNG_Day_5.Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
	@Test
	public void test_Softassertion() 
	{
		System.out.println("Testing.....");
		System.out.println("Testing........");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);   // soft assertion
		
		System.out.println("testing.....");
		System.out.println("testing....");
		
	}

}
