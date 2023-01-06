package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example2_assertNotEquals
{
	
	@Test
	public void TC2()
	{
		String actresult1="The Hindu";
		String expresult1="Times of India";
		Assert.assertNotEquals(actresult1,expresult1);
		
		String actresult="hello";
		String expresult="hello";
		Assert.assertNotEquals(actresult,expresult,"passed:becoz both result are same");
    }

	@Test
	public void TC1()
	{
		String actresult="hello";
		String expresult="hello";
		Assert.assertNotEquals(actresult,expresult,"passed:becoz both result are same");
	}
	
}
