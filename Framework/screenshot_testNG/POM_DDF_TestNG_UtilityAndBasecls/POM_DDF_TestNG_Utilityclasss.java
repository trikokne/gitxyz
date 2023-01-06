package POM_DDF_TestNG_UtilityAndBasecls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class POM_DDF_TestNG_Utilityclasss 
{
	//author=@Trimurti
	//getTD takes two argument like 1. rowindex 2. cellindex
	public static String getTD(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\trimurti\\OneDrive\\Desktop\\selenium excel sheets\\demo1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;	
	}
	
	public static void capturescreenshot(WebDriver driver,int TestcaseID) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\trimurti\\eclipse-workspace\\Framework\\screenshot\\TCID"+TestcaseID+".jpeg");
		 FileHandler.copy(src, dest);	
	}
	
	
}
