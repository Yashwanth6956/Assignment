package com.te.transation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		Savepoint  setSavepoint =null;
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			connection = DriverManager.getConnection(url, "root", "root@123");
			statement = connection.createStatement();
			statement.execute("insert into trans values(1,'unblocking using fp')");
			statement.execute("insert into trans values(2,'entering the pin')");
			statement.execute("insert into trans values(3'check balance')");
			System.out.println("balance is 10000000");
			 setSavepoint = connection.setSavepoint();
			statement.execute("insert into trans values(4'deleting the amt')");
			statement.execute("insert into trans values(5'transfer through network')");
			statement.execute("insert into trans values(6'crediting to account')");
			System.out.println("transaction completed |ting ting|");
			connection.commit();

		} catch (SQLException e) {
			try {
				
				connection.rollback(setSavepoint);
				connection.commit();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
