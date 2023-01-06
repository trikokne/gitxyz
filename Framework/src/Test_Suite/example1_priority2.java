package Test_Suite;

import org.testng.Reporter;
import org.testng.annotations.Test;
//with giving priority
public class example1_priority2
{
	@Test(priority=2)
	public void m3()
	{
		Reporter.log("running TC3....",true);
	}
	
	@Test(priority=1)
	public void m4()
	{
		Reporter.log("running TC4....",true);
	}
}
