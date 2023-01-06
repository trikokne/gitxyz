package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;
//with enabled keyword 
public class example3_testNG_keyword_enable
{
	@Test()
	public void m1()   //test case or test method
	{
		Reporter.log("running TC1",true);
	}
	@Test(enabled=false)
	public void m2()    //test case or test method
	{
		Reporter.log("running TC2",true);
	}
	@Test
	public void m3()   //test case or test method
	{
		Reporter.log("running TC3",true);
	}
}
