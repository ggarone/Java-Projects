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
	private MagazzinoCtrl ctrl;
       

    public MovimentiSVT() {
        super();
        this.ctrl = new MagazzinoCtrl();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("movimenti", this.ctrl.getCtrlMovimenti().getMovimentiList());
		request.getRequestDispatcher("elencoMovimenti.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("descrizione") != null) {
			String descrizione = request.getParameter("descrizione");
			int quantita = Integer.parseInt(request.getParameter("quantita"));
			int idArticolo = Integer.parseInt(request.getParameter("articolo"));
			Articolo a = ctrl.getCtrlArticoli().getArticolo(idArticolo);
			if(quantita > 0) {
				ctrl.caricaMagazzino(a, quantita,descrizione);				
			}
			else if (quantita < 0) {
				ctrl.scaricaMagazzino(a, quantita,descrizione);
			}
		}
		doGet(request, response);
	}

}
