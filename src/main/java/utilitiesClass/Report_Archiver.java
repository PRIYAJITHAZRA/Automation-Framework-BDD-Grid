package utilitiesClass;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;
import com.sun.jna.platform.FileUtils;


public class Report_Archiver {
	 public static void Archive_Report() throws IOException
	 {
		 DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HHmmss");
		 Date date = new Date();
		String Report_Target_Path="Report_Target_Path",Report_Archive_Path="Report_Archive_Path";
		File_Managers Reader=new File_Managers();
		
		
		File Target_File = new File(Reader.Read_Property_File(Report_Target_Path)+"SampleBank_Automation_report.html");
		File Archived_File= new File(Reader.Read_Property_File(Report_Archive_Path)+"Archived_Automation_report_on_"+dateFormat.format(date)+".html");
		Files.copy(Target_File, Archived_File);
	 }
	 }
	

