package Multibrowser_Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import upstox_pom.upstoxlogin1page;
import upstox_pom.upstoxlogin2page;
import upstox_pom.upstoxlogin3page;
import upstox_pom.upstoxlogin4page;

public class exa2_multibrowser
{
	WebDriver driver;
	@Parameters("browsername")
	@Test
	public void TC1(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		    driver=new ChromeDriver();
		}	
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\firefox driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	        driver=new FirefoxDriver();
		}	
		else if(browsername.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\EdgedriverV107\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();	
		}
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://login-v2.upstox.com/");
	      //calling 1st pom page
	      upstoxlogin1page obj1=new upstoxlogin1page(driver);
	      obj1.enterUN();
	      obj1.enterPW();
	      obj1.clickon();
	      
	      //calling 2nd pom page
	      upstoxlogin2page obj2=new upstoxlogin2page(driver);
	      obj2.passcd();
	      
	      //calling 3rd pom page
	      upstoxlogin3page obj3=new upstoxlogin3page(driver);
	      obj3.welcome();
	      
	      //caliing 4th pom page
	      upstoxlogin4page obj4=new upstoxlogin4page(driver);
	      obj4.username();
	}    
}
