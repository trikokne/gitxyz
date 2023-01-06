package parallel_testing.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1
{
	@Parameters({"URL"})
	@Test
	public void loginpersonalloan(String url)
	{
	 System.out.println("login related PL");
	 System.out.println(url);
	}
	@Parameters("URL")
	@Test
	public void logoutpersonalloan(String url)
	{
		 System.out.println("logout related PL");
		 System.out.println(url);	 
	}
	@Parameters("URL")
	@Test
	public void propertypersonalloan(String url)
	{
		 System.out.println("property related PL");
		 System.out.println(url);
	}

}
