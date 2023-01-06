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

public class upstox_Testclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\trimurti\\OneDrive\\Desktop\\selenium excel sheets\\demo1.xlsx"); 
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		String USN = sh.getRow(0).getCell(0).getStringCellValue();  //get user name
		String psw = sh.getRow(0).getCell(1).getStringCellValue(); //get password
	    String pin=sh.getRow(0).getCell(2).getStringCellValue(); //pin
	    String usrid = sh.getRow(0).getCell(3).getStringCellValue(); //usrid
		System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    driver.get("https://login-v2.upstox.com/");
	    
	    upstoxlogin1page obj1=new upstoxlogin1page(driver);
	    obj1.enterUN(USN);
	    obj1.enterPW(psw);
	    obj1.clickon();
	    
	    upstoxlogin2page obj2=new upstoxlogin2page(driver);
	    obj2.passcd(pin);
	    
	    upstoxlogin3page obj3= new upstoxlogin3page(driver);
	    obj3.welcome();
	    
	    upstoxlogin4page obj4=new upstoxlogin4page(driver);
	   //obj4.username(usrid);
	    obj4.VUID();
	}
}
