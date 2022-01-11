package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingPrepare {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root@123");
			statement = connection.prepareStatement("insert into sweets values(?,?,?,?)");
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the id of sweet");
			int id = scan.nextInt();
			System.out.println("enter name of the sweet");
			String sweetName = scan.next();
			System.out.println("enter the  cost of the sweet");
			double cost = scan.nextDouble();
			System.out.println("enter quantity of the sweet");
			int quantity = scan.nextInt();
			statement.setInt(1, id);
			statement.setString(2, sweetName);
			statement.setDouble(3, cost);
			statement.setInt(4, quantity);
			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
