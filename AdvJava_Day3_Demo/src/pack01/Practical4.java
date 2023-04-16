package pack01;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Practical4
{

	public static void main(String[] args)throws Exception
    {
        String s = JOptionPane.showInputDialog( "Enter Any Message ");	
        s =  s+ "\n" ;
       
        FileWriter fw = new FileWriter( "Message.txt" , true);
       
        fw.write(s);       
        fw.close();       
        System.out.println("Data saved successfully.");       

    }//end of main()

}
