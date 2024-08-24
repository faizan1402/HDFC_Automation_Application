package rahulsheetyacademy.TestComponents;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.resources.ExtentReporterNG;

public class Listeners implements ITestListener {

	ExtentTest test;     
	ExtentReports extent = ExtentReporterNG.getReportObject();
	@Override
	public void onTestStart(ITestResult result) 
	{
		test = extent.createTest(result.getMethod().getMethodName());	
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS,"Test Passed");
		
		
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		test.log(Status.FAIL,"Test Failed");
		test.fail(result.getThrowable()); // test throwable basically give the all the erro messages
		
		//screenshot -> attach to the report
		
		//test.addScreenCaptureFromPath(null, null)
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	
}
