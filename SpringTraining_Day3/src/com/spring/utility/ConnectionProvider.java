package com.spring.utility;

import java.sql.*;

public class ConnectionProvider
{
	public static Connection getConnection()
	{	
		Connection con = null;
		try 
        {	
			//Initialize and load the JDBC-ODBC Bridge driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Establish a connection with a data source
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "kamal");

        }
        catch (ClassNotFoundException | SQLException e) 
        {   
        }
		return con;	//returns connection object
		
	}
}