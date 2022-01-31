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

@WebServlet("/conti")
public class Conti extends HttpServlet {
	
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
		if(request.getParameter("amount")!= null && request.getParameter("operazione")!= null) {
			//1.controlla login
			String amount = request.getParameter("amount");
			double denari = Double.parseDouble(amount);
			
			
			String operazione = request.getParameter("operazione");
			ContoCorrente cc = (ContoCorrente)request.getSession().getAttribute("conto");
			
			if(operazione.equals("versamento")) {
				cc.versamento(denari);
			}else {
				cc.prelievo(denari);
			}
			
			
			
			request.getRequestDispatcher("areaRiservata.jsp").forward(request, response);
			
		}else {
			//3.se non c'è rimanda a login
			doGet(request, response);
			
		}
	}


	

}
