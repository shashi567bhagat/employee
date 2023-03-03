package employee;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/First")
public class First implements Servlet {
	
	
	ServletConfig config = null;

	
	
	public First(ServletConfig config) {
		super();
		this.config = config;
	}

	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("servlet is initialized");
	}

	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.print("hello world");
		//out.print("<b>hello simple servlet</b>");
		//out.print("</body></html>");

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}


}
