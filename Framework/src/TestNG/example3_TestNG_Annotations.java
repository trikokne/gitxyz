package TestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example3_TestNG_Annotations 
{
	@BeforeMethod
	public void loginapp()
	{
		Reporter.log("Login into application",true);
	}
	
	@Test
	public void verifyUID1() //test case
	{
		Reporter.log("runnign UID1 test case", true);
	}
	
	@Test
	public void verifyUID2() //test case
	{
		Reporter.log("runnign UID2 test case", true);
	}
	
	

}
