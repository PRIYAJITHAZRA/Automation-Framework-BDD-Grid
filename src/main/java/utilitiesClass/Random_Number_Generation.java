/**
 * 
 */
package utilitiesClass;

/**
 * @author Priyajit
 *
 */
public class Random_Number_Generation {
public  String Random_String()
	{
		/* this part is fixed matching Transaction ID header*/
	String randomCharacterSet1 = "ABC"; 	
	   /* this part is fixed matching Transaction ID tailer*/
	String randomCharacterSet2 = "XYZ"; 
	  /* generate random 7 digit integer number */
	int randomNumber = (int)((Math.random() * 9000000)+1000000); 
    String TransactionID = randomCharacterSet1 + randomNumber + randomCharacterSet2; 
    return TransactionID;

	}
	
	
}
