package pack1;

import java.sql.*;

import javax.swing.JOptionPane;

public class Practical2		//DELETE VALUES IN THE TABLE(STUDENTS)-DELETION
{

	public static void main(String[] args)
	{
		try 
        {                       
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");
             
            PreparedStatement pst = con.prepareStatement( "delete from student where roll = ? " );
                       
            int r=Integer.parseInt(JOptionPane.showInputDialog("Enter Roll No : "));
            pst.setInt(1, r);
            
            int status = pst.executeUpdate();
            
            if (status == 1) 
            {  JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            } 
            else 
            {  JOptionPane.showMessageDialog(null, "Record not found to delete");
            }

        }
        catch (Exception e) 
        {	System.out.println("Some Exception : " + e);
        }
	}
}