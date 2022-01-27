package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import DB.ArticoliDB;
import DB.MovimentiDB;
import model.Articolo;
import model.Movimento;

@WebServlet("/movimenti")
public class MovimentiSVT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MovimentiSVT() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("movimenti", MovimentiDB.getAll());
		request.getRequestDispatcher("elencoMovimenti.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("descrizione") != null) {
			String descrizione = request.getParameter("descrizione");
			int quantita = Integer.parseInt("quantita");
			Articolo a = ArticoliDB.getAll().get(request.getParameter("articolo"));
			MovimentiDB.addMovimento(new Movimento(descrizione, quantita, a));
		}
		
	}

}
