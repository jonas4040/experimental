import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		java.time.LocalDate hoje = java.time.LocalDate.now();
		
		//abaixo vem a magica
		out.println("<html>"+
		"<body>"+
		"<h1>Meu primeiro servlet</h1>"+"<br/>"+hoje+
		"</body>"+
		"</html>");
	}
}
