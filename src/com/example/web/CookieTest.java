package com.example.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieTest extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("username");

		Cookie cookie = new Cookie("username", name);
		cookie.setMaxAge(30 * 60);
		response.addCookie(cookie);
		
		RequestDispatcher view = request.getRequestDispatcher("cookieresult.jsp");
		view.forward(request, response);
	}
}