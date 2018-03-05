package utilitiesClass;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.stream.Collectors;
import com.sun.jna.platform.FileUtils;

public class File_Managers {


//This is responsible to read the Property file
	 public  String Read_Property_File(String Key)
	{
		Properties Pro = new Properties();
		String Value = null;
		InputStream InputStram = getClass().getClassLoader().getResourceAsStream("configs\\Configuration.properties");
		try {
			//Load the input stream in propert's load method
			Pro.load(InputStram);
			Value=  Pro.getProperty(Key);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//Call the log method here to print the error if there are any
			e.printStackTrace();
		}
		return Value;
		}
 //To read Text file 
 public String Text_File_Reader() throws IOException
 {
	 String contents = Files.lines(Paths.get("c:\\textfile.txt")).collect(Collectors.joining("\n"));
     return contents;
 
 }
}
 

