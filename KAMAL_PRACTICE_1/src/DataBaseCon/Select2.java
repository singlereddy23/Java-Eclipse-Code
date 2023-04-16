package DataBaseCon;

import java.sql.*;

public class Select2
{
	public static void main(String[] args)throws Exception
    {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");

        Statement st = con.createStatement(   );
        ResultSet rs = st.executeQuery(  "select * from employee");
        
        System.out.printf(   " %5s   %-15s  %-15s \n", "ID" , "NAME" , "COMPANY");
        
        System.out.println("----------------------------------- ");
        while(rs.next())
        {   int	   i = rs.getInt("ID");
            String n = rs.getString("NAME");
            String c = rs.getString("COMPANY");            
            System.out.printf( " %5d   %-15s  %-15s \n", i , n , c);            
        }
        
        con.close();
    }
}