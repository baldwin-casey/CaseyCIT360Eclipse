package caseyfinal;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
private String mymsg;

	public void init() throws ServletException {
		mymsg = "Hello World!";
	   }

	   public void doGet(HttpServletRequest request, 
	      HttpServletResponse response)
	      throws ServletException, IOException 
	   {

	      // Setting up the content type of webpage
	      response.setContentType("text/html");

	      // Writing message to the web page
	      PrintWriter out = response.getWriter();
	      out.println("<HTML><h1>" + mymsg + "</h1></HTML>");

	   }
	   
	   public void destroy() {
		      // do nothing.
		   }

	}

