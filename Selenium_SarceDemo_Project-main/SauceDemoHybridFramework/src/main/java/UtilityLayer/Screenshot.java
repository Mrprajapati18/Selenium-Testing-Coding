package UtilityLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class Screenshot extends BaseClass{
	
	public static String takeScreenshot(String folderName, String screenshotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		String destPath = System.getProperty("user.dir")+"//"+folderName+"//"
		+DateAndTime.captureCurrentYear()+"//"+DateAndTime.captureMonthAndYear()
		+"//"+screenshotName+DateAndTime.captureDateAndTime()+".png";
		
		FileUtils.copyFile(src, new File(destPath));
		return destPath;
		
	}

}
