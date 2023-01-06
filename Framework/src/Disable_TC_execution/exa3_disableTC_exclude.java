package Disable_TC_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class exa3_disableTC_exclude
{
	@Test
	public void TC9()
	{
		Reporter.log("running TC9",true);
	}
	@Test
	public void TC10()
	{
		Reporter.log("running TC10",true);
	}
	@Test
	public void TC11()
	{
		Reporter.log("running TC11",true);
	}
	@Test
	public void TC12()
	{
		Reporter.log("running TC12",true);
	}

}
