package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass{
	@Parameters({"browsername"})
	@BeforeClass
	public void setUp(String browsername)
	{
		BaseClass.initialization(browsername);
	}
	
	@Test
	public void loginFunctionality()
	{
		LoginPage login = new LoginPage();
		login.createLoginPage("standard_user", "secret_sauce");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
