package runner;

	
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import utilitiesClass.Excel_Read;
import utilitiesClass.Report_Archiver;
import baseClass.BaseUtil;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


	@RunWith(Cucumber.class)
	
	@CucumberOptions  (plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/reports/SampleBank_Automation_report.html"},
			
			/*
			 * Features: Features Options helps Cucumber to locate the Feature file in the project folder structure.All we need to do is 
			 * to specify the folder path and Cucumber will automatically find all the �.features� extension files in the folder.
             * It can be defined like:
			 */
			
			features = "src/test/resources/features/",
			
			/*
			 * Monochrome: This option can either set as true or false (default value is false). 
			 * If it is set as true, it means that the console output for the Cucumber test are much 
			 * more readable. And if it is set as false, then the console output is not as readable as
			 *  it should be. For practice just add the code �monochrome = true� in TestRunner_1 class.          
			*/			
			
			monochrome = true,
			
			// tags is used to run selective scenario
            tags = {"@CHROME"},
            // tags = "@SmokeTest2",
            
            /*
             * Strict: if strict option is set to false then at execution time if cucumber encounters any undefined/pending steps then 
             * cucumber does not fail the execution and undefined steps are skipped and BUILD is SUCCESSFUL.
             */
            
            //strict = false ,
            
            /*
             * 
             */
            
           //plugin = { "pretty","html: cucumber-html-reports","json: cucumber-html-reports/cucumber.json" },
            
            
 /*
  * DryRun: This option can either set as true or false (default value is false). 
  * If it is set as true, it means that Cucumber will only checks that every Step 
  * mentioned in the Feature File have corresponding code written in Step Definition 
  * file or not. So in case any of the function is missed in the Step Definition for any 
  * Step in Feature File, it will give us the message. So If you writing scenarios first 
  * and then implementing step definitions then add dryRun = true.
 */
           // dryRun = true,
            
  
           
           glue = "stepDefintions" )
	
	public class TestRunner_1 {
		//Run this
		// This class will be empty 
	
		//We don't need Before class hook here as Step difination file itself is taking care of object creation.
		@BeforeClass
		public static void Test()
		{
			System.out.println("......");
		}
		@AfterClass
		
	public static void End_Of_Scenario() throws IOException, InterruptedException
    {
			
	 utilitiesClass.Excel_Read Ex = new utilitiesClass.Excel_Read();
      Reporter.loadXMLConfig(Ex.Return_XML_File());
      Reporter.addStepLog("Test");
      Reporter.setSystemInfo("user", System.getProperty("user.name"));
      Reporter.setSystemInfo("os", "Windows-10");
      Reporter.setTestRunnerOutput("Sample test runner output  message");
      
    }
	}
	// refer the HelpFolder for detail documentation
	
