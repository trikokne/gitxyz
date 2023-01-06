package Disable_TC_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;
//1)disable TC using enabled keyword
public class exa1_disable_TC_enabled 
{
	@Test
	public void TC()
	{
		Reporter.log("running TC");
	}
	@Test
	public void TC1()
	{
		Reporter.log("running TC1");
	}
	
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("running TC2");
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("running TC3");
	}
	
	

}
