package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.FinishPage;

public class FinishPageTest extends BaseClass{
	
	@Test
	public void validateFinishFunctionality()
	{
		FinishPage finish = new FinishPage();
		finish.finishPageFunctionality();
	}

}
