package jonas4040.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class JuiceSelect extends HttpServlet{
	public void doPost(HttpServletRequest request,
	HttpServletResponse response)
	 throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Aviso de selecao de suco<br>");
		String t=request.getParameter("type");
		out.println("<br> Suco de: "+t+" escolhido com sucesso!");
	}
}
