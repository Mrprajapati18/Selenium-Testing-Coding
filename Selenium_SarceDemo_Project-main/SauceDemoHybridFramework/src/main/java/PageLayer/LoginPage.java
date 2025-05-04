package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass{
	
	@FindBy(name="user-name")
	private WebElement firstname;
	
	@FindBy(name="password")
	private WebElement lastname;
	
	@FindBy(name="login-button")
	private WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createLoginPage(String Fname, String Lname)
	{
		Wait.sendKeys(firstname, Fname);
		Wait.sendKeys(lastname, Lname);
		Wait.click(login);
	}

}
