package day37;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listenerss implements ITestListener {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	public void onTestStart(ITestResult result) {
sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/reports/210224.html");//specify location of the report
		
		sparkReporter.config().setDocumentTitle("Automation Report"); // TiTle of report
		sparkReporter.config().setReportName("Functional Testing"); // name of the report
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name","localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name","Thiru");
		extent.setSystemInfo("os","Windows10");
		extent.setSystemInfo("Browser name","Chrome");
						
	  }
	
	 public void onTestSuccess(ITestResult result) {
		 test = extent.createTest(result.getName()); // create a new enty in the report
			test.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status p/f/s
		  }

	  public void onTestFailure(ITestResult result) {
		  test = extent.createTest(result.getName());
			test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
			test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable());
		  }

	   public void onTestSkipped(ITestResult result) {
		   test = extent.createTest(result.getName()); // create a new enty in the report
			test.log(Status.SKIP, "Test case skipped is:" + result.getName()); // update status p/f/s     
		  }
	    public void onFinish(ITestContext context) {
		    extent.flush();
		  }
	
	
	
	
}
