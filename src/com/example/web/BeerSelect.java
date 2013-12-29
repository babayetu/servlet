package com.example.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet
{
  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
//    paramHttpServletResponse.setContentType("text/html");
//    PrintWriter localPrintWriter = paramHttpServletResponse.getWriter();
//    localPrintWriter.println("Beer Selection Advice<br>");
//    String str = paramHttpServletRequest.getParameter("color");
//    BeerExpert be = new BeerExpert();
//    List<Object> beerList = be.getBrands(str);
//    Iterator<Object> it = beerList.iterator();
//    localPrintWriter.println("<br>Recommended beers:  ");
//    while (it.hasNext())
//    {
//    	localPrintWriter.println((String)it.next());
//    }    
//    localPrintWriter.close();
	  
	  String c = request.getParameter("color");
	  BeerExpert be = new BeerExpert();
	  List<Object> beerList = be.getBrands(c);
	  
	  request.setAttribute("styles", beerList);
	  RequestDispatcher view = request.getRequestDispatcher("result.jsp");
	  
	  view.forward(request, response);	  
  }
  
  public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException
  {
	  String forwards = request.getHeader("Max-Forwards");
	  String client = request.getHeader("User-Agent");
	  Cookie[] cookies = request.getCookies();
	  HttpSession session = request.getSession();
	  String theMethod = request.getMethod();
	  
	  response.setContentType("text/html");
	  PrintWriter out = response.getWriter();
	  out.println("Max-Forwards: " + forwards + "<br>");
	  out.println("User-Agent: " + client + "<br>");
	  out.println("Cookies: ");
	  for (int i=0;i<cookies.length;i++)
		  out.println(" " + cookies[i] + "<br>");
	  out.println("HttpSession: " + session.toString() + "<br>");
	  out.println("Method: " + theMethod + "<br>");
  }
}