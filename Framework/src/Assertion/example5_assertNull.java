package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example5_assertNull
{
	@Test
	public void TC1()
	{
		String result=null;
		Assert.assertNull(result,"passed");
	}

	@Test
	public void TC2()
	{
		String result="Upstox";
		Assert.assertNull(result,"failed");
	}

}
