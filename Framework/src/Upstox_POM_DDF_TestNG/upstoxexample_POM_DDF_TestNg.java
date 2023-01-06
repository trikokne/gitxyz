package Upstox_POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class upstoxexample_POM_DDF_TestNg
{
	upstoxlogin1page obj1;
	upstoxlogin2page obj2;
	upstoxlogin3page obj3;
	upstoxlogin4page obj4;
	Sheet sh;
	WebDriver driver;
	@BeforeClass
	public void Browseropen() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\trimurti\\OneDrive\\Desktop\\selenium excel sheets\\demo1.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("Sheet2");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//go to upstox URL
		driver.get("https://login-v2.upstox.com/");
		
		obj1=new upstoxlogin1page(driver);
		obj2=new upstoxlogin2page(driver);
		obj3=new upstoxlogin3page(driver);
		obj4=new upstoxlogin4page(driver);
		
	}
	@BeforeMethod
	public void loginapp() throws InterruptedException
	{
		//enter user name
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		obj1.enterUN(UN);
	    String PW = sh.getRow(0).getCell(1).getStringCellValue();
	    obj1.enterPW(PW);
	    //click on signin
	    obj1.clickon();		
	    //enter pin
	    String pin = sh.getRow(0).getCell(2).getStringCellValue();
	    obj2.passcd(pin);
	   // Thread.sleep(3000);
	    obj3.welcome();
	}
	@Test
	public void verifyUN()
	{
	    //String vusrnm = sh.getRow(0).getCell(3).getStringCellValue();
		//obj4.username(vusrnm);
		String actid = obj4.VUID();
		String expid = sh.getRow(0).getCell(3).getStringCellValue();
	    Assert.assertEquals(actid, expid,"TC is passed");   
;	}
	@AfterMethod
	public void logout()
	{
		
	}
	@AfterClass()
	public void browserclose()
	{
		obj1=null;
		obj2=null;
		obj3=null;
		obj4=null;
		driver=null;
		sh=null;
	}

}
