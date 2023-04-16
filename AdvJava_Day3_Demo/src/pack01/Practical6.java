package pack01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practical6
{

	public static void main(String args[])// throws IOException
    {   int i;

        try( FileInputStream  fin = new FileInputStream(args[0]) )  //try with auto-cloasable resource
        {  //read characters until EOF is encountered
            do
            { i = fin.read();
              if(i != -1)
              {    System.out.print((char) i);
              }
            }while(i != -1);    
        }//end of try     
        catch(ArrayIndexOutOfBoundsException | FileNotFoundException e2) 
        {  System.out.println("Some problem occoured. Retry.");
           return;
        }//end of catch block  
       catch(IOException io)
       {  System.out.print("File is locked.Retry later.");  
       }   
       catch(Exception e)
       {  System.out.println("Some other problem.");
       }
   
  }//end of main()

}
