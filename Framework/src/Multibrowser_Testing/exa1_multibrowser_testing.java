package Multibrowser_Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class exa1_multibrowser_testing
{
	WebDriver driver;
    @Parameters("browsername")
    @Test	
	public void TC1(String browsername)
	{
	   	if(browsername.equals("Chrome"))
	   	{
	   	System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();	
	    }
	   	else if(browsername.equals("Edge"))
	   	{
	   		System.setProperty("webdriver.edge.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\EdgedriverV107\\edgedriver_win64\\msedgedriver.exe\"\"C:\\Users\\trimurti\\Selenium\\Webdriver\\EdgedriverV107\\edgedriver_win64\\msedgedriver.exe");
	        driver=new EdgeDriver();   
	   	}
	   	else if(browsername.equals("Firefox"))
	   	{
	   		System.setProperty("webdriver.gecko.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\firefox driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	   		driver=new FirefoxDriver();
	   	}
	   	driver.manage().window().maximize();
   	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.facebook.com/");	   	
	}
}
