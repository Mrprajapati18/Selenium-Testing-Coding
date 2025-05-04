package TestNG_Day_3.Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void testTitle() 
	{
		String exp_title = "Opencart";
		String act_title1 = "OpenShort";
		
//	if(exp_title.equals(act_title1)) 
//	{
//       System.out.println("test passed");
//	}
//	else {
//		System.out.println("test failed");
//	}
	
	//Assert.assertEquals(exp_title, act_title);
		
		if(exp_title.equals(act_title1)) {
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
  }
}