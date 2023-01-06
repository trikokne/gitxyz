package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;
//with duplicate priority
public class example1_priority3
{
	@Test(priority=1)  //duplicate priority
	public void c()
	{
		Reporter.log("running TC1....",true);
	}
	
	@Test(priority=1)  //duplicate priority
	public void a()
	{
		Reporter.log("running TC2....",true);
	}
}

