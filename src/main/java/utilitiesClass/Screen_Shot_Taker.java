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

public class Screen_Shot_Taker {

	public static String  screen_Shot_Taker(WebDriver Driver,String Filename) throws IOException
	{
		 DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		 Date date = new Date();
		TakesScreenshot screenshot=(TakesScreenshot)Driver;
		File InpurScreenshot= screenshot.getScreenshotAs(OutputType.FILE);
		String ScreenShot_Path="ScreenShot_Path";
		File_Managers Reader=new File_Managers();
		File OutputScreenshot = new File(Reader.Read_Property_File(ScreenShot_Path)+Filename+"_"+dateFormat.format(date)+".png");
		Files.copy(InpurScreenshot, OutputScreenshot);
		return OutputScreenshot.toString();
	
	
	
}
}