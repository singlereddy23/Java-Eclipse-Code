package pack1;

import java.sql.*;

public class Practical9
{
	public static void main(String[] args)throws Exception
    {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");
        
        String sql = "select * from student";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        ResultSetMetaData rsmd = rs.getMetaData();
        
        int cols = rsmd.getColumnCount();
        System.out.println("Total no of column fetched : " + cols );
        
        System.out.println("\nThese columns are: ");
        
        for (int i=1; i<=cols; i++) 
        {   
            String colName = rsmd.getColumnName(i);
            String colType = rsmd.getColumnTypeName(i);
            
            System.out.println(colName+" -> "+colType);
        }
	}
}
