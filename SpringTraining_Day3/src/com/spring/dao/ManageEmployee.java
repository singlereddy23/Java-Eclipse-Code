package com.spring.dao;

import java.sql.*;
import com.spring.bean.Employee;
import com.spring.utility.ConnectionProvider;

public class ManageEmployee
{	
	Connection con;
	PreparedStatement ps1;
	//PreparedStatement ps2;
	ResultSet rs;
	
	public void add(Employee e)
	{	
		con = ConnectionProvider.getConnection();
		String query = "insert into employee2 (id,name,role) values (?,?,?)";
		try
		{	
			ps1 = con.prepareStatement(query);
			ps1.setInt(1, e.getId());
			ps1.setString(2, e.getName());
			ps1.setString(3, e.getRole());
			ps1.executeUpdate();
		}
		catch (Exception ex)
		{	System.out.println(ex);
		}
	}
	
	
	public void show()
	{
		con = ConnectionProvider.getConnection();
		String query = "select * from Employee2";
		try
		{	
			ps1 = con.prepareStatement(query);
			rs = ps1.executeQuery();
			System.out.println("Eid\tName\tRole");
			while (rs.next())
			{	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}
		catch (Exception e)
		{	System.out.println(e);
		}
		
	}
	
}
