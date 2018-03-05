/**
 * 
 */
package utilitiesClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.Spring;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Priyajit
 *This class is responsible to load the test case and it's related methods to a single collection
 */
public class Excel_Read {
	 private HashMap<String, List<String>>Test_Configure = new HashMap<String, List<String>>();
	String Test_Case = null;
	String Test_Steps_Name=null;
	ClassLoader classLoader = getClass().getClassLoader();
	
    File file = new File(classLoader.getResource("testData\\Test-Data-and-Regulator.xlsx").getFile());
//Method to build the hashmap from excel data sheet 
    
    public File Return_XML_File()
    {
    	File xmlFile= new File(classLoader.getResource("reportConfiguration//Extent_Config.xml").getFile());
    	return xmlFile;
    }
    
    
    
	@SuppressWarnings("finally")
	private HashMap<String, List<String>>  getTestConFig_Map() throws IOException
	{	//Method to extract test case name and test steps.
		FileInputStream Fin= new FileInputStream(file);
		XSSFWorkbook Excel_Workbook=new XSSFWorkbook(Fin);
		XSSFSheet Excel_Worksheet = Excel_Workbook.getSheet("Test-Config");
int Step_Counter=1;
try
{
for (int i=1;i<=40;i++)
	{
	boolean Flag=Excel_Worksheet.getRow(i).getCell(0).toString().trim().isEmpty();
	
	boolean Flag1=Excel_Worksheet.getRow(i).getCell(1).toString().trim().isEmpty();
	if (Flag1==true)
    {
    	break;
    }
    if (Flag==false)
	{
		Test_Case=Excel_Worksheet.getRow(i).getCell(0).toString();
	    @SuppressWarnings("rawtypes")
		List<String>Test_Steps_List= new ArrayList<String>();
		Test_Steps_Name=Excel_Worksheet.getRow(i).getCell(1).toString();
		Test_Steps_List.add(Test_Steps_Name);
		Step_Counter++;
		while(Excel_Worksheet.getRow(Step_Counter).getCell(0).toString().trim().isEmpty())
		{   
			Test_Steps_Name=Excel_Worksheet.getRow(Step_Counter).getCell(1).toString();
			Test_Steps_List.add(Test_Steps_Name);
			Step_Counter++;			
	    }
		Test_Configure.put(Test_Case, Test_Steps_List);	
	}
    Excel_Workbook.close();
	}
}
catch(NullPointerException e )
	{
		System.out.println("Null pointer exception occured");
}
finally
{
Excel_Workbook.close();	
return Test_Configure ;

}
	}
//Mathod to access private method
public HashMap<String, List<String>> getValue(HashMap<String, List<String>>Config_Map) throws IOException {
	    //Call the getTestConfig_Map() method.
		Config_Map=getTestConFig_Map();
		return Config_Map;
	  }
/*public List<String> Get_Test_Case() throws IOException
	{
	        //File file_Soucre = new File("G:\\Priyajit-JAVA-Project-Work\\Selenium-End-End-Fresh-Project\\Resource\\Test-Data-and-Regulator.xlsx");
	 		//Method to extract test case name
	        FileInputStream Fin= new FileInputStream(file);
			XSSFWorkbook Excel_Workbook_1=new XSSFWorkbook(Fin);
			XSSFSheet Excel_Worksheet = Excel_Workbook_1.getSheet("Test-Config");
	for (int i=1;i<=40;i++)
		{
		boolean Flag=Excel_Worksheet.getRow(i).getCell(0).toString().trim().isEmpty();
		
		boolean Flag1=Excel_Worksheet.getRow(i).getCell(1).toString().trim().isEmpty();
		if (Flag1==true)
	    {
	    	break;
	    }
	    if (Flag==false)
		{
	    	Test_Case=Excel_Worksheet.getRow(i).getCell(0).toString();
			System.out.println(""+Test_Steps_Name);
			boolean Flag3=Test_Case.startsWith("End");
			if (Flag3==false)
			{
			Test_Cases.add(Test_Case);
			}
}
		}
	//System.out.println("Test_Case list is ready ");
	return Test_Cases;
	
	}*/
}
	
	

