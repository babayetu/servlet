package com.example.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Dog  implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable {
	private String breed;
	
	public Dog(String event) {
		this.breed = event;
	}
	
	public String getBreed() {
		return breed;
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("sessionDidActivate");
		
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("sessionWillPassivate");		
	}

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("valueBound");		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("valueUnbound");
	}
}