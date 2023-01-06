package upstox_pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_withddf {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login-v2.upstox.com/");
		FileInputStream file=new FileInputStream("C:\\Users\\trimurti\\OneDrive\\Desktop\\selenium excel sheets\\demo1.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		//enter User name
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys(UN);
		//enter password
		String PW = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PW);
		//click on sign IN
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		//enter the passcode
		String code = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='yob']")).sendKeys(code);
		//click on welcome
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		WebElement act = driver.findElement(By.xpath("//span[text()='trimurti k.']"));
		String actual = act.getText();
		         String expct = "Trimurti K.";
		         boolean result = expct.equals(actual);
		         if(result)
		         {
		        	 System.out.println("user is valid"+"="+result);
		         }
		         else
		         {
		        	 System.out.println("user is not valid"+"="+result);
		         }
	}

}
