package managers;



import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import pageObjects_Application1.LoginPage_Application1;
import pageObjects_Application1.LogoutPage_Application1;
import pageObjects_Application2.Search_Page_Application2;
import utilitiesClass.Screen_Shot_Taker;
	 
		 
	public class PageObjectManager {
	 
	
		public  WebDriver driver;
		String Checker_ForApplication_2;
		LoginPage_Application1 loginPage_Application1 = new LoginPage_Application1();
		LogoutPage_Application1 logoutPage_Application2 = new LogoutPage_Application1();
		Search_Page_Application2 search_Page_Application2 = new Search_Page_Application2();
		WebDriverManager  webDriverManager= new WebDriverManager();
			public WebDriver Initialize_Driver(String Browser, String node)  {
				try {
					this.driver =webDriverManager.getDriver(Browser,node);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return driver;
		}
	 
	
		public boolean	Login_To_Application(String Username,String Password,String URL) throws InterruptedException
			{
			
			driver.get(URL);
			loginPage_Application1.Supply_Credentials(Username, Password, driver);
			
			boolean Flag = loginPage_Application1.ClickLogin(driver);
			return Flag;
			}
		
		public void	Log_Out_From_Application() throws InterruptedException
		{
			Thread.sleep(100);
			Checker_ForApplication_2=LogoutPage_Application1.Function_To_Pass_Value_To_Next(driver);
			LogoutPage_Application1.ClickLogout(driver);
			
		}

		public void	To_Launch_Application_and_Search_in_Application2(String URLSecond) throws InterruptedException 
		{
			
			if( Checker_ForApplication_2 !=null)
			{
				search_Page_Application2.Launch_Application2(URLSecond,driver);
				search_Page_Application2.Search_the_Item(Checker_ForApplication_2, driver);
			}
		}
		
		public String Take_Screenshot(WebDriver webdriver,String Image) throws IOException
		{
			webdriver=driver;
			
			String ImagePath=Screen_Shot_Taker.screen_Shot_Taker(driver,Image);
			return ImagePath;
		}
		public void Close_Driver()
		{
			webDriverManager.closeDriver(driver);
		}
	}
	
