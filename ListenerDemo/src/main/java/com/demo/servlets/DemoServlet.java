package com.demo.servlets;



import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID=1L;
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	Date dt=new Date();
	res.getWriter().append("Served at:").append(req.getContextPath()).append(dt.toString());
}
protected void doPost(HttpServletRequest req,HttpServletResponse res) {
	try {
		doGet(req,res);
	} catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}