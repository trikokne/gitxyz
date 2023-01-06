package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example1_assertequals
{
	@Test
	public void TC1()
	{	
		String actresult="hello";
		String expresult="hello";
		Assert.assertEquals(actresult,expresult,"passed:becoz both result are same");
	}
	@Test
	public void TC2()
	{
		String actresult="The Hindu";
		String expresult="Times of India";
		Assert.assertEquals(actresult,expresult);
		
		
	}

}
