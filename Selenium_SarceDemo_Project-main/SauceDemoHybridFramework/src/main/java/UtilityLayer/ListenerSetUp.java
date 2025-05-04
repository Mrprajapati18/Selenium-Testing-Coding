package UtilityLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerSetUp extends ExtentReportsSetUp implements ITestListener{

	private static ExtentReports extentReports;
	private static ExtentTest extentTest;
	@Override
	public void onStart(ITestContext context) {
		String projectName = context.getSuite().getName();
		extentReports = ExtentReportsSetUp.setUp(projectName);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
		extentTest = extentReports.createTest("Test case is started " +testCaseName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
		extentTest.log(Status.SKIP, "Test case is passed" +testCaseName);
		String destPath = null;
		try {
			destPath = Screenshot.takeScreenshot("PassScreenshot", testCaseName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		extentTest.addScreenCaptureFromPath(destPath);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
		extentTest.log(Status.FAIL, "Test case is failed" +testCaseName);
		String destPath = null;
		try {
			destPath = Screenshot.takeScreenshot("FailScreenshot", testCaseName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		extentTest.addScreenCaptureFromPath(destPath);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
		extentTest.log(Status.SKIP, "Test case is skiped" +testCaseName);
	}


	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}
	

}
