package upstox_pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_without_ddf 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login-v2.upstox.com/");
		//enter the user id
		driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("6WBQ83");
		//enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tri@12345");
		//click on sign in
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		//enter the pass code
		driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1992");
		//click on welcome
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		WebElement act = driver.findElement(By.xpath("//span[text()='trimurti k.']"));
		String actual = act.getText();
		String expct = "Trimurti K.";
		boolean result = actual.equals(expct);
		if(result)
		{
			System.out.println("valid user"+" "+result);
		}
		else
		{
			System.out.println("user is not valid"+"  "+result);
		}		
	}

}
