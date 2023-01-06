package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;
//without giving priority
public class example1_priority1
{
	@Test
	public void m1()
	{
		Reporter.log("running TC1....",true);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("running TC2....",true);
	}
	
	

}
