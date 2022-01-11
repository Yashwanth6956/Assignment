package com.te.batchquery;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BatchStatement {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		FileReader filereader;
		Connection connection = null;
		Statement statement = null;

		try {
			filereader = new FileReader("C:\\Users\\Y\\Desktop\\db cred.txt");
			Properties properties = new Properties();
			properties.load(filereader);
			connection = DriverManager.getConnection(url, properties);
			statement = connection.createStatement();
			statement.addBatch("insert into employees values(101,'yash')");
			statement.addBatch("insert into employees values(102,'mani')");
			statement.addBatch("insert into employees values(103,'sanjay')");
			statement.executeBatch();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
