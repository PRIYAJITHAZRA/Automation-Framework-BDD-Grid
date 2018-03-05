package pageObjects_Application1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created By:
 */
public class LoginPage_Application1 {
    
	public WebElement txtUserName;
	public  WebElement txtPassword;
	public  WebElement btnLogin;
	/*public  LoginPage_Application1(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    	txtUserName=driver.findElement(By.name("userName"));
    	txtPassword=driver.findElement(By.name("password"));
    	btnLogin=driver.findElement(By.name("password"));
    	
    }*/

	 public void Supply_Credentials(String userName, String password, WebDriver driver) throws InterruptedException
	    {
		 txtUserName=driver.findElement(By.name("userName"));
	    	txtPassword=driver.findElement(By.name("password"));
		 txtUserName.sendKeys(userName);
		 txtPassword.sendKeys(password);
		
	    }

    /*public static void Login(String userName, String password) throws InterruptedException
    {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        
    }*/

    public  boolean ClickLogin(WebDriver driver) throws InterruptedException
    {
    	btnLogin=driver.findElement(By.name("login"));
    	boolean Flag= btnLogin.isDisplayed();
    	 Thread.sleep(100);
        btnLogin.submit();
       
        return Flag;
    }


}
