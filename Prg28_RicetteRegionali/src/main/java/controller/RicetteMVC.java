package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ricetta;
import service.RicetteService;

import java.io.IOException;

/**
 * Servlet implementation class RicetteRest
 */
@WebServlet("/ricette")
public class RicetteMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RicetteService service;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RicetteMVC() {
        super();
        this.service = new RicetteService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("nomePiatto") != null && request.getParameter("nomeRegione") != null) {
			this.service.addRicetta(new Ricetta(request.getParameter("nomePiatto"), request.getParameter("nomeRegione")));
		}
		//doGet(request, response);
		
	}

}
