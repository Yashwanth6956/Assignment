package com.te.create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/yash";
	String username="root";
	String password="root@123";
	String query="drop table emp";
	
	try {
		Connection connection = DriverManager.getConnection(url,username,password);
		Statement createStatement = connection.createStatement();
		createStatement.execute(query);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
