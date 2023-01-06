package upstox_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin1page
{
	//regular class i.e. without main method
	//globally declaration of variables
	//1st step
            @FindBy(xpath="//input[@id='userCode']")private WebElement UN;
            @FindBy(xpath="//input[@id='password']")  private WebElement PWD;
            @FindBy(xpath= "//div[text()='Sign into Upstox']") private WebElement sigbtn;
   //2nd step: initialize within a constructor with access level public using page factory class 
            public upstoxlogin1page(WebDriver driver)
            {
            	PageFactory.initElements(driver,this);
            }
    //3rd step: initialize within a method with access level public
            public void enterUN()
            {
            	UN.sendKeys("6WBQ83");
            }
            public void enterPW()
            {
            	PWD.sendKeys("Tri@12345");
            }
            public void clickon()
            {
            	sigbtn.click();
            }
}
