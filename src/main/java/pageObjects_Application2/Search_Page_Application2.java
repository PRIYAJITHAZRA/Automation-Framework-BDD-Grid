/**
 * 
 */
/**
 * @author Priyajit
 *
 */
package pageObjects_Application2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class Search_Page_Application2
{
static WebElement Search_Box;
static WebElement Search_Button;
	
public  void Launch_Application2(String URLSecond,WebDriver Driver)
{
	Driver.get(URLSecond);
}

	public void Search_the_Item(String Search_Item,WebDriver Driver)
	{
		Search_Box=Driver.findElement(By.name("q"));
		Search_Box.sendKeys(Search_Item);
		Search_Button=Driver.findElement(By.name("btnK"));
		Search_Button.submit();
	}
	
}