package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PersonalPage extends BaseClass{
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;

	@FindBy(name="postalCode")
	private WebElement code;
	
	@FindBy(name="continue")
	private WebElement continuebutton;
	
	public PersonalPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void personalPageFunctionality(String Fname, String Lname, String Code) throws InterruptedException
	{
		Wait.sendKeys(fname, Fname);
		Wait.sendKeys(lname, Lname);
		Wait.sendKeys(code, Code);
		Thread.sleep(3000);
		Wait.click(continuebutton);
	}
}
