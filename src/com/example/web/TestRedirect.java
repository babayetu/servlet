package com.example.web;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class TestRedirect extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		response.sendRedirect("http://www.baidu.com");		
	}
}