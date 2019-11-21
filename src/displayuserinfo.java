

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class displayuserinfo
 */
@WebServlet("/displayuserinfo")
public class displayuserinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displayuserinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
        // read form fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter wr = response.getWriter();

        String htmlResponse = "<html>";
        htmlResponse += "<marquee behavior='scroll' direction='left' scrollamount='20'><p>the username is: " + username + "</p></marquee><br/>";      
        htmlResponse += "<marquee behavior='scroll' direction='right' scrollamount='20'><p>the password is: " + password + "</p></marquee>";    
        htmlResponse += "</html>";
         
        // return response
        wr.println(htmlResponse);
	}

}
