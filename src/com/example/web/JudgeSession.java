package com.example.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class JudgeSession extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		
		if (session.isNew()) {
			out.println("this is a new session");
		} else {
			out.println("Welcome back");
		}		
	}
}