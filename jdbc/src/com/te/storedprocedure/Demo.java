package com.te.storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=root@123";
		Connection con = null;
		CallableStatement clst = null;
		try {
			con = DriverManager.getConnection(url);
			clst = con.prepareCall("call put(?,?,?,?)");

			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.println("Enter the sweet id");
				int id = scan.nextInt();
				if (id == 0) {
					break;
				}
				System.out.println("Enter the sweet name");
				String name = scan.next();
				System.out.println("Enter the cost of the sweet");
				double price = scan.nextDouble();
				System.out.println("Enter the quantity of the sweet");
				int qty = scan.nextInt();
				clst.setInt(1, id);
				clst.setString(2, name);
				clst.setDouble(3, price);
				clst.setInt(4, qty);
				clst.execute();

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
