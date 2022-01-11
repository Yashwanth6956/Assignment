package com.te.trywithresource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResources {
	public static void main(String[] args) {
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=root@123");
				Statement st = con.createStatement();) {
			boolean execute = st.execute("alter table sweets rename to sanjana_sweets ");
			System.out.println(execute);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
