package com.hops;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try
		{
			String sql = "select username from user1 where username=? and password=?";
			Connection con = Util.getConnection();
			String name = request.getParameter("usName");
			String password = request.getParameter("usPass");
			PreparedStatement ps = con.prepareStatement(sql);
		
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				//it used to dispatching the request to another servlet/jsp/html
				RequestDispatcher rq = request.getRequestDispatcher("welcome.jsp");
				rq.forward(request, response);
				Cookie ck = new Cookie("name", name);
				response.addCookie(ck);
			}
			else
			{
				out.println("<font color=red size=18>Login Failed!!<br>");
				out.print("<a href=login.jsp>Try Again!..");
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("Some erro "+ex);
		}
	}

}
