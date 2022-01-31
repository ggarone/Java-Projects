package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.ContoCorrente;

import java.io.IOException;
import java.util.List;

import dal.ClienteDAO;
import dal.ContoCorrenteDAO;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	private ClienteDAO repo = new ClienteDAO();
	private ContoCorrenteDAO repocc = new ContoCorrenteDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("logged")==null) {
		request.getRequestDispatcher("form_login.jsp").forward(request, response); //se non mi hanno passato username e password
		} else {
			request.getRequestDispatcher("areaRiservata.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//se mi hanno passato username e password
		if(request.getParameter("username")!= null && request.getParameter("password")!= null) {
			//1.controlla login
			String username = request.getParameter("username");
			String password = request.getParameter("password");
	
			Cliente c = controllaLogin(username, password);
			
			if(c != null) {
			//2.se c'è un utente autorizza l'accesso
			request.getSession().setAttribute("logged", c);
			ContoCorrente cc = repocc.getContoByCliente(c);
			System.out.println("-------------------------------------------");
			request.getSession().setAttribute("conto", cc);
			
			request.getRequestDispatcher("areaRiservata.jsp").forward(request, response);
			} else {
			doGet(request, response);
			}
		}else {
			//3.se non c'è rimanda a login
			doGet(request, response);
			
		}
	}


	private Cliente controllaLogin(String username, String password) {
		//Cliente c = null;
		List<Cliente> clienti = repo.getClienti();
		
		for (Cliente cliente : clienti) {
			if (cliente.getUsername().equals(username) && cliente.getPassword().equals(password)) {
				System.out.println(cliente.getPassword());
				return cliente;
			}
		}
		
		return null;
	}

}
