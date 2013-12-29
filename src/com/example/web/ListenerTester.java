package com.example.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ListenerTester extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("test context attribute set by listener<br>");
		out.println("<br>");
		
		Dog dog = (Dog)getServletContext().getAttribute("dog");
		out.println("Dog's breed is: " + dog.getBreed());		
	}
}