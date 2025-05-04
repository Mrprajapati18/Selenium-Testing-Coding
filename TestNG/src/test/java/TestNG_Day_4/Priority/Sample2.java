package TestNG_Day_4.Priority;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(priority = -10)
	public void  abc() 
	{
		System.out.println("Fist test case");
	}
	@Test(priority= -20)
    public void xyz() 
    {
    	System.out.println("Second test case");
    }
	@Test(priority=1)
    public void pqr()
    {
    	System.out.println("Third test case");
    }
	@Test(priority=1)
    public void stv()
    {
    	System.out.println("Fouth test case");
    }
	public void hys() 
	{
		System.out.println("Sixth test case");
	}
	@Test(priority=0)
	public void xvg()
	{
		System.out.println("Fivth test case");
	}
	
}
