package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example6_assertnotnull
{
	@Test
	public void TC1()
	{
		String result="trimurti";
		Assert.assertNotNull(result,"passed");
	}
	@Test
	public void TC2()
	{
		String result=null;
		Assert.assertNotNull(result,"failed");
	}

}
