package jonas4040.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import jonas4040.model.JuiceExpert;
import java.util.*;

/*
	*						*
	*** Version 3.0 ***
	*						*
*/

public class JuiceSelect extends HttpServlet{
	public void doPost(HttpServletRequest request,
	HttpServletResponse response)
	 throws IOException, ServletException{
		String t=request.getParameter("type");
		JuiceExpert jc = new JuiceExpert();
		List result = jc.getBrands(t);
		
		//response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		//out.println("Aviso de selecao de suco<br>");
		
		request.setAttribute("styles",result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");//nome da pagina
		view.forward(request,response);//para o container ver
			
	}
}
