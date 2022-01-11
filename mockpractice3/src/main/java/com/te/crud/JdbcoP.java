package com.te.crud;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.xdevapi.Statement;

public class JdbcoP {
	public static void main(String[] args) throws IOException {

		String url = "jdbc:mysql://localhost:3306/yash";
		FileReader filereader = null;
		Connection con = null;
		java.sql.Statement st = null;
		filereader = new FileReader("C:\\Users\\Y\\Desktop\\db.txt");
		Properties properties = new Properties();
		properties.load(filereader);
	

		try {
			con = DriverManager.getConnection(url, properties);
			st = con.createStatement();
			st.addBatch("insert into person values(10,'vamsi','hosur')");
			st.addBatch("delete from person where id=2");
            st.addBatch("update person set id=4 where name='praveen'");
            st.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
