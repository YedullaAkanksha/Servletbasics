package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletSampleDemo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		p.println("<html>");
		p.println("<body>");
		p.println("<h1>Hello World !!!! <h1>");
		p.println("</body>");
		p.println("</html>");
		
	}
	

}
