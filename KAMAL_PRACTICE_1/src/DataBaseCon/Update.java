package DataBaseCon;

import java.sql.*;
import javax.swing.JOptionPane;

public class Update
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");

	        PreparedStatement pst = con.prepareStatement( "update employee set COMPANY = ? where ID = ? ");
	        
	        int ro = Integer.parseInt(JOptionPane.showInputDialog("Enter ID : "));
	        String ph = JOptionPane.showInputDialog("Enter New COMPANY : "); 
	        
	        pst.setString(1, ph);
	        pst.setInt(2, ro);
	        
	        int status = pst.executeUpdate();
	        
	        if (status == 1) 
	        {  JOptionPane.showMessageDialog(null, "Record updated successfully.");
	        } 
	        else 
	        {  JOptionPane.showMessageDialog(null, "Record not found to update.");
	        }
	        con.close();
		}
		catch (Exception e) 
        {	System.out.println("Some Exception : " + e);
        }
	}
}