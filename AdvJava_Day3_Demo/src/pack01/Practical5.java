package pack01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practical5
{

	public static void main(String args[])throws IOException
	{
	      int i;
	      FileInputStream fin;
	      try 
	      { 
	        fin = new FileInputStream(args[0]); //File name will be supplied from command line argument
	      } 
	      catch(ArrayIndexOutOfBoundsException e) 
	      {  System.out.println("Argument not supplied.");
	         return;
	      }
	      catch(FileNotFoundException e) 
	      {  System.out.println("File Not Found");
	         return;
	      }

	    // read characters until EOF is encountered
	      do
	      {
	        i = fin.read();
	         if(i != -1)
	         {
	           System.out.print((char) i);
	         }
	      }while(i != -1);

	      fin.close();
	}

}
