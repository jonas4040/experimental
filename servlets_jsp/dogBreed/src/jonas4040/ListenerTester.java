package jonas4040;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class ListenerTester extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("testando se funciona o listener . . . <br/>");
		
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		
		out.println("A Raca do cachorro seria "+dog.getBreed());
	}
}
