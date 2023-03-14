package com.demo.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
@WebFilter("/DemoServlet")
public class DemoServletFilter extends HttpFilter implements Filter {
	public void destroy() {
		System.out.println("filter destroyed");
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain ch) {
		System.out.println("inside demoservletfilter");
		//res.getWriter().println("before servlet");
		try {
			ch.doFilter(req, res);
		} catch (IOException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void init(FilterConfig fConfig) throws ServletException{
		System.out.println("Filter init");
	}
}
