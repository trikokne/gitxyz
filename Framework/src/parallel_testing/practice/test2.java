package parallel_testing.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 
{
	@Parameters("URL")
	@Test
	public void loginhomeloan(String url )
	{
	 System.out.println("login related HL");
	 System.out.println(url);
	}
	@Parameters("URL")
	@Test
	public void logouthomeloan(String url)
	{
	 System.out.println("logout related HL");
	 System.out.println(url);
	}
	@Parameters("URL")
	@Test
	public void propertyhomeloan(String url)
	{
	 System.out.println("property related HL");	
	 System.out.println(url);
	}
}
