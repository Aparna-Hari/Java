package com.telusko.jdbc.util;
import java.sql.*;

public class JdbcUtility 
{
	static //static block is initialized during class loading subsystem
	{
		//Loading and register the driver
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		System.out.println("Driver is registered!");
	}
	
	public static Connection getDBConnection() throws SQLException
	{
		//Establishing the connection
		
		String url = "jdbc:mysql://localhost:3306/books";
		String userName = "root";
		String password = "root";
		
		return DriverManager.getConnection(url, userName, password);
	}
	
	public static void closeResources(Connection conct, Statement stat , ResultSet rs) throws SQLException
	{
		if(conct != null) //to avoid null pointer exception
			conct.close();
		if(stat!= null)
			stat.close();
		if(rs != null)
			rs.close();
	}
}
