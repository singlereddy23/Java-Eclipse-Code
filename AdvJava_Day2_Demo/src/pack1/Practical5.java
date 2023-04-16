package pack1;

import java.sql.*;

public class Practical5
{
	public static void main(String[] args)throws Exception
    {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");

        Statement st = con.createStatement(   );
        ResultSet rs = st.executeQuery(  "select * from student");
        
        System.out.printf(   " %5s   %-15s  %-15s \n", "Roll" , "Name" , "Phone");
        
        System.out.println("----------------------------------- ");
        while(rs.next())
        {   int	   r = rs.getInt("roll");
            String n = rs.getString("name");
            String p = rs.getString("phone");            
            System.out.printf( " %5d   %-15s  %-15s \n", r , n , p);            
        }
        
        con.close();
    }
}