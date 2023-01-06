package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example2_testNG_keyword_invocationCount 
{
	@Test(invocationCount=5)
	public void m1()
	{
		Reporter.log("running TC1",true);
	}

}
