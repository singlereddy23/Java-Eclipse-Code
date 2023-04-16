package DataBaseCon;

import java.sql.*;
import javax.swing.JOptionPane;

public class Insert1Value
{
	public static void main(String[] args)
	{
		try 
        {
            int i = Integer.parseInt( JOptionPane.showInputDialog("Enter ID : ")  );           
            String n = JOptionPane.showInputDialog("Enter NAME: ");
            String c = JOptionPane.showInputDialog("Enter COMPANY : ");
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");

            PreparedStatement pst = con.prepareStatement("insert into employee(ID, NAME, COMPANY) values(?,?,?) ");
            
            pst.setInt( 1 , i);
            pst.setString(2, n );
            pst.setString(3, c );
            int status = pst.executeUpdate();            
            if (status == 1) 
            { JOptionPane.showMessageDialog(null, "Record inserted successfully.");
            } 
            else 
            {  JOptionPane.showMessageDialog(null, "Record insertion failed.");
            }
                    
            con.close();
        }
        catch (Exception e) 
        {   System.out.println("Some Exception: " + e);
        }
	}
}