package stepDefintions;

import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
//import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageObjects_Application1.LoginPage_Application1;
import org.testng.asserts.*;

import com.cucumber.listener.Reporter;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseUtil;

import org.openqa.selenium.support.PageFactory;

//@CucumberOptions (plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/reports/SampleBank_Automation_report.html"})
public class StepDefination4 {
	
	 private  BaseUtil base;
	 private static WebDriver driver;
	 private static PageObjectManager pageobjmanager=new PageObjectManager();
	 public static Scenario scenario;
	 
	 public StepDefination4(BaseUtil base) {
	        this.base = base;
	    }
	
	    public StepDefination4()
		{
			
		}
	    @Before("@EXecution_Set4")
	    public void Start_Of_Scenario(Scenario Sc)
	    {
	  this.scenario=Sc;
	   System.out.println("..."+Sc.getName());
	    
	    }
	// Creating object of the Pageobjectmanager class in order perform specific operation across all the pages 

	    @Given("^I  Login Application_Fourth with username as \"(.*?)\" and password as \"(.*?)\" and URL as \"(.*?)\"$")
	public void i_Login_Application_First_with_username_as_and_password_as_and_URL_as(String username, String password,String URLFirst) throws Throwable {
        //List<List<String>> data=Data.raw();
       //pageobjmanager.Login_To_Application(data.get(1).get(1),data.get(2).get(1));
	    //pageobjmanager.Initialize_Driver("CHROME", URLFirst);  	
		pageobjmanager.Login_To_Application(username,password,URLFirst);			
		
        
	}

	@When("^I click login button for application_Fourth$")
	public void i_click_login_button_application4th() throws Throwable {
		//pageobjmanager.getLoginPage().ClickLogin();
	}

	@And("^I signout from application-Fourth$")
	public void I_signout_from_application_application4th() throws Throwable {
		pageobjmanager.Log_Out_From_Application();
		pageobjmanager.driver.close();
		
	}
	
	/*
	@Then("^I pass the info to Second Application with URL \"(.*?)\"\"$")
	public void i_pass_the_info_to_Application_Second_with_URL(String URLSecond) throws InterruptedException
	{
		pageobjmanager.Initialize_Driver();
		pageobjmanager.To_Launch_Application_and_Search_in_Application2(URLSecond);
		pageobjmanager.driver.close();
		
	}
	*/
	@Then("^I pass the info from Application_fourth to next Application with URL \"(.*?)\"$")
	public void i_pass_the_info_to_Fourth_Application_with_URL_application4th(String URLSecond) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//pageobjmanager.Initialize_Driver("CHROME");
		pageobjmanager.To_Launch_Application_and_Search_in_Application2(URLSecond);
		//Assert.assertTrue("Test the method", false);
		pageobjmanager.driver.close();
		
	  	}


	 @After("@EXecution_Set4")
	   
	 public static void End_Of_Scenario() throws IOException, InterruptedException
	    {
		 //utilitiesClass.Excel_Read Ex = new utilitiesClass.Excel_Read();
	      //Reporter.loadXMLConfig(Ex.Return_XML_File());
	 if(scenario.isFailed())
	 {
		String Image=scenario.getName();
		 System.out.println("End of execution"+scenario.getName());
		String ImagePath= pageobjmanager.Take_Screenshot(driver, Image);
		pageobjmanager.driver.close();
		Thread.sleep(100);
		 Reporter.addScreenCaptureFromPath(ImagePath);
	 }
	    }	
	    
	    }   


