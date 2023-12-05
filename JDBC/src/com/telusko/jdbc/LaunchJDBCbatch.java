package com.telusko.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Scanner;


import com.telusko.jdbc.util.JdbcUtility;


public class LaunchJDBCbatch 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		//Resource
		
		Connection connect = null;
		PreparedStatement stmt = null;
		
		ResultSet rSet = null;
		//Scanner scan = null;
		
		try 
		{
			connect = JdbcUtility.getDBConnection();
			if(connect !=null)
			{
				String query = "UPDATE authors set name = ? where id = ?";
				stmt = connect.prepareStatement(query);
			}
			if(stmt!= null)
			{
//				System.out.println("Welcome to my world!");
//				
//				scan = new Scanner(System.in);
//				System.out.println("Please enter the name to be updated");
//				String nameString = scan.next();
//				
//				System.out.println("Please enter your id");
//				Integer idInteger = scan.nextInt();
				
				
//				stmt.setString(1, nameString); //1 is index of placeholder,i.e ? for name in query ,line 32
//				stmt.setInt(2, idInteger);
				
				stmt.setString(1, "Sarita");
				stmt.setInt(2,5);
				stmt.addBatch();
				
				stmt.setString(1, "Krishna");
				stmt.setInt(2,4);
				stmt.addBatch();
				
				stmt.setString(1, "Nihith");
				stmt.setInt(2,3);
				stmt.addBatch();
				
				stmt.executeBatch();
				System.out.println("Check db for update");
				
				
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
				JdbcUtility.closeResources(connect, stmt, rSet);
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		}

	}

}
