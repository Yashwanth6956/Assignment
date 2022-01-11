package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateTable {
	public static void main(String[] args) {
		Connection connection = null;
		Statement createStatement = null;

		try {

			// 1st step loading or register the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// Create a connection
			Connection connection1 = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=root@123");

			// 3rd step creating a platform (statement)
			Statement createStatement1 = connection1.createStatement();

			// execute query
			createStatement1.execute("Create table Sweets (id int, name varchar(40), cost double ,quantity int)");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (connection != null) {
				try {
					connection.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (createStatement != null) {
				try {
					createStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
