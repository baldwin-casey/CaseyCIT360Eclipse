

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletfinal
 */
@WebServlet("/servletfinal")
public class servletfinal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletfinal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int firstnum = Integer.parseInt(request.getParameter("firstnumber"));
		int secondnum = Integer.parseInt(request.getParameter("secondnumber"));
		int result = 0;
		String operand = request.getParameter("operation");
		if (operand.contentEquals("-")) {
			result = firstnum - secondnum;
		}
		else if (operand.contentEquals("+")) {
			result = firstnum + secondnum;
		}
		else if (operand.contentEquals("*")) {
			result = firstnum * secondnum;
		}
		else if (operand.contentEquals("/")) {
			result = firstnum / secondnum;
		}
		response.getWriter().append("<!doctype HTML> <br>Served at: ").append(request.getContextPath());
		

		response.getWriter().append("\n" + request.getParameter("name"));
		response.getWriter().append("<p>Here is what you entered! " + request.getParameter("firstnumber") + " And " + request.getParameter("secondnumber") + " And " + request.getParameter("operation"));
		response.getWriter().append("<p>Here is the result! " + result  + " </p></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
