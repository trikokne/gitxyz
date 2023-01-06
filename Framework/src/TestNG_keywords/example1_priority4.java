package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;
//with -ve integer priority
public class example1_priority4
{
	@Test(priority=-1)  //executes 2nd
	public void m1()
	{
		Reporter.log("running TC1",true);
	}
	@Test(priority=-2)  //executes 1st
	public void m2()
	{
		Reporter.log("running TC2",true);
	}
}
