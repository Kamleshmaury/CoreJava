package com.hops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class UserMain {
	public static void main(String[] args) {
	try
	{
		Connection con = Util.getConnection();
		String s1 = "insert into user1 values(2,'raka@gmail.com','56789')";
		/*String s1 = "select * from user1 where id=?";
		PreparedStatement ps = con.prepareStatement(s1);
		ps.setInt(1, 1);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
		}*/
		Statement st = con.createStatement();
		st.execute(s1);
		System.out.println("record inserted...");
	}
	catch(Exception ex) {
		System.out.println(ex);
	}
}

}
