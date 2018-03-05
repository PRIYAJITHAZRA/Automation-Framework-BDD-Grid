package managers;
	import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
	import enums.DriverType;
	import enums.EnvironmentType;
import enums.Remote_Driver_Browser_Option;
import utilitiesClass.File_Managers;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.*;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.*;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	 
	public class WebDriverManager {
		private WebDriver driver;
		private static DriverType driverType;
		private String environmentType;
		private static Remote_Driver_Browser_Option remoteBrowserType;
		private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
		File_Managers reader=new File_Managers();
		public  void WebDriverManager(String Browser) {
			//driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
			
			//remoteBrowserType = FileReaderManager.getInstance().getConfigReader().remote_Driver_Browser_Option();
		}
	 
		public  WebDriver getDriver(String Browser,String node) throws MalformedURLException {
			 createDriver(Browser,node);
			return driver;
		}
	 
		private  WebDriver createDriver(String Browser,String node) throws MalformedURLException {
			environmentType =reader.Read_Property_File("environment");
			   if (environmentType.equalsIgnoreCase("local")) 
				   {
				   driver = createLocalDriver(Browser);
		        driver.manage().deleteAllCookies();
		 	   driver.manage().window().maximize();
				   }
			   else if (environmentType.equalsIgnoreCase("remote")) 
			   {
		        driver = createRemoteDriver(Browser,node);
		        driver.manage().deleteAllCookies();
			 	   driver.manage().window().maximize();
		        	
			   }
			   return driver;
		}
	 
		private WebDriver createRemoteDriver(String Browser,String node) throws MalformedURLException {
			Capabilities Caps=null;
			String System_IP=reader.Read_Property_File("System_IP");
			
			if (Browser.equalsIgnoreCase("CHROME"))
			{
			 Caps=DesiredCapabilities.chrome();
			((DesiredCapabilities) Caps).setPlatform(Platform.WINDOWS);
			URL url = new URL("http://"+System_IP+":4444"+"/wd/hub/");
			driver=new RemoteWebDriver(url,Caps);
			}
			else if (Browser.equalsIgnoreCase("FIREFOX"))
			{
			 Caps=DesiredCapabilities.firefox();
			((DesiredCapabilities) Caps).setPlatform(Platform.WINDOWS);
			URL url1 = new URL("http://"+System_IP+":"+node+"/wd/hub/");
			driver=new RemoteWebDriver(url1,Caps);
			
			}
			else if (Browser.equalsIgnoreCase("INTERNETEXPLORER"))
			{
			Caps=DesiredCapabilities.internetExplorer();
			((DesiredCapabilities) Caps).setPlatform(Platform.WINDOWS);
			URL url11 = new URL("http://"+System_IP+":"+node+"/wd/hub/");
			driver=new RemoteWebDriver(url11,Caps);
		
			}
			return driver;
		}
	 
		private WebDriver createLocalDriver(String Browser) {
			if (Browser.equalsIgnoreCase("CHROME")) {	    
	       
	       String ChromedriverPath="ChromedriverPath";
		System.setProperty(CHROME_DRIVER_PROPERTY,reader.Read_Property_File(ChromedriverPath));
		driver = new ChromeDriver();
			}
	       else if (Browser.equalsIgnoreCase("FIREFOX")) 
	       {
	        	String FirefoxdriverPath="FirefoxdriverPath";
				System.setProperty("webdriver.gecko.driver", reader.Read_Property_File(FirefoxdriverPath));
	        	driver = new FirefoxDriver();
	       }
	       else
	    	   {
	    	   String InternetexplorerDriverPath="InternetexplorerDriverPath";
			System.setProperty("webdriver.ie.driver",reader.Read_Property_File(InternetexplorerDriverPath));
	    	   driver = new InternetExplorerDriver();
	    		    
	        }
	 
	       // if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
			return driver;
		}	
	 
		public void closeDriver(WebDriver driver) {
			driver.close();
			driver.quit();
		}
	 
	}

