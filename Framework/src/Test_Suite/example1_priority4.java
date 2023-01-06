package Test_Suite;

import org.testng.Reporter;
import org.testng.annotations.Test;
//with -ve integer priority
public class example1_priority4
{
	@Test(priority=-1)  //executes 2nd
	public void m7()
	{
		Reporter.log("running TC7",true);
	}
	@Test(priority=-2)  //executes 1st
	public void m8()
	{
		Reporter.log("running TC8",true);
	}
}
