package Assertion;

import org.testng.annotations.Test;

import graphql.Assert;

public class example4_assertfalse 
{
	@Test
	public void TC2()
	{
		boolean actresult =false;
		Assert.assertFalse(actresult); //TC passed becoz actresult false
	}
	
	@Test
	public void TC1()
	{
		boolean actresult = true;
		Assert.assertFalse(actresult); //TC failed becoz actresult true
	}

}
