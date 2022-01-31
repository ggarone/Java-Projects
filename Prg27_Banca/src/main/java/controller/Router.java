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

@WebServlet("")
public class Router extends HttpServlet {
	
	private ClienteDAO repo = new ClienteDAO();
	private ContoCorrenteDAO repocc = new ContoCorrenteDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("logged")==null) {
		request.getRequestDispatcher("form_login.jsp").forward(request, response); //se non mi hanno passato username e password
		} else {
			request.getRequestDispatcher("areaRiservata.jsp").forward(request, response);
		}
	}

}
