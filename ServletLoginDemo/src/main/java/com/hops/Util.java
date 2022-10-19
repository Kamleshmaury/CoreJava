package com.hops;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
	
	public static Connection getConnection() {
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users ", "root", "root");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return con;
	}

}
