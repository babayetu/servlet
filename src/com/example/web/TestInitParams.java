package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInitParams extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test init parameters <br>");
		
		Enumeration<String> e = getServletContext().getInitParameterNames();
		while (e.hasMoreElements()) {
			out.println("<br> param name = " + e.nextElement() + "<br>");
		}
		out.println("mail address is : " + getServletContext().getInitParameter("mainEmail"));
		out.println("<br>");
		out.println("admin address is : " + getServletContext().getInitParameter("adminEmail"));
	}
}