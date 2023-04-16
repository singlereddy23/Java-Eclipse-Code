package DataBaseCon;

import java.sql.*;
import javax.swing.JOptionPane;

public class InsertMoreValues
{
	public static void main(String[] args)throws Exception
    {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");
        
        //con.setAutoCommit(false);
        
        String sql = "insert into employee(ID, NAME, COMPANY) values(?,?,?) " ;   
        PreparedStatement pst = con.prepareStatement(sql);
        
        
        //BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        
        while(true)
        {  
           System.out.println("********************************************************");
           
           
           int i = Integer.parseInt( JOptionPane.showInputDialog("Enter ID : ")  );                        
           String n = JOptionPane.showInputDialog("Enter NAME : ");
           String c = JOptionPane.showInputDialog("Enter COMPANY : ");
           pst.setInt( 1 , i);
           pst.setString(2, n );
           pst.setString(3, c );
           
           pst.addBatch();
           count = count + 1;
           
           System.out.println("********************************************************");
           String choice = JOptionPane.showInputDialog("Do you wish to add more records? (yes/no) :  ");
           if(choice.equals("no") )
           {   break;
           }
        }//end of loop
        System.out.println("\nTotal rows added in the batch = " + count);
        
        //execute batch
        int status[] = pst.executeBatch();
        //con.commit();
        
        System.out.println("\n\n");
        for(int s: status)
        { System.out.println("Row Insertion Status : " + s);
        }
          
        con.close();
	}
}