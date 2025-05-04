package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class FinishPage extends BaseClass{
	
	@FindBy(name="finish")
	private WebElement finish;
	
	public FinishPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void finishPageFunctionality()
	{
		Wait.click(finish);
	}
	

}
