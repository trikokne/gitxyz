package Disable_TC_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;
//2) disable TC using include
public class exa2_disable_TC_include
{
	@Test
	public void TC5()
	{
		Reporter.log("running TC5",true);
	}
	@Test
	public void TC6()
	{
		Reporter.log("running TC6",true);
	}
	@Test
	public void TC7()
	{
		Reporter.log("running TC7",true);
	}
	@Test
	public void TC8()
	{
		Reporter.log("running TC8",true);
	}
}
