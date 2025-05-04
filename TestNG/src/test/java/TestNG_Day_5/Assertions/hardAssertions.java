package TestNG_Day_5.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertions {
	@Test
	public void test_1() {
//		Assert.assertEquals("xyz", "xyz");
//		Assert.assertEquals(123, 536);
//		Assert.assertEquals(123, "xys");
//	    Assert.assertEquals("123", 123);
	    
//	    Assert.assertNotEquals(123, 123); // Failed
//	   Assert.assertNotEquals("why", 123); // Passed
	    
//	    Assert.assertTrue(true); // Passed
//	    Assert.assertTrue(false); // failed
	    
//	    Assert.assertTrue(1==2); // failed
//	    Assert.assertTrue(1==1); // passed
	    
	   
//		Assert.assertFalse(false);  // Passed
//		Assert.assertFalse(true);   // Failed
		
//		Assert.assertFalse(1==2);   // Passed
//		Assert.assertFalse(1==1);   // Failed
		
		Assert.fail();
		
	}

}
