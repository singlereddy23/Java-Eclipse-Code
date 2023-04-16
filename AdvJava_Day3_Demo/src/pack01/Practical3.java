package pack01;

import java.io.FileInputStream;

public class Practical3
{

	public static void main(String[] args)throws Exception
    {   int i;
        FileInputStream fin = null;  
        
        try
        { fin = new FileInputStream( args[0] );
        }  
        catch(Exception exc)
        { System.out.println("Some problem occoured.\n" + exc);
          return;
        }        
        
        // read characters until EOF is encountered
        do
        {	i = fin.read();
            if(i != -1)
            { System.out.print((char) i);
            }
        }
        while( i  !=  -1 );

        fin.close();        
    }//end of main()
}