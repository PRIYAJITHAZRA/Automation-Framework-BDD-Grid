/**
 * 
 */
/**
 * @author Priyajit
 *
 */
package Parallel_Runner;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

import java.net.MalformedURLException;

import org.junit.AfterClass;



import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import utilitiesClass.Batch_Runner;
import utilitiesClass.Excel_Read;
import utilitiesClass.Report_Archiver;
import baseClass.BaseUtil;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import managers.FileReaderManager;
import runner.TestRunner_1;
import runner.TestRunner_2;
import runner.TestRunner_3;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


public class Parallel_Runner {
	
	  @Test
	public void runAllTests() throws IOException, InterruptedException {
	        Class<?>[] classes = {TestRunner_1.class,TestRunner_3.class,TestRunner_2.class};
	        if (FileReaderManager.getInstance().getConfigReader().getEnvironment().toString()=="REMOTE")
			{
			Batch_Runner  batch_runner = new Batch_Runner();
			batch_runner.Trigger_Bartch();
			Thread.sleep(1000);
			}
			JUnitCore.runClasses(new ParallelComputer(true, true), classes);
	        Report_Archiver.Archive_Report();
			
	        }
}