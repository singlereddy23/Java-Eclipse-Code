package pack1;

import java.sql.*;

import javax.swing.JOptionPane;

public class Practical7		//SCROLLABLE & UPDATABLE ResultSet
{
	public static void main(String[] args)throws Exception
    {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");
        //con.setAutoCommit(true);
        
        String sql = "select roll, name, phone from student order by roll asc";
        PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, 
                                                           ResultSet.CONCUR_UPDATABLE );
        ResultSet rs = stmt.executeQuery();
        
        int r ;
        String n ;
        String p ;
        
        // Move cursor to 2nd row
        rs.absolute(2);
        r = rs.getInt("roll");
        n = rs.getString("name");
        p = rs.getString("phone");        
        System.out.printf( " %5d   %-15s  %-15s \n", r , n , p);
        
        
        // Move cursor to 4th row
        rs.absolute(4);
        r = rs.getInt("roll");
        n = rs.getString("name");
        p = rs.getString("phone");        
        System.out.printf( " %5d   %-15s  %-15s \n", r , n , p);
        
        
        // Move cursor to first row
        rs.first();
        r = rs.getInt("roll");
        n = rs.getString("name");
        p = rs.getString("phone");        
        System.out.printf( " %5d   %-15s  %-15s \n", r , n , p);
        
       
        // Move cursor to last row
        rs.last();
        r = rs.getInt("roll");
        n = rs.getString("name");
        p = rs.getString("phone");        
        System.out.printf( " %5d   %-15s  %-15s \n", r , n , p);
        
        
        // Move cursor to 3rd row
        rs.absolute(3);
        
        
        // Save the current cursor position, and move cursor to the insert row, 
        rs.moveToInsertRow();
        r = Integer.parseInt( JOptionPane.showInputDialog("Enter Roll No : ")  );            
        n = JOptionPane.showInputDialog("Enter Name: ");
        p = JOptionPane.showInputDialog("Enter Phone : ");
        

        //Set columns values
        rs.updateInt("roll", r);
        rs.updateString("name", n);
        rs.updateString("phone", p);
        //Insert new row
        rs.insertRow();   //click of OK Button
         
        // Move cursor back to saved 3rd row position
        rs.moveToCurrentRow();
        
        r = rs.getInt("roll");
        n = rs.getString("name");
        p = rs.getString("phone");        
        System.out.printf( " %5d   %-15s  %-15s \n", r , n , p);
        

        // Move cursor to last row
        rs.last();
        r = rs.getInt("roll");
        n = rs.getString("name");
        p = rs.getString("phone");        
        System.out.printf( " %5d   %-15s  %-15s \n", r , n , p);
        con.commit();
    }
}
