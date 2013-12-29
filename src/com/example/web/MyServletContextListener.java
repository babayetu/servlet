package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServletContextListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
		ServletContext sc = event.getServletContext();
		String dogBreed = sc.getInitParameter("breed");
		Dog d = new Dog(dogBreed);
		sc.setAttribute("dog", d);
	}
	
	public void contextDestroyed(ServletContextEvent evnet) {
		// do nothing
	}	
}