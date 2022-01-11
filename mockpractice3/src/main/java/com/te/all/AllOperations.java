package com.te.all;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllOperations {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		String url = "jdbc:mysql://localhost:3306/yash";
		String user = "root";
		String Password = "root@123";
//		String query = "create table emp(id int ,name varchar(20),salary double)";
//		String query="insert into emp values(1,'yash',1000)";
//		String query2="insert into emp values(2,'mani',10000)";
//		String query3="insert into emp values(3,'raj',1200)";
//		String query4="insert into emp values(4,'san',1400)";
//		String query = "alter table emp add phno long";
//		String query = "alter table emp drop phno ";
//		String query="alter table emp modify column salary double";

		try {
			con = DriverManager.getConnection(url, user, Password);

//			st.executeUpdate(query);
//            st.executeUpdate(query2);
//            st.executeUpdate(query3);
//            st.executeUpdate(query4);
//		ResultSet executeQuery = st.executeQuery(query);
//		while(executeQuery.next()) {
//			System.out.println(executeQuery.getInt(1) +",");
//			System.out.println(executeQuery.getString(2) +",");
//			System.out.println(executeQuery.getDouble(3)+",");
//		}
//			st.addBatch("insert into emp values(5,'chetan',23000)");
//			st.addBatch("insert into emp values(6,'preetham',29000)");

			st.executeBatch();

		} finally {
			if (con != null && st != null) {
				con.close();
				st.close();
			}
		}
	}

}
