package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Articolo;

import java.io.IOException;

@WebServlet("/articoli")
public class ArticoliMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Articoli articoli;

    public ArticoliMVC() {
        super();
        this.articoli = new Articoli();
        for (Articolo  a : DB.ArticoliDB.getAll().values()) {
        	this.articoli.addArticolo(a);
		}
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("articoli", articoli.getArticoliList());
		request.getRequestDispatcher("elenco.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
