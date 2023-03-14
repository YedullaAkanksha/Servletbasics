package com.demo.servlets;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListeners implements ServletRequestListener{
	public RequestListeners() {
		
	}
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("Req destroyed");
	}
	public void requestInitialised(ServletRequestEvent sre) {
		System.out.println("Req destroyed");
	}
}
