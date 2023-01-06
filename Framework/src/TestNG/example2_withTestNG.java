package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example2_withTestNG
{
	@Test
	public void m1()
	{
		Reporter.log("running method m1...",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("Running method m2....",true);
	}
}
