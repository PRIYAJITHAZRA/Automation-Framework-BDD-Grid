package pageObjects_Application1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class LogoutPage_Application1 {

	public static WebElement signOff;
	public static WebElement Reigster;
	public static Select select;

	 public static String Function_To_Pass_Value_To_Next(WebDriver driver) throws InterruptedException
	    {
		 String S;
		 Reigster=driver.findElement(By.linkText("PROFILE"));
		 Reigster.click();
		 Thread.sleep(13);
		 select=new Select (driver.findElement(By.name("country")));
		 select.selectByIndex(0);
		 return S ="Test";
		 
		 
		 
	         
	    }
	    
	    public static void ClickLogout(WebDriver driver)
	    {
	         signOff=driver.findElement(By.linkText("SIGN-OFF"));
	    
	    	signOff.click();
	    }

	   
	}

