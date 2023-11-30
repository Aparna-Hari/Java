package com.telusko.jdbc;

import java.sql.*;

public class LaunchJDBC1 {
										   //Handling the exceptions that might occur
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//Loading and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is registered!");
		
		//Establishing the connection
		
		String url = "jdbc:mysql://localhost:3306/books";
		String userName = "root";
		String password = "root";
		
		Connection connect = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection is established! ");
		
		//Creating the statement
		Statement stmt =  connect.createStatement();
		System.out.println("Statement object is ready");
		
		//Executing the Query
		String query = "select * from authors";
		
		//Processing the ResultSet
		
		ResultSet rSet= stmt.executeQuery(query);
		System.out.println("We have got result set");
		
		
		while(rSet.next())
		{
			System.out.println(rSet.getInt(1) + "\t" + rSet.getString(4));
		}
		
		//Closing the resources
		rSet.close();
		stmt.close();
		connect.close();
		
		System.out.println("Task completed");

	}

}
