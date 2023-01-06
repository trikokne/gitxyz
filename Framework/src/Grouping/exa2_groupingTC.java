package Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class exa2_groupingTC 
{
	@Test(groups="login")
	public void TC11()
	{
		Reporter.log("running TC11",true);
	}
	@Test(groups="login")
	public void TC12()
	{
		Reporter.log("running TC12",true);
	}
	@Test(groups="login")
	public void TC13()
	{
		Reporter.log("running TC13",true);
	}
	@Test(groups="profile")
	public void TC14()
	{
		Reporter.log("running TC14",true);
	}
	@Test(groups="profile")
	public void TC15()
	{
		Reporter.log("running TC15",true);
	}
	@Test(groups="profile")
	public void TC16()
	{
		Reporter.log("running TC16");
	}
}
