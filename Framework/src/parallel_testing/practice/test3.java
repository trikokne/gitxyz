package parallel_testing.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 
{
	@Parameters({"URL","key"})
	@Test
	public void logincarloan(String usrnm, String pw)
	{
	 System.out.println("login related CL");	
	 System.out.println(usrnm);
	 System.out.println(pw);
	}
	@Test(dataProvider="verifyUN")
	public void logoutcarloan(String username, String password)
	{
	 System.out.println("logout related CL");
	 System.out.println(username);
	 System.out.println(password);
	}
	@Test
	public void propertycarloan()
	{
	 System.out.println("property related CL");	
	}
	@DataProvider
	public Object[][] verifyUN()
	{
		//1st combination -username and password
		//2nd combi. -username and password
		//3rd combi. - username and password
		
		Object[][] data = new Object[3][2];
		//1st combi
		data [0][0]="trimurti@gmail.com";
		data [0][1]="tri@12345";
		
		//2nd combi 
		data [1][0]="ankita@gmail.com";
		data [1][1]="ankita@123";
		//3rd combi
		data [2][0]="tri@gmail.com";
		data [2][1]="trimurti@12345";
		return data;
	}
}
