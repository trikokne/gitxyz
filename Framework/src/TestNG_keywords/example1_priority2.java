package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;
//with giving priority
public class example1_priority2
{
	@Test(priority=2)
	public void m1()
	{
		Reporter.log("running TC1....",true);
	}
	
	@Test(priority=1)
	public void m2()
	{
		Reporter.log("running TC2....",true);
	}
}
