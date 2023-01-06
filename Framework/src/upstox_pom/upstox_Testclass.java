package upstox_pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstox_Testclass {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    driver.get("https://login-v2.upstox.com/");
	    
	    upstoxlogin1page obj1=new upstoxlogin1page(driver);
	    obj1.enterUN();
	    obj1.enterPW();
	    obj1.clickon();
	    
	    upstoxlogin2page obj2=new upstoxlogin2page(driver);
	    obj2.passcd();
	    
	    upstoxlogin3page obj3= new upstoxlogin3page(driver);
	    obj3.welcome();
	    
	    upstoxlogin4page obj4=new upstoxlogin4page(driver);
	    obj4.username();
	}
}
