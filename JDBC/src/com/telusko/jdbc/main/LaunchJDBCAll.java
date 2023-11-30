package com.telusko.jdbc.main;

import java.sql.*;

import com.telusko.jdbc.util.JdbcUtility;

public class LaunchJDBCAll 
{

	public static void main(String[] args) 
	{
		Connection connection = null;
		Statement stmt = null;
		ResultSet rSet = null;
		
		String query = "SELECT * from authors";
		try 
		{
			connection= JdbcUtility.getDBConnection();
			if(connection != null)
				stmt = connection.createStatement();
			if(stmt != null)
				rSet= stmt.executeQuery(query);
			if(rSet != null)
			{
				System.out.println("Id \t  Name ");
				while(rSet.next())
				{
					System.out.println(rSet.getInt(1) + "\t" + rSet.getString(4));
				}
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				JdbcUtility.closeResources(connection, stmt, rSet);
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		}

	}

}
