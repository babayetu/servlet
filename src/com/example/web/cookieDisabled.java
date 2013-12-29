package com.example.web;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class cookieDisabled extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		
		System.out.println(session.getId() + " is new : "+session.isNew());		
		out.println("<html><body>");
		out.println("<a href=\"" + response.encodeURL("/Beer-v1/cookie.do") + "\">click me</a>");
		out.println("</body></html>");	
	}
}