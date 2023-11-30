package com.telusko.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchJDBC2 
{

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
				String query = "INSERT INTO authors(id,name)" + "VALUES(6,'NavinReddy')";
				
				//ResultSet is returned only while fetching data from database ,not while inserting into db
				int rowAffected = stmt.executeUpdate(query);
				
				System.out.println("Query is fine");
				if(rowAffected != 0)
					{
						System.out.println("Check DB!, Data has been updated");
					}
				else 
					{
						System.out.println("Failed to add Data in DB!");
						
					}
				
				stmt.close();
				connect.close();
				}
				
}


