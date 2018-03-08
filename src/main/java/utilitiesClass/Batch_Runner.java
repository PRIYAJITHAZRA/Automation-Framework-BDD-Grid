/**
 * 
 */
package utilitiesClass;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
 
import org.codehaus.plexus.util.cli.CommandLineException;
import org.codehaus.plexus.util.cli.CommandLineUtils;
import org.codehaus.plexus.util.cli.Commandline;
import org.codehaus.plexus.util.cli.WriterStreamConsumer;
/**
 * @author Priyajit
 *
 */
public class Batch_Runner {
	File_Managers reader=new File_Managers();
		public void batchRunner() {
			String batfile = "Starter.bat";
			String directory = "G:\\Priyajit-Software\\JAVA\\Selenium-Grid";
			try {
				runProcess(batfile, directory);
			} catch (CommandLineException e) {
				e.printStackTrace();
			}
		}
		
		public void runProcess(String batfile, String directory) throws CommandLineException {
			
			Commandline commandLine = new Commandline();
			
			File executable = new File(directory + "/" +batfile);
			commandLine.setExecutable(executable.getAbsolutePath());
			
			WriterStreamConsumer systemOut = new WriterStreamConsumer(
		            new OutputStreamWriter(System.out));
			
			WriterStreamConsumer systemErr = new WriterStreamConsumer(
		            new OutputStreamWriter(System.out));
	 
			int returnCode = CommandLineUtils.executeCommandLine(commandLine, systemOut, systemErr,1);
		
		}
		public void Trigger_Bartch()
		{
		Runtime runtime = Runtime.getRuntime();
	        try {
	            //Pass string in this format to open Batch file
	            runtime.exec("cmd /c start "+reader.Read_Property_File("Grid_Batch_Path"));
	        } catch (IOException e) 
	        {
		}
		}
	}


