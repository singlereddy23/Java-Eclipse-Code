package pack1;

import java.sql.*;

import javax.swing.JOptionPane;

public class Practical1		//INSERT VALUES INTO TABLE(STUDENT)-INSERTION
{
	public static void main(String[] args)
	{
		try 
        {
            int r = Integer.parseInt( JOptionPane.showInputDialog("Enter Roll No : ")  );           
            String n = JOptionPane.showInputDialog("Enter Name: ");
            String p = JOptionPane.showInputDialog("Enter Phone : ");
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");

            PreparedStatement pst = con.prepareStatement("insert into student(roll, name, phone) values(?,?,?) ");
            
            pst.setInt( 1 , r);
            pst.setString(2, n );
            pst.setString(3, p );
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