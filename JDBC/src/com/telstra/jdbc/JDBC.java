package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {


		String url="jdbc:mysql://localhost:3306/telstra";
		String username="ojasvi";
		String password="password";
		String command="INSERT INTO product VALUES('FootBall',500)";

		int i=0;

		Connection cn=null;
		Statement st=null;

		try {
			cn=DriverManager.getConnection(url,username,password);
			st=cn.createStatement();
			i=st.executeUpdate(command);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}
}
