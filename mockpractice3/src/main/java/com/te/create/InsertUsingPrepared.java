package com.te.create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingPrepared {

	
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
	Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/yash";
		String userName = "root";
		String password = "root@123";
		int userId = 3;
		String name = "ram";
		String place = "gulbarga";		
		try {
			Connection connection = DriverManager.getConnection(url, userName, password);
			PreparedStatement prepareStatement = connection.prepareStatement("insert into person values(?,?,?)");
			while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the id to insert");
			int id =sc.nextInt();
			if(id==0) {
				break;
			}
			System.out.println("enter the name");
			String nme=sc.next();
			System.out.println("enter the place ");
			String plce=sc.next();
			
			
			
			prepareStatement.setInt(1, id);
			prepareStatement.setString(2, nme);
			prepareStatement.setString(3, plce);
			int executeUpdate = prepareStatement.executeUpdate();
			}
			

		} catch (SQLException e) {
		      
		}
	}

}
