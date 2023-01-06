package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example4_testNG_keywords_timeout 
{
	@Test()
	public void m1()   //test case or test method
	{
		Reporter.log("running TC1",true);
	}
	@Test(timeOut=3000)
	public void m2() throws InterruptedException    //test case or test method
	{
		Thread.sleep(2000);
		Reporter.log("running TC2",true);
	}
	@Test
	public void m3()   //test case or test method
	{
		Reporter.log("running TC3",true);
	}
}
