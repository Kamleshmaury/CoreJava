package com.hops;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ServletDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String phone = request.getParameter("phone");
		pw.println("<b>Success...</b><br>");
		pw.print(fname+"</br>");
		pw.print(lname+"</br>");
		pw.print(phone+"</br>");
	}

	
}
