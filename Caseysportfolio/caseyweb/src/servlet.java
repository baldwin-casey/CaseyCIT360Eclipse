import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class servlet extends HttpServlet {


	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void init() throws ServletException {
	   }

	   public void doGet(HttpServletRequest request, 
	      HttpServletResponse response)
	      throws ServletException, IOException 
	   {

	      // Setting up the content type of webpage
	      response.setContentType("text/html");

	      // Writing message to the web page
	      PrintWriter out = response.getWriter();
// This code is from a previous class. Since Java creates a web page, I can build a basic webpage here, including the javascript!
	      out.println("<div style=\"text-align: center; width: 20%; margin-left: auto; margin-right: auto;\" >\r\n" + 
	      		"<h1>Conditions</h1>\r\n" + 
	      		"<h2>Dice Game: Roll your 2 dice and get a higher score than the dealer to win.</h2>\r\n" + 
	      		"<br>\r\n" + 
	      		"Choose how many sides the die will have. And don't even think about 0 or negative numbers.\r\n" + 
	      		"<br>\r\n" + 
	      		"<input type=\"number\" id=\"numberofsides\" value=\"6\">\r\n" + 
	      		"<br>\r\n" + 
	      		"You chose a <p id=\"sideddie\" style=\"display: inline;\"></p> sided die.\r\n" + 
	      		"<button onclick=\"rolldice()\">Roll Dice</button>\r\n" + 
	      		"<br>\r\n" + 
	      		"<div style=\"background-color: green; text-align: center;\">\r\n" + 
	      		"You rolled\r\n" + 
	      		"<p id=\"yourfirstdice\" style=\"display: inline;\"></p> and <p id=\"yourseconddice\" style=\"display: inline;\"></p> totaling <p id=\"yourscore\" style=\"display: inline;\"></p>\r\n" + 
	      		"</div>\r\n" + 
	      		"<br>\r\n" + 
	      		"<div style=\"background-color: red; text-align: center;\">\r\n" + 
	      		"The Dealer rolled\r\n" + 
	      		"<p id=\"theirfirstdice\" style=\"display: inline;\"></p> and <p id=\"theirseconddice\" style=\"display: inline;\"></p> totaling <p id=\"theirscore\" style=\"display: inline;\"></p>\r\n" + 
	      		"</div>\r\n" + 
	      		"<p id=\"gameresult\" style=\"text-align: center;\"></p>\r\n" + 
	      		"<p id=\"rebuketheuser\" style=\"text-align: center;\"></p>\r\n" + 
	      		"<script>\r\n" + 
	      		"function rolldice() {\r\n" + 
	      		"//Dice roll based on how many sides\r\n" + 
	      		"var numberofsides = document.getElementById(\"numberofsides\").value;\r\n" + 
	      		"//For the user that inputs null or negative numbers. Some mockery of user occurs here.\r\n" + 
	      		"var rebuke = \"Did you really just enter \" + numberofsides + \"? Please use a dice compatible in this dimension.\";\r\n" + 
	      		"if ( numberofsides == null || numberofsides < 1) {\r\n" + 
	      		"numberofsides = 6;\r\n" + 
	      		"document.getElementById(\"rebuketheuser\").innerHTML = rebuke;\r\n" + 
	      		"}\r\n" + 
	      		"else {\r\n" + 
	      		"document.getElementById(\"rebuketheuser\").innerHTML = \"\";\r\n" + 
	      		"}\r\n" + 
	      		"//This math works out because we want 1 and not 0\r\n" + 
	      		"var your1roll = Number(Math.floor(Math.random() * (numberofsides)) + 1);\r\n" + 
	      		"var your2roll = Number(Math.floor(Math.random() * (numberofsides)) + 1);\r\n" + 
	      		"var their1roll = Number(Math.floor(Math.random() * (numberofsides)) + 1);\r\n" + 
	      		"var their2roll = Number(Math.floor(Math.random() * (numberofsides)) + 1);\r\n" + 
	      		"//Math of the 2 dice being added\r\n" + 
	      		"var yourtotal = your1roll + your2roll;\r\n" + 
	      		"var theirtotal = their1roll + their2roll;\r\n" + 
	      		"//Displaying the information\r\n" + 
	      		"document.getElementById(\"sideddie\").innerHTML = numberofsides;\r\n" + 
	      		"document.getElementById(\"yourfirstdice\").innerHTML = your1roll;\r\n" + 
	      		"document.getElementById(\"yourseconddice\").innerHTML = your2roll;\r\n" + 
	      		"document.getElementById(\"yourscore\").innerHTML = yourtotal;\r\n" + 
	      		"document.getElementById(\"theirfirstdice\").innerHTML = their1roll;\r\n" + 
	      		"document.getElementById(\"theirseconddice\").innerHTML = their2roll;\r\n" + 
	      		"document.getElementById(\"theirscore\").innerHTML = theirtotal;\r\n" + 
	      		"//Game result message\r\n" + 
	      		"var victory = \"You Win!\";\r\n" + 
	      		"var defeat = \"You Lose!\";\r\n" + 
	      		"var tie = \"It's a Tie!\";\r\n" + 
	      		"//CHECK FOR WINNER AND DISPLAY\r\n" + 
	      		"if ( yourtotal > theirtotal ) {\r\n" + 
	      		"document.getElementById(\"gameresult\").innerHTML = victory;\r\n" + 
	      		"document.getElementById(\"gameresult\").style.backgroundColor = \"green\";\r\n" + 
	      		"} \r\n" + 
	      		"if ( yourtotal < theirtotal ) {\r\n" + 
	      		"document.getElementById(\"gameresult\").innerHTML = defeat;\r\n" + 
	      		"document.getElementById(\"gameresult\").style.backgroundColor = \"red\";\r\n" + 
	      		"}\r\n" + 
	      		"if ( yourtotal == theirtotal ) {\r\n" + 
	      		"document.getElementById(\"gameresult\").innerHTML = tie;\r\n" + 
	      		"document.getElementById(\"gameresult\").style.backgroundColor = \"yellow\";\r\n" + 
	      		"}\r\n" + 
	      		"}\r\n" + 
	      		"</script>");
	   }

	   
	   public void destroy() {

	   }
	}

