package com.telusko.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchJDBC3 {

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
		String query = "UPDATE authors set name = 'Hyder' where id = 6";
		int rowsAffected = stmt.executeUpdate(query);
		
		System.out.println("Number of rows affected are :" + rowsAffected);
		
		if(rowsAffected != 0)
			System.out.println("Updated Successfully");
		else 
			System.out.println("Failed to update");
		
		String query1 = "DELETE from authors where id =6 ";
		int rowsDeleted = stmt.executeUpdate(query1);
		
		System.out.println("Number of rows deleted  are :" + rowsDeleted);
		
		if(rowsDeleted != 0)
			System.out.println("Deleted Successfully");
		else 
			System.out.println("Failed to Delete data");
		
		stmt.close();
		connect.close();
		

	}

}
