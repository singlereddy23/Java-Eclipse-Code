package pack1;

import java.sql.*;

import javax.swing.JOptionPane;

public class Practical8		//ADDING DETAILS ONE BY ONE & SENDING DETAILS AS A BATCH
{
	public static void main(String[] args)throws Exception
    {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");
        
        //con.setAutoCommit(false);
        
        String sql = "insert into student(roll, name, phone) values(?,?,?) " ;   
        PreparedStatement pst = con.prepareStatement(sql);
        
        
        //BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        
        while(true)
        {  
           System.out.println("********************************************************");
           
           
           int r = Integer.parseInt( JOptionPane.showInputDialog("Enter Roll No : ")  );                        
           String n = JOptionPane.showInputDialog("Enter Name: ");
           String p = JOptionPane.showInputDialog("Enter Phone : ");
           pst.setInt( 1 , r);
           pst.setString(2, n );
           pst.setString(3, p );
           
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