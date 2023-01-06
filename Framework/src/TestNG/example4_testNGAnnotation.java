package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_testNGAnnotation
{
	@BeforeClass
	public void browseropen()
	{
		Reporter.log("Browser open",true);
	}
	@BeforeMethod
	public void loginapp()//testcase or test method
	{
		Reporter.log("Login to application",true);
	}
	@Test
	public void VerifyUID1()//test case
	{
		Reporter.log("Running VerifyUser ID1 Test case....",true);
	}
	
	@Test
	public void VerifyUID2()//test case
	{
		Reporter.log("Running VerifyUser ID2 Test case....",true);
	}
	@AfterMethod
	public void logoutapp()
	{
	Reporter.log("Log out to application",true);	
	}
	
	@AfterClass
	public void browserclose()
	{
		Reporter.log("Browser close",true);
	}

}
