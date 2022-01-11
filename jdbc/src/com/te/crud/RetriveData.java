package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root@123");
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from sweets");
			while (result.next()) {
				// if we use string all values will be converted into string
				/*
				 * System.out.print(result.getString(1)+",");
				 * System.out.print(result.getString(2)+",");
				 * System.out.print(result.getString(3)+",");
				 * System.out.println(result.getString(4));
				 */

				System.out.print(result.getInt(1) + ",");
				System.out.print(result.getString(2) + ",");
				System.out.print(result.getDouble(3) + ",");
				System.out.println(result.getInt(4));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
