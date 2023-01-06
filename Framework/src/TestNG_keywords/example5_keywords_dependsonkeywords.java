package TestNG_keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keywords_dependsonkeywords
{
	@Test
	public void login()
	{
		Assert.fail();
		Reporter.log("running TC1",true);
	}
	@Test(dependsOnMethods = {"login"})
	public void logout()
	{
		Reporter.log("running TC2",true);
	}
}
