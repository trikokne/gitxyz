package POM_DDF_TestNG_UtilityAndBasecls;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_DDF_TestNG_Baseclass
{
	//author name=@Trimurti
	//base class consist of mandatory code every time like open browser
	WebDriver driver;
	public void initializebrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		//enter the URL
		//driver.get("https://login-v2.upstox.com/");
		driver.get(POM_DDF_TestNG_Utilityclass.getproeprtiesfile("URL"));
	}
}
