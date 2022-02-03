package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.RicetteService;

import java.io.IOException;

/**
 * Servlet implementation class RicetteRest
 */
@WebServlet("/api/ricette")
public class RicetteRest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private RicetteService service;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RicetteRest() {
        this.service = new RicetteService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.getWriter().append(this.service.getAll().toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
