package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex_softAssert 
{
	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
		String s1="Trimurti";
		String s2="Trimurti";
		soft.assertEquals(s1, s2);
		
		String s3=null;
		soft.assertNull(s3);
		
		String s4=null;
		soft.assertNotNull(s4);
		
		String actual="trimurti";
		String expected="trimurti";
		soft.assertNotEquals(actual,expected);
		
		soft.assertAll();
	}
	@Test
	public void TC2()
	{
		SoftAssert soft=new SoftAssert();
		String actual="abc";
		String expected="abc";
		soft.assertEquals(actual, expected,"passed");
		
		String s1=null;
		soft.assertNull(s1);
		
		String s2="trimurti";
		soft.assertNotNull(s2);
		
		String act="pqr";
		String exp="velocity";
		soft.assertNotEquals(act, exp);
	
		soft.assertAll();
	}

}
