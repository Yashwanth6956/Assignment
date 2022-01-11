package com.te.create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CreateTable {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/yash";
		String password = "root@123";
		String uname = "root";
		String query = "select * from person";
	 Driver driver = new Driver();
	 DriverManager.registerDriver(driver);
//		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, uname, password);
		Statement createStatement = con.createStatement();
		ResultSet executeQuery = createStatement.executeQuery(query);
		while(executeQuery.next()) {
			
			System.out.println(executeQuery.getInt(1)+",");
			System.out.println(executeQuery.getString(2)+",");
			System.out.println(executeQuery.getString(3)+",");
			
		}
		

		
		
	}

}
