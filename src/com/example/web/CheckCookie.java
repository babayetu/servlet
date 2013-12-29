package com.example.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CheckCookie extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {			
		}
		
		for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			if (cookie.getName().equals("username")) {
				String userName = cookie.getValue();
				out.println("Hello " + userName);
				break;
			}
		}		
	}
}