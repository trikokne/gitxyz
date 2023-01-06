package Assertion;

import org.testng.annotations.Test;

import graphql.Assert;

public class example3_asserttrue 
{
	@Test
	public void TC1()
	{
		boolean actresult = true;
		Assert.assertTrue(actresult); //TC passed becoz actresult true
	}
	@Test
	public void TC2()
	{
		boolean actresult =false;
		Assert.assertTrue(actresult); //TC failed becoz actresult false
	}
}
