package com.office;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static  Connection getConnection()
	{
		String jdbcUrl = "jdbc:sqlserver://ANVAR-PC:1433;databaseName=office;trustServerCertificate=true";
		String username = "sa";
		String password = "sa123";
		 Connection connection = null;
		 
	      try {
       
       System.out.println("Connecting...");
       connection = DriverManager.getConnection(jdbcUrl, username, password);
       System.out.println("Connected");
   } catch (SQLException e) {
       e.printStackTrace();
   }

   return connection;
}
}