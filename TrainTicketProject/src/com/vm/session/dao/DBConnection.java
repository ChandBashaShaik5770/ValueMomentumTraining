package com.vm.session.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {



	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName(ITrainDAO.DRIVER_CLASS);
		
		return DriverManager.getConnection(ITrainDAO.URL,ITrainDAO.USERNAME,ITrainDAO.PASSWORD);
		
	}
	
	
}
