package jonas4040.firstmvc.controller;

import java.io.IOException;

import com.google.gson.Gson;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jonas4040.firstmvc.model.Usuario;

@WebServlet({ "/ShowUserServlet", "/showUserController" })
public class ShowUserServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prmUser= request.getParameter("user");
		String prmSenha = request.getParameter("senha");
		String prmModo = request.getParameter("modo");
		
		RequestDispatcher dispatcher;
		
		if(prmUser.equalsIgnoreCase("jonas") && prmSenha.equals("1234")) {
			Usuario usuario = new Usuario(1010, prmUser, "Jonas Morais", "jonas.morais@email.com");
			
			if(prmModo.equals("html")) {
				request.setAttribute("Usuario", usuario);
				dispatcher = getServletContext().getRequestDispatcher("/ok.jsp");
			}else {
				Gson gson = new Gson();
				String resultado = gson.toJson(usuario);
				request.setAttribute("UsuarioJSON", resultado);
				dispatcher = getServletContext().getRequestDispatcher("/result.jsp");
			}
		}else {
			dispatcher = getServletContext().getRequestDispatcher("/erro.jsp");
		}
		dispatcher.forward(request, response);
	}
}
